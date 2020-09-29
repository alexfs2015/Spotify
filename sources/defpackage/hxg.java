package defpackage;

import android.app.Application;
import android.os.AsyncTask;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: hxg reason: default package */
public final class hxg implements c {
    private final Application a;
    private final Flowable<fqn> b;
    private final hzx c;
    private Disposable d;

    hxg(Application application, Flowable<fqn> flowable, hzx hzx) {
        this.a = application;
        this.b = flowable;
        this.c = hzx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fqn fqn) {
        new hxf(this.a, this.c).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void ai_() {
        this.d = this.b.c((Consumer<? super T>) new $$Lambda$hxg$KQhcvUZbN83YUx2tlujwMJoPy8<Object>(this));
    }

    public final void aj_() {
        this.d.bd_();
    }

    public final String c() {
        return "FetchAdIdTask";
    }
}
