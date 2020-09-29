package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tq reason: default package */
public final class tq implements tc {
    static final String a = su.a("SystemAlarmDispatcher");
    final Context b;
    final vp c;
    final ts d;
    final te e;
    final tj f;
    final tn g;
    final List<Intent> h;
    Intent i;
    b j;
    private final Handler k;

    /* renamed from: tq$a */
    static class a implements Runnable {
        private final tq a;
        private final Intent b;
        private final int c;

        a(tq tqVar, Intent intent, int i) {
            this.a = tqVar;
            this.b = intent;
            this.c = i;
        }

        public final void run() {
            this.a.a(this.b, this.c);
        }
    }

    /* renamed from: tq$b */
    public interface b {
        void f_();
    }

    /* renamed from: tq$c */
    static class c implements Runnable {
        private final tq a;

        c(tq tqVar) {
            this.a = tqVar;
        }

        public final void run() {
            tq tqVar = this.a;
            su.a();
            tqVar.c();
            synchronized (tqVar.h) {
                if (tqVar.i != null) {
                    su.a();
                    String.format("Removing command %s", new Object[]{tqVar.i});
                    if (((Intent) tqVar.h.remove(0)).equals(tqVar.i)) {
                        tqVar.i = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                if (!tqVar.g.a() && tqVar.h.isEmpty()) {
                    su.a();
                    if (tqVar.j != null) {
                        tqVar.j.f_();
                    }
                } else if (!tqVar.h.isEmpty()) {
                    tqVar.b();
                }
            }
        }
    }

    public tq(Context context) {
        this(context, null, null);
    }

    private tq(Context context, te teVar, tj tjVar) {
        this.b = context.getApplicationContext();
        this.g = new tn(this.b);
        this.d = new ts();
        this.f = tj.a(context);
        this.e = this.f.f;
        this.c = this.f.d;
        this.e.a((tc) this);
        this.h = new ArrayList();
        this.i = null;
        this.k = new Handler(Looper.getMainLooper());
    }

    private boolean a(String str) {
        c();
        synchronized (this.h) {
            for (Intent action : this.h) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void a() {
        su.a();
        this.e.b((tc) this);
        ts tsVar = this.d;
        if (!tsVar.a.isShutdown()) {
            tsVar.a.shutdownNow();
        }
        this.j = null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Runnable runnable) {
        this.k.post(runnable);
    }

    public final void a(String str, boolean z) {
        a((Runnable) new a(this, tn.a(this.b, str, z), 0));
    }

    public final void a(b bVar) {
        if (this.j != null) {
            su.a().a(a, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            return;
        }
        this.j = bVar;
    }

    public final boolean a(Intent intent, int i2) {
        su.a();
        boolean z = false;
        String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i2)});
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            su.a();
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i2);
            synchronized (this.h) {
                if (!this.h.isEmpty()) {
                    z = true;
                }
                this.h.add(intent);
                if (!z) {
                    b();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        c();
        WakeLock a2 = vm.a(this.b, "ProcessCommand");
        try {
            a2.acquire();
            this.f.d.a(new Runnable() {
                public final void run() {
                    tq tqVar;
                    c cVar;
                    synchronized (tq.this.h) {
                        tq.this.i = (Intent) tq.this.h.get(0);
                    }
                    if (tq.this.i != null) {
                        String action = tq.this.i.getAction();
                        int intExtra = tq.this.i.getIntExtra("KEY_START_ID", 0);
                        su.a();
                        String str = tq.a;
                        String.format("Processing command %s, %s", new Object[]{tq.this.i, Integer.valueOf(intExtra)});
                        WakeLock a2 = vm.a(tq.this.b, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                        try {
                            su.a();
                            String str2 = tq.a;
                            String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a2});
                            a2.acquire();
                            tq.this.g.a(tq.this.i, intExtra, tq.this);
                            su.a();
                            String str3 = tq.a;
                            String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a2});
                            a2.release();
                            tqVar = tq.this;
                            cVar = new c(tqVar);
                        } catch (Throwable th) {
                            su.a();
                            String str4 = tq.a;
                            String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a2});
                            a2.release();
                            tq tqVar2 = tq.this;
                            tqVar2.a((Runnable) new c(tqVar2));
                            throw th;
                        }
                        tqVar.a((Runnable) cVar);
                    }
                }
            });
        } finally {
            a2.release();
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        if (this.k.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }
}
