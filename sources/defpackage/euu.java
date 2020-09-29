package defpackage;

/* renamed from: euu reason: default package */
final class euu extends ewe {
    private final /* synthetic */ euq a;

    euu(euq euq, esw esw) {
        this.a = euq;
        super(esw);
    }

    public final void a() {
        euq euq = this.a;
        euq.c();
        euq.q().k.a("Current session is expired, remove the session number and Id");
        if (euq.s().h(euq.f().v())) {
            euq.e().a("auto", "_sid", (Object) null, euq.l().a());
        }
        if (euq.s().i(euq.f().v())) {
            euq.e().a("auto", "_sno", (Object) null, euq.l().a());
        }
    }
}
