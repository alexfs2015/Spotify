package defpackage;

/* renamed from: wbr reason: default package */
public final class wbr implements wby {
    public static final wby a = new wbr(8);
    private final defpackage.wby.a b = new a(8, 0);

    /* renamed from: wbr$a */
    static final class a implements defpackage.wby.a {
        private final int a;

        /* synthetic */ a(int i, byte b) {
            this(i);
        }

        private a(int i) {
            this.a = i;
        }

        public final int a(Object obj) {
            if (obj instanceof vyv) {
                return ((vyv) obj).g();
            }
            if (obj instanceof vyx) {
                return ((vyx) obj).a().g();
            }
            if (obj instanceof wbw) {
                return 0;
            }
            return this.a;
        }
    }

    private wbr(int i) {
    }

    public final defpackage.wby.a a() {
        return this.b;
    }
}
