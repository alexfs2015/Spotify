package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;

/* renamed from: nti reason: default package */
public final class nti implements wig<nth> {
    private final wzi<HomeMixFormatListAttributesHelper> a;
    private final wzi<fqn> b;

    private nti(wzi<HomeMixFormatListAttributesHelper> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nti a(wzi<HomeMixFormatListAttributesHelper> wzi, wzi<fqn> wzi2) {
        return new nti(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nth((HomeMixFormatListAttributesHelper) this.a.get(), (fqn) this.b.get());
    }
}
