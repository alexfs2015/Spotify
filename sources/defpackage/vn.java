package defpackage;

import androidx.work.impl.utils.futures.AbstractFuture$Failure$1;
import androidx.work.impl.utils.futures.DirectExecutor;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: vn reason: default package */
public abstract class vn<V> implements ffe<V> {
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    static final a b;
    private static final Logger f;
    private static final Object g = new Object();
    volatile Object c;
    volatile d d;
    volatile h e;

    /* renamed from: vn$a */
    static abstract class a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(h hVar, Thread thread);

        /* access modifiers changed from: 0000 */
        public abstract void a(h hVar, h hVar2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(vn<?> vnVar, Object obj, Object obj2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(vn<?> vnVar, d dVar, d dVar2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(vn<?> vnVar, h hVar, h hVar2);
    }

    /* renamed from: vn$b */
    static final class b {
        static final b a;
        static final b b;
        final boolean c;
        final Throwable d;

        static {
            if (vn.a) {
                b = null;
                a = null;
                return;
            }
            b = new b(false, null);
            a = new b(true, null);
        }

        b(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    /* renamed from: vn$c */
    public static final class c {
        static final c a = new c(new AbstractFuture$Failure$1("Failure occurred while trying to finish a future."));
        final Throwable b;

        c(Throwable th) {
            this.b = (Throwable) vn.b(th);
        }
    }

    /* renamed from: vn$d */
    static final class d {
        static final d a = new d(null, null);
        final Runnable b;
        final Executor c;
        d d;

        d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    /* renamed from: vn$e */
    static final class e extends a {
        private AtomicReferenceFieldUpdater<h, Thread> a;
        private AtomicReferenceFieldUpdater<h, h> b;
        private AtomicReferenceFieldUpdater<vn, h> c;
        private AtomicReferenceFieldUpdater<vn, d> d;
        private AtomicReferenceFieldUpdater<vn, Object> e;

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<vn, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<vn, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<vn, Object> atomicReferenceFieldUpdater5) {
            super(0);
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: 0000 */
        public final void a(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }

        /* access modifiers changed from: 0000 */
        public final void a(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(vn<?> vnVar, Object obj, Object obj2) {
            return this.e.compareAndSet(vnVar, obj, obj2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(vn<?> vnVar, d dVar, d dVar2) {
            return this.d.compareAndSet(vnVar, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(vn<?> vnVar, h hVar, h hVar2) {
            return this.c.compareAndSet(vnVar, hVar, hVar2);
        }
    }

    /* renamed from: vn$f */
    static final class f<V> implements Runnable {
        final vn<V> a;
        final ffe<? extends V> b;

        f(vn<V> vnVar, ffe<? extends V> ffe) {
            this.a = vnVar;
            this.b = ffe;
        }

        public final void run() {
            if (this.a.c == this) {
                if (vn.b.a(this.a, (Object) this, vn.b(this.b))) {
                    vn.a(this.a);
                }
            }
        }
    }

    /* renamed from: vn$g */
    static final class g extends a {
        g() {
            super(0);
        }

        /* access modifiers changed from: 0000 */
        public final void a(h hVar, Thread thread) {
            hVar.b = thread;
        }

        /* access modifiers changed from: 0000 */
        public final void a(h hVar, h hVar2) {
            hVar.c = hVar2;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(vn<?> vnVar, Object obj, Object obj2) {
            synchronized (vnVar) {
                if (vnVar.c != obj) {
                    return false;
                }
                vnVar.c = obj2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(vn<?> vnVar, d dVar, d dVar2) {
            synchronized (vnVar) {
                if (vnVar.d != dVar) {
                    return false;
                }
                vnVar.d = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(vn<?> vnVar, h hVar, h hVar2) {
            synchronized (vnVar) {
                if (vnVar.e != hVar) {
                    return false;
                }
                vnVar.e = hVar2;
                return true;
            }
        }
    }

    /* renamed from: vn$h */
    static final class h {
        static final h a = new h();
        volatile Thread b;
        volatile h c;

        h() {
        }

        h(byte b2) {
            vn.b.a(this, Thread.currentThread());
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            Thread thread = this.b;
            if (thread != null) {
                this.b = null;
                LockSupport.unpark(thread);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(h hVar) {
            vn.b.a(this, hVar);
        }
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [vn$g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            java.lang.String r0 = "c"
            java.lang.Class<vn> r1 = defpackage.vn.class
            java.lang.String r2 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r3 = "false"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            a = r2
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f = r2
            vn$e r2 = new vn$e     // Catch:{ all -> 0x004c }
            java.lang.Class<vn$h> r3 = defpackage.vn.h.class
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.lang.String r5 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r4, r5)     // Catch:{ all -> 0x004c }
            java.lang.Class<vn$h> r3 = defpackage.vn.h.class
            java.lang.Class<vn$h> r5 = defpackage.vn.h.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r5, r0)     // Catch:{ all -> 0x004c }
            java.lang.Class<vn$h> r3 = defpackage.vn.h.class
            java.lang.String r6 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r3, r6)     // Catch:{ all -> 0x004c }
            java.lang.Class<vn$d> r3 = defpackage.vn.d.class
            java.lang.String r7 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r3, r7)     // Catch:{ all -> 0x004c }
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r3, r0)     // Catch:{ all -> 0x004c }
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004c }
            r0 = 0
            goto L_0x0052
        L_0x004c:
            r0 = move-exception
            vn$g r2 = new vn$g
            r2.<init>()
        L_0x0052:
            b = r2
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0061
            java.util.logging.Logger r1 = f
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0061:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn.<clinit>():void");
    }

    protected vn() {
    }

    private static <V> V a(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private static CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private d a(d dVar) {
        d dVar2;
        do {
            dVar2 = this.d;
        } while (!b.a(this, dVar2, d.a));
        d dVar3 = dVar2;
        d dVar4 = dVar;
        d dVar5 = dVar3;
        while (dVar5 != null) {
            d dVar6 = dVar5.d;
            dVar5.d = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    private void a() {
        h hVar;
        do {
            hVar = this.e;
        } while (!b.a(this, hVar, h.a));
        while (hVar != null) {
            hVar.a();
            hVar = hVar.c;
        }
    }

    private static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e2);
        }
    }

    private void a(StringBuilder sb) {
        String str = "]";
        try {
            Object a2 = a((Future<V>) this);
            sb.append("SUCCESS, result=[");
            sb.append(d(a2));
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private void a(h hVar) {
        hVar.b = null;
        while (true) {
            h hVar2 = this.e;
            if (hVar2 != h.a) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.c;
                    if (hVar2.b != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.c = hVar4;
                        if (hVar3.b == null) {
                        }
                    } else if (b.a(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=vn<?>, code=vn, for r4v0, types: [vn, vn<?>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(defpackage.vn r4) {
        /*
            r0 = 0
        L_0x0001:
            r4.a()
            vn$d r4 = r4.a(r0)
        L_0x0008:
            if (r4 == 0) goto L_0x0030
            vn$d r0 = r4.d
            java.lang.Runnable r1 = r4.b
            boolean r2 = r1 instanceof defpackage.vn.f
            if (r2 == 0) goto L_0x0029
            vn$f r1 = (defpackage.vn.f) r1
            vn<V> r4 = r1.a
            java.lang.Object r2 = r4.c
            if (r2 != r1) goto L_0x002e
            ffe<? extends V> r2 = r1.b
            java.lang.Object r2 = b(r2)
            vn$a r3 = b
            boolean r1 = r3.a(r4, r1, r2)
            if (r1 != 0) goto L_0x0001
            goto L_0x002e
        L_0x0029:
            java.util.concurrent.Executor r4 = r4.c
            a(r1, r4)
        L_0x002e:
            r4 = r0
            goto L_0x0008
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn.a(vn):void");
    }

    static Object b(ffe<?> ffe) {
        if (ffe instanceof vn) {
            Object obj = ((vn) ffe).c;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.c) {
                    obj = bVar.d != null ? new b(false, bVar.d) : b.b;
                }
            }
            return obj;
        }
        boolean isCancelled = ffe.isCancelled();
        if ((!a) && isCancelled) {
            return b.b;
        }
        try {
            Object a2 = a((Future<V>) ffe);
            return a2 == null ? g : a2;
        } catch (ExecutionException e2) {
            return new c(e2.getCause());
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new b(false, e3);
            }
            StringBuilder sb = new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb.append(ffe);
            return new c(new IllegalArgumentException(sb.toString(), e3));
        } catch (Throwable th) {
            return new c(th);
        }
    }

    static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    private static V c(Object obj) {
        if (obj instanceof b) {
            throw a("Task was cancelled.", ((b) obj).d);
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).b);
        } else if (obj == g) {
            return null;
        } else {
            return obj;
        }
    }

    private String d(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    public boolean a(ffe<? extends V> ffe) {
        f fVar;
        c cVar;
        b((T) ffe);
        Object obj = this.c;
        if (obj == null) {
            if (ffe.isDone()) {
                if (!b.a(this, (Object) null, b(ffe))) {
                    return false;
                }
                a(this);
                return true;
            }
            fVar = new f(this, ffe);
            if (b.a(this, (Object) null, (Object) fVar)) {
                try {
                    ffe.addListener(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    cVar = c.a;
                }
                return true;
            }
            obj = this.c;
        }
        if (obj instanceof b) {
            ffe.cancel(((b) obj).c);
        }
        return false;
        b.a(this, (Object) fVar, (Object) cVar);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(V v) {
        if (v == null) {
            v = g;
        }
        if (!b.a(this, (Object) null, (Object) v)) {
            return false;
        }
        a(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(Throwable th) {
        if (!b.a(this, (Object) null, (Object) new c((Throwable) b((T) th)))) {
            return false;
        }
        a(this);
        return true;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        b((T) runnable);
        b((T) executor);
        d dVar = this.d;
        if (dVar != d.a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.d = dVar;
                if (!b.a(this, dVar, dVar2)) {
                    dVar = this.d;
                } else {
                    return;
                }
            } while (dVar != d.a);
        }
        a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        Object obj = this.c;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        b bVar = a ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.a : b.b;
        boolean z2 = false;
        Object obj2 = obj;
        vn vnVar = this;
        while (true) {
            if (b.a(vnVar, obj2, (Object) bVar)) {
                a(vnVar);
                if (!(obj2 instanceof f)) {
                    return true;
                }
                ffe<? extends V> ffe = ((f) obj2).b;
                if (ffe instanceof vn) {
                    vnVar = (vn) ffe;
                    obj2 = vnVar.c;
                    if (!(obj2 == null) && !(obj2 instanceof f)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    ffe.cancel(z);
                    return true;
                }
            } else {
                obj2 = vnVar.c;
                if (!(obj2 instanceof f)) {
                    return z2;
                }
            }
        }
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.c;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return c(obj2);
            }
            h hVar = this.e;
            if (hVar != h.a) {
                h hVar2 = new h(0);
                do {
                    hVar2.a(hVar);
                    if (b.a(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.c;
                            } else {
                                a(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return c(obj);
                    }
                    hVar = this.e;
                } while (hVar != h.a);
            }
            return c(this.c);
        }
        throw new InterruptedException();
    }

    public final V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.c;
            if ((obj != null) && (!(obj instanceof f))) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.e;
                if (hVar != h.a) {
                    h hVar2 = new h(0);
                    while (true) {
                        hVar2.a(hVar);
                        if (b.a(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.c;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    a(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(hVar2);
                        } else {
                            hVar = this.e;
                            if (hVar == h.a) {
                                break;
                            }
                        }
                    }
                }
                return c(this.c);
            }
            while (nanos > 0) {
                Object obj3 = this.c;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String vnVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder("Waited ");
            sb.append(j2);
            String str = " ";
            sb.append(str);
            sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(" (plus ");
                String sb4 = sb3.toString();
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb4);
                    sb5.append(convert);
                    sb5.append(str);
                    sb5.append(lowerCase);
                    String sb6 = sb5.toString();
                    if (z) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(sb6);
                        sb7.append(",");
                        sb6 = sb7.toString();
                    }
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(sb6);
                    sb8.append(str);
                    sb4 = sb8.toString();
                }
                if (z) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(sb4);
                    sb9.append(nanos2);
                    sb9.append(" nanoseconds ");
                    sb4 = sb9.toString();
                }
                StringBuilder sb10 = new StringBuilder();
                sb10.append(sb4);
                sb10.append("delay)");
                sb2 = sb10.toString();
            }
            if (isDone()) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb2);
                sb11.append(" but future completed as timeout expired");
                throw new TimeoutException(sb11.toString());
            }
            StringBuilder sb12 = new StringBuilder();
            sb12.append(sb2);
            sb12.append(" for ");
            sb12.append(vnVar);
            throw new TimeoutException(sb12.toString());
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.c instanceof b;
    }

    public final boolean isDone() {
        Object obj = this.c;
        return (!(obj instanceof f)) & (obj != null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        String str2 = "]";
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                Object obj = this.c;
                if (obj instanceof f) {
                    StringBuilder sb2 = new StringBuilder("setFuture=[");
                    sb2.append(d(((f) obj).b));
                    sb2.append(str2);
                    str = sb2.toString();
                } else if (this instanceof ScheduledFuture) {
                    StringBuilder sb3 = new StringBuilder("remaining delay=[");
                    sb3.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
                    sb3.append(" ms]");
                    str = sb3.toString();
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                StringBuilder sb4 = new StringBuilder("Exception thrown from implementation: ");
                sb4.append(e2.getClass());
                str = sb4.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append(str2);
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(str2);
        return sb.toString();
    }
}
