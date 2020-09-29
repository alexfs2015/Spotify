package defpackage;

/* renamed from: evl reason: default package */
final class evl extends ewv {
    private final /* synthetic */ evh a;

    evl(evh evh, etn etn) {
        this.a = evh;
        super(etn);
    }

    public final void a() {
        evh evh = this.a;
        evh.c();
        evh.q().k.a("Current session is expired, remove the session number and Id");
        if (evh.s().h(evh.f().v())) {
            evh.e().a("auto", "_sid", (Object) null, evh.l().a());
        }
        if (evh.s().i(evh.f().v())) {
            evh.e().a("auto", "_sno", (Object) null, evh.l().a());
        }
    }
}
