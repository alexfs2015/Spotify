package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import java.util.Map;

/* renamed from: sli reason: default package */
public final class sli {
    public String a;
    private String b;
    private final jtz c;
    private String d;
    private String e;
    private final String f;
    private int g;
    private final slh h;
    private final int i;
    private final String j;
    private final boolean k;
    private final sld l;
    private final boolean m;
    private Optional<Integer> n = Optional.e();
    private Optional<Integer> o = Optional.e();

    sli(jtz jtz, String str, jty jty, boolean z, boolean z2, sle sle, sla sla, sld sld) {
        this.c = jtz;
        this.f = str;
        this.j = jty.a();
        this.m = z;
        this.h = sle.a();
        this.i = sla.a();
        this.k = z2;
        this.l = sld;
    }

    public final Map<String, String> a() {
        a g2 = ImmutableMap.g();
        g2.b("locale", this.f);
        g2.b("clientVersion", this.j);
        g2.b("username", this.b);
        g2.b("country", this.d);
        g2.b("catalogue", this.e);
        g2.b("limit", String.valueOf(this.g));
        g2.b("timestamp", String.valueOf(this.c.a()));
        g2.b("search-image-size", String.valueOf(this.h.a()));
        g2.b("search-image-size-cards", String.valueOf(this.h.b()));
        g2.b("echo", this.k ? "onDemand" : "");
        g2.b("entityVersion", String.valueOf(this.i));
        String str = "requestId";
        if (!fbo.a(this.a)) {
            g2.b(str, this.a);
        } else {
            g2.b(str, this.l.a());
        }
        if (this.m) {
            g2.b("nft", String.valueOf(Boolean.TRUE));
        }
        if (this.n.b()) {
            g2.b("search-offset", String.valueOf(this.n.c()));
        }
        if (this.o.b()) {
            g2.b("offset", String.valueOf(this.o.c()));
        }
        return g2.b();
    }

    public final sli a(int i2) {
        this.n = Optional.b(Integer.valueOf(i2));
        this.o = Optional.b(Integer.valueOf(i2));
        return this;
    }

    public final sli a(String str, String str2, String str3, int i2) {
        this.b = (String) fbp.a(str);
        this.d = (String) fbp.a(str2);
        this.e = (String) fbp.a(str3);
        this.g = i2;
        return this;
    }
}
