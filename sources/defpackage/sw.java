package defpackage;

/* renamed from: sw reason: default package */
public interface sw {
    public static final c a = new c(0);
    public static final b b = new b(0);

    /* renamed from: sw$a */
    public static abstract class a {

        /* renamed from: sw$a$a reason: collision with other inner class name */
        public static final class C0079a extends a {
            public final Throwable a;

            public C0079a(Throwable th) {
                this.a = th;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.a.getMessage()});
            }
        }

        /* renamed from: sw$a$b */
        public static final class b extends a {
            private b() {
            }

            /* synthetic */ b(byte b) {
                this();
            }

            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: sw$a$c */
        public static final class c extends a {
            private c() {
            }

            /* synthetic */ c(byte b) {
                this();
            }

            public final String toString() {
                return "SUCCESS";
            }
        }

        a() {
        }
    }
}
