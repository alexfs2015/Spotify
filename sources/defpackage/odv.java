package defpackage;

import com.spotify.music.features.nowplayingbar.domain.model.Accessory;

/* renamed from: odv reason: default package */
final class odv extends oea {
    private final oec b;
    private final Accessory c;
    private final gud d;
    private final uns e;

    odv(oec oec, Accessory accessory, gud gud, uns uns) {
        if (oec != null) {
            this.b = oec;
            if (accessory != null) {
                this.c = accessory;
                if (gud != null) {
                    this.d = gud;
                    if (uns != null) {
                        this.e = uns;
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

    public final oec a() {
        return this.b;
    }

    public final Accessory b() {
        return this.c;
    }

    public final gud c() {
        return this.d;
    }

    public final uns d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oea) {
            oea oea = (oea) obj;
            return this.b.equals(oea.a()) && this.c.equals(oea.b()) && this.d.equals(oea.c()) && this.e.equals(oea.d());
        }
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
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
}
