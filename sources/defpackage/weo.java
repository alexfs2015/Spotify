package defpackage;

import com.spotify.player.model.PlayerState;

/* renamed from: weo reason: default package */
public abstract class weo {
    public static weo a(PlayerState playerState, String str, boolean z) {
        return new wej(playerState, str, z);
    }

    public abstract PlayerState a();

    public abstract String b();

    public abstract boolean c();
}
