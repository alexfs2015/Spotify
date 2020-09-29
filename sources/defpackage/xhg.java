package defpackage;

import java.io.IOException;

/* renamed from: xhg reason: default package */
final class xhg {

    /* renamed from: xhg$a */
    static final class a implements xgd<xam, Boolean> {
        static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Boolean.valueOf(((xam) obj).f());
        }
    }

    /* renamed from: xhg$b */
    static final class b implements xgd<xam, Byte> {
        static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Byte.valueOf(((xam) obj).f());
        }
    }

    /* renamed from: xhg$c */
    static final class c implements xgd<xam, Character> {
        static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object a(Object obj) {
            String f = ((xam) obj).f();
            if (f.length() == 1) {
                return Character.valueOf(f.charAt(0));
            }
            StringBuilder sb = new StringBuilder("Expected body of length 1 for Character conversion but was ");
            sb.append(f.length());
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: xhg$d */
    static final class d implements xgd<xam, Double> {
        static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Double.valueOf(((xam) obj).f());
        }
    }

    /* renamed from: xhg$e */
    static final class e implements xgd<xam, Float> {
        static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Float.valueOf(((xam) obj).f());
        }
    }

    /* renamed from: xhg$f */
    static final class f implements xgd<xam, Integer> {
        static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Integer.valueOf(((xam) obj).f());
        }
    }

    /* renamed from: xhg$g */
    static final class g implements xgd<xam, Long> {
        static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Long.valueOf(((xam) obj).f());
        }
    }

    /* renamed from: xhg$h */
    static final class h implements xgd<xam, Short> {
        static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Short.valueOf(((xam) obj).f());
        }
    }

    /* renamed from: xhg$i */
    static final class i implements xgd<xam, String> {
        static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return ((xam) obj).f();
        }
    }
}
