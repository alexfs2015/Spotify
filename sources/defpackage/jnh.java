package defpackage;

/* renamed from: jnh reason: default package */
public final class jnh implements vua<jng> {
    private final wlc<hba> a;

    private jnh(wlc<hba> wlc) {
        this.a = wlc;
    }

    public static jnh a(wlc<hba> wlc) {
        return new jnh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jng((hba) this.a.get());
    }
}
