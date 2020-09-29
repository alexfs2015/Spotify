package defpackage;

/* renamed from: rex reason: default package */
public final class rex implements vua<rfd> {
    private final wlc<uzm> a;
    private final wlc<rgz> b;
    private final wlc<fpt> c;
    private final wlc<wud<Boolean>> d;

    private rex(wlc<uzm> wlc, wlc<rgz> wlc2, wlc<fpt> wlc3, wlc<wud<Boolean>> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rex a(wlc<uzm> wlc, wlc<rgz> wlc2, wlc<fpt> wlc3, wlc<wud<Boolean>> wlc4) {
        return new rex(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        Object obj;
        uzm uzm = (uzm) this.a.get();
        wud wud = (wud) this.d.get();
        if (((rgz) this.b.get()).a((fpt) this.c.get())) {
            obj = new rfb(uzm, wud);
        } else {
            obj = new rfc();
        }
        return (rfd) vuf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
