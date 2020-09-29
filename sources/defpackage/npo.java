package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;

/* renamed from: npo reason: default package */
public final class npo implements wig<HomeMixFormatListAttributesHelper> {
    private final wzi<rwl> a;

    private npo(wzi<rwl> wzi) {
        this.a = wzi;
    }

    public static npo a(wzi<rwl> wzi) {
        return new npo(wzi);
    }

    public final /* synthetic */ Object get() {
        return new HomeMixFormatListAttributesHelper((rwl) this.a.get());
    }
}
