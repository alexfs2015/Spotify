package defpackage;

/* renamed from: qim reason: default package */
public final class qim implements wig<qil> {
    private final wzi<squ> a;
    private final wzi<qiu> b;
    private final wzi<sqb> c;

    private qim(wzi<squ> wzi, wzi<qiu> wzi2, wzi<sqb> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qim a(wzi<squ> wzi, wzi<qiu> wzi2, wzi<sqb> wzi3) {
        return new qim(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qil((squ) this.a.get(), (qiu) this.b.get(), (sqb) this.c.get());
    }
}
