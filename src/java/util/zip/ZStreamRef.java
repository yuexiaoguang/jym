package java.util.zip;

/**
 * A reference to the native zlib's z_stream structure.
 */
class ZStreamRef {

    private volatile long address;
    ZStreamRef (long address) {
        this.address = address;
    }

    long address() {
        return address;
    }

    void clear() {
        address = 0;
    }
}
