package defpackage;

import com.spotify.music.features.nowplayingbar.domain.model.Accessory;

/* renamed from: nxi reason: default package */
final class nxi extends nxn {
    private final nxp b;
    private final Accessory c;
    private final gsd d;
    private final uax e;

    nxi(nxp nxp, Accessory accessory, gsd gsd, uax uax) {
        if (nxp != null) {
            this.b = nxp;
            if (accessory != null) {
                this.c = accessory;
                if (gsd != null) {
                    this.d = gsd;
                    if (uax != null) {
                        this.e = uax;
                        return;
                    }
                    throw new NullPointerException("Null socialListeningState");
                }
                throw new NullPointerException("Null connectState");
            }
            throw new NullPointerException("Null accessory");
        }
        throw new NullPointerException("Null playerInfo");
    }

    public final nxp a() {
        return this.b;
    }

    public final Accessory b() {
        return this.c;
    }

    public final gsd c() {
        return this.d;
    }

    public final uax d() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowPlayingBarModel{playerInfo=");
        sb.append(this.b);
        sb.append(", accessory=");
        sb.append(this.c);
        sb.append(", connectState=");
        sb.append(this.d);
        sb.append(", socialListeningState=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nxn) {
            nxn nxn = (nxn) obj;
            return this.b.equals(nxn.a()) && this.c.equals(nxn.b()) && this.d.equals(nxn.c()) && this.e.equals(nxn.d());
        }
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
