package java.nio;


/**
 * Unchecked exception thrown when a content-mutation method such as
 * <tt>put</tt> or <tt>compact</tt> is invoked upon a read-only buffer.
 *
 * @since 1.4
 */
public class ReadOnlyBufferException extends UnsupportedOperationException {

    private static final long serialVersionUID = -1210063976496234090L;

    /**
     * Constructs an instance of this class.
     */
    public ReadOnlyBufferException() { }

}
