package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.SingleSource;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: pht reason: default package */
final class pht {
    private final phv a;
    private final phx b;
    private final jtz c;
    private final jty d;
    private final String e;

    public pht(phv phv, phx phx, jtz jtz, jty jty, String str) {
        this.a = phv;
        this.b = phx;
        this.c = jtz;
        this.d = jty;
        this.e = str;
    }

    public final xim<phw> a(String str) {
        phv phv = this.a;
        Calendar f = this.c.f();
        f.set(11, 0);
        f.set(12, 0);
        f.set(13, 0);
        f.set(14, 0);
        String str2 = "locale";
        String str3 = "region";
        String str4 = "signal";
        String str5 = "version";
        xim a2 = wit.a((SingleSource<T>) phv.a(ImmutableMap.g().b("platform", "android").b("dt", jub.a(f)).b(str2, this.e).b(str3, Locale.getDefault().getCountry()).b(str4, String.format("episodeURI:%s", new Object[]{str})).b(str5, this.d.a()).b()));
        phx phx = this.b;
        phx.getClass();
        return a2.c(new $$Lambda$nK4EI_BRhb54_iP8GbiCjj93UJs(phx));
    }
}
