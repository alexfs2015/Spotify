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

/* renamed from: jaz reason: default package */
public final class jaz implements jai {
    private final iya a;
    private final izb b;
    private final iyx c;
    private final izl d;
    private final Scheduler e;
    private final Scheduler f;

    public jaz(Scheduler scheduler, Scheduler scheduler2, izb izb, iyx iyx, izl izl, iya iya) {
        this.e = scheduler;
        this.f = scheduler2;
        this.a = iya;
        this.b = izb;
        this.c = iyx;
        this.d = izl;
    }

    public final Exception a(Context context, jbn jbn) {
        return new Exception(context.getString(R.string.toast_generic_share_broadcast_error, new Object[]{context.getString(jbn.b())}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(ShareEventLogger shareEventLogger, izq izq, jbn jbn, long j, Activity activity, Optional optional) {
        if (!optional.b()) {
            return Completable.a((Throwable) a((Context) activity, jbn));
        }
        shareEventLogger.a(izq.b, jbn.c(), j);
        activity.startActivityForResult((Intent) optional.c(), 0);
        return Completable.a();
    }

    public final Completable a(Activity activity, jbn jbn, izq izq, ShareEventLogger shareEventLogger, long j) {
        izq izq2 = izq;
        if (!(izq2.a instanceof jcl)) {
            return Completable.a((Throwable) a((Context) activity, jbn));
        }
        jcl jcl = (jcl) izq2.a;
        if (jcl.f() == null && jcl.g() == null) {
            return Completable.a((Throwable) new IllegalArgumentException("Either background bitmap or color list need to be present"));
        }
        if (jcl.f() == null) {
            return Completable.a((Throwable) new UnsupportedOperationException("Sharing to story with background color list is not implemented yet"));
        }
        Single a2 = Single.a((Callable<? extends T>) new $$Lambda$jaz$QrCkM6okAY9CZOYi4HxUpk7cYuk<Object>(this, izq, jcl)).b(this.e).a(this.f);
        $$Lambda$jaz$Eg18JKP6j8KpeB0wLUAXgK6wuA r0 = new $$Lambda$jaz$Eg18JKP6j8KpeB0wLUAXgK6wuA(this, shareEventLogger, izq, jbn, j, activity);
        return a2.e(r0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional a(izq izq, jcl jcl) {
        Optional optional;
        Optional a2 = this.c.a(jcl.f());
        if (jcl.e() != null) {
            optional = this.c.a(jcl.e());
        } else {
            optional = Optional.e();
        }
        if (!a2.b()) {
            return Optional.e();
        }
        Uri uri = (Uri) a2.c();
        Intent a3 = this.a.a(izl.a(izq.c, this.a.b(), this.a.c()), optional, uri);
        this.b.a(uri, a3, 1);
        if (optional.b()) {
            this.b.a((Uri) optional.c(), a3, 1);
        }
        return Optional.b(a3);
    }
}
