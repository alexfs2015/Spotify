package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.SingleSource;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: pak reason: default package */
final class pak {
    private final pam a;
    private final pao b;
    private final jrp c;
    private final jro d;
    private final String e;

    public pak(pam pam, pao pao, jrp jrp, jro jro, String str) {
        this.a = pam;
        this.b = pao;
        this.c = jrp;
        this.d = jro;
        this.e = str;
    }

    public final wuh<pan> a(String str) {
        pam pam = this.a;
        Calendar f = this.c.f();
        f.set(11, 0);
        f.set(12, 0);
        f.set(13, 0);
        f.set(14, 0);
        String str2 = "locale";
        String str3 = "region";
        String str4 = "signal";
        String str5 = "version";
        wuh a2 = vun.a((SingleSource<T>) pam.a(ImmutableMap.g().b("platform", "android").b("dt", jrr.a(f)).b(str2, this.e).b(str3, Locale.getDefault().getCountry()).b(str4, String.format("episodeURI:%s", new Object[]{str})).b(str5, this.d.a()).b()));
        pao pao = this.b;
        pao.getClass();
        return a2.c(new $$Lambda$Eh9RwJubLVMnNYCTPK2sgwiG7Y4(pao));
    }
}
