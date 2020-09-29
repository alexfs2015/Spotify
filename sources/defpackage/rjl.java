package defpackage;

/* renamed from: rjl reason: default package */
public final class rjl implements wig<rjk> {
    private final wzi<rjm> a;

    private rjl(wzi<rjm> wzi) {
        this.a = wzi;
    }

    public static rjl a(wzi<rjm> wzi) {
        return new rjl(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rjk((rjm) this.a.get());
    }
}
