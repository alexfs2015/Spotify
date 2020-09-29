package defpackage;

import com.spotify.cosmos.router.Response;

/* renamed from: iiv reason: default package */
public final class iiv implements wig<iiu> {
    private final wzi<iiw> a;
    private final wzi<jyk<Response>> b;
    private final wzi<iiy> c;

    private iiv(wzi<iiw> wzi, wzi<jyk<Response>> wzi2, wzi<iiy> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static iiv a(wzi<iiw> wzi, wzi<jyk<Response>> wzi2, wzi<iiy> wzi3) {
        return new iiv(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        iiu iiu = new iiu((iiw) this.a.get(), (jyk) this.b.get());
        iiu.a = (iiy) this.c.get();
        return iiu;
    }
}
