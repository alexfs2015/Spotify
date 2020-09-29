package com.spotify.mobile.android.util;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Locale;

public final class Assertion {
    private static final Assertion a = new Assertion(new jvd());
    private a b;

    public static class Note extends RecoverableAssertionError {
        private static final long serialVersionUID = 1;

        public Note(String str) {
            super(str);
        }

        public Note(String str, Throwable th) {
            super(str, th);
        }
    }

    public static class RecoverableAssertionError extends RuntimeException {
        private static final long serialVersionUID = 1;
        public final String mDetails;

        public RecoverableAssertionError(String str) {
            this(str, (String) null);
        }

        public RecoverableAssertionError(String str, String str2) {
            super(str);
            this.mDetails = str2;
        }

        public RecoverableAssertionError(String str, Throwable th) {
            this(str, th, null);
        }

        private RecoverableAssertionError(String str, Throwable th, String str2) {
            super(str, th);
            this.mDetails = null;
        }
    }

    public interface a {
        void a(Note note);

        void a(RecoverableAssertionError recoverableAssertionError);

        void a(AssertionError assertionError);

        void a(Throwable th);
    }

    private Assertion(a aVar) {
        this.b = aVar;
    }

    public static void a() {
        a(new AssertionError());
    }

    private static void a(Note note) {
        b((Throwable) note);
        a.b.a(note);
    }

    private static void a(RecoverableAssertionError recoverableAssertionError) {
        b((Throwable) recoverableAssertionError);
        a.b.a(recoverableAssertionError);
    }

    public static void a(a aVar) {
        a.b = aVar;
    }

    private static void a(AssertionError assertionError) {
        b((Throwable) assertionError);
        a.b.a(assertionError);
    }

    @Deprecated
    public static void a(CharSequence charSequence, String str) {
        if (charSequence == null) {
            a("chars is null");
            return;
        }
        if (charSequence.length() <= 0) {
            a(str);
        }
    }

    public static void a(Exception exc) {
        String str = "sgssmn ea][o";
        Logger.e(exc, "[no message]", new Object[0]);
        a(new AssertionError(exc));
    }

    public static void a(Object obj) {
        String str = "d jmtlfle ubeceihO cknla";
        a(obj, "Object failed null check");
    }

    public static void a(Object obj, Object obj2) {
        String str = ") are not equal.";
        if (obj == null) {
            if (obj2 != null) {
                String str2 = "The two objects(null, ";
                StringBuilder sb = new StringBuilder("The two objects(null, ");
                sb.append(obj2);
                sb.append(str);
                a(sb.toString());
            }
        } else if (!obj.equals(obj2)) {
            String str3 = "ebwoo(ehs t jcTt";
            StringBuilder sb2 = new StringBuilder("The two objects(");
            sb2.append(obj);
            sb2.append(", ");
            sb2.append(obj2);
            sb2.append(str);
            a(sb2.toString());
        }
    }

    @Deprecated
    public static void a(Object obj, String str) {
        if (obj == null) {
            a(str);
        }
    }

    public static void a(Object obj, String str, Object... objArr) {
        if (obj == null) {
            a(String.format(Locale.US, str, objArr));
        }
    }

    public static void a(String str) {
        String str2 = "%s";
        Logger.e(str2, str);
        a(new AssertionError(Logger.f(str2, str)));
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str};
        String str3 = "s%";
        a(new RecoverableAssertionError(Logger.f("%s", objArr), str2));
    }

    public static void a(String str, Throwable th) {
        a(new RecoverableAssertionError(str, th));
    }

    @Deprecated
    public static void a(String str, boolean z) {
        if (!z) {
            Object[] objArr = {str};
            String str2 = "%s";
            a(Logger.f("%s", objArr));
        }
    }

    public static void a(Throwable th) {
        a.b.a(th);
    }

    @Deprecated
    public static void a(boolean z, String str) {
        if (!z) {
            d(str);
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            a(Logger.f(str, objArr));
        }
    }

    public static void b(Object obj, Object obj2) {
        boolean z = obj != null ? obj.equals(obj2) : obj2 == null;
        if (z) {
            String str = "j(s wbbToocttehe";
            StringBuilder sb = new StringBuilder("The two objects(");
            sb.append(obj);
            sb.append(", ");
            sb.append(obj2);
            String str2 = "aa) rqb.l eu";
            sb.append(") are equal.");
            a(sb.toString());
        }
    }

    public static void b(String str) {
        d(str);
    }

    public static void b(String str, Throwable th) {
        a(new Note(str, th));
    }

    @Deprecated
    public static void b(String str, boolean z) {
        if (z) {
            Object[] objArr = {str};
            String str2 = "s%";
            a(Logger.f("%s", objArr));
        }
    }

    private static void b(Throwable th) {
        StackTraceElement[] stackTrace;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!Assertion.class.getCanonicalName().equals(stackTraceElement.getClassName())) {
                arrayList.add(stackTraceElement);
            }
        }
        th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
    }

    public static void b(boolean z, String str, Object... objArr) {
        if (z) {
            a(Logger.f(str, objArr));
        }
    }

    public static void c(Object obj, Object obj2) {
        if (!fbn.a(obj, obj2)) {
            String str = "Tj woeste o(cbhtt";
            StringBuilder sb = new StringBuilder("The two objects (");
            sb.append(obj);
            sb.append(", ");
            sb.append(obj2);
            sb.append(") are not equal.");
            d(sb.toString());
        }
    }

    public static void c(String str) {
        a(new Note(str));
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            d(String.format(Locale.US, str, objArr));
        }
    }

    private static void d(String str) {
        Object[] objArr = {str};
        String str2 = "s%";
        a(new RecoverableAssertionError(Logger.f("%s", objArr)));
    }
}
