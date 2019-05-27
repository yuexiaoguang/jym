package java.nio.channels;


/**
 * Unchecked exception thrown when an attempt is made to connect a {@link
 * SocketChannel} for which a non-blocking connection operation is already in
 * progress.
 *
 * @since 1.4
 */
public class ConnectionPendingException extends IllegalStateException {

    private static final long serialVersionUID = 2008393366501760879L;

    /**
     * Constructs an instance of this class.
     */
    public ConnectionPendingException() { }

}
