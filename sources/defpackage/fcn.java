package defpackage;

/* renamed from: fcn reason: default package */
public abstract class fcn {
    static final fcn a = new fcn() {
        public final fcn a(boolean z, boolean z2) {
            int a = fet.a(z2, z);
            return a < 0 ? fcn.b : a > 0 ? fcn.c : fcn.a;
        }

        public final int b() {
            return 0;
        }
    };
    static final fcn b = new a(-1);
    static final fcn c = new a(1);

    /* renamed from: fcn$a */
    static final class a extends fcn {
        private int d;

        a(int i) {
            super(0);
            this.d = i;
        }

        public final fcn a(boolean z, boolean z2) {
            return this;
        }

        public final int b() {
            return this.d;
        }
    }

    private fcn() {
    }

    /* synthetic */ fcn(byte b2) {
        this();
    }

    public static fcn a() {
        return a;
    }

    public abstract fcn a(boolean z, boolean z2);

    public abstract int b();
}
