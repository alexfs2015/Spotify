package defpackage;

import com.google.common.util.concurrent.AbstractFuture$Failure$1;
import com.google.common.util.concurrent.DirectExecutor;
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
import sun.misc.Unsafe;

/* renamed from: fed reason: default package */
public abstract class fed<V> extends feo implements fek<V> {
    /* access modifiers changed from: private */
    public static final a ATOMIC_HELPER;
    /* access modifiers changed from: private */
    public static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Object NULL = new Object();
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final Logger log;
    /* access modifiers changed from: private */
    public volatile d listeners;
    /* access modifiers changed from: private */
    public volatile Object value;
    /* access modifiers changed from: private */
    public volatile k waiters;

    /* renamed from: fed$a */
    static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract void a(k kVar, k kVar2);

        /* access modifiers changed from: 0000 */
        public abstract void a(k kVar, Thread thread);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(fed<?> fed, d dVar, d dVar2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(fed<?> fed, k kVar, k kVar2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(fed<?> fed, Object obj, Object obj2);

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: fed$b */
    static final class b {
        static final b a;
        static final b b;
        final boolean c;
        final Throwable d;

        static {
            if (fed.GENERATE_CANCELLATION_CAUSES) {
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

    /* renamed from: fed$c */
    public static final class c {
        static final c a = new c(new AbstractFuture$Failure$1("Failure occurred while trying to finish a future."));
        final Throwable b;

        c(Throwable th) {
            this.b = (Throwable) fay.a(th);
        }
    }

    /* renamed from: fed$d */
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

    /* renamed from: fed$e */
    static final class e extends a {
        private AtomicReferenceFieldUpdater<k, Thread> a;
        private AtomicReferenceFieldUpdater<k, k> b;
        private AtomicReferenceFieldUpdater<fed, k> c;
        private AtomicReferenceFieldUpdater<fed, d> d;
        private AtomicReferenceFieldUpdater<fed, Object> e;

        e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<fed, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<fed, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<fed, Object> atomicReferenceFieldUpdater5) {
            super(0);
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: 0000 */
        public final void a(k kVar, Thread thread) {
            this.a.lazySet(kVar, thread);
        }

        /* access modifiers changed from: 0000 */
        public final void a(k kVar, k kVar2) {
            this.b.lazySet(kVar, kVar2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(fed<?> fed, k kVar, k kVar2) {
            return this.c.compareAndSet(fed, kVar, kVar2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(fed<?> fed, d dVar, d dVar2) {
            return this.d.compareAndSet(fed, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(fed<?> fed, Object obj, Object obj2) {
            return this.e.compareAndSet(fed, obj, obj2);
        }
    }

    /* renamed from: fed$f */
    static final class f<V> implements Runnable {
        final fed<V> a;
        final fek<? extends V> b;

        f(fed<V> fed, fek<? extends V> fek) {
            this.a = fed;
            this.b = fek;
        }

        public final void run() {
            if (this.a.value == this) {
                if (fed.ATOMIC_HELPER.a(this.a, (Object) this, fed.getFutureValue(this.b))) {
                    fed.complete(this.a);
                }
            }
        }
    }

    /* renamed from: fed$g */
    static final class g extends a {
        private g() {
            super(0);
        }

        /* synthetic */ g(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final void a(k kVar, Thread thread) {
            kVar.b = thread;
        }

        /* access modifiers changed from: 0000 */
        public final void a(k kVar, k kVar2) {
            kVar.c = kVar2;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(fed<?> fed, k kVar, k kVar2) {
            synchronized (fed) {
                if (fed.waiters != kVar) {
                    return false;
                }
                fed.waiters = kVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(fed<?> fed, d dVar, d dVar2) {
            synchronized (fed) {
                if (fed.listeners != dVar) {
                    return false;
                }
                fed.listeners = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(fed<?> fed, Object obj, Object obj2) {
            synchronized (fed) {
                if (fed.value != obj) {
                    return false;
                }
                fed.value = obj2;
                return true;
            }
        }
    }

    /* renamed from: fed$h */
    interface h<V> extends fek<V> {
    }

    /* renamed from: fed$i */
    public static abstract class i<V> extends fed<V> implements h<V> {
        protected i() {
        }

        public final V get() {
            return fed.super.get();
        }

        public final V get(long j, TimeUnit timeUnit) {
            return fed.super.get(j, timeUnit);
        }

        public final boolean isDone() {
            return fed.super.isDone();
        }

        public final boolean isCancelled() {
            return fed.super.isCancelled();
        }

        public final void addListener(Runnable runnable, Executor executor) {
            fed.super.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            return fed.super.cancel(z);
        }
    }

    /* renamed from: fed$j */
    static final class j extends a {
        private static Unsafe a;
        private static long b;
        private static long c;
        private static long d;
        private static long e;
        private static long f;

        private j() {
            super(0);
        }

        /* synthetic */ j(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
            r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.fed.j.AnonymousClass1());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                goto L_0x0010
            L_0x0005:
                fed$j$1 r0 = new fed$j$1     // Catch:{ PrivilegedActionException -> 0x005f }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x005f }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x005f }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x005f }
            L_0x0010:
                java.lang.Class<fed> r1 = defpackage.fed.class
                java.lang.String r2 = "waiters"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                c = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "listeners"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                b = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "value"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                d = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<fed$k> r1 = defpackage.fed.k.class
                java.lang.String r2 = "b"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                e = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<fed$k> r1 = defpackage.fed.k.class
                java.lang.String r2 = "c"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f = r1     // Catch:{ Exception -> 0x0055 }
                a = r0     // Catch:{ Exception -> 0x0055 }
                return
            L_0x0055:
                r0 = move-exception
                defpackage.fbe.a(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005f:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fed.j.<clinit>():void");
        }

        /* access modifiers changed from: 0000 */
        public final void a(k kVar, Thread thread) {
            a.putObject(kVar, e, thread);
        }

        /* access modifiers changed from: 0000 */
        public final void a(k kVar, k kVar2) {
            a.putObject(kVar, f, kVar2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(fed<?> fed, k kVar, k kVar2) {
            return a.compareAndSwapObject(fed, c, kVar, kVar2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(fed<?> fed, d dVar, d dVar2) {
            return a.compareAndSwapObject(fed, b, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(fed<?> fed, Object obj, Object obj2) {
            return a.compareAndSwapObject(fed, d, obj, obj2);
        }
    }

    /* renamed from: fed$k */
    static final class k {
        static final k a = new k();
        volatile Thread b;
        volatile k c;

        k() {
        }

        k(byte b2) {
            fed.ATOMIC_HELPER.a(this, Thread.currentThread());
        }

        /* access modifiers changed from: 0000 */
        public final void a(k kVar) {
            fed.ATOMIC_HELPER.a(this, kVar);
        }
    }

    /* access modifiers changed from: protected */
    public void afterDone() {
    }

    /* access modifiers changed from: protected */
    public void interruptTask() {
    }

    static {
        a aVar;
        Class<fed> cls = fed.class;
        log = Logger.getLogger(cls.getName());
        Throwable th = null;
        try {
            aVar = new j(0);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            aVar = new g(0);
        }
        ATOMIC_HELPER = aVar;
        Class<LockSupport> cls2 = LockSupport.class;
        if (th != null) {
            log.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    private void removeWaiter(k kVar) {
        kVar.b = null;
        while (true) {
            k kVar2 = this.waiters;
            if (kVar2 != k.a) {
                k kVar3 = null;
                while (kVar2 != null) {
                    k kVar4 = kVar2.c;
                    if (kVar2.b != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.c = kVar4;
                        if (kVar3.b == null) {
                        }
                    } else if (ATOMIC_HELPER.a(this, kVar2, kVar4)) {
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    protected fed() {
    }

    public V get(long j2, TimeUnit timeUnit) {
        long j3 = j2;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if ((obj != null) && (!(obj instanceof f))) {
                return getDoneValue(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= SPIN_THRESHOLD_NANOS) {
                k kVar = this.waiters;
                if (kVar != k.a) {
                    k kVar2 = new k(0);
                    while (true) {
                        kVar2.a(kVar);
                        if (ATOMIC_HELPER.a(this, kVar, kVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return getDoneValue(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    removeWaiter(kVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= SPIN_THRESHOLD_NANOS);
                            removeWaiter(kVar2);
                        } else {
                            kVar = this.waiters;
                            if (kVar == k.a) {
                                break;
                            }
                        }
                    }
                }
                return getDoneValue(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return getDoneValue(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String fed = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder("Waited ");
            sb.append(j3);
            String str = " ";
            sb.append(str);
            sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
            String sb2 = sb.toString();
            if (nanos + SPIN_THRESHOLD_NANOS < 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(" (plus ");
                String sb4 = sb3.toString();
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                boolean z = convert == 0 || nanos2 > SPIN_THRESHOLD_NANOS;
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
            sb12.append(fed);
            throw new TimeoutException(sb12.toString());
        }
        throw new InterruptedException();
    }

    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return getDoneValue(obj2);
            }
            k kVar = this.waiters;
            if (kVar != k.a) {
                k kVar2 = new k(0);
                do {
                    kVar2.a(kVar);
                    if (ATOMIC_HELPER.a(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                removeWaiter(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return getDoneValue(obj);
                    }
                    kVar = this.waiters;
                } while (kVar != k.a);
            }
            return getDoneValue(this.value);
        }
        throw new InterruptedException();
    }

    private V getDoneValue(Object obj) {
        if (obj instanceof b) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((b) obj).d);
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).b);
        } else if (obj == NULL) {
            return null;
        } else {
            return obj;
        }
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof f)) & (obj != null);
    }

    public boolean isCancelled() {
        return this.value instanceof b;
    }

    public boolean cancel(boolean z) {
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        b bVar = GENERATE_CANCELLATION_CAUSES ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.a : b.b;
        boolean z2 = false;
        Object obj2 = obj;
        fed fed = this;
        while (true) {
            if (ATOMIC_HELPER.a(fed, obj2, (Object) bVar)) {
                if (z) {
                    fed.interruptTask();
                }
                complete(fed);
                if (!(obj2 instanceof f)) {
                    return true;
                }
                fek<? extends V> fek = ((f) obj2).b;
                if (fek instanceof h) {
                    fed = (fed) fek;
                    obj2 = fed.value;
                    if (!(obj2 == null) && !(obj2 instanceof f)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    fek.cancel(z);
                    return true;
                }
            } else {
                obj2 = fed.value;
                if (!(obj2 instanceof f)) {
                    return z2;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).c;
    }

    public void addListener(Runnable runnable, Executor executor) {
        fay.a(runnable, (Object) "Runnable was null.");
        fay.a(executor, (Object) "Executor was null.");
        if (!isDone()) {
            d dVar = this.listeners;
            if (dVar != d.a) {
                d dVar2 = new d(runnable, executor);
                do {
                    dVar2.d = dVar;
                    if (!ATOMIC_HELPER.a(this, dVar, dVar2)) {
                        dVar = this.listeners;
                    } else {
                        return;
                    }
                } while (dVar != d.a);
            }
        }
        executeListener(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public boolean set(V v) {
        if (v == null) {
            v = NULL;
        }
        if (!ATOMIC_HELPER.a(this, (Object) null, (Object) v)) {
            return false;
        }
        complete(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.a(this, (Object) null, (Object) new c((Throwable) fay.a(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean setFuture(fek<? extends V> fek) {
        f fVar;
        c cVar;
        fay.a(fek);
        Object obj = this.value;
        if (obj == null) {
            if (fek.isDone()) {
                if (!ATOMIC_HELPER.a(this, (Object) null, getFutureValue(fek))) {
                    return false;
                }
                complete(this);
                return true;
            }
            fVar = new f(this, fek);
            if (ATOMIC_HELPER.a(this, (Object) null, (Object) fVar)) {
                try {
                    fek.addListener(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    cVar = c.a;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof b) {
            fek.cancel(((b) obj).c);
        }
        return false;
        ATOMIC_HELPER.a(this, (Object) fVar, (Object) cVar);
        return true;
    }

    /* access modifiers changed from: private */
    public static Object getFutureValue(fek<?> fek) {
        String str = "get() did not throw CancellationException, despite reporting isCancelled() == true: ";
        if (fek instanceof h) {
            Object obj = ((fed) fek).value;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.c) {
                    obj = bVar.d != null ? new b(false, bVar.d) : b.b;
                }
            }
            return obj;
        }
        if (fek instanceof feo) {
            Throwable a2 = fep.a((feo) fek);
            if (a2 != null) {
                return new c(a2);
            }
        }
        boolean isCancelled = fek.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            return b.b;
        }
        try {
            Object uninterruptibly = getUninterruptibly(fek);
            if (isCancelled) {
                StringBuilder sb = new StringBuilder(str);
                sb.append(fek);
                return new b(false, new IllegalArgumentException(sb.toString()));
            } else if (uninterruptibly == null) {
                return NULL;
            } else {
                return uninterruptibly;
            }
        } catch (ExecutionException e2) {
            if (!isCancelled) {
                return new c(e2.getCause());
            }
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(fek);
            return new b(false, new IllegalArgumentException(sb2.toString(), e2));
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new b(false, e3);
            }
            StringBuilder sb3 = new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb3.append(fek);
            return new c(new IllegalArgumentException(sb3.toString(), e3));
        } catch (Throwable th) {
            return new c(th);
        }
    }

    private static <V> V getUninterruptibly(Future<V> future) {
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

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=fed<?>, code=fed, for r4v0, types: [fed<?>, fed] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void complete(defpackage.fed r4) {
        /*
            r0 = 0
        L_0x0001:
            r4.releaseWaiters()
            r4.afterDone()
            fed$d r4 = r4.clearListeners(r0)
        L_0x000b:
            if (r4 == 0) goto L_0x0033
            fed$d r0 = r4.d
            java.lang.Runnable r1 = r4.b
            boolean r2 = r1 instanceof defpackage.fed.f
            if (r2 == 0) goto L_0x002c
            fed$f r1 = (defpackage.fed.f) r1
            fed<V> r4 = r1.a
            java.lang.Object r2 = r4.value
            if (r2 != r1) goto L_0x0031
            fek<? extends V> r2 = r1.b
            java.lang.Object r2 = getFutureValue(r2)
            fed$a r3 = ATOMIC_HELPER
            boolean r1 = r3.a(r4, r1, r2)
            if (r1 != 0) goto L_0x0001
            goto L_0x0031
        L_0x002c:
            java.util.concurrent.Executor r4 = r4.c
            executeListener(r1, r4)
        L_0x0031:
            r4 = r0
            goto L_0x000b
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fed.complete(fed):void");
    }

    public final Throwable tryInternalFastPathGetFailure() {
        if (this instanceof h) {
            Object obj = this.value;
            if (obj instanceof c) {
                return ((c) obj).b;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    private void releaseWaiters() {
        k kVar;
        do {
            kVar = this.waiters;
        } while (!ATOMIC_HELPER.a(this, kVar, k.a));
        while (kVar != null) {
            Thread thread = kVar.b;
            if (thread != null) {
                kVar.b = null;
                LockSupport.unpark(thread);
            }
            kVar = kVar.c;
        }
    }

    private d clearListeners(d dVar) {
        d dVar2;
        do {
            dVar2 = this.listeners;
        } while (!ATOMIC_HELPER.a(this, dVar2, d.a));
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

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        String str2 = "]";
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            try {
                str = pendingToString();
            } catch (RuntimeException e2) {
                StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                sb2.append(e2.getClass());
                str = sb2.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append(str2);
            } else if (isDone()) {
                addDoneString(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            sb.append(userObjectToString(((f) obj).b));
            sb.append("]");
            return sb.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder("remaining delay=[");
            sb2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            sb2.append(" ms]");
            return sb2.toString();
        }
    }

    private void addDoneString(StringBuilder sb) {
        String str = "]";
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(uninterruptibly));
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

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = log;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e2);
        }
    }

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
