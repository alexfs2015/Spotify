package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.stories.v1.view.proto.TrackChapter;

/* renamed from: nfr reason: default package */
public final class nfr implements nfq {
    private final lar a;
    private final jvf b;
    private final String c;
    private final jpc d;
    private final nfj e;

    public nfr(lar lar, jvf jvf, jpc jpc, nfj nfj, String str) {
        this.a = lar;
        this.b = jvf;
        this.d = jpc;
        this.e = nfj;
        this.c = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.b.a(SpotifyIconV2.CHECK, (int) R.string.toast_saved_to_collection, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.b.a(SpotifyIconV2.X, (int) R.string.toast_removed_from_collection, 0);
    }

    public final void a(TrackChapter trackChapter) {
        this.e.a(trackChapter, this);
    }

    public final void a(String str, boolean z) {
        if (z) {
            this.a.a(str, this.c, false);
        } else {
            this.a.a(str, false);
        }
    }

    public final void a(ngf ngf) {
        ngf.a(new $$Lambda$nfr$8vY3cxCuzbDUhTECbmMWM1weTY(this), new $$Lambda$nfr$Gg9NoPuXu4Gge4JdyXHFRTEHplE(this));
    }

    public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
        TrackChapter trackChapter = (TrackChapter) obj;
        return this.d.a(trackChapter.d, trackChapter.k().d, this.c).a(sso.a(this.c)).a(true).b(true).c(false).d(false).a();
    }
}
