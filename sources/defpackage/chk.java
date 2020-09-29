package defpackage;

/* renamed from: chk reason: default package */
final class chk implements cqy<ebu> {
    private final /* synthetic */ chj a;

    chk(chj chj) {
        this.a = chj;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            ((ebu) obj).b("AFMA_getAdapterLessMediationAd", this.a.a);
        } catch (Exception e) {
            cml.a("Error requesting an ad url", e);
            chh.f.a(this.a.b);
        }
    }
}
