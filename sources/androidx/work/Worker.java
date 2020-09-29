package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker.a;

public abstract class Worker extends ListenableWorker {
    va<a> d;

    public abstract a g();

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final fek<a> c() {
        this.d = va.a();
        f().execute(new Runnable() {
            public final void run() {
                try {
                    Worker.this.d.a(Worker.this.g());
                } catch (Throwable th) {
                    Worker.this.d.a(th);
                }
            }
        });
        return this.d;
    }
}
