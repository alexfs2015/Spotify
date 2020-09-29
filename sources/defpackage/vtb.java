package defpackage;

import com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties;

/* renamed from: vtb reason: default package */
public final class vtb implements wig<AppsMusicLibsRemoteconfigProperties> {
    private final wzi<vub> a;

    private vtb(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vtb a(wzi<vub> wzi) {
        return new vtb(wzi);
    }

    public final /* synthetic */ Object get() {
        return (AppsMusicLibsRemoteconfigProperties) wil.a(vta.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
