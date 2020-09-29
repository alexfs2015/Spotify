package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.a.C0004a;
import androidx.work.ListenableWorker.a.b;
import androidx.work.ListenableWorker.a.c;
import androidx.work.WorkInfo.State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: sw reason: default package */
public final class sw implements Runnable {
    static final String a = sg.a("WorkerWrapper");
    uj b;
    ListenableWorker c;
    androidx.work.ListenableWorker.a d = new C0004a();
    va<Boolean> e = va.a();
    fek<androidx.work.ListenableWorker.a> f = null;
    private Context g;
    private String h;
    private List<sr> i;
    private androidx.work.WorkerParameters.a j;
    private sb k;
    private vb l;
    private WorkDatabase m;
    private uk n;
    private ub o;
    private un p;
    private List<String> q;
    private String r;
    private volatile boolean s;

    /* renamed from: sw$a */
    public static class a {
        Context a;
        vb b;
        sb c;
        WorkDatabase d;
        String e;
        List<sr> f;
        androidx.work.WorkerParameters.a g = new androidx.work.WorkerParameters.a();

        public a(Context context, sb sbVar, vb vbVar, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.b = vbVar;
            this.c = sbVar;
            this.d = workDatabase;
            this.e = str;
        }
    }

    sw(a aVar) {
        this.g = aVar.a;
        this.l = aVar.b;
        this.h = aVar.e;
        this.i = aVar.f;
        this.j = aVar.g;
        this.c = null;
        this.k = aVar.c;
        this.m = aVar.d;
        this.n = this.m.j();
        this.o = this.m.k();
        this.p = this.m.l();
    }

