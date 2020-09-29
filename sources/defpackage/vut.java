package defpackage;

import android.util.Log;

/* renamed from: vut reason: default package */
public final class vut implements vvc {
    private int a = 4;

    public vut(int i) {
    }

    public vut() {
    }

    public final boolean a(String str, int i) {
        return this.a <= i || Log.isLoggable(str, i);
    }

    public final void a(String str, String str2, Throwable th) {
        a(str, 3);
    }

    public final void b(String str, String str2, Throwable th) {
        a(str, 5);
    }

    public final void c(String str, String str2, Throwable th) {
        if (a(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        c(str, str2, null);
    }

    public final void a(String str, String str2) {
        a(str, 3);
    }

    public final void b(String str, String str2) {
        a(str, 2);
    }

    public final void c(String str, String str2) {
        a(str, 4);
    }

    public final void d(String str, String str2) {
        a(str, 5);
    }

    public final void a(int i, String str, String str2) {
        if (a(str, i)) {
            Log.println(i, str, str2);
        }
    }
}
