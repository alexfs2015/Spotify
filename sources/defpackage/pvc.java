package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.renameplaylist.RenamePlaylistLogger;
import com.spotify.music.features.renameplaylist.RenamePlaylistLogger.UserIntent;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: pvc reason: default package */
public final class pvc {
    public final pvd a;
    public final RenamePlaylistLogger b;
    final CompositeDisposable c = new CompositeDisposable();
    private final Scheduler d;
    private final uxh e;
    private final String f;

    public pvc(pvd pvd, RenamePlaylistLogger renamePlaylistLogger, Scheduler scheduler, uxh uxh, pvb pvb, final a aVar) {
        this.a = pvd;
        this.b = renamePlaylistLogger;
        this.d = scheduler;
        this.e = uxh;
        this.f = pvb.l();
        aVar.a(new c() {
            public final void a() {
                pvc.this.c.c();
            }

            public final void aP_() {
                aVar.b(this);
            }
        });
    }

    public final void a(String str) {
        this.b.a(null, "dialog-buttons", 0, InteractionType.HIT, UserIntent.RENAME);
        if (!str.isEmpty()) {
            this.a.a(false);
            CompositeDisposable compositeDisposable = this.c;
            Completable a2 = this.e.a(this.f, str).a(this.d);
            pvd pvd = this.a;
            pvd.getClass();
            compositeDisposable.a(a2.a((Action) new $$Lambda$9TFfUpjyKzh_v5DllQWgS4W7kMM(pvd), (Consumer<? super Throwable>) new $$Lambda$pvc$oRihAy2LiwFCAct5ygkamUEwZrg<Object>(this)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Failed to rename playlist", new Object[0]);
        this.a.a(true);
    }
}
