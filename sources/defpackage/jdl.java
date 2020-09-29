package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.music.R;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.util.concurrent.Callable;

/* renamed from: jdl reason: default package */
public final class jdl implements jcu {
    private final jal a;
    private final jbm b;
    private final jbi c;
    private final jbw d;
    private final Scheduler e;
    private final Scheduler f;

    public jdl(Scheduler scheduler, Scheduler scheduler2, jbm jbm, jbi jbi, jbw jbw, jal jal) {
        this.e = scheduler;
        this.f = scheduler2;
        this.a = jal;
        this.b = jbm;
        this.c = jbi;
        this.d = jbw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional a(jcc jcc, jex jex) {
        Optional a2 = this.c.a(jex.f());
        Optional a3 = jex.e() != null ? this.c.a(jex.e()) : Optional.e();
        if (!a2.b()) {
            return Optional.e();
        }
        Uri uri = (Uri) a2.c();
        Intent a4 = this.a.a(jbw.a(jcc.c(), this.a.b(), this.a.c()), a3, uri);
        this.b.a(uri, a4, 1);
        if (a3.b()) {
            this.b.a((Uri) a3.c(), a4, 1);
        }
        return Optional.b(a4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(ShareEventLogger shareEventLogger, jcc jcc, jdz jdz, long j, Activity activity, Optional optional) {
        if (!optional.b()) {
            return Completable.a((Throwable) a((Context) activity, jdz));
        }
        shareEventLogger.a(jcc.b(), jdz.d(), j);
        activity.startActivityForResult((Intent) optional.c(), 0);
        return Completable.a();
    }

    public final Completable a(Activity activity, jdz jdz, jcc jcc, ShareEventLogger shareEventLogger, long j) {
        if (!(jcc.a() instanceof jex)) {
            return Completable.a((Throwable) a((Context) activity, jdz));
        }
        jex jex = (jex) jcc.a();
        if (jex.f() == null && jex.g() == null) {
            return Completable.a((Throwable) new IllegalArgumentException("Either background bitmap or color list need to be present"));
        }
        if (jex.f() == null) {
            return Completable.a((Throwable) new UnsupportedOperationException("Sharing to story with background color list is not implemented yet"));
        }
        jcc jcc2 = jcc;
        Single a2 = Single.a((Callable<? extends T>) new $$Lambda$jdl$TiUEEvAgCtuGkoLca630k4gRtIQ<Object>(this, jcc, jex)).b(this.e).a(this.f);
        $$Lambda$jdl$sB9VbFId142zE7ERwjWpmZwg21M r0 = new $$Lambda$jdl$sB9VbFId142zE7ERwjWpmZwg21M(this, shareEventLogger, jcc2, jdz, j, activity);
        return a2.e(r0);
    }

    public final Exception a(Context context, jdz jdz) {
        return new Exception(context.getString(R.string.toast_generic_share_broadcast_error, new Object[]{context.getString(jdz.b())}));
    }
}
