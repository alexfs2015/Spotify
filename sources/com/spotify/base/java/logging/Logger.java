package com.spotify.base.java.logging;

import java.util.Collections;
import java.util.List;

public final class Logger {
    private static List<gcu> a = Collections.emptyList();
    private static gcv b = new gcy();
    private static gcw c = new gcz();

    private Logger() {
    }

    public static int a(String str) {
        return String.valueOf(str).length();
    }

    public static void a(gcv gcv, gcw gcw, List<gcu> list) {
        a = Collections.unmodifiableList(list);
        b = gcv;
        c = gcw;
    }

    private static void a(gcx gcx, String str, Object... objArr) {
        gcx.a(c.a(), f(str, objArr));
    }

    private static void a(gcx gcx, Throwable th, String str, Object... objArr) {
        gcx.a(c.a(), f(str, objArr), th);
    }

    public static void a(String str, Object... objArr) {
        for (gcu a2 : a) {
            a(a2.a(), str, objArr);
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        for (gcu a2 : a) {
            a(a2.a(), th, str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        for (gcu b2 : a) {
            a(b2.b(), str, objArr);
        }
    }

    public static void b(Throwable th, String str, Object... objArr) {
        for (gcu b2 : a) {
            a(b2.b(), th, str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        for (gcu c2 : a) {
            a(c2.c(), str, objArr);
        }
    }

    public static void c(Throwable th, String str, Object... objArr) {
        for (gcu c2 : a) {
            a(c2.c(), th, str, objArr);
        }
    }

    public static void core(String str) {
        for (gcu c2 : a) {
            gcx c3 = c2.c();
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getName());
            sb.append("@core");
            c3.a(sb.toString(), f(str, new Object[0]));
        }
    }

    public static void d(String str, Object... objArr) {
        for (gcu d : a) {
            a(d.d(), str, objArr);
        }
    }

    public static void d(Throwable th, String str, Object... objArr) {
        for (gcu d : a) {
            a(d.d(), th, str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        for (gcu e : a) {
            a(e.e(), str, objArr);
        }
    }

    public static void e(Throwable th, String str, Object... objArr) {
        for (gcu e : a) {
            a(e.e(), th, str, objArr);
        }
    }

    public static String f(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : b.a(str, objArr);
    }
}
