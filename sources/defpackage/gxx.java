package defpackage;

import com.spotify.music.follow.FollowManager;

/* renamed from: gxx reason: default package */
public final class gxx implements wig<gxw> {
    private final wzi<wbt> a;
    private final wzi<gyc> b;
    private final wzi<FollowManager> c;
    private final wzi<gxr> d;
    private final wzi<gxp> e;

    private gxx(wzi<wbt> wzi, wzi<gyc> wzi2, wzi<FollowManager> wzi3, wzi<gxr> wzi4, wzi<gxp> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static gxx a(wzi<wbt> wzi, wzi<gyc> wzi2, wzi<FollowManager> wzi3, wzi<gxr> wzi4, wzi<gxp> wzi5) {
        gxx gxx = new gxx(wzi, wzi2, wzi3, wzi4, wzi5);
        return gxx;
    }

    public final /* synthetic */ Object get() {
        gxw gxw = new gxw((wbt) this.a.get(), (gyc) this.b.get(), (FollowManager) this.c.get(), (gxr) this.d.get(), (gxp) this.e.get());
        return gxw;
    }
}
