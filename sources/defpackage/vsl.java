package defpackage;

import com.spotify.remoteconfig.AndroidLibsShareProperties;

/* renamed from: vsl reason: default package */
public final class vsl implements wig<AndroidLibsShareProperties> {
    private final wzi<vub> a;

    private vsl(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static AndroidLibsShareProperties a(vub vub) {
        return (AndroidLibsShareProperties) wil.a(vsk.a(vub), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static vsl a(wzi<vub> wzi) {
        return new vsl(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((vub) this.a.get());
    }
}
