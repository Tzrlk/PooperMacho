package nz.co.aetheric.poopermacho.description;

/** This is the api for reading, searching and manipulating descriptions. Contains basic CRUD operations. */
public interface DescriptionApi {

    CreateDescription.Response createMovement(CreateDescription.Request request);

    ListDescription.Response listMovement(ListDescription.Request request);

    ReadDescription.Response readMovement(Long id, ReadDescription.Request request);

    UpdateDescription.Response updateMovement(Long id, UpdateDescription.Request request);

    DeleteDescription.Response deleteMovement(Long id, DeleteDescription.Request request);
}
