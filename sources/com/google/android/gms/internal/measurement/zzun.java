package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class zzun implements Serializable, Iterable<Byte> {
    public static final zzun a = new zzux(emy.b);
    private static final ely b = (elr.a() ? new emb(0) : new elx(0));
    int zzbst = 0;

    zzun() {
    }

    public static /* synthetic */ int a(byte b2) {
        return b2 & 255;
    }

    public abstract byte a(int i);

    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    /* access modifiers changed from: 0000 */
    public abstract void a(elt elt);

    public abstract byte b(int i);

    public abstract zzun c(int i);

    public abstract boolean c();

    public abstract boolean equals(Object obj);

    public static zzun a(byte[] bArr, int i, int i2) {
        a(i, i + i2, bArr.length);
        return new zzux(b.a(bArr, i, i2));
    }

    public static zzun a(byte[] bArr) {
        return new zzux(bArr);
    }

    public static zzun a(String str) {
        return new zzux(str.getBytes(emy.a));
    }

    public final String b() {
        return a() == 0 ? "" : a(emy.a);
    }

    public final int hashCode() {
        int i = this.zzbst;
        if (i == 0) {
            int a2 = a();
            i = a(a2, a2);
            if (i == 0) {
                i = 1;
            }
            this.zzbst = i;
        }
        return i;
    }

    public static ema d(int i) {
        return new ema(i, 0);
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

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a())});
    }

    public /* synthetic */ Iterator iterator() {
        return new elu(this);
    }

    static {
        new elv();
    }
}
