package defpackage;

import java.io.PrintStream;

/* renamed from: xfw reason: default package */
public final class xfw {
    private static a a;
    private static boolean b;

    /* renamed from: xfw$a */
    static final class a extends SecurityManager {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private xfw() {
    }

    public static Class<?> a() {
        a aVar = a;
        if (aVar == null) {
            if (b) {
                aVar = null;
            } else {
                a = b();
                b = true;
                aVar = a;
            }
        }
        if (aVar == null) {
            return null;
        }
        Class<?>[] classContext = aVar.getClassContext();
        String name = xfw.class.getName();
        int i = 0;
        while (i < classContext.length && !name.equals(classContext[i].getName())) {
            i++;
        }
        if (i < classContext.length) {
            int i2 = i + 2;
            if (i2 < classContext.length) {
                return classContext[i2];
            }
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    public static String a(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("null input");
        }
    }

    public static final void a(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    private static a b() {
        try {
            return new a(0);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean b(String str) {
        String a2 = a(str);
        if (a2 == null) {
            return false;
        }
        return a2.equalsIgnoreCase("true");
    }

    public static final void c(String str) {
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder("SLF4J: ");
        sb.append(str);
        printStream.println(sb.toString());
    }
}