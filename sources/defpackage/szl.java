package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: szl reason: default package */
public final class szl {
    final Context a;
    final Player b;
    private final usf c;

    public szl(Context context, Player player, usf usf) {
        this.a = context;
        this.b = player;
        this.c = usf;
    }

    public final a a() {
        return new $$Lambda$szl$momBNB_GgBMF6T5V6R8VwtA8bZw(this);
    }

    static boolean a(PlayerState playerState) {
        return playerState.restrictions().disallowTogglingShuffleReasons().isEmpty();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fuh fuh) {
        boolean shufflingContext = ((PlayerState) fay.a(this.b.getLastPlayerState())).options().shufflingContext();
        this.c.d(shufflingContext);
        this.b.setShufflingContext(!shufflingContext);
    }
}
