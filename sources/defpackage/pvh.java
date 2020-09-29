package defpackage;

import com.google.common.hash.Hashing;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: pvh reason: default package */
public final class pvh {
    public final PlayerTrack a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final String f;

    private pvh(PlayerTrack playerTrack, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = playerTrack;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        String str = (String) this.a.metadata().get("iteration");
        if (str == null) {
            str = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        }
        this.f = str;
    }

    public static pvh a(PlayerTrack playerTrack, boolean z, boolean z2, boolean z3, boolean z4) {
        pvh pvh = new pvh(playerTrack, z, z2, z3, z4);
        return pvh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvh)) {
            return false;
        }
        pvh pvh = (pvh) obj;
        if (this.b == pvh.b && this.c == pvh.c && this.d == pvh.d && this.e == pvh.e) {
            return this.a.uid().equals(pvh.a.uid());
        }
        return false;
    }

    public final int hashCode() {
        return Hashing.a().a().a(this.a.uid(), fbi.c).a(this.f, fbi.c).a().b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueTrack{mTrack=");
        sb.append(this.a);
        sb.append(", mIsRemovable=");
        sb.append(this.b);
        sb.append(", mIsQueueable=");
        sb.append(this.c);
        sb.append(", mIsDraggable=");
        sb.append(this.d);
        sb.append(", mIsMuted=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
