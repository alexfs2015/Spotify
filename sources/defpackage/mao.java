package defpackage;

import android.os.Bundle;

/* renamed from: mao reason: default package */
public final class mao implements wig<lyl> {
    private final wzi<Bundle> a;
    private final wzi<fqn> b;
    private final wzi<rqb> c;
    private final wzi<uix> d;
    private final wzi<vrb> e;

    private mao(wzi<Bundle> wzi, wzi<fqn> wzi2, wzi<rqb> wzi3, wzi<uix> wzi4, wzi<vrb> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static mao a(wzi<Bundle> wzi, wzi<fqn> wzi2, wzi<rqb> wzi3, wzi<uix> wzi4, wzi<vrb> wzi5) {
        mao mao = new mao(wzi, wzi2, wzi3, wzi4, wzi5);
        return mao;
    }

    public final /* synthetic */ Object get() {
        fqn fqn = (fqn) this.b.get();
        uix uix = (uix) this.d.get();
        return (lyl) wil.a(lyl.a.f().a(((Bundle) this.a.get()).getString("view_uri", "")).a(((rqb) this.c.get()).a(fqn)).b(uix.a(fqn)).a((vrb) this.e.get()).c(uvx.b(fqn)).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
