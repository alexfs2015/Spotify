package defpackage;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: vrx reason: default package */
public final class vrx implements wig<AndroidLibsPlaylistEntityConfigurationProperties> {
    private final wzi<vub> a;

    private vrx(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static AndroidLibsPlaylistEntityConfigurationProperties a(vub vub) {
        return (AndroidLibsPlaylistEntityConfigurationProperties) wil.a(vrw.a(vub), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static vrx a(wzi<vub> wzi) {
        return new vrx(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((vub) this.a.get());
    }
}
