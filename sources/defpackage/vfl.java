package defpackage;

import com.spotify.remoteconfig.AndroidLibsShareProperties;

/* renamed from: vfl reason: default package */
public final class vfl implements vua<AndroidLibsShareProperties> {
    private final wlc<vgw> a;

    private vfl(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vfl a(wlc<vgw> wlc) {
        return new vfl(wlc);
    }

    public static AndroidLibsShareProperties a(vgw vgw) {
        return (AndroidLibsShareProperties) vuf.a(vfk.a(vgw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((vgw) this.a.get());
    }
}
