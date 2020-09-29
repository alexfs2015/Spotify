package defpackage;

import com.google.common.cache.LocalCache.Strength;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: fbi reason: default package */
public final class fbi {
    private final String a;

    /* renamed from: fbi$a */
    static class a extends c {
        a() {
        }
    }

    /* renamed from: fbi$b */
    static class b extends e {
        b() {
        }
    }

    /* renamed from: fbi$c */
    static abstract class c {
        c() {
        }
    }

    /* renamed from: fbi$d */
    static class d extends e {
        d() {
        }
    }

    /* renamed from: fbi$e */
    static abstract class e {
        e() {
        }
    }

    /* renamed from: fbi$f */
    static class f {
        private final Strength a;

        public f(Strength strength) {
            this.a = strength;
        }
    }

    /* renamed from: fbi$g */
    static abstract class g {
        g() {
        }
    }

    /* renamed from: fbi$h */
    static class h extends g {
        h() {
        }
    }

    /* renamed from: fbi$i */
    static class i extends g {
        i() {
        }
    }

    /* renamed from: fbi$j */
    static class j {
        j() {
        }
    }

    /* renamed from: fbi$k */
    static class k extends c {
        k() {
        }
    }

    /* renamed from: fbi$l */
    static class l {
        private final Strength a;

        public l(Strength strength) {
            this.a = strength;
        }
    }

    /* renamed from: fbi$m */
    static class m extends c {
        m() {
        }
    }

    static {
        fba.a(',').b();
        fba.a('=').b();
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

    public final String toString() {
        defpackage.fav.a a2 = fav.a(this);
        a2.a().b = this.a;
        return a2.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, null, null, null, null, null, a(0, null), a(0, null), a(0, null)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbi) && faw.a(null, null) && faw.a(null, null) && faw.a(null, null) && faw.a(null, null) && faw.a(null, null) && faw.a(null, null) && faw.a(null, null) && faw.a(a(0, null), a(0, null)) && faw.a(a(0, null), a(0, null)) && faw.a(a(0, null), a(0, null));
    }

    private static Long a(long j2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j2));
    }
}
