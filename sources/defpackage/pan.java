package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;

/* renamed from: pan reason: default package */
final class pan implements a {
    private final wzi<String> a;
    private final wzi<iia> b;
    private final wzi<AdRules> c;
    private final wzi<pai> d;
    private final wzi<Context> e;

    pan(wzi<String> wzi, wzi<iia> wzi2, wzi<AdRules> wzi3, wzi<pai> wzi4, wzi<Context> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ pak a() {
        pam pam = new pam((String) a(this.a.get(), 1), (iia) a(this.b.get(), 2), (AdRules) a(this.c.get(), 3), (pai) a(this.d.get(), 4), (Context) a(this.e.get(), 5));
        return pam;
    }
}
