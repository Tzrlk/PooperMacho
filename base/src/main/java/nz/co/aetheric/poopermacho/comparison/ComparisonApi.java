package nz.co.aetheric.poopermacho.comparison;

/** This is the api for reading, searching and manipulating comparisons. Contains basic CRUD operations. */
public interface ComparisonApi {

    CreateComparison.Response createMovement(CreateComparison.Request request);

    ListComparison.Response listMovement(ListComparison.Request request);

    ReadComparison.Response readMovement(Long id, ReadComparison.Request request);

    UpdateComparison.Response updateMovement(Long id, UpdateComparison.Request request);

    DeleteComparison.Response deleteMovement(Long id, DeleteComparison.Request request);
}
