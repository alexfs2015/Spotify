package defpackage;

import com.spotify.music.offline.OfflineError;

/* renamed from: mzs reason: default package */
public final class mzs {
    final mzm a;
    final ttd b;
    final a c = new $$Lambda$mzs$lA8FHtRy20_vYq7yuaGQ8l2kGY(this);

    public mzs(mzm mzm, ttd ttd) {
        this.a = mzm;
        this.b = ttd;
    }

    /* access modifiers changed from: private */
    public void a(OfflineError offlineError) {
        if (offlineError == OfflineError.OFFLINE_NOT_ALLOWED) {
            mzm mzm = this.a;
            if (mzm.d != null) {
                mzm.d.bd_();
            }
            if (mzm.c) {
                mzm.c = false;
                mzm.b.a(mzm.a, false);
            }
        }
    }
}
