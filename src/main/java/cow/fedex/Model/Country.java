package cow.fedex.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
    @Id
    private long id;
    private String name;
    private int difficulty;
    private String region;
    private String capital;
    private String currency;
    private int population;
    private int area;
    private Double phones;

    public int getDifficulty() {
        return difficulty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Double getPhones() {
        return phones;
    }

    public void setPhones(Double phones) {
        this.phones = phones;
    }
}
