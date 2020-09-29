package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: ukl reason: default package */
public final class ukl implements ukk {
    private final Resources a;
    private final tch b;

    public ukl(Resources resources, tch tch) {
        this.a = resources;
        this.b = tch;
    }

    public final String a(PlayerState playerState) {
        return this.b.a(playerState).a(this.a);
    }

    public final String b(PlayerState playerState) {
        return this.b.a(playerState).b(this.a);
    }
}
