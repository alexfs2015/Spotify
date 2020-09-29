package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;

/* renamed from: nra reason: default package */
public final class nra {
    public final wzi<vje> a;
    public final wzi<HomeMixFormatListAttributesHelper> b;
    public final wzi<a> c;

    public nra(wzi<vje> wzi, wzi<HomeMixFormatListAttributesHelper> wzi2, wzi<a> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
