package java.nio.file.attribute;

/**
 * An attribute view that is a read-only or updatable view of non-opaque
 * values associated with a file in a filesystem. This interface is extended or
 * implemented by specific file attribute views that define methods to read
 * and/or update the attributes of a file.
 *
 * @since 1.7
 *
 * @see java.nio.file.Files#getFileAttributeView(Path,Class,java.nio.file.LinkOption[])
 */
public interface FileAttributeView extends AttributeView {
}
