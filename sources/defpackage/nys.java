package defpackage;

import android.content.res.Resources;

/* renamed from: nys reason: default package */
final class nys extends nza {
    private final String a;
    private final kko<Resources, String> b;
    private final kko<Resources, String> c;

    nys(String str, kko<Resources, String> kko, kko<Resources, String> kko2) {
        if (str != null) {
            this.a = str;
            if (kko != null) {
                this.b = kko;
                if (kko2 != null) {
                    this.c = kko2;
                    return;
                }
                throw new NullPointerException("Null subtitle");
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null uid");
    }

    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final kko<Resources, String> b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final kko<Resources, String> c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackViewData{uid=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nza) {
            nza nza = (nza) obj;
            return this.a.equals(nza.a()) && this.b.equals(nza.b()) && this.c.equals(nza.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
