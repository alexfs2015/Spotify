package defpackage;

/* renamed from: sgg reason: default package */
public final class sgg<T> {
    public final String a;
    public final T b;
    private final Throwable c;

    private sgg(String str, T t, Throwable th) {
        this.a = (String) fay.a(str);
        this.b = t;
        this.c = th;
    }

    public static <T> sgg<T> a(String str, T t) {
        return new sgg<>(str, t, null);
    }

    public static <T> sgg<T> a(String str, Throwable th) {
        return new sgg<>(str, null, th);
    }

    public static <T> sgg<T> c() {
        return new sgg<>("", null, null);
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        return this.c != null;
    }
}
