package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: tjs reason: default package */
public final class tjs {
    final Context a;
    final Player b;
    private final vdk c;

    public tjs(Context context, Player player, vdk vdk) {
        this.a = context;
        this.b = player;
        this.c = vdk;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fvb fvb) {
        boolean shufflingContext = ((PlayerState) fbp.a(this.b.getLastPlayerState())).options().shufflingContext();
        this.c.d(shufflingContext);
        this.b.setShufflingContext(!shufflingContext);
    }

    static boolean a(PlayerState playerState) {
        return playerState.restrictions().disallowTogglingShuffleReasons().isEmpty();
    }

    public final a a() {
        return new $$Lambda$tjs$pURVKZGtBitxxuF5GUyQvkA8w(this);
    }
}
