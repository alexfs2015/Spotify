package defpackage;

/* renamed from: pwh reason: default package */
public final class pwh implements gvk, shg {
    private final sfk b;
    private final sgn c;

    public pwh(sfk sfk, sgn sgn) {
        this.b = (sfk) fay.a(sfk);
        this.c = (sgn) fay.a(sgn);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        this.c.a();
        this.b.onRetrySearch();
    }

    public final gzp a() {
        return haa.builder().a("retry").a();
    }
}
