package defpackage;

/* renamed from: qgt reason: default package */
public final class qgt implements wig<Boolean> {
    private final wzi<qeh> a;

    private qgt(wzi<qeh> wzi) {
        this.a = wzi;
    }

    public static qgt a(wzi<qeh> wzi) {
        return new qgt(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((qeh) this.a.get()).d.equals("premium"));
    }
}
