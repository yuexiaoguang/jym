package java.nio.channels;


/**
 * Unchecked exception thrown when an attempt is made to invoke an I/O
 * operation upon a closed selector.
 *
 * @since 1.4
 */
public class ClosedSelectorException extends IllegalStateException {

    private static final long serialVersionUID = 6466297122317847835L;

    /**
     * Constructs an instance of this class.
     */
    public ClosedSelectorException() { }

}
