package defpackage;

/* renamed from: mxt reason: default package */
public final class mxt implements mxs {
    private final boolean a;
    private final wzi<rog> b;
    private final who<mxv> c;
    private final suo d;

    public mxt(boolean z, wzi<rog> wzi, who<mxv> who, suo suo) {
        this.a = z;
        this.b = (wzi) fbp.a(wzi);
        this.c = (who) fbp.a(who);
        this.d = suo;
    }

    public final xii<hcs> a(String str) {
        return this.a ? wit.a((xfk<T>) ((rog) this.b.get()).a()) : ((mxv) this.c.get()).a(str).a((c<? super T, ? extends R>) this.d);
    }
}
