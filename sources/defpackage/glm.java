package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.Optional;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: glm reason: default package */
public final class glm {
    public boolean a;
    public Optional<String> b;
    public a c;
    public boolean d;
    public final glo e;
    public long f;
    private final String g;
    private Optional<Boolean> h;
    private String i;
    private final gls j;
    private Set<gln> k;
    private final glk l;
    private Map<String, Long> m;
    private final Map<String, String> n;
    private final Map<String, Long> o;
    private boolean p;
    private boolean q;

    /* renamed from: glm$a */
    public interface a {
        void a(long j, long j2, Intent intent);
    }

    public glm(glo glo, glk glk, Random random, Context context) {
        this(glo, glk, random, context, new glr());
    }

    private glm(glo glo, glk glk, Random random, Context context, gls gls) {
        this.b = Optional.e();
        this.h = Optional.e();
        this.m = new LinkedHashMap(16);
        this.n = new LinkedHashMap(16);
        this.o = new LinkedHashMap(16);
        this.e = glo;
        this.l = glk;
        this.g = jtl.a(context).a();
        this.j = gls;
        this.q = random.nextDouble() > 0.99d;
        this.k = new HashSet();
    }

    private void d(String str, long j2) {
        if (this.p && !this.a && !this.m.containsKey(str)) {
            this.m.put(str, Long.valueOf(j2));
        }
    }

    public final synchronized void a(long j2) {
        long a2 = (long) this.j.a();
        this.f = j2 - a2;
        this.p = true;
        d("process_start", 0);
        d("app_init", a2);
        this.i = b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.glp r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.p     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x000f
            java.lang.String r7 = "ColdStartTracker not started yet! Don't call this method before having called ColdStartTracker.start()"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0043 }
            com.spotify.base.java.logging.Logger.e(r7, r0)     // Catch:{ all -> 0x0043 }
            monitor-exit(r6)
            return
        L_0x000f:
            if (r7 == 0) goto L_0x0041
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.n     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "di_initialization"
            long r2 = r6.f     // Catch:{ all -> 0x0043 }
            long r4 = r7.a     // Catch:{ all -> 0x0043 }
            long r4 = r4 - r2
            java.lang.String r2 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x0043 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0043 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.n     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "dmi_contentProviders"
            long r2 = r7.b     // Catch:{ all -> 0x0043 }
            long r4 = r7.a     // Catch:{ all -> 0x0043 }
            long r2 = r2 - r4
            java.lang.String r2 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0043 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0043 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.n     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "dmi_initApplication"
            long r2 = r7.c     // Catch:{ all -> 0x0043 }
            long r4 = r7.b     // Catch:{ all -> 0x0043 }
            long r2 = r2 - r4
            java.lang.String r7 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0043 }
            r0.put(r1, r7)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r6)
            return
        L_0x0043:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glm.a(glp):void");
    }

    public final void a(Runnable runnable, String str) {
        a(str);
        runnable.run();
        b(str);
    }

    public final synchronized void b(String str) {
        Long l2 = (Long) this.o.get(str);
        if (l2 != null) {
            e(str, this.e.currentTimeMillisMonotonic() - l2.longValue());
        }
    }

    public final synchronized void a(String str, long j2) {
        StringBuilder sb = new StringBuilder("dcf_");
        sb.append(str);
        b(sb.toString(), j2);
    }

    public final synchronized void c(String str) {
        c(str, this.e.currentTimeMillisMonotonic());
    }

    public final synchronized void c(String str, long j2) {
        if (this.m.size() < 16) {
            d(str, j2 - this.f);
        }
    }

    public final synchronized void a(String str, String str2) {
        a(str, this.e.currentTimeMillisMonotonic(), null);
    }

    public final synchronized void a(String str, long j2, String str2) {
        if (this.p && !this.a) {
            d(str, j2 - this.f);
            this.l.a(str, this.g, this.i, b(), str2, this.m, this.n);
            this.a = true;
            this.b = Optional.b(str);
            d(str);
        }
    }

    public final synchronized void a(gln gln) {
        this.k.add(gln);
    }

    public final synchronized void b(gln gln) {
        this.k.remove(gln);
    }

    private synchronized void d(String str) {
        for (gln a2 : this.k) {
            a2.a(str);
        }
    }

    public final void a(boolean z) {
        this.h = Optional.b(Boolean.valueOf(z));
    }

    public static long a() {
        return (System.nanoTime() / 1000) / 1000;
    }

    private String b() {
        if (!this.h.b()) {
            return "unknown";
        }
        if (((Boolean) this.h.c()).booleanValue()) {
            return this.d ? "inactive" : "active";
        }
        return "background";
    }

    public final synchronized void a(String str) {
        if (!this.a && this.q && !this.o.containsKey(str)) {
            this.o.put(str, Long.valueOf(this.e.currentTimeMillisMonotonic()));
        }
    }

    private synchronized void e(String str, long j2) {
        if (!this.a && this.q && this.o.containsKey(str)) {
            this.n.put(str, Long.toString(j2));
            this.o.remove(str);
        }
    }

    public final synchronized void b(String str, long j2) {
        if (!this.a && this.q) {
            this.n.put(str, Long.toString(j2));
        }
    }
}
