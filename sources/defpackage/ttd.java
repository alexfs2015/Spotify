package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.offline.OfflineError;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ttd reason: default package */
public final class ttd {
    private final SerialDisposable a = new SerialDisposable();
    private final tsx b;
    private final Set<a> c = Collections.synchronizedSet(new HashSet());

    /* renamed from: ttd$a */
    public interface a {
        void onOfflineSyncError(OfflineError offlineError);
    }

    public ttd(tsx tsx) {
        this.b = tsx;
    }

    /* access modifiers changed from: private */
    public void a(OfflineError offlineError) {
        synchronized (this.c) {
            for (a onOfflineSyncError : this.c) {
                onOfflineSyncError.onOfflineSyncError(offlineError);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "Failed to listen for offline errors.", new Object[0]);
    }

    public final void a() {
        this.a.a(this.b.a().c((Function<? super T, ? extends R>) $$Lambda$MOtTE6uG0iwEtBKyGszDpAgPsI.INSTANCE).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$ttd$WOaq_ObK2gCuBdKY8yOF9KQl5Vs<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ttd$KEophgGDUG_MvnM04fIK15H1lU<Object>(this)));
    }

    public final void a(a aVar) {
        fbp.a(aVar);
        this.c.add(aVar);
    }

    public final void b() {
        this.a.a(Disposables.b());
    }

    public final void b(a aVar) {
        this.c.remove(aVar);
    }
}
