package defpackage;

import com.google.common.base.Function;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;

/* renamed from: msw reason: default package */
public final class msw {
    private final Player a;
    private final String b;
    private final String c;
    private final guz d;
    private boolean e;

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(gzt gzt) {
        return gzt != null;
    }

    public msw(Player player, String str, String str2, guz guz) {
        this.a = player;
        this.c = str;
        this.b = str2;
        this.d = guz;
    }

    public final void a(gzz gzz, mvp mvp) {
        if (!this.e) {
            boolean z = true;
            this.e = true;
            String str = "click";
            if (!fax.a(this.b)) {
                String str2 = this.b;
                gzt gzt = (gzt) fbx.a((Iterable<E>) gzz.body()).c(new $$Lambda$msw$Laq31X5WwSEqQ0dJVgfX_X3mKo(str2)).d();
                if (gzt != null) {
                    PlayerState lastPlayerState = this.a.getLastPlayerState();
                    if (lastPlayerState == null || !lastPlayerState.isPlaying() || lastPlayerState.isPaused() || !lastPlayerState.track().uri().equals(str2)) {
                        z = false;
                    }
                    if (!z) {
                        this.d.a(guy.a(str, gzt));
                    }
                    mvp.scrollTo(gzz.body().indexOf(gzt));
                }
                return;
            }
            gzt gzt2 = (gzt) fbx.a((Iterable<E>) gzz.body()).a((Function<? super E, T>) $$Lambda$msw$fWM8SelJ0GHDmqqUJUXkbQacFOM.INSTANCE).c($$Lambda$msw$bz496MQirin_kxnsjmEUt_JbIb0.INSTANCE).d();
            if (gzt2 != null) {
                String str3 = this.c;
                PlayerState lastPlayerState2 = this.a.getLastPlayerState();
                if (lastPlayerState2 == null || !lastPlayerState2.isPlaying() || lastPlayerState2.isPaused() || !lastPlayerState2.contextUri().equals(str3)) {
                    z = false;
                }
                if (!z) {
                    this.d.a(guy.a(str, gzt2));
                }
            }
            if (gzt2 == null) {
                Logger.e("Can't find shuffle button view model.", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, gzt gzt) {
        String id = gzt.componentId().id();
        return (id.equals("glue2:trackRow") || id.equals("glue:entityRow") || id.equals("row:trackWithDownloadProgress")) && str.equals(gzt.metadata().string("uri"));
    }

    /* access modifiers changed from: private */
    public static gzt a(gzt gzt) {
        return (gzt) fbx.a((Iterable<E>) gzt.children()).c($$Lambda$msw$Nr5pggEwOQB6CJRFILcVxX5no.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static boolean b(gzt gzt) {
        return gzt != null && HubsGlueComponent.SHUFFLE_BUTTON.id().equals(gzt.componentId().id());
    }
}
