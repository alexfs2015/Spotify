package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Event;
import io.reactivex.Scheduler;

/* renamed from: igr reason: default package */
public final class igr implements wig<igq> {
    private final wzi<gmm<Event>> a;
    private final wzi<hzt> b;
    private final wzi<iil> c;
    private final wzi<Scheduler> d;

    private igr(wzi<gmm<Event>> wzi, wzi<hzt> wzi2, wzi<iil> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static igr a(wzi<gmm<Event>> wzi, wzi<hzt> wzi2, wzi<iil> wzi3, wzi<Scheduler> wzi4) {
        return new igr(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new igq((gmm) this.a.get(), (hzt) this.b.get(), (iil) this.c.get(), (Scheduler) this.d.get());
    }
}
