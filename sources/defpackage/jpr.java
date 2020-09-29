package defpackage;

/* renamed from: jpr reason: default package */
public final class jpr implements wig<jpq> {
    private final wzi<jpl> a;
    private final wzi<jps> b;

    private jpr(wzi<jpl> wzi, wzi<jps> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jpr a(wzi<jpl> wzi, wzi<jps> wzi2) {
        return new jpr(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jpq((jpl) this.a.get(), (jps) this.b.get());
    }
}
