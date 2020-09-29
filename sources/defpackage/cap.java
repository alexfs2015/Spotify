package defpackage;

import java.util.concurrent.Callable;

/* renamed from: cap reason: default package */
class cap {
    private static final cap c = new cap(true, null, null);
    final boolean a;
    final Throwable b;
    private final String d;

    cap(boolean z, String str, Throwable th) {
        this.a = z;
        this.d = str;
        this.b = th;
    }

    static cap a() {
        return c;
    }

    static cap a(Callable<String> callable) {
        return new caq(callable, 0);
    }

    static cap a(String str) {
        return new cap(false, str, null);
    }

    static cap a(String str, Throwable th) {
        return new cap(false, str, th);
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return this.d;
    }

    static String a(String str, cah cah, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, bzl.a(bzc.a("SHA-1").digest(cah.c())), Boolean.valueOf(z), "12451009.false"});
    }
}
