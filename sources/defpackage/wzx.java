package defpackage;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: wzx reason: default package */
public final class wzx {
    private static /* synthetic */ boolean g = (!wzx.class.desiredAssertionStatus());
    final Deque<a> a = new ArrayDeque();
    private int b = 64;
    private int c = 5;
    private ExecutorService d;
    private final Deque<a> e = new ArrayDeque();
    private final Deque<xai> f = new ArrayDeque();

    public wzx() {
    }

    public wzx(ExecutorService executorService) {
        this.d = executorService;
    }

    private <T> void a(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }

    private int b(a aVar) {
        int i = 0;
        for (a aVar2 : this.e) {
            if (!xai.this.d && aVar2.a().equals(aVar.a())) {
                i++;
            }
        }
        return i;
    }

    private synchronized ExecutorService c() {
        if (this.d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), xaq.a("OkHttp Dispatcher", false));
            this.d = threadPoolExecutor;
        }
        return this.d;
    }

    private synchronized int d() {
        return this.e.size() + this.f.size();
    }

    public final synchronized void a() {
        for (a aVar : this.a) {
            xai.this.c();
        }
        for (a aVar2 : this.e) {
            xai.this.c();
        }
        for (xai c2 : this.f) {
            c2.c();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar) {
        a(this.e, aVar);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(xai xai) {
        this.f.add(xai);
    }

    /* access modifiers changed from: 0000 */
    public final void b(xai xai) {
        a(this.f, xai);
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        int i;
        boolean z;
        if (g || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (this.e.size() >= this.b) {
                        break;
                    } else if (b(aVar) < this.c) {
                        it.remove();
                        arrayList.add(aVar);
                        this.e.add(aVar);
                    }
                }
                i = 0;
                z = d() > 0;
            }
            int size = arrayList.size();
            while (i < size) {
                a aVar2 = (a) arrayList.get(i);
                ExecutorService c2 = c();
                if (a.b || !Thread.holdsLock(xai.this.a.c)) {
                    try {
                        c2.execute(aVar2);
                    } catch (RejectedExecutionException e2) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e2);
                        xai.this.f.c();
                        aVar2.a.onFailure(xai.this, interruptedIOException);
                        xai.this.a.c.a(aVar2);
                    } catch (Throwable th) {
                        xai.this.a.c.a(aVar2);
                        throw th;
                    }
                    i++;
                } else {
                    throw new AssertionError();
                }
            }
            return z;
        }
        throw new AssertionError();
    }
}
