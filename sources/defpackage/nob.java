package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;

/* renamed from: nob reason: default package */
public final class nob {
    final wlc<oix> a;
    final wlc<uxh> b;
    final wlc<HomeMixFormatListAttributesHelper> c;
    final wlc<nke> d;
    final wlc<String> e;
    final wlc<kxz> f;
    final wlc<a> g;

    public nob(wlc<oix> wlc, wlc<uxh> wlc2, wlc<HomeMixFormatListAttributesHelper> wlc3, wlc<nke> wlc4, wlc<String> wlc5, wlc<kxz> wlc6, wlc<a> wlc7) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
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
