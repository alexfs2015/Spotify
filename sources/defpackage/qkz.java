package defpackage;

/* renamed from: qkz reason: default package */
public final class qkz implements wig<qky> {
    private final wzi<Boolean> a;

    private qkz(wzi<Boolean> wzi) {
        this.a = wzi;
    }

    public static qkz a(wzi<Boolean> wzi) {
        return new qkz(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qky(((Boolean) this.a.get()).booleanValue());
    }
}
