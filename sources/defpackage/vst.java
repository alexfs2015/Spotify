package defpackage;

import com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties;

/* renamed from: vst reason: default package */
public final class vst implements wig<AndroidMusicLibsPlaylistProperties> {
    private final wzi<vub> a;

    private vst(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static AndroidMusicLibsPlaylistProperties a(vub vub) {
        return (AndroidMusicLibsPlaylistProperties) wil.a(vss.a(vub), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static vst a(wzi<vub> wzi) {
        return new vst(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((vub) this.a.get());
    }
}
