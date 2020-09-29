package com.spotify.base.java.logging;

import java.util.Collections;
import java.util.List;

public final class Logger {
    private static List<gbv> a = Collections.emptyList();
    private static gbw b = new gbz();
    private static gbx c = new gca();

    public static void a(gbw gbw, gbx gbx, List<gbv> list) {
        a = Collections.unmodifiableList(list);
        b = gbw;
        c = gbx;
    }

    private Logger() {
    }

    public static void core(String str) {
        for (gbv c2 : a) {
            gby c3 = c2.c();
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getName());
            sb.append("@core");
            c3.a(sb.toString(), f(str, new Object[0]));
        }
    }

    public static void a(String str, Object... objArr) {
        for (gbv a2 : a) {
            a(a2.a(), str, objArr);
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        for (gbv a2 : a) {
            a(a2.a(), th, str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        for (gbv b2 : a) {
            a(b2.b(), str, objArr);
        }
    }

    public static void b(Throwable th, String str, Object... objArr) {
        for (gbv b2 : a) {
            a(b2.b(), th, str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        for (gbv c2 : a) {
            a(c2.c(), str, objArr);
        }
    }

    public static void c(Throwable th, String str, Object... objArr) {
        for (gbv c2 : a) {
            a(c2.c(), th, str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        for (gbv d : a) {
            a(d.d(), str, objArr);
        }
    }

    public static void d(Throwable th, String str, Object... objArr) {
        for (gbv d : a) {
            a(d.d(), th, str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        for (gbv e : a) {
            a(e.e(), str, objArr);
        }
    }

    public static void e(Throwable th, String str, Object... objArr) {
        for (gbv e : a) {
            a(e.e(), th, str, objArr);
        }
    }

    private static void a(gby gby, String str, Object... objArr) {
        gby.a(c.a(), f(str, objArr));
    }

    private static void a(gby gby, Throwable th, String str, Object... objArr) {
        gby.a(c.a(), f(str, objArr), th);
    }

    public static String f(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : b.a(str, objArr);
    }

    public static int a(String str) {
        return String.valueOf(str).length();
    }
}
