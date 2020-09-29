package defpackage;

/* renamed from: qhp reason: default package */
public final class qhp implements wig<qho> {
    private final wzi<fqn> a;
    private final wzi<Boolean> b;
    private final wzi<String> c;
    private final wzi<sio> d;
    private final wzi<sip> e;

    private qhp(wzi<fqn> wzi, wzi<Boolean> wzi2, wzi<String> wzi3, wzi<sio> wzi4, wzi<sip> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static qhp a(wzi<fqn> wzi, wzi<Boolean> wzi2, wzi<String> wzi3, wzi<sio> wzi4, wzi<sip> wzi5) {
        qhp qhp = new qhp(wzi, wzi2, wzi3, wzi4, wzi5);
        return qhp;
    }

    public final /* synthetic */ Object get() {
        qho qho = new qho((fqn) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (String) this.c.get(), (sio) this.d.get(), (sip) this.e.get());
        return qho;
    }
}
