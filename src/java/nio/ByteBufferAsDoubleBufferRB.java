package java.nio;

class ByteBufferAsDoubleBufferRB extends ByteBufferAsDoubleBufferB {

    ByteBufferAsDoubleBufferRB(ByteBuffer bb) {   // package-private
        super(bb);
    }

    ByteBufferAsDoubleBufferRB(ByteBuffer bb,
                                     int mark, int pos, int lim, int cap,
                                     int off)
    {
        super(bb, mark, pos, lim, cap, off);
    }

    public DoubleBuffer slice() {
        int pos = this.position();
        int lim = this.limit();
        assert (pos <= lim);
        int rem = (pos <= lim ? lim - pos : 0);
        int off = (pos << 3) + offset;
        assert (off >= 0);
        return new ByteBufferAsDoubleBufferRB(bb, -1, 0, rem, rem, off);
    }

    public DoubleBuffer duplicate() {
        return new ByteBufferAsDoubleBufferRB(bb,
                                                    this.markValue(),
                                                    this.position(),
                                                    this.limit(),
                                                    this.capacity(),
                                                    offset);
    }

    public DoubleBuffer asReadOnlyBuffer() {
        return duplicate();
    }

    public DoubleBuffer put(double x) {
        throw new ReadOnlyBufferException();
    }

    public DoubleBuffer put(int i, double x) {
        throw new ReadOnlyBufferException();
    }

    public DoubleBuffer compact() {
        throw new ReadOnlyBufferException();
    }

    public boolean isDirect() {
        return bb.isDirect();
    }

    public boolean isReadOnly() {
        return true;
    }

    public ByteOrder order() {
        return ByteOrder.BIG_ENDIAN;
    }
}
