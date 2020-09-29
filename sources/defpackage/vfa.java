package defpackage;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: vfa reason: default package */
public final class vfa implements vua<AndroidLibsPlaylistEntityConfigurationProperties> {
    private final wlc<vgw> a;

    private vfa(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vfa a(wlc<vgw> wlc) {
        return new vfa(wlc);
    }

    public static AndroidLibsPlaylistEntityConfigurationProperties a(vgw vgw) {
        return (AndroidLibsPlaylistEntityConfigurationProperties) vuf.a(vez.a(vgw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((vgw) this.a.get());
    }
}
