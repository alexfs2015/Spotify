package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;

/* renamed from: nsd reason: default package */
public final class nsd {
    final wzi<a> a;
    final wzi<a> b;
    final wzi<HomeMixFormatListAttributesHelper> c;
    final wzi<nth> d;
    final wzi<hxx> e;
    final wzi<HomeMixInteractionLogger> f;

    nsd(wzi<a> wzi, wzi<a> wzi2, wzi<HomeMixFormatListAttributesHelper> wzi3, wzi<nth> wzi4, wzi<hxx> wzi5, wzi<HomeMixInteractionLogger> wzi6) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
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
