package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.offline.OfflineError;

/* renamed from: ttb reason: default package */
public final class ttb implements ttc {
    private final tta a;
    private final tsz b;
    private tsy c;
    private boolean d;
    private boolean e;

    public ttb(tta tta, tsz tsz) {
        this.a = tta;
        this.b = tsz;
    }

    public final void a(tsy tsy) {
        this.c = tsy;
        if (!this.d) {
            this.a.updateDownloadViewState(this.c.a());
        }
        if (this.d && !this.c.b()) {
            this.d = false;
            this.b.a(true);
        }
    }

    public final void a(boolean z) {
        if (!z) {
            this.b.a(z);
            return;
        }
        tsy tsy = this.c;
        if (tsy == null) {
            Logger.e("Wrong initialization detected. onDownloadRequest cannot be called before the onModelChanged. Please check the code.", new Object[0]);
        } else if (tsy.b()) {
            this.b.b(true);
            this.d = true;
            this.e = true;
        } else {
            this.b.a(z);
        }
    }

    public final void onOfflineSyncError(OfflineError offlineError) {
        if (this.c == null) {
            Logger.e("Wrong initialization detected. onOfflineSyncError cannot be called before the onModelChanged. Please check the code.", new Object[0]);
            return;
        }
        if (offlineError == OfflineError.OFFLINE_NOT_ALLOWED) {
            if (this.e) {
                this.e = false;
                this.b.b(false);
            }
            this.a.updateDownloadViewState(this.c.a());
        }
    }
}
