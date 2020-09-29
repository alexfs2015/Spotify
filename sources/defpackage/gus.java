package defpackage;

/* renamed from: gus reason: default package */
public interface gus {

    /* renamed from: gus$a */
    public static class a {

        /* renamed from: gus$a$a reason: collision with other inner class name */
        static class C0036a implements gus {
            private final androidx.recyclerview.widget.RecyclerView.a<?> a;

            C0036a(androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
                this.a = (androidx.recyclerview.widget.RecyclerView.a) fay.a(aVar);
            }

            public final void a() {
                this.a.e();
            }
        }

        /* renamed from: gus$a$b */
        public static class b implements gus {
            private final gvb a;

            public b(gvb gvb) {
                this.a = (gvb) fay.a(gvb);
            }

            public final void a() {
                this.a.a();
            }
        }

        public static gus a(androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
            return new C0036a(aVar);
        }
    }

    void a();
}
