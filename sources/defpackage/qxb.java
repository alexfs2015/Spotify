package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import io.reactivex.Scheduler;

/* renamed from: qxb reason: default package */
public final class qxb implements vua<MusicPagesFiltering> {
    private final wlc<qwx> a;
    private final wlc<rnf> b;
    private final wlc<hvl> c;
    private final wlc<Scheduler> d;

    private qxb(wlc<qwx> wlc, wlc<rnf> wlc2, wlc<hvl> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qxb a(wlc<qwx> wlc, wlc<rnf> wlc2, wlc<hvl> wlc3, wlc<Scheduler> wlc4) {
        return new qxb(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new MusicPagesFiltering((qwx) this.a.get(), (rnf) this.b.get(), (hvl) this.c.get(), (Scheduler) this.d.get());
    }
}
