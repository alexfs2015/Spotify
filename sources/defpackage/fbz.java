package defpackage;

import com.google.common.cache.LocalCache.Strength;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: fbz reason: default package */
public final class fbz {
    private final String a;

    /* renamed from: fbz$a */
    static class a extends c {
        a() {
        }
    }

    /* renamed from: fbz$b */
    static class b extends e {
        b() {
        }
    }

    /* renamed from: fbz$c */
    static abstract class c {
        c() {
        }
    }

    /* renamed from: fbz$d */
    static class d extends e {
        d() {
        }
    }

    /* renamed from: fbz$e */
    static abstract class e {
        e() {
        }
    }

    /* renamed from: fbz$f */
    static class f {
        private final Strength a;

        public f(Strength strength) {
            this.a = strength;
        }
    }

    /* renamed from: fbz$g */
    static abstract class g {
        g() {
        }
    }

    /* renamed from: fbz$h */
    static class h extends g {
        h() {
        }
    }

    /* renamed from: fbz$i */
    static class i extends g {
        i() {
        }
    }

    /* renamed from: fbz$j */
    static class j {
        j() {
        }
    }

    /* renamed from: fbz$k */
    static class k extends c {
        k() {
        }
    }

    /* renamed from: fbz$l */
    static class l {
        private final Strength a;

        public l(Strength strength) {
            this.a = strength;
        }
    }

    /* renamed from: fbz$m */
    static class m extends c {
        m() {
        }
    }

    static {
        fbr.a(',').b();
        fbr.a('=').b();
        String str = "maximumSize";
        String str2 = "maximumWeight";
        String str3 = "concurrencyLevel";
        String str4 = "recordStats";
        String str5 = "expireAfterAccess";
        String str6 = "expireAfterWrite";
        String str7 = "refreshAfterWrite";
        String str8 = "refreshInterval";
        ImmutableMap.g().b("initialCapacity", new d()).b(str, new h()).b(str2, new i()).b(str3, new b()).b("weakKeys", new f(Strength.WEAK)).b("softValues", new l(Strength.SOFT)).b("weakValues", new l(Strength.WEAK)).b(str4, new j()).b(str5, new a()).b(str6, new m()).b(str7, new k()).b(str8, new k()).b();
    }

    private static Long a(long j2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbz) && fbn.a(null, null) && fbn.a(null, null) && fbn.a(null, null) && fbn.a(null, null) && fbn.a(null, null) && fbn.a(null, null) && fbn.a(null, null) && fbn.a(a(0, null), a(0, null)) && fbn.a(a(0, null), a(0, null)) && fbn.a(a(0, null), a(0, null));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, null, null, null, null, null, a(0, null), a(0, null), a(0, null)});
    }

    public final String toString() {
        defpackage.fbm.a a2 = fbm.a(this);
        a2.a().b = this.a;
        return a2.toString();
    }
}
