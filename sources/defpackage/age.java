package defpackage;

/* renamed from: age reason: default package */
public abstract class age {
    protected static int a = 2;
    final String b;

    /* access modifiers changed from: 0000 */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract void a(int i, String str, Object... objArr);

    /* access modifiers changed from: 0000 */
    public abstract int b();

    age(String str) {
        this.b = str;
    }

    public static age a(String str, String str2, String str3) {
        return new aga(str, str2, str3);
    }

    public final void a(String str, Object... objArr) {
        a(2, str, objArr);
    }

    public final void b(String str, Object... objArr) {
        a(3, str, objArr);
    }

    public final void c(String str, Object... objArr) {
        a(5, str, objArr);
    }

    public final void d(String str, Object... objArr) {
        a(6, str, objArr);
    }

    public static void a(int i) {
        a = 7;
    }
}
