package defpackage;

/* renamed from: mdt reason: default package */
public final class mdt implements wig<b> {
    private final wzi<String> a;

    private mdt(wzi<String> wzi) {
        this.a = wzi;
    }

    public static mdt a(wzi<String> wzi) {
        return new mdt(wzi);
    }

    public final /* synthetic */ Object get() {
        return new b((String) this.a.get());
    }
}
