package java.sql;

/**
 * The representation of a savepoint, which is a point within
 * the current transaction that can be referenced from the
 * <code>Connection.rollback</code> method. When a transaction
 * is rolled back to a savepoint all changes made after that
 * savepoint are undone.
 * <p>
 * Savepoints can be either named or unnamed. Unnamed savepoints
 * are identified by an ID generated by the underlying data source.
 *
 * @since 1.4
 */
public interface Savepoint {

    /**
     * Retrieves the generated ID for the savepoint that this
     * <code>Savepoint</code> object represents.
     * @return the numeric ID of this savepoint
     * @exception SQLException if this is a named savepoint
     * @since 1.4
     */
    int getSavepointId() throws SQLException;

    /**
     * Retrieves the name of the savepoint that this <code>Savepoint</code>
     * object represents.
     * @return the name of this savepoint
     * @exception SQLException if this is an un-named savepoint
     * @since 1.4
     */
    String getSavepointName() throws SQLException;
}
