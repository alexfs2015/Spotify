package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: uk reason: default package */
public abstract class uk<T> {
    protected final Context a;
    T b;
    private vp c;
    private final Object d = new Object();
    private final Set<tv<T>> e = new LinkedHashSet();

    static {
        su.a("ConstraintTracker");
    }

    uk(Context context, vp vpVar) {
        this.a = context.getApplicationContext();
        this.c = vpVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            T r1 = r3.b     // Catch:{ all -> 0x002f }
            if (r1 == r4) goto L_0x002d
            T r1 = r3.b     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.b     // Catch:{ all -> 0x002f }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            r3.b = r4     // Catch:{ all -> 0x002f }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            java.util.Set<tv<T>> r1 = r3.e     // Catch:{ all -> 0x002f }
            r4.<init>(r1)     // Catch:{ all -> 0x002f }
            vp r1 = r3.c     // Catch:{ all -> 0x002f }
            java.util.concurrent.Executor r1 = r1.a()     // Catch:{ all -> 0x002f }
            uk$1 r2 = new uk$1     // Catch:{ all -> 0x002f }
            r2.<init>(r4)     // Catch:{ all -> 0x002f }
            r1.execute(r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk.a(java.lang.Object):void");
    }

    public final void a(tv<T> tvVar) {
        synchronized (this.d) {
            if (this.e.add(tvVar)) {
                if (this.e.size() == 1) {
                    this.b = b();
                    su.a();
                    String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.b});
                    c();
                }
                tvVar.a(this.b);
            }
        }
    }

    public abstract T b();

    public final void b(tv<T> tvVar) {
        synchronized (this.d) {
            if (this.e.remove(tvVar) && this.e.isEmpty()) {
                d();
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
