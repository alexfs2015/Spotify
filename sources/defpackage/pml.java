package defpackage;

import com.google.common.hash.Hashing;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: pml reason: default package */
public final class pml {
    public final PlayerTrack a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final String f;

    public static pml a(PlayerTrack playerTrack, boolean z, boolean z2, boolean z3, boolean z4) {
        pml pml = new pml(playerTrack, z, z2, z3, z4);
        return pml;
    }

    private pml(PlayerTrack playerTrack, boolean z, boolean z2, boolean z3, boolean z4) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pml)) {
            return false;
        }
        pml pml = (pml) obj;
        if (this.b == pml.b && this.c == pml.c && this.d == pml.d && this.e == pml.e) {
            return this.a.uid().equals(pml.a.uid());
        }
        return false;
    }

    public final int hashCode() {
        return Hashing.a().a().a(this.a.uid(), far.c).a(this.f, far.c).a().b();
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
