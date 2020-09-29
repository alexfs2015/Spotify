package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

/* renamed from: xop reason: default package */
public final class xop {
    static volatile a[] a = b;
    private static final a[] b = new a[0];
    private static final a c = new a() {
        /* access modifiers changed from: protected */
        public final void a() {
            throw new AssertionError("Missing override for log method.");
        }

        public final void a(String str, Object... objArr) {
            for (a a : xop.a) {
                a.a(str, objArr);
            }
        }

        public final void a(Throwable th, String str, Object... objArr) {
            for (a a : xop.a) {
                a.a(th, str, objArr);
            }
        }

        public final void b(String str, Object... objArr) {
            for (a b : xop.a) {
                b.b(str, objArr);
            }
        }

        public final void c(String str, Object... objArr) {
            for (a c : xop.a) {
                c.c(str, objArr);
            }
        }
    };

    /* renamed from: xop$a */
    public static abstract class a {
        private ThreadLocal<String> a = new ThreadLocal<>();

        private static String a(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        private void a(int i, Throwable th, String str, Object... objArr) {
            b();
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr != null && objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                if (th != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("\n");
                    sb.append(a(th));
                }
            } else if (th != null) {
                a(th);
            } else {
                return;
            }
            a();
        }

        private String b() {
            String str = (String) this.a.get();
            if (str != null) {
                this.a.remove();
            }
            return str;
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        public void a(String str, Object... objArr) {
            a(3, null, str, objArr);
        }

        public void a(Throwable th, String str, Object... objArr) {
            a(6, th, str, objArr);
        }

        public void b(String str, Object... objArr) {
            a(4, null, str, objArr);
        }

        public void c(String str, Object... objArr) {
            a(6, null, str, objArr);
        }
    }

    static {
        new ArrayList();
    }

    public static void a(String str, Object... objArr) {
        c.a(str, objArr);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        c.a(th, str, objArr);
    }

    public static void b(String str, Object... objArr) {
        c.b(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        c.c(str, objArr);
    }
}
