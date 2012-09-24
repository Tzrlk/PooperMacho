package nz.co.aetheric.poopermacho.movement;

import nz.co.aetheric.poopermacho.BaseEntity;
import nz.co.aetheric.poopermacho.description.Description;

import java.util.Collection;

public class Movement extends BaseEntity<Movement> {

    private Collection<Description> description;

    public Movement() {
        super(Movement.class);
    }
}
