package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: aht reason: default package */
public final class aht {
    public final byte[] a;
    private volatile int b = 0;

    private aht(byte[] bArr) {
        this.a = bArr;
    }

    static {
        new aht(new byte[0]);
    }

    public static aht a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return new aht(bArr2);
    }

    public static aht a(String str) {
        try {
            return new aht(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public final void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aht)) {
            return false;
        }
        aht aht = (aht) obj;
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = aht.a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int i2 = r1;
            for (byte b2 : this.a) {
                i2 = (i2 * 31) + b2;
            }
            i = i2 == 0 ? 1 : i2;
            this.b = i;
        }
        return i;
    }
}
