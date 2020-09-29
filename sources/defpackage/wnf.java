package defpackage;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.OutputStream;

/* renamed from: wnf reason: default package */
public final class wnf extends OutputStream implements DataOutput {
    private final wnb a;
    private final int b;
    private final DataOutputStream c = new DataOutputStream(this);

    public wnf(wnb wnb) {
        if (wnb != null) {
            this.a = wnb;
            this.b = wnb.d();
            return;
        }
        throw new NullPointerException("buffer");
    }

    public final void write(int i) {
        this.a.x((byte) i);
    }

    public final void write(byte[] bArr) {
        this.a.b(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            this.a.b(bArr, i, i2);
        }
    }

    public final void writeBoolean(boolean z) {
        write(z ? 1 : 0);
    }

    public final void writeByte(int i) {
        write(i);
    }

    public final void writeBytes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            write((int) (byte) str.charAt(i));
        }
    }

    public final void writeChar(int i) {
        writeShort((short) i);
    }

    public final void writeChars(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            writeChar(str.charAt(i));
        }
    }

    public final void writeDouble(double d) {
        writeLong(Double.doubleToLongBits(d));
    }

    public final void writeFloat(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    public final void writeInt(int i) {
        this.a.z(i);
    }

    public final void writeLong(long j) {
        this.a.a(j);
    }

    public final void writeShort(int i) {
        this.a.y((short) i);
    }

    public final void writeUTF(String str) {
        this.c.writeUTF(str);
    }
}
