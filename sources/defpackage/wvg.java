package defpackage;

/* renamed from: wvg reason: default package */
public interface wvg {

    /* renamed from: wvg$a */
    public static class a implements wvg {
        private final byte a;

        public a(byte b) {
            this.a = b;
        }

        public final boolean a(byte b) {
            return b == this.a;
        }
    }

    /* renamed from: wvg$b */
    public static class b implements wvg {
        private final byte a;

        public b(byte b) {
            this.a = b;
        }

        public final boolean a(byte b) {
            return b != this.a;
        }
    }

    static {
        new b(0);
        new a(0);
        new b(13);
        new a(13);
        new b(10);
        new a(10);
        new b(59);
        new wvg() {
            public final boolean a(byte b) {
                return (b == 13 || b == 10) ? false : true;
            }
        };
        new wvg() {
            public final boolean a(byte b) {
                return b == 13 || b == 10;
            }
        };
        new wvg() {
            public final boolean a(byte b) {
                return (b == 32 || b == 9) ? false : true;
            }
        };
        new wvg() {
            public final boolean a(byte b) {
                return b == 32 || b == 9;
            }
        };
    }

    boolean a(byte b2);
}
