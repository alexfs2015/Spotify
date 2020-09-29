package defpackage;

/* renamed from: qko reason: default package */
public final class qko implements wig<qkn> {
    private final wzi<Boolean> a;

    private qko(wzi<Boolean> wzi) {
        this.a = wzi;
    }

    public static qko a(wzi<Boolean> wzi) {
        return new qko(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qkn(((Boolean) this.a.get()).booleanValue());
    }
}
