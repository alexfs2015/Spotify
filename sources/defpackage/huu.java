package defpackage;

import android.app.Application;
import android.os.AsyncTask;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: huu reason: default package */
public final class huu implements c {
    private final Application a;
    private final Flowable<fpt> b;
    private final hxl c;
    private Disposable d;

    public final String c() {
        return "FetchAdIdTask";
    }

    huu(Application application, Flowable<fpt> flowable, hxl hxl) {
        this.a = application;
        this.b = flowable;
        this.c = hxl;
    }

    public final void ai_() {
        this.d = this.b.c((Consumer<? super T>) new $$Lambda$huu$cyOVcU_JCAsioS5ILmh13JOzV0s<Object>(this));
    }

    public final void aj_() {
        this.d.bf_();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        new hut(this.a, this.c).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
