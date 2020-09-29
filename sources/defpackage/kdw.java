package defpackage;

import com.google.common.base.Optional;
import org.json.JSONObject;

/* renamed from: kdw reason: default package */
public final class kdw extends wzz {
    private final jlr b;
    private final String c;
    private final kcz d;
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

    public kdw(jlr jlr, kcz kcz, String str, String str2) {
        String str3 = "";
        this.f = str3;
        this.h = str3;
        this.i = str3;
        this.j = str3;
        this.b = jlr;
        this.d = kcz;
        this.e = str;
        this.c = str2;
    }

    private void d() {
        String str = "";
        String str2 = (String) this.o.a(str);
        bl blVar = new bl(str2, String.valueOf(this.m), (String) this.q.a(str), (long) this.k, (String) this.p.a(str), (String) this.n.a(str), this.h, this.i, this.j, this.l, this.g, (String) this.r.a(str), this.f, new JSONObject(this.d.a()).toString(), this.e);
        this.b.a(blVar);
    }

    public final void a(long j2) {
        this.l = j2;
    }

    public final void a(wzp wzp) {
        this.f = this.c.equals(wzp.a().a.toString()) ? "playlist" : "segment";
        this.n = Optional.c(wzp.a().a.toString());
        this.o = Optional.c(wzp.a().a.b);
        this.p = Optional.c(wzp.a().b);
    }

    public final void a(xal xal) {
        this.q = Optional.c(xal.a.a("User-Agent"));
        this.m = xal.l;
        this.g = xal.l - xal.k;
        this.h = xal.b.toString();
        this.i = xal.a("X-Cache", null);
        this.j = xal.a("X-Cache-Hits", null);
        this.k = xal.c;
        this.r = Optional.c(xal.a.a("X-rid"));
    }

    public final void b() {
        d();
    }

    public final void c() {
        d();
    }
}
