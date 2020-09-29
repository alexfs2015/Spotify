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

/* renamed from: qdy reason: default package */
public final class qdy {
    public final qdz a;
    public final RenamePlaylistLogger b;
    final CompositeDisposable c = new CompositeDisposable();
    private final Scheduler d;
    private final vjj e;
    private final String f;

    public qdy(qdz qdz, RenamePlaylistLogger renamePlaylistLogger, Scheduler scheduler, vjj vjj, qdx qdx, final a aVar) {
        this.a = qdz;
        this.b = renamePlaylistLogger;
        this.d = scheduler;
        this.e = vjj;
        this.f = qdx.l();
        aVar.a(new c() {
            public final void a() {
                qdy.this.c.c();
            }

            public final void aN_() {
                aVar.b(this);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Failed to rename playlist", new Object[0]);
        this.a.a(true);
    }

    public final void a(String str) {
        this.b.a(null, "dialog-buttons", 0, InteractionType.HIT, UserIntent.RENAME);
        if (!str.isEmpty()) {
            this.a.a(false);
            CompositeDisposable compositeDisposable = this.c;
            Completable a2 = this.e.a(this.f, str).a(this.d);
            qdz qdz = this.a;
            qdz.getClass();
            compositeDisposable.a(a2.a((Action) new $$Lambda$KfybWIdouANvMer7rYtCbFmF_qc(qdz), (Consumer<? super Throwable>) new $$Lambda$qdy$BXqX_1kb9aUmtN_RDAuuVzpO3K8<Object>(this)));
        }
    }
}
