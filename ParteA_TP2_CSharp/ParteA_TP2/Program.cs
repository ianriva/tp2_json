using MySql.Data.MySqlClient;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using static ParteA_TP2.Model.Pais;

namespace ParteA_TP2
{
    class Program 
    {

        static void Main(string[] args)
        {
         
           LeerJSONFromURL();
        }
        public static void LeerJSONFromURL()
        {
            Console.WriteLine("Leyendo Paises...Esto Puede Demorar Unos 2 Minutos");
            var contador = 0;
            


            var mayorValor = 0;
            for (int i = 1; i < 301; i++)
            {
                try
                {
                    var url = "https://restcountries.eu/rest/v2/callingcode/" + i; //URL Del JSON

                    WebClient wc = new WebClient(); //WebClient Instancia

                    string datosJSON = wc.DownloadString(url); //JSON A String

                    //Console.WriteLine(datosJSON);

                    var response = JsonConvert.DeserializeObject<List<Root>>(datosJSON);

                   


                    //El Response Devuelve Un Array De Paises Dependiendo El callingCode,
                    //Agunos callingCode Tienen Desde 0 a 4 Paises, Al Menos Desde El callingCode 1 al 300
                    //Obtengo La response Con Mas Paises, 4 Maximo Para El Caso De Los callingCode 1 al 300
                    if (response.Count >= mayorValor)
                    {
                        mayorValor = response.Count;
                    }



                    //Recorro Todas Las Posiciones, j Alcanza Un Valor Maximo De 4 En El Caso De Los callingCode 1 al 300 
                    for (int j = 0; j < mayorValor; j++)
                    {
                        if (response[j].name != null)
                        {
                            
                          
                            
                            
                            Console.WriteLine("-----------------------------");
                            //Guardo El Pais A La DB
                            string SQL_INSERT = "INSERT INTO paises (numericCode, callingCode, nombrePais, capitalPais, region, poblacion, latitud, longitud) " +
                                "VALUES ('" + response[j].numericCode + "','" + response[j].callingCodes[0] + "'," +
                                "'" + response[j].name + "','" + response[j].capital + "'," +
                                "'" + response[j].region + "'," +
                                "'" + response[j].population + "'," +
                                "'" + response[j].latlng[0] + "'," +
                                "'" + response[j].latlng[1] + "')";

                            string conn = "server=localhost; database=paises_csharp_db;Uid=root;pwd=1234";
                            MySqlConnection databaseConnection = new MySqlConnection(conn);
                            MySqlCommand commandDatabase = new MySqlCommand(SQL_INSERT, databaseConnection);
                            databaseConnection.Open();
                            MySqlDataReader myReader = commandDatabase.ExecuteReader();
                            Console.WriteLine(response[j].name+ " Insertado!");
                            databaseConnection.Close();
                            contador++;
                        }
                    }






                   



                }
                catch (Exception)
                {
                    //Muestro Los callingCode Que NO Contienen Paises
                    //Console.WriteLine("https://restcountries.eu/rest/v2/callingcode/" + i);
                }

               
            }

            Console.WriteLine("Total Registros : " + contador);//Total Paises
            Console.WriteLine("Mayor Cantidad De Paises Con callingCode Igual : " + mayorValor);//Mayor Valor De j

            Console.ReadKey();//Console Pause









        }
    }
}

