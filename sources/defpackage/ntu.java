package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import java.util.EnumMap;

/* renamed from: ntu reason: default package */
public final class ntu {
    final wzi<vje> a;
    final wzi<HomeMixFormatListAttributesHelper> b;
    final wzi<a> c;
    final wzi<EnumMap<Style, String>> d;
    final wzi<String> e;

    public ntu(wzi<vje> wzi, wzi<HomeMixFormatListAttributesHelper> wzi2, wzi<a> wzi3, wzi<EnumMap<Style, String>> wzi4, wzi<String> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
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
