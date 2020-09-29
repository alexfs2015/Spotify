package defpackage;

import com.google.common.base.Function;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: stl reason: default package */
public final class stl {
    private final suc a;
    private final sue b;
    private final String c;
    private final Player d;
    private final gwz e;
    private boolean f;

    public stl(String str, Player player, gwz gwz, suc suc, sue sue) {
        this.c = str;
        this.d = player;
        this.e = gwz;
        this.a = suc;
        this.b = sue;
    }

    /* access modifiers changed from: private */
    public static hcm a(hcm hcm) {
        return (hcm) fcp.a((Iterable<E>) hcm.children()).c($$Lambda$stl$uivprG6RggQVIoBfDwRhxbgA4ts.INSTANCE).d();
    }

    private boolean a(String str) {
        PlayerState lastPlayerState = this.d.getLastPlayerState();
        return lastPlayerState != null && lastPlayerState.isPlaying() && !lastPlayerState.isPaused() && lastPlayerState.contextUri().equals(str);
    }

    private static hcm b(hcs hcs) {
        hcm c2 = c(hcs);
        return c2 == null ? d(hcs) : c2;
    }

    /* access modifiers changed from: private */
    public static boolean b(hcm hcm) {
        return hcm != null && hcm.componentId().id().equals("lowFrictionSearch:shuffleButton");
    }

    private static hcm c(hcs hcs) {
        hcm header = hcs.header();
        if (header == null) {
            return null;
        }
        return a(header);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(hcm hcm) {
        return hcm != null;
    }

    private static hcm d(hcs hcs) {
        return (hcm) fcp.a((Iterable<E>) hcs.body()).a((Function<? super E, T>) $$Lambda$stl$CagnW2iNU8MqjYilF_HfQukrqWI.INSTANCE).c($$Lambda$stl$O6vRleyKNvJMeoD_y4KcEFUiBUM.INSTANCE).d();
    }

    public final void a(hcs hcs) {
        if (!this.f) {
            this.f = true;
            hcm b2 = b(hcs);
            if (this.a.c() && b2 != null && !a(this.c)) {
                this.b.b(this.c, "entity");
                this.e.a(gwy.a("click", b2));
            }
            if (b2 == null) {
                Logger.e("Can't find shuffle button view model.", new Object[0]);
            }
        }
    }
}
