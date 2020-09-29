package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.stories.v1.view.proto.TrackChapter;

/* renamed from: nak reason: default package */
public final class nak implements naj {
    private final kxi a;
    private final jsz b;
    private final String c;
    private final jmq d;
    private final nac e;

    public final /* synthetic */ jms onCreateContextMenu(Object obj) {
        TrackChapter trackChapter = (TrackChapter) obj;
        return this.d.a(trackChapter.d, trackChapter.k().d, this.c).a(sih.a(this.c)).a(true).b(true).c(false).d(false).a();
    }

    public nak(kxi kxi, jsz jsz, jmq jmq, nac nac, String str) {
        this.a = kxi;
        this.b = jsz;
        this.d = jmq;
        this.e = nac;
        this.c = str;
    }

    public final void a(String str, boolean z) {
        if (z) {
            this.a.a(str, this.c, false);
        } else {
            this.a.a(str, false);
        }
    }

    public final void a(nax nax) {
        nax.a(new $$Lambda$nak$6jSRp5zRvquf2ZnR4rFMcfZ8ifQ(this), new $$Lambda$nak$9p3PV1ZKCV1TKwm2OHxgBZuVxBQ(this));
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
}
