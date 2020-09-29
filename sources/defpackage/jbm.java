package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: jbm reason: default package */
public final class jbm {
    public final CompositeDisposable a = new CompositeDisposable();
    private final Scheduler b;
    private final Context c;
    private final Consumer<Throwable> d = $$Lambda$jbm$VmSCqjlr3gPajpAbFx3nokNo6m8.INSTANCE;

    public jbm(Context context, Scheduler scheduler) {
        this.c = context;
        this.b = scheduler;
    }

    private void a(Uri uri, int i) {
        this.a.a(Flowable.b(10, TimeUnit.MINUTES, this.b).a(this.b).a((Action) new $$Lambda$jbm$8PQHqGm4_fKTXfYlaq6qFQKHnJU(this, uri, i)).a((Consumer<? super T>) new $$Lambda$jbm$5N4PlEDBMFkruZIOn5pQSacERbc<Object>(uri), this.d));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Uri uri, int i) {
        Logger.b("Revoking Permission for Uri: %s", uri);
        this.c.revokeUriPermission(uri, i);
    }

    public final void a(Uri uri, Intent intent, int i) {
        for (ResolveInfo resolveInfo : this.c.getPackageManager().queryIntentActivities(intent, 65536)) {
            this.c.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 1);
        }
        a(uri, 1);
    }
}
