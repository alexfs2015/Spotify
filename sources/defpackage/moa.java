package defpackage;

/* renamed from: moa reason: default package */
public final class moa implements wig<mnz> {
    private final wzi<mob> a;
    private final wzi<String> b;

    private moa(wzi<mob> wzi, wzi<String> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static moa a(wzi<mob> wzi, wzi<String> wzi2) {
        return new moa(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mnz(this.a, this.b);
    }
}
