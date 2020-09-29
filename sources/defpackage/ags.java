package defpackage;

/* renamed from: ags reason: default package */
public abstract class ags {
    protected static int a = 2;
    final String b;

    ags(String str) {
        this.b = str;
    }

    public static ags a(String str, String str2, String str3) {
        return new ago(str, str2, str3);
    }

    public static void a(int i) {
        a = 7;
    }

    /* access modifiers changed from: 0000 */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract void a(int i, String str, Object... objArr);

    public final void a(String str, Object... objArr) {
        a(2, str, objArr);
    }

    /* access modifiers changed from: 0000 */
    public abstract int b();

    public final void b(String str, Object... objArr) {
        a(3, str, objArr);
    }

    public final void c(String str, Object... objArr) {
        a(5, str, objArr);
    }

    public final void d(String str, Object... objArr) {
        a(6, str, objArr);
    }
}
