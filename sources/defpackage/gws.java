package defpackage;

/* renamed from: gws reason: default package */
public interface gws {

    /* renamed from: gws$a */
    public static class a {

        /* renamed from: gws$a$a reason: collision with other inner class name */
        static class C0037a implements gws {
            private final androidx.recyclerview.widget.RecyclerView.a<?> a;

            C0037a(androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
                this.a = (androidx.recyclerview.widget.RecyclerView.a) fbp.a(aVar);
            }

            public final void a() {
                this.a.e();
            }
        }

        /* renamed from: gws$a$b */
        public static class b implements gws {
            private final gxb a;

            public b(gxb gxb) {
                this.a = (gxb) fbp.a(gxb);
            }

            public final void a() {
                this.a.a();
            }
        }

        public static gws a(androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
            return new C0037a(aVar);
        }
    }

    void a();
}
