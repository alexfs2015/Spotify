package defpackage;

import android.app.Application;

/* renamed from: sfw reason: default package */
public final class sfw implements wig<gnk> {
    private final wzi<jlr> a;
    private final wzi<Application> b;
    private final wzi<hhc> c;
    private final wzi<gna> d;

    private sfw(wzi<jlr> wzi, wzi<Application> wzi2, wzi<hhc> wzi3, wzi<gna> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static sfw a(wzi<jlr> wzi, wzi<Application> wzi2, wzi<hhc> wzi3, wzi<gna> wzi4) {
        return new sfw(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        jlr jlr = (jlr) this.a.get();
        Application application = (Application) this.b.get();
        gna gna = (gna) this.d.get();
        sfy sfy = new sfy(wit.a(((hhc) this.c.get()).b()));
        sfy.a((gnj) gna);
        sfy.a((gnj) new sga(jlr));
        sfy.a((gnj) new sfo(application.getApplicationContext()));
        return (gnk) wil.a(sfy, "Cannot return null from a non-@Nullable @Provides method");
    }
}
