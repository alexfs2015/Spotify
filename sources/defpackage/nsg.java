package defpackage;

import android.content.Context;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import java.util.EnumMap;

/* renamed from: nsg reason: default package */
public final class nsg {
    public final wzi<nsd> a;
    public final wzi<oml> b;
    public final wzi<omc> c;
    public final wzi<Context> d;
    public final wzi<EnumMap<Style, String>> e;
    public final wzi<HomeMixInteractionLogger> f;

    public nsg(wzi<nsd> wzi, wzi<oml> wzi2, wzi<omc> wzi3, wzi<Context> wzi4, wzi<EnumMap<Style, String>> wzi5, wzi<HomeMixInteractionLogger> wzi6) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
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
