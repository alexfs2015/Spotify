package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import io.reactivex.SingleSource;
import java.util.Map;

/* renamed from: njg reason: default package */
public final class njg {
    public final njf a;
    private final fqn b;
    private final jtz c;
    private final boolean d;
    private final String e;
    private final String f;
    private final String g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final nki k;

    public njg(njf njf, fqn fqn, jtz jtz, boolean z, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, nki nki) {
        this.a = njf;
        this.b = fqn;
        this.c = jtz;
        this.d = z;
        this.e = String.valueOf(str.hashCode()).substring(0, 4);
        this.f = str2;
        this.g = str3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = nki;
    }

    public final xii<xgo<xam>> a() {
        return xim.a(wit.a((SingleSource<T>) this.a.a(b(), c())));
    }

    public Map<String, String> b() {
        String str = "salt";
        String str2 = "video";
        String str3 = "podcast";
        String str4 = "is_car_connected";
        a b2 = ImmutableMap.g().b("platform", this.i ? "android-tablet" : "android").b("client-timezone", this.c.e().getID()).b("locale", this.g).b(str, this.e).b(str2, String.valueOf(isu.c(this.b))).b(str3, String.valueOf(isu.a(this.b))).b(str4, String.valueOf(this.h));
        if (!fbo.a(this.f)) {
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
