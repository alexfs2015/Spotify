package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.editplaylist.EditPlaylistLogger;
import com.spotify.music.features.editplaylist.upload.ImageUpload;
import io.reactivex.Scheduler;

/* renamed from: mnu reason: default package */
public final class mnu implements vua<mns> {
    private final wlc<mny> a;
    private final wlc<EditPlaylistLogger> b;
    private final wlc<a> c;
    private final wlc<mnv> d;
    private final wlc<Scheduler> e;
    private final wlc<hec> f;
    private final wlc<mnm> g;
    private final wlc<mmo> h;
    private final wlc<a> i;
    private final wlc<mnr> j;
    private final wlc<uxc> k;
    private final wlc<mnx> l;
    private final wlc<ImageUpload> m;
    private final wlc<mnw> n;

    public static mns a(mny mny, EditPlaylistLogger editPlaylistLogger, a aVar, mnv mnv, Scheduler scheduler, hec hec, mnm mnm, mmo mmo, Object obj, mnr mnr, uxc uxc, mnx mnx, ImageUpload imageUpload, mnw mnw) {
        mns mns = new mns(mny, editPlaylistLogger, aVar, mnv, scheduler, hec, mnm, mmo, (a) obj, mnr, uxc, mnx, imageUpload, mnw);
        return mns;
    }

    public final /* synthetic */ Object get() {
        mns mns = new mns((mny) this.a.get(), (EditPlaylistLogger) this.b.get(), (a) this.c.get(), (mnv) this.d.get(), (Scheduler) this.e.get(), (hec) this.f.get(), (mnm) this.g.get(), (mmo) this.h.get(), (a) this.i.get(), (mnr) this.j.get(), (uxc) this.k.get(), (mnx) this.l.get(), (ImageUpload) this.m.get(), (mnw) this.n.get());
        return mns;
    }
}
