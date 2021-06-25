package Parte_B.Model;

/**
 *
 * @author Ismael
 */
public class Pais {

    private int numericCode;
    private int callingCode;
    private String nombre;
    private String capital;
    private String region;
    private long poblacion;
    private double latitud;
    private double longitud;

    public Pais(int numericCode, int callingCode, String nombre, String capital, String region, long poblacion, double latitud, double longitud) {
        this.numericCode = numericCode;
        this.callingCode = callingCode;
        this.nombre = nombre;
        this.capital = capital;
        this.region = region;
        this.poblacion = poblacion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Pais() {
    }

    public int getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(int numericCode) {
        this.numericCode = numericCode;
    }

    public int getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(int callingCode) {
        this.callingCode = callingCode;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

}
