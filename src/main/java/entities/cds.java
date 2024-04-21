package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class cds {
    @Id
    private Long cd_id;
    private String title;
    private String description;
    private int year;
    private Double price;
    private int artist_id;

    public cds() {
    }

    public Long getCd_id() {
        return cd_id;
    }

    public void setCd_id(Long cd_id) {
        this.cd_id = cd_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }
}
