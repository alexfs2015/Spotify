package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: rsh reason: default package */
public abstract class rsh {
    public static final rsh a = a(a.a, b.a);

    /* renamed from: rsh$a */
    public static abstract class a {
        public static final a a = a(false, ImmutableList.d(), false);

        public abstract boolean a();

        public abstract ImmutableList<rrx> b();

        public abstract boolean c();

        public final a d() {
            return a(true, b(), false);
        }

        public static a a(ImmutableList<rrx> immutableList) {
            return a(false, immutableList, false);
        }

        public static a a(boolean z, ImmutableList<rrx> immutableList, boolean z2) {
            return new rsf(z, immutableList, z2);
        }
    }

    /* renamed from: rsh$b */
    public static abstract class b {
        public static final b a = a(false, ImmutableList.d(), "", false);

        public abstract boolean a();

        public abstract ImmutableList<rrz> b();

        public abstract String c();

        public abstract boolean d();

        public final b e() {
            return a(true, b(), c(), false);
        }

        public static b a(ImmutableList<rrz> immutableList, String str) {
            return a(false, immutableList, str, false);
        }

        public static b a(boolean z, ImmutableList<rrz> immutableList, String str, boolean z2) {
            return new rsg(z, immutableList, str, z2);
        }
    }

    public abstract a a();

    public abstract b b();

    public final rsh a(a aVar) {
        return a(aVar, b());
    }

    public final rsh a(b bVar) {
        return a(a(), bVar);
    }

    private static rsh a(a aVar, b bVar) {
        return new rse(aVar, bVar);
    }
}
