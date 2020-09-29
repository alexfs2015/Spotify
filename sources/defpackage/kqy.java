package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import io.reactivex.Flowable;

/* renamed from: kqy reason: default package */
public final class kqy implements wig<c<krf, krc, krb>> {
    private final wzi<Player> a;
    private final wzi<Flowable<PlayerState>> b;
    private final wzi<jtz> c;
    private final wzi<iiw> d;
    private final wzi<wca> e;
    private final wzi<SlotApi> f;
    private final wzi<krn> g;
    private final wzi<gfk<fli>> h;
    private final wzi<krk> i;
    private final wzi<rwl> j;

    private kqy(wzi<Player> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<jtz> wzi3, wzi<iiw> wzi4, wzi<wca> wzi5, wzi<SlotApi> wzi6, wzi<krn> wzi7, wzi<gfk<fli>> wzi8, wzi<krk> wzi9, wzi<rwl> wzi10) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
    }

    public static kqy a(wzi<Player> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<jtz> wzi3, wzi<iiw> wzi4, wzi<wca> wzi5, wzi<SlotApi> wzi6, wzi<krn> wzi7, wzi<gfk<fli>> wzi8, wzi<krk> wzi9, wzi<rwl> wzi10) {
        kqy kqy = new kqy(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10);
        return kqy;
    }

    public final /* synthetic */ Object get() {
        return (c) wil.a(CC.a((Player) this.a.get(), (Flowable) this.b.get(), (jtz) this.c.get(), (iiw) this.d.get(), (wca) this.e.get(), (SlotApi) this.f.get(), (krn) this.g.get(), (gfk) this.h.get(), (krk) this.i.get(), (rwl) this.j.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
