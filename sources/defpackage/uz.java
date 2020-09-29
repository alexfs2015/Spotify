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

/* renamed from: uz reason: default package */
public abstract class uz<V> implements fek<V> {
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    static final a b;
    private static final Logger f;
    private static final Object g = new Object();
    volatile Object c;
    volatile d d;
    volatile h e;

    /* renamed from: uz$a */
    static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract void a(h hVar, Thread thread);

        /* access modifiers changed from: 0000 */
        public abstract void a(h hVar, h hVar2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(uz<?> uzVar, Object obj, Object obj2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(uz<?> uzVar, d dVar, d dVar2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(uz<?> uzVar, h hVar, h hVar2);

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: uz$b */
    static final class b {
        static final b a;
        static final b b;
        final boolean c;
        final Throwable d;

        static {
            if (uz.a) {
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

    /* renamed from: uz$c */
    public static final class c {
        static final c a = new c(new AbstractFuture$Failure$1("Failure occurred while trying to finish a future."));
        final Throwable b;

        c(Throwable th) {
            this.b = (Throwable) uz.b(th);
        }
    }

    /* renamed from: uz$d */
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

    /* renamed from: uz$e */
    static final class e extends a {
        private AtomicReferenceFieldUpdater<h, Thread> a;
        private AtomicReferenceFieldUpdater<h, h> b;
        private AtomicReferenceFieldUpdater<uz, h> c;
        private AtomicReferenceFieldUpdater<uz, d> d;
        private AtomicReferenceFieldUpdater<uz, Object> e;

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<uz, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<uz, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<uz, Object> atomicReferenceFieldUpdater5) {
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
        public final boolean a(uz<?> uzVar, h hVar, h hVar2) {
            return this.c.compareAndSet(uzVar, hVar, hVar2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(uz<?> uzVar, d dVar, d dVar2) {
            return this.d.compareAndSet(uzVar, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(uz<?> uzVar, Object obj, Object obj2) {
            return this.e.compareAndSet(uzVar, obj, obj2);
        }
    }

    /* renamed from: uz$f */
    static final class f<V> implements Runnable {
        final uz<V> a;
        final fek<? extends V> b;

        f(uz<V> uzVar, fek<? extends V> fek) {
            this.a = uzVar;
            this.b = fek;
        }

        public final void run() {
            if (this.a.c == this) {
                if (uz.b.a(this.a, (Object) this, uz.b(this.b))) {
                    uz.a(this.a);
                }
            }
        }
    }

    /* renamed from: uz$g */
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
        public final boolean a(uz<?> uzVar, h hVar, h hVar2) {
            synchronized (uzVar) {
                if (uzVar.e != hVar) {
                    return false;
                }
                uzVar.e = hVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(uz<?> uzVar, d dVar, d dVar2) {
            synchronized (uzVar) {
                if (uzVar.d != dVar) {
                    return false;
                }
                uzVar.d = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(uz<?> uzVar, Object obj, Object obj2) {
            synchronized (uzVar) {
                if (uzVar.c != obj) {
                    return false;
                }
                uzVar.c = obj2;
                return true;
            }
        }
    }

    /* renamed from: uz$h */
    static final class h {
        static final h a = new h();
        volatile Thread b;
        volatile h c;

        h() {
        }

        h(byte b2) {
            uz.b.a(this, Thread.currentThread());
        }

        /* access modifiers changed from: 0000 */
        public final void a(h hVar) {
            uz.b.a(this, hVar);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            Thread thread = this.b;
            if (thread != null) {
                this.b = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [uz$g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            java.lang.String r0 = "c"
            java.lang.Class<uz> r1 = defpackage.uz.class
            java.lang.String r2 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r3 = "false"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            a = r2
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f = r2
            uz$e r2 = new uz$e     // Catch:{ all -> 0x004c }
            java.lang.Class<uz$h> r3 = defpackage.uz.h.class
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.lang.String r5 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r4, r5)     // Catch:{ all -> 0x004c }
            java.lang.Class<uz$h> r3 = defpackage.uz.h.class
            java.lang.Class<uz$h> r5 = defpackage.uz.h.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r5, r0)     // Catch:{ all -> 0x004c }
            java.lang.Class<uz$h> r3 = defpackage.uz.h.class
            java.lang.String r6 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r3, r6)     // Catch:{ all -> 0x004c }
            java.lang.Class<uz$d> r3 = defpackage.uz.d.class
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
            uz$g r2 = new uz$g
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz.<clinit>():void");
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

    protected uz() {
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
            String uzVar = toString();
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
            sb12.append(uzVar);
            throw new TimeoutException(sb12.toString());
        }
        throw new InterruptedException();
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

    public final boolean isDone() {
        Object obj = this.c;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final boolean isCancelled() {
        return this.c instanceof b;
    }

    public final boolean cancel(boolean z) {
        Object obj = this.c;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        b bVar = a ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.a : b.b;
        boolean z2 = false;
        Object obj2 = obj;
        uz uzVar = this;
        while (true) {
            if (b.a(uzVar, obj2, (Object) bVar)) {
                a(uzVar);
                if (!(obj2 instanceof f)) {
                    return true;
                }
                fek<? extends V> fek = ((f) obj2).b;
                if (fek instanceof uz) {
                    uzVar = (uz) fek;
                    obj2 = uzVar.c;
                    if (!(obj2 == null) && !(obj2 instanceof f)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    fek.cancel(z);
                    return true;
                }
            } else {
                obj2 = uzVar.c;
                if (!(obj2 instanceof f)) {
                    return z2;
                }
            }
        }
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

    /* access modifiers changed from: protected */
    public boolean a(fek<? extends V> fek) {
        f fVar;
        c cVar;
        b((T) fek);
        Object obj = this.c;
        if (obj == null) {
            if (fek.isDone()) {
                if (!b.a(this, (Object) null, b(fek))) {
                    return false;
                }
                a(this);
                return true;
            }
            fVar = new f(this, fek);
            if (b.a(this, (Object) null, (Object) fVar)) {
                try {
                    fek.addListener(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    cVar = c.a;
                }
                return true;
            }
            obj = this.c;
        }
        if (obj instanceof b) {
            fek.cancel(((b) obj).c);
        }
        return false;
        b.a(this, (Object) fVar, (Object) cVar);
        return true;
    }

    static Object b(fek<?> fek) {
        if (fek instanceof uz) {
            Object obj = ((uz) fek).c;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.c) {
                    obj = bVar.d != null ? new b(false, bVar.d) : b.b;
                }
            }
            return obj;
        }
        boolean isCancelled = fek.isCancelled();
        if ((!a) && isCancelled) {
            return b.b;
        }
        try {
            Object a2 = a((Future<V>) fek);
            if (a2 == null) {
                return g;
            }
            return a2;
        } catch (ExecutionException e2) {
            return new c(e2.getCause());
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new b(false, e3);
            }
            StringBuilder sb = new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb.append(fek);
            return new c(new IllegalArgumentException(sb.toString(), e3));
        } catch (Throwable th) {
            return new c(th);
        }
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

    /* JADX WARNING: Incorrect type for immutable var: ssa=uz<?>, code=uz, for r4v0, types: [uz<?>, uz] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(defpackage.uz r4) {
        /*
            r0 = 0
        L_0x0001:
            r4.a()
            uz$d r4 = r4.a(r0)
        L_0x0008:
            if (r4 == 0) goto L_0x0030
            uz$d r0 = r4.d
            java.lang.Runnable r1 = r4.b
            boolean r2 = r1 instanceof defpackage.uz.f
            if (r2 == 0) goto L_0x0029
            uz$f r1 = (defpackage.uz.f) r1
            uz<V> r4 = r1.a
            java.lang.Object r2 = r4.c
            if (r2 != r1) goto L_0x002e
            fek<? extends V> r2 = r1.b
            java.lang.Object r2 = b(r2)
            uz$a r3 = b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz.a(uz):void");
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

    private String d(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
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

    private static CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }
}
