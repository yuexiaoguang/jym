package java.nio.channels;

/**
 * Unchecked exception thrown when an attempt is made to invoke an I/O
 * operation upon a server socket channel that is not yet bound.
 *
 * @since 1.4
 */
public class NotYetBoundException extends IllegalStateException {

    private static final long serialVersionUID = 4640999303950202242L;

    /**
     * Constructs an instance of this class.
     */
    public NotYetBoundException() { }

}
