package defpackage;

import android.content.Context;
import com.spotify.music.navigation.NavigationManager;

/* renamed from: qxw reason: default package */
public final class qxw implements wig<sxw> {
    private final wzi<NavigationManager> a;
    private final wzi<Context> b;
    private final wzi<szp> c;
    private final wzi<xii<Long>> d;
    private final wzi<tmu> e;

    private qxw(wzi<NavigationManager> wzi, wzi<Context> wzi2, wzi<szp> wzi3, wzi<xii<Long>> wzi4, wzi<tmu> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static qxw a(wzi<NavigationManager> wzi, wzi<Context> wzi2, wzi<szp> wzi3, wzi<xii<Long>> wzi4, wzi<tmu> wzi5) {
        qxw qxw = new qxw(wzi, wzi2, wzi3, wzi4, wzi5);
        return qxw;
    }

    public final /* synthetic */ Object get() {
        sxv sxv = new sxv((NavigationManager) this.a.get(), (Context) this.b.get(), (szp) this.c.get(), (xii) this.d.get(), (tmu) this.e.get());
        return (sxw) wil.a(sxv, "Cannot return null from a non-@Nullable @Provides method");
    }
}
