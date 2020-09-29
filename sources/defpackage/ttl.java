package defpackage;

/* renamed from: ttl reason: default package */
public final class ttl implements wig<ttk> {
    private final wzi<fqn> a;
    private final wzi<rqb> b;
    private final wzi<sye> c;

    private ttl(wzi<fqn> wzi, wzi<rqb> wzi2, wzi<sye> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ttl a(wzi<fqn> wzi, wzi<rqb> wzi2, wzi<sye> wzi3) {
        return new ttl(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ttk((fqn) this.a.get(), (rqb) this.b.get(), (sye) this.c.get());
    }
}
