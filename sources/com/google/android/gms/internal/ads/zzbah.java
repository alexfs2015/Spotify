package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class zzbah implements Serializable, Iterable<Byte> {
    public static final zzbah a = new zzbao(dda.b);
    private static final dcb b = (dbu.a() ? new dcd(0) : new dca(0));
    int zzdpa = 0;

    zzbah() {
    }

    static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static zzbah a(String str) {
        return new zzbao(str.getBytes(dda.a));
    }

    public static zzbah a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static zzbah a(byte[] bArr, int i, int i2) {
        return new zzbao(b.a(bArr, i, i2));
    }

    public static zzbah b(byte[] bArr) {
        return new zzbao(bArr);
    }

    public static dcc c(int i) {
        return new dcc(i, 0);
    }

    public abstract byte a(int i);

    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    /* access modifiers changed from: 0000 */
    public abstract void a(dby dby);

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr, int i);

    public abstract zzbah b(int i);

    public final byte[] b() {
        int a2 = a();
        if (a2 == 0) {
            return dda.b;
        }
        byte[] bArr = new byte[a2];
        a(bArr, a2);
        return bArr;
    }

    public final String c() {
        return a() == 0 ? "" : a(dda.a);
    }

    public abstract boolean d();

    public abstract dce e();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzdpa;
        if (i == 0) {
            int a2 = a();
            i = a(a2, a2);
            if (i == 0) {
                i = 1;
            }
            this.zzdpa = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new dbz(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a())});
    }
}
