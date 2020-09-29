package defpackage;

/* renamed from: wha reason: default package */
public interface wha {

    /* renamed from: wha$a */
    public static class a implements wha {
        private final byte a;

        public a(byte b) {
            this.a = b;
        }

        public final boolean a(byte b) {
            return b == this.a;
        }
    }

    /* renamed from: wha$b */
    public static class b implements wha {
        private final byte a;

        public b(byte b) {
            this.a = b;
        }

        public final boolean a(byte b) {
            return b != this.a;
        }
    }

    boolean a(byte b2);

    static {
        new b(0);
        new a(0);
        new b(13);
        new a(13);
        new b(10);
        new a(10);
        new b(59);
        new wha() {
            public final boolean a(byte b) {
                return (b == 13 || b == 10) ? false : true;
            }
        };
        new wha() {
            public final boolean a(byte b) {
                return b == 13 || b == 10;
            }
        };
        new wha() {
            public final boolean a(byte b) {
                return (b == 32 || b == 9) ? false : true;
            }
        };
        new wha() {
            public final boolean a(byte b) {
                return b == 32 || b == 9;
            }
        };
    }
}
