package defpackage;

/* renamed from: qwb reason: default package */
public final class qwb implements wig<qwa> {
    private final wzi<qwc> a;

    private qwb(wzi<qwc> wzi) {
        this.a = wzi;
    }

    public static qwb a(wzi<qwc> wzi) {
        return new qwb(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qwa((qwc) this.a.get());
    }
}
