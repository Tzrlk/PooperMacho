package nz.co.aetheric.poopermacho.description;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/** What is the purpose of this class? */
public interface DescriptionDao extends CrudRepository<Description, Long> {

    public Collection<Description> findAllByDescType(String descType);
}
