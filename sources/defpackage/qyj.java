package defpackage;

/* renamed from: qyj reason: default package */
public final class qyj implements wig<qyi> {
    private final wzi<gix> a;

    private qyj(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static qyj a(wzi<gix> wzi) {
        return new qyj(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qyi((gix) this.a.get());
    }
}
