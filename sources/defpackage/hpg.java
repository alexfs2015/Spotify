package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: hpg reason: default package */
public final class hpg {
    public int a;
    public final Map<defpackage.md.a<?>, a<?>> b = new HashMap();

    /* renamed from: hpg$a */
    public static class a<D> implements defpackage.mg.a<D> {
        public final int a;
        public final mg<D> b;
        public boolean c;
        public boolean d;
        private final defpackage.md.a<D> e;

        private a(int i, defpackage.md.a<D> aVar) {
            this.a = i;
            this.b = aVar.a();
            this.e = aVar;
        }

        public /* synthetic */ a(int i, defpackage.md.a aVar, byte b2) {
            this(i, aVar);
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

    public final void a(defpackage.md.a<?> aVar) {
        a aVar2 = (a) this.b.remove(aVar);
        if (aVar2 != null) {
            aVar2.a();
        }
    }
}
