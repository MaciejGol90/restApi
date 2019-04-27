package eu.infoshare.pl.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

/**"id" : 1,
*        "country" : "USA",
*        "name" : "Alabama",
*        "abbr" : "AL",
*        "area" : "135767SKM",
*        "largest_city" : "Birmingham",
*        "capital" : "Montgomery"
*/
public class StateInfo implements Serializable {
    private Long id;
    private String name;
    private String abbr;
    private String area;
    @JsonProperty("largest_city")
    private String largestCity;
    private String capital;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLargestCity() {
        return largestCity;
    }

    public void setLargestCity(String largestCity) {
        this.largestCity = largestCity;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
