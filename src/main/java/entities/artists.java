package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class artists {
    @Id
    private Long id;
    private String name;
    private String instrument;

    public artists() {
    }

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

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
