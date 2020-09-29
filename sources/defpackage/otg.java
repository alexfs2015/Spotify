package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;

/* renamed from: otg reason: default package */
final class otg implements a {
    private final wlc<String> a;
    private final wlc<ifn> b;
    private final wlc<AdRules> c;
    private final wlc<otb> d;
    private final wlc<Context> e;

    otg(wlc<String> wlc, wlc<ifn> wlc2, wlc<AdRules> wlc3, wlc<otb> wlc4, wlc<Context> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ otd a() {
        otf otf = new otf((String) a(this.a.get(), 1), (ifn) a(this.b.get(), 2), (AdRules) a(this.c.get(), 3), (otb) a(this.d.get(), 4), (Context) a(this.e.get(), 5));
        return otf;
    }
}
