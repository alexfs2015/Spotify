package defpackage;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

/* renamed from: vrl reason: default package */
public final class vrl implements wig<AndroidFeatureSearchProperties> {
    private final wzi<vub> a;

    private vrl(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vrl a(wzi<vub> wzi) {
        return new vrl(wzi);
    }

    public final /* synthetic */ Object get() {
        return (AndroidFeatureSearchProperties) wil.a(vrk.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
