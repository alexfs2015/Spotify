package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;

/* renamed from: wrt reason: default package */
final class wrt extends defpackage.wry.a {
    private boolean a = true;

    /* renamed from: wrt$a */
    static final class a implements wry<wmg, wmg> {
        static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return a((wmg) obj);
        }

        private static wmg a(wmg wmg) {
            try {
                return wsm.a(wmg);
            } finally {
                wmg.close();
            }
        }
    }

    /* renamed from: wrt$b */
    static final class b implements wry<wme, wme> {
        static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return (wme) obj;
        }
    }

    /* renamed from: wrt$c */
    static final class c implements wry<wmg, wmg> {
        static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return (wmg) obj;
        }
    }

    /* renamed from: wrt$d */
    static final class d implements wry<Object, String> {
        static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: wrt$e */
    static final class e implements wry<wmg, Unit> {
        static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object a(Object obj) {
            ((wmg) obj).close();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: wrt$f */
    static final class f implements wry<wmg, Void> {
        static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object a(Object obj) {
            ((wmg) obj).close();
            return null;
        }
    }

    wrt() {
    }

    public final wry<wmg, ?> a(Type type, Annotation[] annotationArr, wsk wsk) {
        if (type == wmg.class) {
            if (wsm.a(annotationArr, wtz.class)) {
                return c.a;
            }
            return a.a;
        } else if (type == Void.class) {
            return f.a;
        } else {
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

    public final wry<?, wme> a(Type type) {
        if (wme.class.isAssignableFrom(wsm.a(type))) {
            return b.a;
        }
        return null;
    }
}
