package defpackage;

/* renamed from: cnn reason: default package */
final class cnn implements cpb<Throwable, T> {
    private final /* synthetic */ cnr a;

    cnn(cnr cnr) {
        this.a = cnr;
    }

    public final /* synthetic */ cpr a(Object obj) {
        Throwable th = (Throwable) obj;
        clu.a("Error occurred while dispatching http response in getter.", th);
        bjl.i().a(th, "HttpGetter.deliverResponse.1");
        return cpg.a(this.a.a());
    }
}
