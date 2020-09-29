package defpackage;

/* renamed from: qfd reason: default package */
public final class qfd implements gxk, srn {
    private final spr b;
    private final squ c;

    public qfd(spr spr, squ squ) {
        this.b = (spr) fbp.a(spr);
        this.c = (squ) fbp.a(squ);
    }

    public final hci a() {
        return hct.builder().a("retry").a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        this.c.a();
        this.b.onRetrySearch();
    }
}
