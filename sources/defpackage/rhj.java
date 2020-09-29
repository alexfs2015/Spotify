package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

/* renamed from: rhj reason: default package */
public final class rhj implements wig<rhi> {
    private final wzi<rhr> a;
    private final wzi<CollectionStateProvider> b;
    private final wzi<sso> c;
    private final wzi<rgf> d;
    private final wzi<lbi> e;

    private rhj(wzi<rhr> wzi, wzi<CollectionStateProvider> wzi2, wzi<sso> wzi3, wzi<rgf> wzi4, wzi<lbi> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static rhj a(wzi<rhr> wzi, wzi<CollectionStateProvider> wzi2, wzi<sso> wzi3, wzi<rgf> wzi4, wzi<lbi> wzi5) {
        rhj rhj = new rhj(wzi, wzi2, wzi3, wzi4, wzi5);
        return rhj;
    }

    public final /* synthetic */ Object get() {
        rhi rhi = new rhi(this.a, this.b, this.c, this.d, this.e);
        return rhi;
    }
}
