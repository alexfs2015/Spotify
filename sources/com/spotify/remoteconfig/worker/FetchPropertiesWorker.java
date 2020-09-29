package com.spotify.remoteconfig.worker;

import android.content.Context;
import androidx.work.ListenableWorker.a;
import androidx.work.ListenableWorker.a.C0004a;
import androidx.work.ListenableWorker.a.b;
import androidx.work.ListenableWorker.a.c;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.spotify.rcs.model.Fetch.Type;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.observers.BlockingMultiObserver;

public class FetchPropertiesWorker extends Worker {
    public FetchPropertiesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final a g() {
        if (!(this.a instanceof vva)) {
            xop.c("Cannot fetch configuration. Application class does not implement RemoteConfigurationProvider.", new Object[0]);
            return new C0004a();
        }
        vuq b = ((vva) this.a).b();
        Object obj = b().b.get("FETCH_TYPE");
        Completable a = b.a().a(Type.a(Integer.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : 0).intValue()));
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        a.a((CompletableObserver) blockingMultiObserver);
        Throwable b2 = blockingMultiObserver.b();
        if (b2 == null) {
            xop.b("Configuration successfully fetched.", new Object[0]);
            return new c();
        }
        xop.a(b2, "Cannot fetch configuration. Retrying soon.", new Object[0]);
        return new b();
    }
}
