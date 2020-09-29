package defpackage;

import com.google.common.base.Function;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;

/* renamed from: mxx reason: default package */
public final class mxx {
    private final Player a;
    private final String b;
    private final String c;
    private final gwz d;
    private boolean e;

    public mxx(Player player, String str, String str2, gwz gwz) {
        this.a = player;
        this.c = str;
        this.b = str2;
        this.d = gwz;
    }

    /* access modifiers changed from: private */
    public static hcm a(hcm hcm) {
        return (hcm) fcp.a((Iterable<E>) hcm.children()).c($$Lambda$mxx$ZOjCO7kdVaLDbJK0UNX5TfuiAQ.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, hcm hcm) {
        String id = hcm.componentId().id();
        return (id.equals("glue2:trackRow") || id.equals("glue:entityRow") || id.equals("row:trackWithDownloadProgress")) && str.equals(hcm.metadata().string("uri"));
    }

    /* access modifiers changed from: private */
    public static boolean b(hcm hcm) {
        return hcm != null && HubsGlueComponent.SHUFFLE_BUTTON.id().equals(hcm.componentId().id());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(hcm hcm) {
        return hcm != null;
    }

    public final void a(hcs hcs, naq naq) {
        if (!this.e) {
            boolean z = true;
            this.e = true;
            String str = "click";
            if (!fbo.a(this.b)) {
                String str2 = this.b;
                hcm hcm = (hcm) fcp.a((Iterable<E>) hcs.body()).c(new $$Lambda$mxx$IcUuPkvHBwwiTjA1dgczW2nhmM(str2)).d();
                if (hcm != null) {
                    PlayerState lastPlayerState = this.a.getLastPlayerState();
                    if (lastPlayerState == null || !lastPlayerState.isPlaying() || lastPlayerState.isPaused() || !lastPlayerState.track().uri().equals(str2)) {
                        z = false;
                    }
                    if (!z) {
                        this.d.a(gwy.a(str, hcm));
                    }
                    naq.scrollTo(hcs.body().indexOf(hcm));
                }
                return;
            }
            hcm hcm2 = (hcm) fcp.a((Iterable<E>) hcs.body()).a((Function<? super E, T>) $$Lambda$mxx$rhsyi45MIukdovFbngsUrvWiTvQ.INSTANCE).c($$Lambda$mxx$a0il97PrvZMDRjD0UjFxzOCGa_E.INSTANCE).d();
            if (hcm2 != null) {
                String str3 = this.c;
                PlayerState lastPlayerState2 = this.a.getLastPlayerState();
                if (lastPlayerState2 == null || !lastPlayerState2.isPlaying() || lastPlayerState2.isPaused() || !lastPlayerState2.contextUri().equals(str3)) {
                    z = false;
                }
                if (!z) {
                    this.d.a(gwy.a(str, hcm2));
                }
            }
            if (hcm2 == null) {
                Logger.e("Can't find shuffle button view model.", new Object[0]);
            }
        }
    }
}
