package defpackage;

import java.io.IOException;

/* renamed from: wtb reason: default package */
final class wtb {

    /* renamed from: wtb$a */
    static final class a implements wry<wmg, Boolean> {
        static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Boolean.valueOf(((wmg) obj).f());
        }
    }

    /* renamed from: wtb$b */
    static final class b implements wry<wmg, Byte> {
        static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Byte.valueOf(((wmg) obj).f());
        }
    }

    /* renamed from: wtb$c */
    static final class c implements wry<wmg, Character> {
        static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object a(Object obj) {
            String f = ((wmg) obj).f();
            if (f.length() == 1) {
                return Character.valueOf(f.charAt(0));
            }
            StringBuilder sb = new StringBuilder("Expected body of length 1 for Character conversion but was ");
            sb.append(f.length());
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: wtb$d */
    static final class d implements wry<wmg, Double> {
        static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Double.valueOf(((wmg) obj).f());
        }
    }

    /* renamed from: wtb$e */
    static final class e implements wry<wmg, Float> {
        static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Float.valueOf(((wmg) obj).f());
        }
    }

    /* renamed from: wtb$f */
    static final class f implements wry<wmg, Integer> {
        static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Integer.valueOf(((wmg) obj).f());
        }
    }

    /* renamed from: wtb$g */
    static final class g implements wry<wmg, Long> {
        static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Long.valueOf(((wmg) obj).f());
        }
    }

    /* renamed from: wtb$h */
    static final class h implements wry<wmg, Short> {
        static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Short.valueOf(((wmg) obj).f());
        }
    }

    /* renamed from: wtb$i */
    static final class i implements wry<wmg, String> {
        static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return ((wmg) obj).f();
        }
    }
}
