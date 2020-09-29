package defpackage;

/* renamed from: pda reason: default package */
public final class pda implements vua<pcq> {
    private final wlc<fpt> a;
    private final wlc<pcr> b;

    private pda(wlc<fpt> wlc, wlc<pcr> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pda a(wlc<fpt> wlc, wlc<pcr> wlc2) {
        return new pda(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        pcq pcq;
        fpt fpt = (fpt) this.a.get();
        wlc<pcr> wlc = this.b;
        if (fpt.b(pdd.a)) {
            pcq = (pcq) wlc.get();
        } else {
            pcq = pcq.a;
        }
        return (pcq) vuf.a(pcq, "Cannot return null from a non-@Nullable @Provides method");
    }
}
