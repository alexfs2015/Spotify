package defpackage;

import com.spotify.music.features.nowplayingbar.domain.model.Accessory;

/* renamed from: oen reason: default package */
public final class oen extends oeo {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final Accessory d;

    public oen(String str, boolean z, boolean z2, Accessory accessory) {
        if (str != null) {
            this.a = str;
            this.b = z;
            this.c = z2;
            if (accessory != null) {
                this.d = accessory;
                return;
            }
            throw new NullPointerException("Null accessory");
        }
        throw new NullPointerException("Null currentTrackUri");
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final Accessory d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oeo) {
            oeo oeo = (oeo) obj;
            return this.a.equals(oeo.a()) && this.b == oeo.b() && this.c == oeo.c() && this.d.equals(oeo.d());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowPlayingBarLoggingModel{currentTrackUri=");
        sb.append(this.a);
        sb.append(", currentTrackIsInCollection=");
        sb.append(this.b);
        sb.append(", isPlaying=");
        sb.append(this.c);
        sb.append(", accessory=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
