package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;

/* renamed from: nmo reason: default package */
public final class nmo {
    final wlc<oix> a;
    final wlc<a> b;
    final wlc<orf> c;
    final wlc<a> d;
    final wlc<HomeMixFormatListAttributesHelper> e;
    final wlc<nng> f;
    final wlc<hvl> g;
    final wlc<HomeMixInteractionLogger> h;

    nmo(wlc<oix> wlc, wlc<a> wlc2, wlc<orf> wlc3, wlc<a> wlc4, wlc<HomeMixFormatListAttributesHelper> wlc5, wlc<nng> wlc6, wlc<hvl> wlc7, wlc<HomeMixInteractionLogger> wlc8) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
        this.h = (wlc) a(wlc8, 8);
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
