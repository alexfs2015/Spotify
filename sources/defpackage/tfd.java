package defpackage;

/* renamed from: tfd reason: default package */
public final class tfd implements wig<tfc> {
    private final wzi<tfe> a;

    private tfd(wzi<tfe> wzi) {
        this.a = wzi;
    }

    public static tfd a(wzi<tfe> wzi) {
        return new tfd(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tfc((tfe) this.a.get());
    }
}
