package defpackage;

/* renamed from: hrl reason: default package */
public final class hrl implements wig<hrk> {
    private final wzi<hsu> a;

    private hrl(wzi<hsu> wzi) {
        this.a = wzi;
    }

    public static hrl a(wzi<hsu> wzi) {
        return new hrl(wzi);
    }

    public final /* synthetic */ Object get() {
        return new hrk(wif.b(this.a));
    }
}
