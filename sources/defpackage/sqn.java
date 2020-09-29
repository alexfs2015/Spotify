package defpackage;

/* renamed from: sqn reason: default package */
public final class sqn<T> {
    public final String a;
    public final T b;
    private final Throwable c;

    private sqn(String str, T t, Throwable th) {
        this.a = (String) fbp.a(str);
        this.b = t;
        this.c = th;
    }

    public static <T> sqn<T> a(String str, T t) {
        return new sqn<>(str, t, null);
    }

    public static <T> sqn<T> a(String str, Throwable th) {
        return new sqn<>(str, null, th);
    }

    public static <T> sqn<T> c() {
        return new sqn<>("", null, null);
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        return this.c != null;
    }
}
