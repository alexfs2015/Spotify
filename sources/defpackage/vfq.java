package defpackage;

import com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties;

/* renamed from: vfq reason: default package */
public final class vfq implements vua<AndroidMusicLibsPlaylistProperties> {
    private final wlc<vgw> a;

    private vfq(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vfq a(wlc<vgw> wlc) {
        return new vfq(wlc);
    }

    public static AndroidMusicLibsPlaylistProperties a(vgw vgw) {
        return (AndroidMusicLibsPlaylistProperties) vuf.a(vfp.a(vgw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((vgw) this.a.get());
    }
}
