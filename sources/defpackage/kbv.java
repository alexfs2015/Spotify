package defpackage;

import com.google.common.base.Optional;
import org.json.JSONObject;

/* renamed from: kbv reason: default package */
public final class kbv extends wlt {
    private final jjf b;
    private final String c;
    private final kaz d;
    private final String e;
    private String f;
    private long g;
    private String h;
    private String i;
    private String j;
    private int k;
    private long l;
    private long m;
    private Optional<String> n = Optional.e();
    private Optional<String> o = Optional.e();
    private Optional<String> p = Optional.e();
    private Optional<String> q = Optional.e();
    private Optional<String> r = Optional.e();

    public kbv(jjf jjf, kaz kaz, String str, String str2) {
        String str3 = "";
        this.f = str3;
        this.h = str3;
        this.i = str3;
        this.j = str3;
        this.b = jjf;
        this.d = kaz;
        this.e = str;
        this.c = str2;
    }

    public final void a(wlj wlj) {
        this.f = this.c.equals(wlj.a().a.toString()) ? "playlist" : "segment";
        this.n = Optional.c(wlj.a().a.toString());
        this.o = Optional.c(wlj.a().a.b);
        this.p = Optional.c(wlj.a().b);
    }

    public final void a(long j2) {
        this.l = j2;
    }

    public final void b() {
        d();
    }

    public final void c() {
        d();
    }

    private void d() {
        String str = "";
        String str2 = (String) this.o.a(str);
        bm bmVar = new bm(str2, String.valueOf(this.m), (String) this.q.a(str), (long) this.k, (String) this.p.a(str), (String) this.n.a(str), this.h, this.i, this.j, this.l, this.g, (String) this.r.a(str), this.f, new JSONObject(this.d.a()).toString(), this.e);
        this.b.a(bmVar);
    }

    public final void a(wmf wmf) {
        this.q = Optional.c(wmf.a.a("User-Agent"));
        this.m = wmf.l;
        this.g = wmf.l - wmf.k;
        this.h = wmf.b.toString();
        this.i = wmf.a("X-Cache", null);
        this.j = wmf.a("X-Cache-Hits", null);
        this.k = wmf.c;
        this.r = Optional.c(wmf.a.a("X-rid"));
    }
}
