package defpackage;

/* renamed from: wcl reason: default package */
public final class wcl implements wig<wck> {
    private final wzi<wcn> a;
    private final wzi<wci> b;

    private wcl(wzi<wcn> wzi, wzi<wci> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static wcl a(wzi<wcn> wzi, wzi<wci> wzi2) {
        return new wcl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new wck((wcn) this.a.get(), (wci) this.b.get());
    }
}
