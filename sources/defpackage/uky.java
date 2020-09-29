package defpackage;

/* renamed from: uky reason: default package */
public final class uky implements vua<ukj> {
    private static final uky a = new uky();

    public static uky a() {
        return a;
    }

    public static ukj b() {
        return (ukj) vuf.a(new ukt(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
