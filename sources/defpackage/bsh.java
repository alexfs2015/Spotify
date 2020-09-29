package defpackage;

/* renamed from: bsh reason: default package */
final class bsh extends f {
    private final /* synthetic */ String a;
    private final /* synthetic */ String e;
    private final /* synthetic */ brr f = null;

    bsh(bsy bsy, String str, String str2) {
        this.a = str;
        this.e = str2;
        super(bsy);
    }

    public final /* synthetic */ void a(b bVar) {
        a((ehs) bVar);
    }

    public final void a(ehs ehs) {
        try {
            String str = this.a;
            String str2 = this.e;
            ehs.a((b<a>) this);
            brr brr = new brr();
            eie eie = (eie) ehs.q();
            if (ehs.t()) {
                eie.a(str, str2, brr);
            } else {
                ehs.b(2016);
            }
        } catch (IllegalStateException unused) {
            h();
        }
    }
}
