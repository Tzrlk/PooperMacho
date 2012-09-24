package nz.co.aetheric.poopermacho.auth;

import nz.co.aetheric.poopermacho.BaseEntity;

/* A user of the PooperMacho application */
public class PooperMacho extends BaseEntity<PooperMacho> {

    private String poopername;
    private String password;

    public PooperMacho() {
        super(PooperMacho.class);
    }

    public String getPoopername() {
        return poopername;
    }

    public PooperMacho setPoopername(String poopername) {
        this.poopername = poopername;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public PooperMacho setPassword(String password) {
        this.password = password;
        return this;
    }
}
