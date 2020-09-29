package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;

/* renamed from: xfy reason: default package */
final class xfy extends defpackage.xgd.a {
    private boolean a = true;

    /* renamed from: xfy$a */
    static final class a implements xgd<xam, xam> {
        static final a a = new a();

        a() {
        }

        private static xam a(xam xam) {
            try {
                return xgr.a(xam);
            } finally {
                xam.close();
            }
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return a((xam) obj);
        }
    }

    /* renamed from: xfy$b */
    static final class b implements xgd<xak, xak> {
        static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return (xak) obj;
        }
    }

    /* renamed from: xfy$c */
    static final class c implements xgd<xam, xam> {
        static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return (xam) obj;
        }
    }

    /* renamed from: xfy$d */
    static final class d implements xgd<Object, String> {
        static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: xfy$e */
    static final class e implements xgd<xam, Unit> {
        static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object a(Object obj) {
            ((xam) obj).close();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: xfy$f */
    static final class f implements xgd<xam, Void> {
        static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object a(Object obj) {
            ((xam) obj).close();
            return null;
        }
    }

    xfy() {
    }

    public final xgd<?, xak> a(Type type) {
        if (xak.class.isAssignableFrom(xgr.a(type))) {
            return b.a;
        }
        return null;
    }

    public final xgd<xam, ?> a(Type type, Annotation[] annotationArr, xgp xgp) {
        if (type == xam.class) {
            return xgr.a(annotationArr, xie.class) ? c.a : a.a;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (this.a && type == Unit.class) {
            try {
                return e.a;
            } catch (NoClassDefFoundError unused) {
                this.a = false;
            }
        }
        return null;
    }
}
