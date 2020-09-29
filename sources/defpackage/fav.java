package defpackage;

import java.util.Arrays;

/* renamed from: fav reason: default package */
public final class fav {

    /* renamed from: fav$a */
    public static final class a {
        private final String a;
        private final C0027a b;
        private C0027a c;
        private boolean d;

        /* renamed from: fav$a$a reason: collision with other inner class name */
        public static final class C0027a {
            String a;
            public Object b;
            C0027a c;

            private C0027a() {
            }

            /* synthetic */ C0027a(byte b2) {
                this();
            }
        }

        /* synthetic */ a(String str, byte b2) {
            this(str);
        }

        private a(String str) {
            this.b = new C0027a(0);
            this.c = this.b;
            this.d = false;
            this.a = (String) fay.a(str);
        }

        public final a a(String str, int i) {
            return a(str, (Object) String.valueOf(i));
        }

        public final a a(String str, long j) {
            return a(str, (Object) String.valueOf(j));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            C0027a aVar = this.b.c;
            String str = "";
            while (aVar != null) {
                Object obj = aVar.b;
                sb.append(str);
                if (aVar.a != null) {
                    sb.append(aVar.a);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                aVar = aVar.c;
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        public C0027a a() {
            C0027a aVar = new C0027a(0);
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        public a a(String str, Object obj) {
            C0027a a2 = a();
            a2.b = obj;
            a2.a = (String) fay.a(str);
            return this;
        }
    }

    public static <T> T a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static a a(Object obj) {
        return new a(obj.getClass().getSimpleName(), 0);
    }
}
