package Parte_B.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

/**
 *
 * @author Ismael
 */
public class PaisFromJSON {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "code",
        "name",
        "symbol"
    })
    @Generated("jsonschema2pojo")
    public static class Currency {

        @JsonProperty("code")
        private String code;
        @JsonProperty("name")
        private String name;
        @JsonProperty("symbol")
        private String symbol;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("code")
        public String getCode() {
            return code;
        }

        @JsonProperty("code")
        public void setCode(String code) {
            this.code = code;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("symbol")
        public String getSymbol() {
            return symbol;
        }

        @JsonProperty("symbol")
        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "name",
        "topLevelDomain",
        "alpha2Code",
        "alpha3Code",
        "callingCodes",
        "capital",
        "altSpellings",
        "region",
        "subregion",
        "population",
        "latlng",
        "demonym",
        "area",
        "gini",
        "timezones",
        "borders",
        "nativeName",
        "numericCode",
        "currencies",
        "languages",
        "translations",
        "flag",
        "regionalBlocs",
        "cioc"
    })
    @Generated("jsonschema2pojo")
    public static class Country {

        @JsonProperty("name")
        private String name;
        @JsonProperty("topLevelDomain")
        private List<String> topLevelDomain = null;
        @JsonProperty("alpha2Code")
        private String alpha2Code;
        @JsonProperty("alpha3Code")
        private String alpha3Code;
        @JsonProperty("callingCodes")
        private List<String> callingCodes = null;
        @JsonProperty("capital")
        private String capital;
        @JsonProperty("altSpellings")
        private List<String> altSpellings = null;
        @JsonProperty("region")
        private String region;
        @JsonProperty("subregion")
        private String subregion;
        @JsonProperty("population")
        private Integer population;
        @JsonProperty("latlng")
        private List<Integer> latlng = null;
        @JsonProperty("demonym")
        private String demonym;
        @JsonProperty("area")
        private Integer area;
        @JsonProperty("gini")
        private Double gini;
        @JsonProperty("timezones")
        private List<String> timezones = null;
        @JsonProperty("borders")
        private List<String> borders = null;
        @JsonProperty("nativeName")
        private String nativeName;
        @JsonProperty("numericCode")
        private String numericCode;
        @JsonProperty("currencies")
        private List<Currency> currencies = null;
        @JsonProperty("languages")
        private List<Language> languages = null;
        @JsonProperty("translations")
        private Translations translations;
        @JsonProperty("flag")
        private String flag;
        @JsonProperty("regionalBlocs")
        private List<RegionalBloc> regionalBlocs = null;
        @JsonProperty("cioc")
        private String cioc;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("topLevelDomain")
        public List<String> getTopLevelDomain() {
            return topLevelDomain;
        }

        @JsonProperty("topLevelDomain")
        public void setTopLevelDomain(List<String> topLevelDomain) {
            this.topLevelDomain = topLevelDomain;
        }

        @JsonProperty("alpha2Code")
        public String getAlpha2Code() {
            return alpha2Code;
        }

        @JsonProperty("alpha2Code")
        public void setAlpha2Code(String alpha2Code) {
            this.alpha2Code = alpha2Code;
        }

        @JsonProperty("alpha3Code")
        public String getAlpha3Code() {
            return alpha3Code;
        }

        @JsonProperty("alpha3Code")
        public void setAlpha3Code(String alpha3Code) {
            this.alpha3Code = alpha3Code;
        }

        @JsonProperty("callingCodes")
        public List<String> getCallingCodes() {
            return callingCodes;
        }

        @JsonProperty("callingCodes")
        public void setCallingCodes(List<String> callingCodes) {
            this.callingCodes = callingCodes;
        }

        @JsonProperty("capital")
        public String getCapital() {
            return capital;
        }

        @JsonProperty("capital")
        public void setCapital(String capital) {
            this.capital = capital;
        }

        @JsonProperty("altSpellings")
        public List<String> getAltSpellings() {
            return altSpellings;
        }

        @JsonProperty("altSpellings")
        public void setAltSpellings(List<String> altSpellings) {
            this.altSpellings = altSpellings;
        }

        @JsonProperty("region")
        public String getRegion() {
            return region;
        }

        @JsonProperty("region")
        public void setRegion(String region) {
            this.region = region;
        }

        @JsonProperty("subregion")
        public String getSubregion() {
            return subregion;
        }

        @JsonProperty("subregion")
        public void setSubregion(String subregion) {
            this.subregion = subregion;
        }

        @JsonProperty("population")
        public Integer getPopulation() {
            return population;
        }

        @JsonProperty("population")
        public void setPopulation(Integer population) {
            this.population = population;
        }

        @JsonProperty("latlng")
        public List<Integer> getLatlng() {
            return latlng;
        }

        @JsonProperty("latlng")
        public void setLatlng(List<Integer> latlng) {
            this.latlng = latlng;
        }

        @JsonProperty("demonym")
        public String getDemonym() {
            return demonym;
        }

        @JsonProperty("demonym")
        public void setDemonym(String demonym) {
            this.demonym = demonym;
        }

        @JsonProperty("area")
        public Integer getArea() {
            return area;
        }

        @JsonProperty("area")
        public void setArea(Integer area) {
            this.area = area;
        }

        @JsonProperty("gini")
        public Double getGini() {
            return gini;
        }

        @JsonProperty("gini")
        public void setGini(Double gini) {
            this.gini = gini;
        }

        @JsonProperty("timezones")
        public List<String> getTimezones() {
            return timezones;
        }

        @JsonProperty("timezones")
        public void setTimezones(List<String> timezones) {
            this.timezones = timezones;
        }

        @JsonProperty("borders")
        public List<String> getBorders() {
            return borders;
        }

        @JsonProperty("borders")
        public void setBorders(List<String> borders) {
            this.borders = borders;
        }

        @JsonProperty("nativeName")
        public String getNativeName() {
            return nativeName;
        }

        @JsonProperty("nativeName")
        public void setNativeName(String nativeName) {
            this.nativeName = nativeName;
        }

        @JsonProperty("numericCode")
        public String getNumericCode() {
            return numericCode;
        }

        @JsonProperty("numericCode")
        public void setNumericCode(String numericCode) {
            this.numericCode = numericCode;
        }

        @JsonProperty("currencies")
        public List<Currency> getCurrencies() {
            return currencies;
        }

        @JsonProperty("currencies")
        public void setCurrencies(List<Currency> currencies) {
            this.currencies = currencies;
        }

        @JsonProperty("languages")
        public List<Language> getLanguages() {
            return languages;
        }

        @JsonProperty("languages")
        public void setLanguages(List<Language> languages) {
            this.languages = languages;
        }

        @JsonProperty("translations")
        public Translations getTranslations() {
            return translations;
        }

        @JsonProperty("translations")
        public void setTranslations(Translations translations) {
            this.translations = translations;
        }

        @JsonProperty("flag")
        public String getFlag() {
            return flag;
        }

        @JsonProperty("flag")
        public void setFlag(String flag) {
            this.flag = flag;
        }

        @JsonProperty("regionalBlocs")
        public List<RegionalBloc> getRegionalBlocs() {
            return regionalBlocs;
        }

        @JsonProperty("regionalBlocs")
        public void setRegionalBlocs(List<RegionalBloc> regionalBlocs) {
            this.regionalBlocs = regionalBlocs;
        }

        @JsonProperty("cioc")
        public String getCioc() {
            return cioc;
        }

        @JsonProperty("cioc")
        public void setCioc(String cioc) {
            this.cioc = cioc;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "iso639_1",
        "iso639_2",
        "name",
        "nativeName"
    })
    @Generated("jsonschema2pojo")
    public static class Language {

        @JsonProperty("iso639_1")
        private String iso6391;
        @JsonProperty("iso639_2")
        private String iso6392;
        @JsonProperty("name")
        private String name;
        @JsonProperty("nativeName")
        private String nativeName;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("iso639_1")
        public String getIso6391() {
            return iso6391;
        }

        @JsonProperty("iso639_1")
        public void setIso6391(String iso6391) {
            this.iso6391 = iso6391;
        }

        @JsonProperty("iso639_2")
        public String getIso6392() {
            return iso6392;
        }

        @JsonProperty("iso639_2")
        public void setIso6392(String iso6392) {
            this.iso6392 = iso6392;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("nativeName")
        public String getNativeName() {
            return nativeName;
        }

        @JsonProperty("nativeName")
        public void setNativeName(String nativeName) {
            this.nativeName = nativeName;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "acronym",
        "name",
        "otherAcronyms",
        "otherNames"
    })
    @Generated("jsonschema2pojo")
    public static class RegionalBloc {

        @JsonProperty("acronym")
        private String acronym;
        @JsonProperty("name")
        private String name;
        @JsonProperty("otherAcronyms")
        private List<String> otherAcronyms = null;
        @JsonProperty("otherNames")
        private List<String> otherNames = null;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("acronym")
        public String getAcronym() {
            return acronym;
        }

        @JsonProperty("acronym")
        public void setAcronym(String acronym) {
            this.acronym = acronym;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("otherAcronyms")
        public List<String> getOtherAcronyms() {
            return otherAcronyms;
        }

        @JsonProperty("otherAcronyms")
        public void setOtherAcronyms(List<String> otherAcronyms) {
            this.otherAcronyms = otherAcronyms;
        }

        @JsonProperty("otherNames")
        public List<String> getOtherNames() {
            return otherNames;
        }

        @JsonProperty("otherNames")
        public void setOtherNames(List<String> otherNames) {
            this.otherNames = otherNames;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "de",
        "es",
        "fr",
        "ja",
        "it",
        "br",
        "pt",
        "nl",
        "hr",
        "fa"
    })
    @Generated("jsonschema2pojo")
    public static class Translations {

        @JsonProperty("de")
        private String de;
        @JsonProperty("es")
        private String es;
        @JsonProperty("fr")
        private String fr;
        @JsonProperty("ja")
        private String ja;
        @JsonProperty("it")
        private String it;
        @JsonProperty("br")
        private String br;
        @JsonProperty("pt")
        private String pt;
        @JsonProperty("nl")
        private String nl;
        @JsonProperty("hr")
        private String hr;
        @JsonProperty("fa")
        private String fa;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("de")
        public String getDe() {
            return de;
        }

        @JsonProperty("de")
        public void setDe(String de) {
            this.de = de;
        }

        @JsonProperty("es")
        public String getEs() {
            return es;
        }

        @JsonProperty("es")
        public void setEs(String es) {
            this.es = es;
        }

        @JsonProperty("fr")
        public String getFr() {
            return fr;
        }

        @JsonProperty("fr")
        public void setFr(String fr) {
            this.fr = fr;
        }

        @JsonProperty("ja")
        public String getJa() {
            return ja;
        }

        @JsonProperty("ja")
        public void setJa(String ja) {
            this.ja = ja;
        }

        @JsonProperty("it")
        public String getIt() {
            return it;
        }

        @JsonProperty("it")
        public void setIt(String it) {
            this.it = it;
        }

        @JsonProperty("br")
        public String getBr() {
            return br;
        }

        @JsonProperty("br")
        public void setBr(String br) {
            this.br = br;
        }

        @JsonProperty("pt")
        public String getPt() {
            return pt;
        }

        @JsonProperty("pt")
        public void setPt(String pt) {
            this.pt = pt;
        }

        @JsonProperty("nl")
        public String getNl() {
            return nl;
        }

        @JsonProperty("nl")
        public void setNl(String nl) {
            this.nl = nl;
        }

        @JsonProperty("hr")
        public String getHr() {
            return hr;
        }

        @JsonProperty("hr")
        public void setHr(String hr) {
            this.hr = hr;
        }

        @JsonProperty("fa")
        public String getFa() {
            return fa;
        }

        @JsonProperty("fa")
        public void setFa(String fa) {
            this.fa = fa;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

}