    public final void run() {
        se a2;
        this.q = this.p.a(this.h);
        List<String> list = this.q;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.h);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        this.r = sb.toString();
        if (!d()) {
            this.m.e();
            try {
                this.b = this.n.b(this.h);
                if (this.b == null) {
                    sg.a().a(a, String.format("Didn't find WorkSpec for id %s", new Object[]{this.h}), new Throwable[0]);
                    a(false);
                } else if (this.b.b != State.ENQUEUED) {
                    c();
                    this.m.g();
                    sg.a();
                    String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.b.c});
                    this.m.f();
                } else {
                    if (this.b.a() || this.b.b()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!(this.b.n == 0) && currentTimeMillis < this.b.c()) {
                            sg.a();
                            String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.b.c});
                            a(true);
                            this.m.f();
                            return;
                        }
                    }
                    this.m.g();
                    this.m.f();
                    if (this.b.a()) {
                        a2 = this.b.e;
                    } else {
                        sf a3 = sf.a(this.b.d);
                        if (a3 == null) {
                            sg.a().a(a, String.format("Could not create Input Merger %s", new Object[]{this.b.d}), new Throwable[0]);
                            f();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.b.e);
                        arrayList.addAll(this.n.g(this.h));
                        a2 = a3.a((List<se>) arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.h), a2, this.q, this.j, this.b.k, this.k.a, this.l, this.k.c);
                    if (this.c == null) {
                        this.c = this.k.c.a(this.g, this.b.c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.c;
                    if (listenableWorker == null) {
                        sg.a().a(a, String.format("Could not create Worker %s", new Object[]{this.b.c}), new Throwable[0]);
                        f();
                    } else if (listenableWorker.c) {
                        sg.a().a(a, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.b.c}), new Throwable[0]);
                        f();
                    } else {
                        this.c.c = true;
                        if (!e()) {
                            c();
                        } else if (!d()) {
                            final va a4 = va.a();
                            this.l.a().execute(new Runnable() {
                                public final void run() {
                                    try {
                                        sg.a();
                                        String str = sw.a;
                                        String.format("Starting work for %s", new Object[]{sw.this.b.c});
                                        sw.this.f = sw.this.c.c();
                                        a4.a(sw.this.f);
                                    } catch (Throwable th) {
                                        a4.a(th);
                                    }
                                }
                            });
                            final String str2 = this.r;
                            a4.addListener(new Runnable() {
                                public final void run() {
                                    try {
                                        androidx.work.ListenableWorker.a aVar = (androidx.work.ListenableWorker.a) a4.get();
                                        if (aVar == null) {
                                            sg.a().a(sw.a, String.format("%s returned a null result. Treating it as a failure.", new Object[]{sw.this.b.c}), new Throwable[0]);
                                        } else {
                                            sg.a();
                                            String str = sw.a;
                                            String.format("%s returned a %s result.", new Object[]{sw.this.b.c, aVar});
                                            sw.this.d = aVar;
                                        }
                                    } catch (CancellationException e) {
                                        sg.a();
                                        String str2 = sw.a;
                                        String.format("%s was cancelled", new Object[]{str2});
                                        new Throwable[1][0] = e;
                                    } catch (InterruptedException | ExecutionException e2) {
                                        sg.a().a(sw.a, String.format("%s failed because it threw an exception/error", new Object[]{str2}), e2);
                                    } catch (Throwable th) {
                                        sw.this.a();
                                        throw th;
                                    }
                                    sw.this.a();
                                }
                            }, this.l.b());
                        }
                    }
                }
            } finally {
                this.m.f();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        boolean z = false;
        if (!d()) {
            this.m.e();
            try {
                State f2 = this.n.f(this.h);
                if (f2 == null) {
                    a(false);
                    z = true;
                } else if (f2 == State.RUNNING) {
                    androidx.work.ListenableWorker.a aVar = this.d;
                    if (aVar instanceof c) {
                        sg.a();
                        String.format("Worker result SUCCESS for %s", new Object[]{this.r});
                        if (this.b.a()) {
                            h();
                        } else {
                            i();
                        }
                    } else if (aVar instanceof b) {
                        sg.a();
                        String.format("Worker result RETRY for %s", new Object[]{this.r});
                        g();
                    } else {
                        sg.a();
                        String.format("Worker result FAILURE for %s", new Object[]{this.r});
                        if (this.b.a()) {
                            h();
                        } else {
                            f();
                        }
                    }
                    z = this.n.f(this.h).a();
                } else if (!f2.a()) {
                    g();
                }
                this.m.g();
            } finally {
                this.m.f();
            }
        }
        List<sr> list = this.i;
        if (list != null) {
            if (z) {
                for (sr a2 : list) {
                    a2.a(this.h);
                }
            }
            ss.a(this.k, this.m, this.i);
        }
    }

    public final void b() {
        this.s = true;
        d();
        fek<androidx.work.ListenableWorker.a> fek = this.f;
        if (fek != null) {
            fek.cancel(true);
        }
        ListenableWorker listenableWorker = this.c;
        if (listenableWorker != null) {
            listenableWorker.d();
        }
    }

    private void c() {
        State f2 = this.n.f(this.h);
        if (f2 == State.RUNNING) {
            sg.a();
            String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.h});
            a(true);
            return;
        }
        sg.a();
        String.format("Status for %s is %s; not doing any work", new Object[]{this.h, f2});
        a(false);
    }

    private boolean d() {
        boolean z = false;
        if (!this.s) {
            return false;
        }
        sg.a();
        String.format("Work interrupted for %s", new Object[]{this.r});
        State f2 = this.n.f(this.h);
        if (f2 != null && !f2.a()) {
            z = true;
        }
        a(z);
        return true;
    }

    /* JADX INFO: finally extract failed */
    private void a(boolean z) {
        this.m.e();
        try {
            if (this.m.j().a().isEmpty()) {
                ut.a(this.g, RescheduleReceiver.class, false);
            }
            this.m.g();
            this.m.f();
            this.e.a(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.m.f();
            throw th;
        }
    }

    private boolean e() {
        this.m.e();
        try {
            boolean z = true;
            if (this.n.f(this.h) == State.ENQUEUED) {
                this.n.a(State.RUNNING, this.h);
                this.n.d(this.h);
            } else {
                z = false;
            }
            this.m.g();
            return z;
        } finally {
            this.m.f();
        }
    }

    private void f() {
        this.m.e();
        try {
            a(this.h);
            this.n.a(this.h, ((C0004a) this.d).a);
            this.m.g();
        } finally {
            this.m.f();
            a(false);
        }
    }

    private void a(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.n.f(str2) != State.CANCELLED) {
                this.n.a(State.FAILED, str2);
            }
            linkedList.addAll(this.o.b(str2));
        }
    }

    private void g() {
        this.m.e();
        try {
            this.n.a(State.ENQUEUED, this.h);
            this.n.a(this.h, System.currentTimeMillis());
            this.n.b(this.h, -1);
            this.m.g();
        } finally {
            this.m.f();
            a(true);
        }
    }

    private void h() {
        this.m.e();
        try {
            this.n.a(this.h, System.currentTimeMillis());
            this.n.a(State.ENQUEUED, this.h);
            this.n.e(this.h);
            this.n.b(this.h, -1);
            this.m.g();
        } finally {
            this.m.f();
            a(false);
        }
    }

    private void i() {
        this.m.e();
        try {
            this.n.a(State.SUCCEEDED, this.h);
            this.n.a(this.h, ((c) this.d).a);
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.o.b(this.h)) {
                if (this.n.f(str) == State.BLOCKED && this.o.a(str)) {
                    sg.a();
                    String.format("Setting status to enqueued for %s", new Object[]{str});
                    this.n.a(State.ENQUEUED, str);
                    this.n.a(str, currentTimeMillis);
                }
            }
            this.m.g();
        } finally {
            this.m.f();
            a(false);
        }
    }
}
