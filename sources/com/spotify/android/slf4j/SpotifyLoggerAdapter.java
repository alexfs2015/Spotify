package com.spotify.android.slf4j;

import com.spotify.base.java.logging.Logger;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.slf4j.helpers.MarkerIgnoringBase;

public final class SpotifyLoggerAdapter extends MarkerIgnoringBase {
    private static final Pattern a = Pattern.compile("\\{\\}");
    private static final long serialVersionUID = 708742732011405806L;

    public SpotifyLoggerAdapter() {
        this.name = "spotify";
    }

    private static boolean a(Object[] objArr) {
        return objArr[objArr.length - 1] instanceof Throwable;
    }

    private static String f(String str) {
        return a.matcher(str).replaceAll("%s");
    }

    public final void a(String str) {
        Logger.a(str, new Object[0]);
    }

    public final void a(String str, Object obj) {
        Logger.a(f(str), obj);
    }

    public final void a(String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            Logger.a((Throwable) obj2, f(str), obj);
            return;
        }
        Logger.a(f(str), obj, obj2);
    }

    public final void a(String str, Throwable th) {
        Logger.a(th, str, new Object[0]);
    }

    public final void a(String str, Object... objArr) {
        if (a(objArr)) {
            Logger.b(objArr[objArr.length - 1], f(str), Arrays.copyOf(objArr, objArr.length - 1));
        } else {
            Logger.b(f(str), objArr);
        }
    }

    public final boolean a() {
        return true;
    }

    public final void b(String str) {
        Logger.b(str, new Object[0]);
    }

    public final void b(String str, Object obj) {
        Logger.b(f(str), obj);
    }

    public final void b(String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            Logger.b((Throwable) obj2, f(str), obj);
            return;
        }
        Logger.b(f(str), obj, obj2);
    }

    public final void b(String str, Throwable th) {
        Logger.b(th, str, new Object[0]);
    }

    public final void b(String str, Object... objArr) {
        if (a(objArr)) {
            Logger.d(objArr[objArr.length - 1], f(str), Arrays.copyOf(objArr, objArr.length - 1));
        } else {
            Logger.d(f(str), objArr);
        }
    }

    public final boolean b() {
        return true;
    }

    public final void c(String str) {
        Logger.c(str, new Object[0]);
    }

    public final void c(String str, Object obj) {
        Logger.d(f(str), obj);
    }

    public final void c(String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            Logger.d((Throwable) obj2, f(str), obj);
            return;
        }
        Logger.d(f(str), obj, obj2);
    }

    public final void c(String str, Throwable th) {
        Logger.c(th, str, new Object[0]);
    }

    public final void c(String str, Object... objArr) {
        if (a(objArr)) {
            Logger.e(objArr[objArr.length - 1], f(str), Arrays.copyOf(objArr, objArr.length - 1));
        } else {
            Logger.e(f(str), objArr);
        }
    }

    public final boolean c() {
        return true;
    }

    public final void d(String str) {
        Logger.d(str, new Object[0]);
    }

    public final void d(String str, Object obj) {
        Logger.e(f(str), obj);
    }

    public final void d(String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            Logger.e((Throwable) obj2, f(str), obj);
            return;
        }
        Logger.e(f(str), obj, obj2);
    }

    public final void d(String str, Throwable th) {
        Logger.d(th, str, new Object[0]);
    }

    public final boolean d() {
        return true;
    }

    public final void e(String str) {
        Logger.e(str, new Object[0]);
    }

    public final void e(String str, Throwable th) {
        Logger.e(th, str, new Object[0]);
    }

    public final boolean e() {
        return true;
    }
}
