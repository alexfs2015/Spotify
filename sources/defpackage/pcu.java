package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.Single;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: pcu reason: default package */
final class pcu {
    private final pct a;
    private final pcy b;
    private final jrp c;
    private final jro d;
    private final String e;

    public pcu(pct pct, pcy pcy, jrp jrp, jro jro, String str) {
        this.a = pct;
        this.b = pcy;
        this.c = jrp;
        this.d = jro;
        this.e = str;
    }

    public final Single<pcx> a(String str) {
        pct pct = this.a;
        Calendar f = this.c.f();
        f.set(11, 0);
        f.set(12, 0);
        f.set(13, 0);
        f.set(14, 0);
        String str2 = "locale";
        String str3 = "region";
        String str4 = "signal";
        String str5 = "version";
        Single a2 = pct.a(ImmutableMap.g().b("platform", "android").b("dt", jrr.a(f)).b(str2, this.e).b(str3, Locale.getDefault().getCountry()).b(str4, String.format("episodeURI:%s", new Object[]{str})).b(str5, this.d.a()).b());
        pcy pcy = this.b;
        pcy.getClass();
        return a2.f(new $$Lambda$4qYSYVEps3W7LbdPIoOv4sdWY(pcy));
    }
}
