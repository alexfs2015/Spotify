package defpackage;

import com.spotify.mobile.android.service.offlinesync.OfflineProgressModel;

/* renamed from: hxa reason: default package */
public final class hxa implements a {
    private final jkp a;

    public hxa(jkp jkp) {
        this.a = jkp;
    }

    public final void a(OfflineProgressModel offlineProgressModel) {
        if (offlineProgressModel.isSyncing()) {
            this.a.c.e();
        } else {
            this.a.c.f();
        }
    }
}
