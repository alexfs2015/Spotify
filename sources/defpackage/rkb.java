package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.feedback.FeedbackContextType;
import io.reactivex.Scheduler;
import java.util.Map;

/* renamed from: rkb reason: default package */
public final class rkb implements wig<rka> {
    private final wzi<rjk> a;
    private final wzi<Map<FeedbackContextType, rjz>> b;
    private final wzi<rkg> c;
    private final wzi<rjo> d;
    private final wzi<Scheduler> e;
    private final wzi<Scheduler> f;
    private final wzi<a> g;

    private rkb(wzi<rjk> wzi, wzi<Map<FeedbackContextType, rjz>> wzi2, wzi<rkg> wzi3, wzi<rjo> wzi4, wzi<Scheduler> wzi5, wzi<Scheduler> wzi6, wzi<a> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static rkb a(wzi<rjk> wzi, wzi<Map<FeedbackContextType, rjz>> wzi2, wzi<rkg> wzi3, wzi<rjo> wzi4, wzi<Scheduler> wzi5, wzi<Scheduler> wzi6, wzi<a> wzi7) {
        rkb rkb = new rkb(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return rkb;
    }

    public final /* synthetic */ Object get() {
        rka rka = new rka((rjk) this.a.get(), (Map) this.b.get(), (rkg) this.c.get(), (rjo) this.d.get(), (Scheduler) this.e.get(), (Scheduler) this.f.get(), (a) this.g.get());
        return rka;
    }
}
