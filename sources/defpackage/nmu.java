package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;

/* renamed from: nmu reason: default package */
public final class nmu {
    final wlc<ood> a;
    final wlc<a<ooa>> b;
    final wlc<oob> c;
    final wlc<nml> d;
    final wlc<sih> e;
    final wlc<HomeMixFormatListAttributesHelper> f;

    public nmu(wlc<ood> wlc, wlc<a<ooa>> wlc2, wlc<oob> wlc3, wlc<nml> wlc4, wlc<sih> wlc5, wlc<HomeMixFormatListAttributesHelper> wlc6) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
