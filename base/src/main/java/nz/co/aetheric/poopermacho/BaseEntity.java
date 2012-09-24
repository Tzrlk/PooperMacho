package nz.co.aetheric.poopermacho;

import java.util.Date;

public abstract class BaseEntity<E extends BaseEntity<E>> {

    private final Class<E> clazz;

    private Long id;
    private Date dateCreated;
    private Date lastUpdated;

    protected BaseEntity(Class<E> clazz) {
        this.clazz = clazz;
    }

    public Long getId() {
        return id;
    }

    public E setId(Long id) {
        this.id = id;
        return clazz.cast(this);
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public E setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        return clazz.cast(this);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public E setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        return clazz.cast(this);
    }
}