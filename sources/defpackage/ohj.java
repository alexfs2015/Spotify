package defpackage;

/* renamed from: ohj reason: default package */
public final class ohj implements vua<ohi> {
    private final wlc<String> a;
    private final wlc<uzm> b;
    private final wlc<osf> c;
    private final wlc<rgz> d;

    private ohj(wlc<String> wlc, wlc<uzm> wlc2, wlc<osf> wlc3, wlc<rgz> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ohj a(wlc<String> wlc, wlc<uzm> wlc2, wlc<osf> wlc3, wlc<rgz> wlc4) {
        return new ohj(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new ohi((String) this.a.get(), (uzm) this.b.get(), (osf) this.c.get(), (rgz) this.d.get());
    }
}
