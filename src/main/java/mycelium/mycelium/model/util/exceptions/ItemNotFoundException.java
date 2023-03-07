package mycelium.mycelium.model.util.exceptions;

public class ItemNotFoundException extends  RuntimeException{

    public ItemNotFoundException() {
        super(String.format("A requested item was not found."));
    }

    public ItemNotFoundException(Object dup) {
        super(String.format("The requested item %s was not found.", dup));
    }
}
