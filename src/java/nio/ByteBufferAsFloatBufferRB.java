package java.nio;

class ByteBufferAsFloatBufferRB extends ByteBufferAsFloatBufferB {

    ByteBufferAsFloatBufferRB(ByteBuffer bb) {   // package-private
        super(bb);
    }

    ByteBufferAsFloatBufferRB(ByteBuffer bb,
                                     int mark, int pos, int lim, int cap,
                                     int off)
    {
        super(bb, mark, pos, lim, cap, off);
    }

    public FloatBuffer slice() {
        int pos = this.position();
        int lim = this.limit();
        assert (pos <= lim);
        int rem = (pos <= lim ? lim - pos : 0);
        int off = (pos << 2) + offset;
        assert (off >= 0);
        return new ByteBufferAsFloatBufferRB(bb, -1, 0, rem, rem, off);
    }

    public FloatBuffer duplicate() {
        return new ByteBufferAsFloatBufferRB(bb,
                                                    this.markValue(),
                                                    this.position(),
                                                    this.limit(),
                                                    this.capacity(),
                                                    offset);
    }

    public FloatBuffer asReadOnlyBuffer() {
        return duplicate();
    }

    public FloatBuffer put(float x) {
        throw new ReadOnlyBufferException();
    }

    public FloatBuffer put(int i, float x) {
        throw new ReadOnlyBufferException();
    }

    public FloatBuffer compact() {
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
