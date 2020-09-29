package defpackage;

/* renamed from: coe reason: default package */
final class coe implements cps<Throwable, T> {
    private final /* synthetic */ coi a;

    coe(coi coi) {
        this.a = coi;
    }

    public final /* synthetic */ cqi a(Object obj) {
        Throwable th = (Throwable) obj;
        cml.a("Error occurred while dispatching http response in getter.", th);
        bkc.i().a(th, "HttpGetter.deliverResponse.1");
        return cpx.a(this.a.a());
    }
}
