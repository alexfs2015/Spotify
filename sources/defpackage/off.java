package defpackage;

import java.util.List;

/* renamed from: off reason: default package */
public final class off extends ofn {
    private final List<ofm> a;
    private final int b;
    private final boolean c;
    private final boolean d;

    public off(List<ofm> list, int i, boolean z, boolean z2) {
        if (list != null) {
            this.a = list;
            this.b = i;
            this.c = z;
            this.d = z2;
            return;
        }
        throw new NullPointerException("Null tracks");
    }

    public final List<ofm> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ofn) {
            ofn ofn = (ofn) obj;
            return this.a.equals(ofn.a()) && this.b == ofn.b() && this.c == ofn.c() && this.d == ofn.d();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TracksCarouselViewData{tracks=");
        sb.append(this.a);
        sb.append(", currentTrackIndex=");
        sb.append(this.b);
        sb.append(", disallowScrollLeft=");
        sb.append(this.c);
        sb.append(", disallowScrollRight=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
