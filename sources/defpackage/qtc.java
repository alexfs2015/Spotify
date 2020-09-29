package defpackage;

/* renamed from: qtc reason: default package */
public final class qtc implements wig<qtb> {
    private final wzi<qtd> a;

    private qtc(wzi<qtd> wzi) {
        this.a = wzi;
    }

    public static qtc a(wzi<qtd> wzi) {
        return new qtc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qtb((qtd) this.a.get());
    }
}
