package defpackage;

import android.app.Activity;

/* renamed from: ocm reason: default package */
public final class ocm implements wig<ocl> {
    private final wzi<kfb> a;
    private final wzi<kfm> b;
    private final wzi<Activity> c;
    private final wzi<obg> d;
    private final wzi<szp> e;
    private final wzi<jhv> f;

    private ocm(wzi<kfb> wzi, wzi<kfm> wzi2, wzi<Activity> wzi3, wzi<obg> wzi4, wzi<szp> wzi5, wzi<jhv> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static ocl a(kfb kfb, kfm kfm, Activity activity, obg obg, szp szp, jhv jhv) {
        ocl ocl = new ocl(kfb, kfm, activity, obg, szp, jhv);
        return ocl;
    }

    public static ocm a(wzi<kfb> wzi, wzi<kfm> wzi2, wzi<Activity> wzi3, wzi<obg> wzi4, wzi<szp> wzi5, wzi<jhv> wzi6) {
        ocm ocm = new ocm(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return ocm;
    }

    public final /* synthetic */ Object get() {
        ocl ocl = new ocl((kfb) this.a.get(), (kfm) this.b.get(), (Activity) this.c.get(), (obg) this.d.get(), (szp) this.e.get(), (jhv) this.f.get());
        return ocl;
    }
}
