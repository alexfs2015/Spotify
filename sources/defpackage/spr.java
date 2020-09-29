package defpackage;

/* renamed from: spr reason: default package */
public final class spr implements spo {
    public spo a;

    private spr() {
    }

    public static spr a() {
        return new spr();
    }

    public final void onRetrySearch() {
        spo spo = this.a;
        if (spo != null) {
            spo.onRetrySearch();
        }
    }
}
