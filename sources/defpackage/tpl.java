package defpackage;

/* renamed from: tpl reason: default package */
public final class tpl implements vua<tks> {
    private final wlc<tox> a;
    private final wlc<kpe> b;
    private final wlc<Boolean> c;

    private tpl(wlc<tox> wlc, wlc<kpe> wlc2, wlc<Boolean> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tpl a(wlc<tox> wlc, wlc<kpe> wlc2, wlc<Boolean> wlc3) {
        return new tpl(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        Object obj = (tox) this.a.get();
        Object obj2 = (kpe) this.b.get();
        if (((Boolean) this.c.get()).booleanValue()) {
            obj = obj2;
        }
        return (tks) vuf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
