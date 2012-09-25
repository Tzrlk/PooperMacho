package nz.co.aetheric.poopermacho.movement;

/** This is the api for reading, searching and manipulating movements. Contains basic CRUD operations. */
public interface MovementApi {

    CreateMovement.Response createMovement(CreateMovement.Request request);

    ListMovement.Response listMovement(ListMovement.Request request);

    ReadMovement.Response readMovement(Long id, ReadMovement.Request request);

    UpdateMovement.Response updateMovement(Long id, UpdateMovement.Request request);

    DeleteMovement.Response deleteMovement(Long id, DeleteMovement.Request request);
}
