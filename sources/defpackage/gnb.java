package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.Optional;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: gnb reason: default package */
public final class gnb {
    public boolean a;
    public Optional<String> b;
    public a c;
    public boolean d;
    private final String e;
    private Optional<Boolean> f;
    private String g;
    private final gnh h;
    private final Set<gnc> i;
    private final gnd j;
    private final gmz k;
    private Map<String, Long> l;
    private final Map<String, String> m;
    private final Map<String, Long> n;
    private final BehaviorSubject<Long> o;
    private final CompositeDisposable p;
    private boolean q;
    private boolean r;
    private final Scheduler s;

    /* renamed from: gnb$a */
    public interface a {
        void a(long j, long j2, Intent intent);
    }

    public gnb(gnd gnd, gmz gmz, Random random, Context context) {
        this(gnd, gmz, random, context, new gng(), Schedulers.b());
    }

    private gnb(gnd gnd, gmz gmz, Random random, Context context, gnh gnh, Scheduler scheduler) {
        this.b = Optional.e();
        this.f = Optional.e();
        this.l = new LinkedHashMap(16);
        this.m = new LinkedHashMap(14);
        this.n = new LinkedHashMap(14);
        this.o = BehaviorSubject.a();
        this.p = new CompositeDisposable();
        this.j = gnd;
        this.k = gmz;
        this.e = jvt.a(context).a();
        this.h = gnh;
        this.s = scheduler;
        this.r = random.nextDouble() > 0.99d;
        this.i = new HashSet();
    }

    public static long a() {
        return (System.nanoTime() / 1000) / 1000;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j2, Intent intent, Long l2) {
        this.c.a(l2.longValue(), j2, intent);
        this.c = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j2, Integer num) {
        this.o.onNext(Long.valueOf(j2 - ((long) num.intValue())));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gne gne, Long l2) {
        String str = "di_initialization";
        this.m.put(str, Long.toString(gne.a - l2.longValue()));
        this.m.put("dmi_contentProviders", Long.toString(gne.b - gne.a));
        this.m.put("dmi_initApplication", Long.toString(gne.c - gne.b));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j2, String str2, Long l2) {
        e(str, j2);
        Map<String, Long> map = this.l;
        for (Entry entry : map.entrySet()) {
            map.put(entry.getKey(), Long.valueOf(((Long) entry.getValue()).longValue() - l2.longValue()));
        }
        map.put("process_start", Long.valueOf(0));
        this.k.a(str, this.e, this.g, b(), str2, map, this.m);
        d(str);
        this.p.bd_();
    }

    private String b() {
        return this.f.b() ? ((Boolean) this.f.c()).booleanValue() ? this.d ? "inactive" : "active" : "background" : "unknown";
    }

    private synchronized void d(String str) {
        for (gnc a2 : this.i) {
            a2.a(str);
        }
    }

    private void d(String str, long j2) {
        if (this.q && !this.a) {
            e(str, j2);
        }
    }

    private void e(String str, long j2) {
        if (!this.l.containsKey(str)) {
            this.l.put(str, Long.valueOf(j2));
        }
    }

    private synchronized void f(String str, long j2) {
        if (!this.a && this.r && this.n.containsKey(str)) {
            this.m.put(str, Long.toString(j2));
            this.n.remove(str);
        }
    }

    public final synchronized void a(long j2) {
        this.q = true;
        this.g = b();
        d("app_init", j2);
        CompositeDisposable compositeDisposable = this.p;
        gnh gnh = this.h;
        gnh.getClass();
        compositeDisposable.a(Single.a((Callable<? extends T>) new $$Lambda$eYyq1AstPL6VwNXPA5EIstEVz0Q<Object>(gnh)).b(this.s).d((Consumer<? super T>) new $$Lambda$gnb$e1_vEFz6cvL5nJMGjGi4WtCBk<Object>(this, j2)));
    }

    public final void a(Intent intent) {
        if (this.c != null) {
            this.p.a(this.o.d((Consumer<? super T>) new $$Lambda$gnb$tSbxy0ynggPVGg_qedaGl0r9KJg<Object>(this, this.j.currentTimeMillisMonotonic(), intent)));
        }
    }

    public final synchronized void a(gnc gnc) {
        this.i.add(gnc);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.gne r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.q     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000f
            java.lang.String r4 = "ColdStartTracker not started yet! Don't call this method before having called ColdStartTracker.start()"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0023 }
            com.spotify.base.java.logging.Logger.e(r4, r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r3)
            return
        L_0x000f:
            if (r4 == 0) goto L_0x0021
            io.reactivex.disposables.CompositeDisposable r0 = r3.p     // Catch:{ all -> 0x0023 }
            io.reactivex.subjects.BehaviorSubject<java.lang.Long> r1 = r3.o     // Catch:{ all -> 0x0023 }
            -$$Lambda$gnb$WdchaPzSZRftjJoFnf7kih3irmM r2 = new -$$Lambda$gnb$WdchaPzSZRftjJoFnf7kih3irmM     // Catch:{ all -> 0x0023 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0023 }
            io.reactivex.disposables.Disposable r4 = r1.d(r2)     // Catch:{ all -> 0x0023 }
            r0.a(r4)     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r3)
            return
        L_0x0023:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnb.a(gne):void");
    }

    public final void a(Runnable runnable, String str) {
        a(str);
        runnable.run();
        b(str);
    }

    public final synchronized void a(String str) {
        if (!this.a && this.r && !this.n.containsKey(str)) {
            this.n.put(str, Long.valueOf(this.j.currentTimeMillisMonotonic()));
        }
    }

    public final synchronized void a(String str, long j2) {
        StringBuilder sb = new StringBuilder("dcf_");
        sb.append(str);
        b(sb.toString(), j2);
    }

    public final synchronized void a(String str, long j2, String str2) {
        if (this.q && !this.a) {
            this.a = true;
            this.b = Optional.b(str);
            CompositeDisposable compositeDisposable = this.p;
            Observable a2 = this.o.a(AndroidSchedulers.a());
            $$Lambda$gnb$yHdbwoWvl2b5dwurLVQSBAc9Czs r2 = new $$Lambda$gnb$yHdbwoWvl2b5dwurLVQSBAc9Czs(this, str, j2, str2);
            compositeDisposable.a(a2.d((Consumer<? super T>) r2));
        }
    }

    public final synchronized void a(String str, String str2) {
        a(str, this.j.currentTimeMillisMonotonic(), (String) null);
    }

    public final void a(boolean z) {
        this.f = Optional.b(Boolean.valueOf(z));
    }

    public final synchronized void b(gnc gnc) {
        this.i.remove(gnc);
    }

    public final synchronized void b(String str) {
        Long l2 = (Long) this.n.get(str);
        if (l2 != null) {
            f(str, this.j.currentTimeMillisMonotonic() - l2.longValue());
        }
    }

    public final synchronized void b(String str, long j2) {
        if (!this.a && this.r) {
            this.m.put(str, Long.toString(j2));
        }
    }

    public final synchronized void c(String str) {
        c(str, this.j.currentTimeMillisMonotonic());
    }

    public final synchronized void c(String str, long j2) {
        if (this.l.size() < 14) {
            d(str, j2);
        }
    }
}
