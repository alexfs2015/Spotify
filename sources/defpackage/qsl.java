package defpackage;

/* renamed from: qsl reason: default package */
public final class qsl implements vua<qsk> {
    private final wlc<kf> a;

    private qsl(wlc<kf> wlc) {
        this.a = wlc;
    }

    public static qsl a(wlc<kf> wlc) {
        return new qsl(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qsk((kf) this.a.get());
    }
}
