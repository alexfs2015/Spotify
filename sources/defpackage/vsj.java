package defpackage;

import com.squareup.picasso.Picasso.Priority;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: vsj reason: default package */
public final class vsj extends ThreadPoolExecutor {

    /* renamed from: vsj$a */
    static final class a extends FutureTask<vrr> implements Comparable<a> {
        private final vrr a;

        public final /* synthetic */ int compareTo(Object obj) {
            a aVar = (a) obj;
            Priority priority = this.a.o;
            Priority priority2 = aVar.a.o;
            return priority == priority2 ? this.a.a - aVar.a.a : priority2.ordinal() - priority.ordinal();
        }

        public a(vrr vrr) {
            super(vrr, null);
            this.a = vrr;
        }
    }

    public vsj() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b());
    }

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    public final Future<?> submit(Runnable runnable) {
        a aVar = new a((vrr) runnable);
        execute(aVar);
        return aVar;
    }
}
