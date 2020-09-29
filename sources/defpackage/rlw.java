package defpackage;

import io.reactivex.Observable;

/* renamed from: rlw reason: default package */
public interface rlw extends rma {

    /* renamed from: rlw$a */
    public static class a implements rlw {
        public final fot<rmb> a = fot.a(b.a);

        public final void Z_() {
            this.a.accept(b.a);
        }

        public final Observable<rmb> a() {
            return this.a;
        }

        public final void a(String str, String str2) {
            this.a.accept(rmc.a(str, str2));
        }
    }

    /* renamed from: rlw$b */
    public static class b implements rmb {
        public static final b a = new b();

        private b() {
        }
    }

    Observable<rmb> a();
}
