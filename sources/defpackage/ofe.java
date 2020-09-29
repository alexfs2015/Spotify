package defpackage;

import android.content.res.Resources;

/* renamed from: ofe reason: default package */
final class ofe extends ofm {
    private final String a;
    private final knx<Resources, String> b;
    private final knx<Resources, String> c;

    ofe(String str, knx<Resources, String> knx, knx<Resources, String> knx2) {
        if (str != null) {
            this.a = str;
            if (knx != null) {
                this.b = knx;
                if (knx2 != null) {
                    this.c = knx2;
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
    public final knx<Resources, String> b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final knx<Resources, String> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ofm) {
            ofm ofm = (ofm) obj;
            return this.a.equals(ofm.a()) && this.b.equals(ofm.b()) && this.c.equals(ofm.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
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
}
