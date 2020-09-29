package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: sbo reason: default package */
public abstract class sbo {
    public static final sbo a = a(a.a, b.a);

    /* renamed from: sbo$a */
    public static abstract class a {
        public static final a a = a(false, ImmutableList.d(), false);

        public static a a(ImmutableList<sbe> immutableList) {
            return a(false, immutableList, false);
        }

        public static a a(boolean z, ImmutableList<sbe> immutableList, boolean z2) {
            return new sbm(z, immutableList, z2);
        }

        public abstract boolean a();

        public abstract ImmutableList<sbe> b();

        public abstract boolean c();

        public final a d() {
            return a(true, b(), false);
        }
    }

    /* renamed from: sbo$b */
    public static abstract class b {
        public static final b a = a(false, ImmutableList.d(), "", false);

        public static b a(ImmutableList<sbg> immutableList, String str) {
            return a(false, immutableList, str, false);
        }

        public static b a(boolean z, ImmutableList<sbg> immutableList, String str, boolean z2) {
            return new sbn(z, immutableList, str, z2);
        }

        public abstract boolean a();

        public abstract ImmutableList<sbg> b();

        public abstract String c();

        public abstract boolean d();

        public final b e() {
            return a(true, b(), c(), false);
        }
    }

    private static sbo a(a aVar, b bVar) {
        return new sbl(aVar, bVar);
    }

    public abstract a a();

    public final sbo a(a aVar) {
        return a(aVar, b());
    }

    public final sbo a(b bVar) {
        return a(a(), bVar);
    }

    public abstract b b();
}
