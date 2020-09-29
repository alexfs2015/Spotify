package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: vrg reason: default package */
public abstract class vrg {
    public abstract PlayerState a();

    public abstract String b();

    public abstract boolean c();

    public static vrg a(PlayerState playerState, String str, boolean z) {
        return new vrb(playerState, str, z);
    }
}
