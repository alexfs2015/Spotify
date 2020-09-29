package defpackage;

import android.net.Uri;

/* renamed from: fbf reason: default package */
public final class fbf {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public fbf(String str, long j, long j2) {
        if (str == null) {
            str = "";
        }
        this.c = str;
        this.a = j;
        this.b = j2;
    }

    public final Uri a(String str) {
        return bem.a(str, this.c);
    }

    public final String b(String str) {
        return bem.b(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fbf fbf = (fbf) obj;
            return this.a == fbf.a && this.b == fbf.b && this.c.equals(fbf.c);
        }
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = ((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        }
        return this.d;
    }
}
