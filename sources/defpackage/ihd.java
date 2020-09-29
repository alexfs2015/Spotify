package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.squareup.picasso.Picasso;
import io.reactivex.Scheduler;

/* renamed from: ihd reason: default package */
public final class ihd implements wig<ihc> {
    private final wzi<Context> a;
    private final wzi<hzu> b;
    private final wzi<SlotApi> c;
    private final wzi<Picasso> d;
    private final wzi<igd> e;
    private final wzi<ibr> f;
    private final wzi<Scheduler> g;
    private final wzi<Scheduler> h;

    private ihd(wzi<Context> wzi, wzi<hzu> wzi2, wzi<SlotApi> wzi3, wzi<Picasso> wzi4, wzi<igd> wzi5, wzi<ibr> wzi6, wzi<Scheduler> wzi7, wzi<Scheduler> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static ihd a(wzi<Context> wzi, wzi<hzu> wzi2, wzi<SlotApi> wzi3, wzi<Picasso> wzi4, wzi<igd> wzi5, wzi<ibr> wzi6, wzi<Scheduler> wzi7, wzi<Scheduler> wzi8) {
        ihd ihd = new ihd(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return ihd;
    }

    public final /* synthetic */ Object get() {
        ihc ihc = new ihc((Context) this.a.get(), (hzu) this.b.get(), (SlotApi) this.c.get(), wif.b(this.d), (igd) this.e.get(), (ibr) this.f.get(), (Scheduler) this.g.get(), (Scheduler) this.h.get());
        return ihc;
    }
}
