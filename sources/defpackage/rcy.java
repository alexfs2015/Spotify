package defpackage;

import io.reactivex.Observable;

/* renamed from: rcy reason: default package */
public interface rcy extends rdc {

    /* renamed from: rcy$a */
    public static class a implements rcy {
        public final fnz<rdd> a = fnz.a(b.a);

        public final void a(String str, String str2) {
            this.a.accept(rde.a(str, str2));
        }

        public final void Z_() {
            this.a.accept(b.a);
        }

        public final Observable<rdd> a() {
            return this.a;
        }
    }

    /* renamed from: rcy$b */
    public static class b implements rdd {
        public static final b a = new b();

        private b() {
        }
    }

    Observable<rdd> a();
}
