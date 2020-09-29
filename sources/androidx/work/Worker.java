package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker.a;

public abstract class Worker extends ListenableWorker {
    vo<a> d;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final ffe<a> c() {
        this.d = vo.a();
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

    public abstract a g();
}
