package java.nio.file;

/**
 * Defines the file tree traversal options.
 *
 * @since 1.7
 *
 * @see Files#walkFileTree
 */
public enum FileVisitOption {
    /**
     * Follow symbolic links.
     */
    FOLLOW_LINKS;
}
