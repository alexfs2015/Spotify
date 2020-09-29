package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.List;

/* renamed from: ity reason: default package */
abstract class ity extends iuh {
    final PlayerTrack a;
    final List<PlayerTrack> b;
    final List<PlayerTrack> c;
    final PlayerRestrictions d;
    final String e;
    final String f;
    final boolean g;
    final boolean h;
    final long i;
    final long j;
    final float k;

    ity(PlayerTrack playerTrack, List<PlayerTrack> list, List<PlayerTrack> list2, PlayerRestrictions playerRestrictions, String str, String str2, boolean z, boolean z2, long j2, long j3, float f2) {
        this.a = playerTrack;
        if (list != null) {
            this.b = list;
            if (list2 != null) {
                this.c = list2;
                if (playerRestrictions != null) {
                    this.d = playerRestrictions;
                    if (str != null) {
                        this.e = str;
                        if (str2 != null) {
                            this.f = str2;
                            this.g = z;
                            this.h = z2;
                            this.i = j2;
                            this.j = j3;
                            this.k = f2;
                            return;
                        }
                        throw new NullPointerException("Null entityUri");
                    }
                    throw new NullPointerException("Null contextUri");
                }
                throw new NullPointerException("Null restrictions");
            }
            throw new NullPointerException("Null future");
        }
        throw new NullPointerException("Null reverse");
    }

    public final PlayerTrack a() {
        return this.a;
    }

    public final List<PlayerTrack> b() {
        return this.b;
    }

    public final List<PlayerTrack> c() {
        return this.c;
    }

    public final PlayerRestrictions d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final long i() {
        return this.i;
    }

    public final long j() {
        return this.j;
    }

    public final float k() {
        return this.k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MiniPlayerStateViewModel{track=");
        sb.append(this.a);
        sb.append(", reverse=");
        sb.append(this.b);
        sb.append(", future=");
        sb.append(this.c);
        sb.append(", restrictions=");
        sb.append(this.d);
        sb.append(", contextUri=");
        sb.append(this.e);
        sb.append(", entityUri=");
        sb.append(this.f);
        sb.append(", isPaused=");
        sb.append(this.g);
        sb.append(", isInLoadingState=");
        sb.append(this.h);
        sb.append(", currentPlaybackPosition=");
        sb.append(this.i);
        sb.append(", duration=");
        sb.append(this.j);
        sb.append(", playbackSpeed=");
        sb.append(this.k);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iuh) {
            iuh iuh = (iuh) obj;
            PlayerTrack playerTrack = this.a;
            if (playerTrack != null ? playerTrack.equals(iuh.a()) : iuh.a() == null) {
                return this.b.equals(iuh.b()) && this.c.equals(iuh.c()) && this.d.equals(iuh.d()) && this.e.equals(iuh.e()) && this.f.equals(iuh.f()) && this.g == iuh.g() && this.h == iuh.h() && this.i == iuh.i() && this.j == iuh.j() && Float.floatToIntBits(this.k) == Float.floatToIntBits(iuh.k());
            }
        }
    }

    public int hashCode() {
        PlayerTrack playerTrack = this.a;
        int i2 = 1231;
        int hashCode = ((((((((((((((playerTrack == null ? 0 : playerTrack.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003;
        if (!this.h) {
            i2 = 1237;
        }
        int i3 = (hashCode ^ i2) * 1000003;
        long j2 = this.i;
        int i4 = (i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.j;
        return ((i4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Float.floatToIntBits(this.k);
    }
}
