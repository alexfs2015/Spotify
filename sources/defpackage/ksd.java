package defpackage;

/* renamed from: ksd reason: default package */
public final class ksd implements vua<ksc> {
    private final wlc<krz> a;

    private ksd(wlc<krz> wlc) {
        this.a = wlc;
    }

    public static ksd a(wlc<krz> wlc) {
        return new ksd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ksc(this.a);
    }
}
