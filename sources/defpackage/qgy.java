package defpackage;

/* renamed from: qgy reason: default package */
public final class qgy implements wig<Boolean> {
    private final wzi<b> a;

    private qgy(wzi<b> wzi) {
        this.a = wzi;
    }

    public static qgy a(wzi<b> wzi) {
        return new qgy(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((b) this.a.get()).f);
    }
}
