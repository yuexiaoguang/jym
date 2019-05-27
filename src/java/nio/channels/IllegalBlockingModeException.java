package java.nio.channels;


/**
 * Unchecked exception thrown when a blocking-mode-specific operation
 * is invoked upon a channel in the incorrect blocking mode.
 *
 * @since 1.4
 */
public class IllegalBlockingModeException extends IllegalStateException {

    private static final long serialVersionUID = -3335774961855590474L;

    /**
     * Constructs an instance of this class.
     */
    public IllegalBlockingModeException() { }

}
