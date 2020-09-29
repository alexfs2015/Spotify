package defpackage;

import android.net.Uri;

/* renamed from: fao reason: default package */
public final class fao {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public fao(String str, long j, long j2) {
        if (str == null) {
            str = "";
        }
        this.c = str;
        this.a = j;
        this.b = j2;
    }

    public final Uri a(String str) {
        return bdv.a(str, this.c);
    }

    public final String b(String str) {
        return bdv.b(str, this.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = ((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fao fao = (fao) obj;
            return this.a == fao.a && this.b == fao.b && this.c.equals(fao.c);
        }
    }
}
