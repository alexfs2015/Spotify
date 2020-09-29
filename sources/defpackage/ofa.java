package defpackage;

/* renamed from: ofa reason: default package */
public final class ofa extends ofh {
    private final ofm a;
    private final ofg b;

    public ofa(ofm ofm, ofg ofg) {
        if (ofm != null) {
            this.a = ofm;
            if (ofg != null) {
                this.b = ofg;
                return;
            }
            throw new NullPointerException("Null connectViewData");
        }
        throw new NullPointerException("Null track");
    }

    public final ofm a() {
        return this.a;
    }

    public final ofg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ofh) {
            ofh ofh = (ofh) obj;
            return this.a.equals(ofh.a()) && this.b.equals(ofh.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowPlayingBarCarouselItem{track=");
        sb.append(this.a);
        sb.append(", connectViewData=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
