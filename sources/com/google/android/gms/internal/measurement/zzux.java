package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

public class zzux extends zzuw {
    protected final byte[] zzbvb;

    public zzux(byte[] bArr) {
        if (bArr != null) {
            this.zzbvb = bArr;
            return;
        }
        throw new NullPointerException();
    }

    public byte a(int i) {
        return this.zzbvb[i];
    }

    public int a() {
        return this.zzbvb.length;
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2) {
        return enp.a(i, this.zzbvb, d(), i2);
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(this.zzbvb, d(), a(), charset);
    }

    /* access modifiers changed from: 0000 */
    public final void a(emk emk) {
        emk.a(this.zzbvb, d(), a());
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(zzun zzun, int i) {
        if (i > zzun.a()) {
            int a = a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i > zzun.a()) {
            int a2 = zzun.a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzun instanceof zzux)) {
            return zzun.c(i).equals(c(i));
        } else {
            zzux zzux = (zzux) zzun;
            byte[] bArr = this.zzbvb;
            byte[] bArr2 = zzux.zzbvb;
            int d = d() + i;
            int d2 = d();
            int d3 = zzux.d();
            while (d2 < d) {
                if (bArr[d2] != bArr2[d3]) {
                    return false;
                }
                d2++;
                d3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public byte b(int i) {
        return this.zzbvb[i];
    }

    public final zzun c(int i) {
        int a = a(0, i, a());
        return a == 0 ? zzun.a : new zzus(this.zzbvb, d(), a);
    }

    public final boolean c() {
        int d = d();
        return eqd.a(this.zzbvb, d, a() + d);
    }

    /* access modifiers changed from: protected */
    public int d() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzun) || a() != ((zzun) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (!(obj instanceof zzux)) {
            return obj.equals(this);
        }
        zzux zzux = (zzux) obj;
        int i = this.zzbst;
        int i2 = zzux.zzbst;
        if (i == 0 || i2 == 0 || i == i2) {
            return a(zzux, a());
        }
        return false;
    }
}
