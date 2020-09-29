package defpackage;

import com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties;

/* renamed from: vfy reason: default package */
public final class vfy implements vua<AppsMusicLibsRemoteconfigProperties> {
    private final wlc<vgw> a;

    private vfy(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vfy a(wlc<vgw> wlc) {
        return new vfy(wlc);
    }

    public final /* synthetic */ Object get() {
        return (AppsMusicLibsRemoteconfigProperties) vuf.a(vfx.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
