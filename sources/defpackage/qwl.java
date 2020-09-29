package defpackage;

/* renamed from: qwl reason: default package */
public final class qwl implements wig<qwk> {
    private final wzi<String> a;

    private qwl(wzi<String> wzi) {
        this.a = wzi;
    }

    public static qwl a(wzi<String> wzi) {
        return new qwl(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qwk((String) this.a.get());
    }
}
