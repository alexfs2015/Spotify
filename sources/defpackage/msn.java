package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.editplaylist.EditPlaylistLogger;
import com.spotify.music.features.editplaylist.upload.ImageUpload;
import io.reactivex.Scheduler;

/* renamed from: msn reason: default package */
public final class msn implements wig<msl> {
    private final wzi<msr> a;
    private final wzi<EditPlaylistLogger> b;
    private final wzi<a> c;
    private final wzi<mso> d;
    private final wzi<Scheduler> e;
    private final wzi<hgy> f;
    private final wzi<msf> g;
    private final wzi<mrh> h;
    private final wzi<a> i;
    private final wzi<msk> j;
    private final wzi<vje> k;
    private final wzi<msq> l;
    private final wzi<ImageUpload> m;
    private final wzi<msp> n;

    public static msl a(msr msr, EditPlaylistLogger editPlaylistLogger, a aVar, mso mso, Scheduler scheduler, hgy hgy, msf msf, mrh mrh, Object obj, msk msk, vje vje, msq msq, ImageUpload imageUpload, msp msp) {
        msl msl = new msl(msr, editPlaylistLogger, aVar, mso, scheduler, hgy, msf, mrh, (a) obj, msk, vje, msq, imageUpload, msp);
        return msl;
    }

    public final /* synthetic */ Object get() {
        msl msl = new msl((msr) this.a.get(), (EditPlaylistLogger) this.b.get(), (a) this.c.get(), (mso) this.d.get(), (Scheduler) this.e.get(), (hgy) this.f.get(), (msf) this.g.get(), (mrh) this.h.get(), (a) this.i.get(), (msk) this.j.get(), (vje) this.k.get(), (msq) this.l.get(), (ImageUpload) this.m.get(), (msp) this.n.get());
        return msl;
    }
}
