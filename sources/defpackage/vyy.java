package defpackage;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;

/* renamed from: vyy reason: default package */
public final class vyy extends InputStream implements DataInput {
    private final vyv a;
    private final int b;
    private final int c;
    private final StringBuilder d;

    public final boolean markSupported() {
        return true;
    }

    public vyy(vyv vyv) {
        this(vyv, vyv.g());
    }

    private vyy(vyv vyv, int i) {
        this.d = new StringBuilder();
        if (vyv == null) {
            throw new NullPointerException("buffer");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder("length: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= vyv.g()) {
            this.a = vyv;
            this.b = vyv.c();
            this.c = this.b + i;
            vyv.i();
        } else {
            StringBuilder sb2 = new StringBuilder("Too many bytes to be read - Needs ");
            sb2.append(i);
            sb2.append(", maximum is ");
            sb2.append(vyv.g());
            throw new IndexOutOfBoundsException(sb2.toString());
        }
    }

    public final int available() {
        return this.c - this.a.c();
    }

    public final void mark(int i) {
        this.a.i();
    }

    public final int read() {
        if (!this.a.f()) {
            return -1;
        }
        return this.a.n() & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int available = available();
        if (available == 0) {
            return -1;
        }
        int min = Math.min(available, i2);
        this.a.a(bArr, i, min);
        return min;
    }

    public final void reset() {
        this.a.j();
    }

    public final long skip(long j) {
        int skipBytes;
        if (j > 2147483647L) {
            skipBytes = skipBytes(Integer.MAX_VALUE);
        } else {
            skipBytes = skipBytes((int) j);
        }
        return (long) skipBytes;
    }

    public final boolean readBoolean() {
        a(1);
        if (read() != 0) {
            return true;
        }
        return false;
    }

    public final byte readByte() {
        if (this.a.f()) {
            return this.a.n();
        }
        throw new EOFException();
    }

    public final char readChar() {
        return (char) readShort();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.a(bArr, i, i2);
    }

    public final int readInt() {
        a(4);
        return this.a.q();
    }

    public final String readLine() {
        this.d.setLength(0);
        while (this.a.f()) {
            short o = this.a.o();
            if (o != 10) {
                if (o != 13) {
                    this.d.append((char) o);
                } else if (this.a.f()) {
                    vyv vyv = this.a;
                    if (((char) vyv.g(vyv.c())) == 10) {
                        this.a.w(1);
                    }
                }
            }
            return this.d.toString();
        }
        if (this.d.length() > 0) {
            return this.d.toString();
        }
        return null;
    }

    public final long readLong() {
        a(8);
        return this.a.r();
    }

    public final short readShort() {
        a(2);
        return this.a.p();
    }

    public final String readUTF() {
        return DataInputStream.readUTF(this);
    }

    public final int readUnsignedByte() {
        return readByte() & 255;
    }

    public final int readUnsignedShort() {
        return readShort() & 65535;
    }

    public final int skipBytes(int i) {
        int min = Math.min(available(), i);
        this.a.w(min);
        return min;
    }

    private void a(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("fieldSize cannot be a negative number");
        } else if (i > available()) {
            StringBuilder sb = new StringBuilder("fieldSize is too long! Length is ");
            sb.append(i);
            sb.append(", but maximum is ");
            sb.append(available());
            throw new EOFException(sb.toString());
        }
    }
}
