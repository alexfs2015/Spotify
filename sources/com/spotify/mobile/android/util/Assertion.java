package com.spotify.mobile.android.util;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Locale;

public final class Assertion {
    private static final Assertion a = new Assertion(new jsw());
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

        public RecoverableAssertionError(String str, Throwable th) {
            this(str, th, null);
        }

        public RecoverableAssertionError(String str, String str2) {
            super(str);
            this.mDetails = str2;
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

    public static void a(Object obj) {
        a(obj, "Object failed null check");
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

    public static void a(Object obj, Object obj2) {
        String str = ") are not equal.";
        if (obj == null) {
            if (obj2 != null) {
                StringBuilder sb = new StringBuilder("The two objects(null, ");
                sb.append(obj2);
                sb.append(str);
                a(sb.toString());
            }
        } else if (!obj.equals(obj2)) {
            StringBuilder sb2 = new StringBuilder("The two objects(");
            sb2.append(obj);
            sb2.append(", ");
            sb2.append(obj2);
            sb2.append(str);
            a(sb2.toString());
        }
    }

    public static void b(Object obj, Object obj2) {
        boolean z = obj != null ? obj.equals(obj2) : obj2 == null;
        if (z) {
            StringBuilder sb = new StringBuilder("The two objects(");
            sb.append(obj);
            sb.append(", ");
            sb.append(obj2);
            sb.append(") are equal.");
            a(sb.toString());
        }
    }

    public static void a() {
        a(new AssertionError());
    }

    public static void a(String str) {
        String str2 = "%s";
        Logger.e(str2, str);
        a(new AssertionError(Logger.f(str2, str)));
    }

    public static void a(Exception exc) {
        Logger.e(exc, "[no message]", new Object[0]);
        a(new AssertionError(exc));
    }

    @Deprecated
    public static void a(String str, boolean z) {
        if (!z) {
            a(Logger.f("%s", str));
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            a(Logger.f(str, objArr));
        }
    }

    @Deprecated
    public static void b(String str, boolean z) {
        if (z) {
            a(Logger.f("%s", str));
        }
    }

    public static void b(boolean z, String str, Object... objArr) {
        if (z) {
            a(Logger.f(str, objArr));
        }
    }

    public static void b(String str) {
        d(str);
    }

    @Deprecated
    public static void a(boolean z, String str) {
        if (!z) {
            d(str);
        }
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            d(String.format(Locale.US, str, objArr));
        }
    }

    public static void c(Object obj, Object obj2) {
        if (!faw.a(obj, obj2)) {
            StringBuilder sb = new StringBuilder("The two objects (");
            sb.append(obj);
            sb.append(", ");
            sb.append(obj2);
            sb.append(") are not equal.");
            d(sb.toString());
        }
    }

    public static void a(String str, String str2) {
        a(new RecoverableAssertionError(Logger.f("%s", str), str2));
    }

    public static void a(String str, Throwable th) {
        a(new RecoverableAssertionError(str, th));
    }

    public static void c(String str) {
        a(new Note(str));
    }

    public static void b(String str, Throwable th) {
        a(new Note(str, th));
    }

    private static void a(RecoverableAssertionError recoverableAssertionError) {
        b((Throwable) recoverableAssertionError);
        a.b.a(recoverableAssertionError);
    }

    private static void d(String str) {
        a(new RecoverableAssertionError(Logger.f("%s", str)));
    }

    private static void a(Note note) {
        b((Throwable) note);
        a.b.a(note);
    }

    private static void a(AssertionError assertionError) {
        b((Throwable) assertionError);
        a.b.a(assertionError);
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

    public static void a(a aVar) {
        a.b = aVar;
    }

    public static void a(Throwable th) {
        a.b.a(th);
    }
}
