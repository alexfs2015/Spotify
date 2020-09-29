package defpackage;

import com.google.common.base.Function;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: sje reason: default package */
public final class sje {
    private final sjv a;
    private final sjx b;
    private final String c;
    private final Player d;
    private final guz e;
    private boolean f;

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(gzt gzt) {
        return gzt != null;
    }

    public sje(String str, Player player, guz guz, sjv sjv, sjx sjx) {
        this.c = str;
        this.d = player;
        this.e = guz;
        this.a = sjv;
        this.b = sjx;
    }

    public final void a(gzz gzz) {
        if (!this.f) {
            this.f = true;
            gzt b2 = b(gzz);
            if (this.a.c() && b2 != null && !a(this.c)) {
                this.b.b(this.c, "entity");
                this.e.a(guy.a("click", b2));
            }
            if (b2 == null) {
                Logger.e("Can't find shuffle button view model.", new Object[0]);
            }
        }
    }

    private boolean a(String str) {
        PlayerState lastPlayerState = this.d.getLastPlayerState();
        return lastPlayerState != null && lastPlayerState.isPlaying() && !lastPlayerState.isPaused() && lastPlayerState.contextUri().equals(str);
    }

    private static gzt b(gzz gzz) {
        gzt c2 = c(gzz);
        return c2 == null ? d(gzz) : c2;
    }

    private static gzt c(gzz gzz) {
        gzt header = gzz.header();
        if (header == null) {
            return null;
        }
        return a(header);
    }

    private static gzt d(gzz gzz) {
        return (gzt) fbx.a((Iterable<E>) gzz.body()).a((Function<? super E, T>) $$Lambda$sje$SqET5e6EOmvBRflvkE6LHNqyqE.INSTANCE).c($$Lambda$sje$Fm0WEKySfoXpLwCdEx1p0Tz7Q.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static gzt a(gzt gzt) {
        return (gzt) fbx.a((Iterable<E>) gzt.children()).c($$Lambda$sje$lV0WJfP677iVuyXUchcUdjMXtY.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static boolean b(gzt gzt) {
        return gzt != null && gzt.componentId().id().equals("lowFrictionSearch:shuffleButton");
    }
}
