package defpackage;

import android.content.Context;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import java.util.EnumMap;

/* renamed from: nmr reason: default package */
public final class nmr {
    public final wlc<nmo> a;
    public final wlc<ofh> b;
    public final wlc<oew> c;
    public final wlc<Context> d;
    public final wlc<EnumMap<Style, String>> e;
    public final wlc<HomeMixInteractionLogger> f;

    public nmr(wlc<nmo> wlc, wlc<ofh> wlc2, wlc<oew> wlc3, wlc<Context> wlc4, wlc<EnumMap<Style, String>> wlc5, wlc<HomeMixInteractionLogger> wlc6) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
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
