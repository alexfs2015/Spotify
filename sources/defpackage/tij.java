package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.offline.OfflineError;

/* renamed from: tij reason: default package */
public final class tij implements tik {
    private final tii a;
    private final tih b;
    private tig c;
    private boolean d;
    private boolean e;

    public tij(tii tii, tih tih) {
        this.a = tii;
        this.b = tih;
    }

    public final void a(tig tig) {
        this.c = tig;
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
        tig tig = this.c;
        if (tig == null) {
            Logger.e("Wrong initialization detected. onDownloadRequest cannot be called before the onModelChanged. Please check the code.", new Object[0]);
        } else if (tig.b()) {
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
