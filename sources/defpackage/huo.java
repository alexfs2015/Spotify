package defpackage;

import com.spotify.mobile.android.service.offlinesync.OfflineProgressModel;

/* renamed from: huo reason: default package */
public final class huo implements a {
    private final jhz a;

    public huo(jhz jhz) {
        this.a = jhz;
    }

    public final void a(OfflineProgressModel offlineProgressModel) {
        if (offlineProgressModel.isSyncing()) {
            this.a.c.e();
        } else {
            this.a.c.f();
        }
    }
}
