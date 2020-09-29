package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;

/* renamed from: nuc reason: default package */
public final class nuc {
    final wzi<vje> a;
    final wzi<vjj> b;
    final wzi<HomeMixFormatListAttributesHelper> c;
    final wzi<npy> d;
    final wzi<String> e;
    final wzi<lbi> f;
    final wzi<a> g;

    public nuc(wzi<vje> wzi, wzi<vjj> wzi2, wzi<HomeMixFormatListAttributesHelper> wzi3, wzi<npy> wzi4, wzi<String> wzi5, wzi<lbi> wzi6, wzi<a> wzi7) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
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
