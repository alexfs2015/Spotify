package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.Single;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: pkg reason: default package */
final class pkg {
    private final pkf a;
    private final pkk b;
    private final jtz c;
    private final jty d;
    private final String e;

    public pkg(pkf pkf, pkk pkk, jtz jtz, jty jty, String str) {
        this.a = pkf;
        this.b = pkk;
        this.c = jtz;
        this.d = jty;
        this.e = str;
    }

    public final Single<pkj> a(String str) {
        pkf pkf = this.a;
        Calendar f = this.c.f();
        f.set(11, 0);
        f.set(12, 0);
        f.set(13, 0);
        f.set(14, 0);
        String str2 = "locale";
        String str3 = "region";
        String str4 = "signal";
        String str5 = "version";
        Single a2 = pkf.a(ImmutableMap.g().b("platform", "android").b("dt", jub.a(f)).b(str2, this.e).b(str3, Locale.getDefault().getCountry()).b(str4, String.format("episodeURI:%s", new Object[]{str})).b(str5, this.d.a()).b());
        pkk pkk = this.b;
        pkk.getClass();
        return a2.f(new $$Lambda$E1YSbw5ZoD4YUCYrLf5UGA1Ks0(pkk));
    }
}
