package defpackage;

/* renamed from: bsg reason: default package */
final class bsg extends f {
    private final /* synthetic */ String a;
    private final /* synthetic */ boa e;

    bsg(bsy bsy, String str, boa boa) {
        this.a = str;
        this.e = boa;
        super(bsy);
    }

    public final /* synthetic */ void a(b bVar) {
        a((ehs) bVar);
    }

    public final void a(ehs ehs) {
        try {
            String str = this.a;
            boa boa = this.e;
            ehs.a((b<a>) this);
            eie eie = (eie) ehs.q();
            if (ehs.t()) {
                eie.a(str, boa);
            } else {
                ehs.b(2016);
            }
        } catch (IllegalStateException unused) {
            h();
        }
    }
}
