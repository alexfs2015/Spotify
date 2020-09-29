package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.List;

/* renamed from: iws reason: default package */
public abstract class iws implements Parcelable {
    public static iws a(PlayerTrack playerTrack, List<PlayerTrack> list, List<PlayerTrack> list2, PlayerRestrictions playerRestrictions, String str, String str2, boolean z, boolean z2, long j, long j2, float f) {
        iwk iwk = new iwk(playerTrack, list, list2, playerRestrictions, str, str2, z, z2, j, j2, f);
        return iwk;
    }

    public abstract PlayerTrack a();

    public abstract List<PlayerTrack> b();

    public abstract List<PlayerTrack> c();

    public abstract PlayerRestrictions d();

    public abstract String e();

    public abstract String f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract long i();

    public abstract long j();

    public abstract float k();
}
