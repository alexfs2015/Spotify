package defpackage;

/* renamed from: nyo reason: default package */
public final class nyo extends nyv {
    private final nza a;
    private final nyu b;

    public nyo(nza nza, nyu nyu) {
        if (nza != null) {
            this.a = nza;
            if (nyu != null) {
                this.b = nyu;
                return;
            }
            throw new NullPointerException("Null connectViewData");
        }
        throw new NullPointerException("Null track");
    }

    public final nza a() {
        return this.a;
    }

    public final nyu b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowPlayingBarCarouselItem{track=");
        sb.append(this.a);
        sb.append(", connectViewData=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nyv) {
            nyv nyv = (nyv) obj;
            return this.a.equals(nyv.a()) && this.b.equals(nyv.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
