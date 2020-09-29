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

/* renamed from: wlr reason: default package */
public final class wlr {
    private static /* synthetic */ boolean g = (!wlr.class.desiredAssertionStatus());
    final Deque<a> a = new ArrayDeque();
    private int b = 64;
    private int c = 5;
    private ExecutorService d;
    private final Deque<a> e = new ArrayDeque();
    private final Deque<wmc> f = new ArrayDeque();

    public wlr(ExecutorService executorService) {
        this.d = executorService;
    }

    public wlr() {
    }

    private synchronized ExecutorService c() {
        if (this.d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), wmk.a("OkHttp Dispatcher", false));
            this.d = threadPoolExecutor;
        }
        return this.d;
    }

    public final synchronized void a() {
        for (a aVar : this.a) {
            wmc.this.c();
        }
        for (a aVar2 : this.e) {
            wmc.this.c();
        }
        for (wmc c2 : this.f) {
            c2.c();
        }
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
                if (a.b || !Thread.holdsLock(wmc.this.a.c)) {
                    try {
                        c2.execute(aVar2);
                    } catch (RejectedExecutionException e2) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e2);
                        wmc.this.f.c();
                        aVar2.a.onFailure(wmc.this, interruptedIOException);
                        wmc.this.a.c.a(aVar2);
                    } catch (Throwable th) {
                        wmc.this.a.c.a(aVar2);
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

    private int b(a aVar) {
        int i = 0;
        for (a aVar2 : this.e) {
            if (!wmc.this.d && aVar2.a().equals(aVar.a())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(wmc wmc) {
        this.f.add(wmc);
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar) {
        a(this.e, aVar);
    }

    /* access modifiers changed from: 0000 */
    public final void b(wmc wmc) {
        a(this.f, wmc);
    }

    private <T> void a(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }

    private synchronized int d() {
        return this.e.size() + this.f.size();
    }
}
