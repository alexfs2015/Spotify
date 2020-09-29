package defpackage;

/* renamed from: si reason: default package */
public interface si {
    public static final c a = new c(0);
    public static final b b = new b(0);

    /* renamed from: si$a */
    public static abstract class a {

        /* renamed from: si$a$a reason: collision with other inner class name */
        public static final class C0076a extends a {
            public final Throwable a;

            public C0076a(Throwable th) {
                this.a = th;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.a.getMessage()});
            }
        }

        /* renamed from: si$a$b */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }

            /* synthetic */ b(byte b) {
                this();
            }

            private b() {
            }
        }

        /* renamed from: si$a$c */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }

            /* synthetic */ c(byte b) {
                this();
            }

            private c() {
            }
        }

        a() {
        }
    }
}
