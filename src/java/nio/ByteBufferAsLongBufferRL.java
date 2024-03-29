package java.nio;

class ByteBufferAsLongBufferRL extends ByteBufferAsLongBufferL {


    ByteBufferAsLongBufferRL(ByteBuffer bb) {   // package-private
        super(bb);
    }

    ByteBufferAsLongBufferRL(ByteBuffer bb,
                                     int mark, int pos, int lim, int cap,
                                     int off)
    {
        super(bb, mark, pos, lim, cap, off);
    }

    public LongBuffer slice() {
        int pos = this.position();
        int lim = this.limit();
        assert (pos <= lim);
        int rem = (pos <= lim ? lim - pos : 0);
        int off = (pos << 3) + offset;
        assert (off >= 0);
        return new ByteBufferAsLongBufferRL(bb, -1, 0, rem, rem, off);
    }

    public LongBuffer duplicate() {
        return new ByteBufferAsLongBufferRL(bb,
                                                    this.markValue(),
                                                    this.position(),
                                                    this.limit(),
                                                    this.capacity(),
                                                    offset);
    }

    public LongBuffer asReadOnlyBuffer() {
        return duplicate();
    }

    public LongBuffer put(long x) {
        throw new ReadOnlyBufferException();
    }

    public LongBuffer put(int i, long x) {
        throw new ReadOnlyBufferException();
    }

    public LongBuffer compact() {
        throw new ReadOnlyBufferException();
    }

    public boolean isDirect() {
        return bb.isDirect();
    }

    public boolean isReadOnly() {
        return true;
    }

    public ByteOrder order() {
        return ByteOrder.LITTLE_ENDIAN;
    }
}
