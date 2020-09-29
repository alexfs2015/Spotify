package defpackage;

/* renamed from: wpx reason: default package */
public final class wpx implements wqe {
    public static final wqe a = new wpx(8);
    private final defpackage.wqe.a b = new a(8, 0);

    /* renamed from: wpx$a */
    static final class a implements defpackage.wqe.a {
        private final int a;

        private a(int i) {
            this.a = i;
        }

        /* synthetic */ a(int i, byte b) {
            this(i);
        }

        public final int a(Object obj) {
            if (obj instanceof wnb) {
                return ((wnb) obj).g();
            }
            if (obj instanceof wnd) {
                return ((wnd) obj).a().g();
            }
            if (obj instanceof wqc) {
                return 0;
            }
            return this.a;
        }
    }

    private wpx(int i) {
    }

    public final defpackage.wqe.a a() {
        return this.b;
    }
}
