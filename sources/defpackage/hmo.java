package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: hmo reason: default package */
public final class hmo {
    public int a;
    public final Map<defpackage.ly.a<?>, a<?>> b = new HashMap();

    /* renamed from: hmo$a */
    public static class a<D> implements defpackage.mb.a<D> {
        public final int a;
        public final mb<D> b;
        public boolean c;
        public boolean d;
        private final defpackage.ly.a<D> e;

        public /* synthetic */ a(int i, defpackage.ly.a aVar, byte b2) {
            this(i, aVar);
        }

        private a(int i, defpackage.ly.a<D> aVar) {
            this.a = i;
            this.b = aVar.a();
            this.e = aVar;
        }

        public final void a() {
            if (this.d) {
                this.d = false;
                this.b.a(this);
            }
            this.b.i();
        }

        public final void c(D d2) {
            this.e.a(this.b, d2);
        }
    }

    public final void a(defpackage.ly.a<?> aVar) {
        a aVar2 = (a) this.b.remove(aVar);
        if (aVar2 != null) {
            aVar2.a();
        }
    }
}
