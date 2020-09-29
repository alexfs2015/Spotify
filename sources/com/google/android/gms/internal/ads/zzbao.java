package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

public class zzbao extends zzban {
    protected final byte[] zzdpw;

    public zzbao(byte[] bArr) {
        this.zzdpw = bArr;
    }

    public byte a(int i) {
        return this.zzdpw[i];
    }

    public int a() {
        return this.zzdpw.length;
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2) {
        return dda.a(i, this.zzdpw, f(), i2);
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(this.zzdpw, f(), a(), charset);
    }

    /* access modifiers changed from: 0000 */
    public final void a(dby dby) {
        dby.a(this.zzdpw, f(), a());
    }

    /* access modifiers changed from: protected */
    public void a(byte[] bArr, int i) {
        System.arraycopy(this.zzdpw, 0, bArr, 0, i);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(zzbah zzbah, int i) {
        if (i > zzbah.a()) {
            int a = a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i > zzbah.a()) {
            int a2 = zzbah.a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzbah instanceof zzbao)) {
            return zzbah.b(i).equals(b(i));
        } else {
            zzbao zzbao = (zzbao) zzbah;
            byte[] bArr = this.zzdpw;
            byte[] bArr2 = zzbao.zzdpw;
            int f = f() + i;
            int f2 = f();
            int f3 = zzbao.f();
            while (f2 < f) {
                if (bArr[f2] != bArr2[f3]) {
                    return false;
                }
                f2++;
                f3++;
            }
            return true;
        }
    }

    public final zzbah b(int i) {
        int a = a(0, i, a());
        return a == 0 ? zzbah.a : new zzbak(this.zzdpw, f(), a);
    }

    public final boolean d() {
        int f = f();
        return dfs.a(this.zzdpw, f, a() + f);
    }

    public final dce e() {
        return dce.a(this.zzdpw, f(), a(), true);
    }

    /* access modifiers changed from: protected */
    public int f() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbah) || a() != ((zzbah) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (!(obj instanceof zzbao)) {
            return obj.equals(this);
        }
        zzbao zzbao = (zzbao) obj;
        int i = this.zzdpa;
        int i2 = zzbao.zzdpa;
        if (i == 0 || i2 == 0 || i == i2) {
            return a(zzbao, a());
        }
        return false;
    }
}
