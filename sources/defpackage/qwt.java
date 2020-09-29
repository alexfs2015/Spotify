package defpackage;

import android.content.Context;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;

/* renamed from: qwt reason: default package */
public final class qwt {
    private final qsr a;
    private final Context b;
    private final kf c;
    private final rcj d;

    public qwt(qsr qsr, Context context, kf kfVar, rcj rcj) {
        this.a = qsr;
        this.b = context;
        this.c = kfVar;
        this.d = rcj;
    }

    public final rbu a(MusicPageId musicPageId) {
        if (musicPageId == MusicPageId.SONGS) {
            if (this.a.f()) {
                return a();
            }
            return b();
        } else if (qsr.e()) {
            return a();
        } else {
            return b();
        }
    }

    private rbu a() {
        return new rbv(this.b, this.c, this.d);
    }

    private rbu b() {
        return new rcg(this.b, this.c, this.d);
    }
}
