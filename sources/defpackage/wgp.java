package defpackage;

import com.squareup.picasso.Picasso.Priority;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: wgp reason: default package */
public final class wgp extends ThreadPoolExecutor {

    /* renamed from: wgp$a */
    static final class a extends FutureTask<wfx> implements Comparable<a> {
        private final wfx a;

        public a(wfx wfx) {
            super(wfx, null);
            this.a = wfx;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            a aVar = (a) obj;
            Priority priority = this.a.o;
            Priority priority2 = aVar.a.o;
            return priority == priority2 ? this.a.a - aVar.a.a : priority2.ordinal() - priority.ordinal();
        }
    }

    public wgp() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b());
    }

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    public final Future<?> submit(Runnable runnable) {
        a aVar = new a((wfx) runnable);
        execute(aVar);
        return aVar;
    }
}
