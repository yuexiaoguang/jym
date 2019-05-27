package java.nio.channels;

/**
 * Unchecked exception thrown when an attempt is made to read
 * from a channel that was not originally opened for reading.
 *
 * @since 1.4
 */
public class NonReadableChannelException extends IllegalStateException {

    private static final long serialVersionUID = -3200915679294993514L;

    /**
     * Constructs an instance of this class.
     */
    public NonReadableChannelException() { }

}
