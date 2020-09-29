package defpackage;

/* renamed from: cgt reason: default package */
final class cgt implements cqh<ebd> {
    private final /* synthetic */ cgs a;

    cgt(cgs cgs) {
        this.a = cgs;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            ((ebd) obj).b("AFMA_getAdapterLessMediationAd", this.a.a);
        } catch (Exception e) {
            clu.a("Error requesting an ad url", e);
            cgq.f.a(this.a.b);
        }
    }
}
