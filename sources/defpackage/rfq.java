package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import io.reactivex.Scheduler;

/* renamed from: rfq reason: default package */
public final class rfq implements wig<MusicPagesFiltering> {
    private final wzi<rfm> a;
    private final wzi<rwl> b;
    private final wzi<hxx> c;
    private final wzi<Scheduler> d;

    private rfq(wzi<rfm> wzi, wzi<rwl> wzi2, wzi<hxx> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rfq a(wzi<rfm> wzi, wzi<rwl> wzi2, wzi<hxx> wzi3, wzi<Scheduler> wzi4) {
        return new rfq(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new MusicPagesFiltering((rfm) this.a.get(), (rwl) this.b.get(), (hxx) this.c.get(), (Scheduler) this.d.get());
    }
}
