package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import java.util.EnumMap;

/* renamed from: nnt reason: default package */
public final class nnt {
    final wlc<oix> a;
    final wlc<HomeMixFormatListAttributesHelper> b;
    final wlc<a> c;
    final wlc<EnumMap<Style, String>> d;

    public nnt(wlc<oix> wlc, wlc<HomeMixFormatListAttributesHelper> wlc2, wlc<a> wlc3, wlc<EnumMap<Style, String>> wlc4) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
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
