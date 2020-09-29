package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: tsb reason: default package */
public final class tsb implements wig<Flowable<Ad>> {
    private final wzi<igd> a;
    private final wzi<Scheduler> b;
    private final wzi<Scheduler> c;

    private tsb(wzi<igd> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tsb a(wzi<igd> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3) {
        return new tsb(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(CC.a((igd) this.a.get(), (Scheduler) this.b.get(), (Scheduler) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
