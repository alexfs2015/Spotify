package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import io.reactivex.SingleSource;
import java.util.Map;

/* renamed from: ndr reason: default package */
public final class ndr {
    public final ndq a;
    private final fpt b;
    private final jrp c;
    private final boolean d;
    private final String e;
    private final String f;
    private final String g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final net k;

    public ndr(ndq ndq, fpt fpt, jrp jrp, boolean z, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, net net) {
        this.a = ndq;
        this.b = fpt;
        this.c = jrp;
        this.d = z;
        this.e = String.valueOf(str.hashCode()).substring(0, 4);
        this.f = str2;
        this.g = str3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = net;
    }

    public final wud<wsj<wmg>> a() {
        return wuh.a(vun.a((SingleSource<T>) this.a.a(b(), c())));
    }

    public Map<String, String> b() {
        String str = "salt";
        String str2 = "video";
        String str3 = "podcast";
        String str4 = "is_car_connected";
        a b2 = ImmutableMap.g().b("platform", this.i ? "android-tablet" : "android").b("client-timezone", this.c.e().getID()).b("locale", this.g).b(str, this.e).b(str2, String.valueOf(iqh.c(this.b))).b(str3, String.valueOf(iqh.a(this.b))).b(str4, String.valueOf(this.h));
        if (!fax.a(this.f)) {
            b2.b("space-id", this.f);
        }
        if (this.j) {
            b2.b("alt", "protobuf");
        }
        return b2.b();
    }

    public String c() {
        String str = "no-cache";
        if (this.d) {
            return str;
        }
        if (!this.k.c()) {
            return null;
        }
        this.k.b(false);
        return str;
    }
}
