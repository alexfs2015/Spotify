package defpackage;

/* renamed from: sjl reason: default package */
public final class sjl implements wig<sjk> {
    private final wzi<ska> a;
    private final wzi<sjc> b;

    private sjl(wzi<ska> wzi, wzi<sjc> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sjl a(wzi<ska> wzi, wzi<sjc> wzi2) {
        return new sjl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sjk((ska) this.a.get(), (sjc) this.b.get());
    }
}
