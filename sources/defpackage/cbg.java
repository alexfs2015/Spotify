package defpackage;

import java.util.concurrent.Callable;

/* renamed from: cbg reason: default package */
class cbg {
    private static final cbg c = new cbg(true, null, null);
    final boolean a;
    final Throwable b;
    private final String d;

    cbg(boolean z, String str, Throwable th) {
        this.a = z;
        this.d = str;
        this.b = th;
    }

    static cbg a() {
        return c;
    }

    static cbg a(String str) {
        return new cbg(false, str, null);
    }

    static cbg a(String str, Throwable th) {
        return new cbg(false, str, th);
    }

    static cbg a(Callable<String> callable) {
        return new cbh(callable, 0);
    }

    static String a(String str, cay cay, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, cac.a(bzt.a("SHA-1").digest(cay.c())), Boolean.valueOf(z), "12451009.false"});
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return this.d;
    }
}
