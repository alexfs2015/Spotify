package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: qxt reason: default package */
public final class qxt implements uvv {
    private final Resources a;
    private final tmo b;

    public qxt(Resources resources, tmo tmo) {
        this.a = resources;
        this.b = tmo;
    }

    public final String a(PlayerState playerState) {
        return this.b.a(playerState).a(this.a);
    }

    public final String b(PlayerState playerState) {
        return this.b.a(playerState).b(this.a);
    }
}
