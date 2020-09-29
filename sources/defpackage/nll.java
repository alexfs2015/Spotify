package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;

/* renamed from: nll reason: default package */
public final class nll {
    final wlc<oix> a;
    final wlc<HomeMixFormatListAttributesHelper> b;
    final wlc<a> c;

    public nll(wlc<oix> wlc, wlc<HomeMixFormatListAttributesHelper> wlc2, wlc<a> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
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
