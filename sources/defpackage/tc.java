package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tc reason: default package */
public final class tc implements so {
    static final String a = sg.a("SystemAlarmDispatcher");
    final Context b;
    final vb c;
    final te d;
    final sq e;
    final sv f;
    final sz g;
    final List<Intent> h;
    Intent i;
    b j;
    private final Handler k;

    /* renamed from: tc$a */
    static class a implements Runnable {
        private final tc a;
        private final Intent b;
        private final int c;

        a(tc tcVar, Intent intent, int i) {
            this.a = tcVar;
            this.b = intent;
            this.c = i;
        }

        public final void run() {
            this.a.a(this.b, this.c);
        }
    }

    /* renamed from: tc$b */
    public interface b {
        void f_();
    }

    /* renamed from: tc$c */
    static class c implements Runnable {
        private final tc a;

        c(tc tcVar) {
            this.a = tcVar;
        }

        public final void run() {
            tc tcVar = this.a;
            sg.a();
            tcVar.c();
            synchronized (tcVar.h) {
                if (tcVar.i != null) {
                    sg.a();
                    String.format("Removing command %s", new Object[]{tcVar.i});
                    if (((Intent) tcVar.h.remove(0)).equals(tcVar.i)) {
                        tcVar.i = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                if (!tcVar.g.a() && tcVar.h.isEmpty()) {
                    sg.a();
                    if (tcVar.j != null) {
                        tcVar.j.f_();
                    }
                } else if (!tcVar.h.isEmpty()) {
                    tcVar.b();
                }
            }
        }
    }

    public tc(Context context) {
        this(context, null, null);
    }

    private tc(Context context, sq sqVar, sv svVar) {
        this.b = context.getApplicationContext();
        this.g = new sz(this.b);
        this.d = new te();
        this.f = sv.a(context);
        this.e = this.f.f;
        this.c = this.f.d;
        this.e.a((so) this);
        this.h = new ArrayList();
        this.i = null;
        this.k = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        sg.a();
        this.e.b((so) this);
        te teVar = this.d;
        if (!teVar.a.isShutdown()) {
            teVar.a.shutdownNow();
        }
        this.j = null;
    }

    public final void a(String str, boolean z) {
        a((Runnable) new a(this, sz.a(this.b, str, z), 0));
    }

    public final boolean a(Intent intent, int i2) {
        sg.a();
        boolean z = false;
        String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i2)});
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            sg.a();
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

    public final void a(b bVar) {
        if (this.j != null) {
            sg.a().a(a, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            return;
        }
        this.j = bVar;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Runnable runnable) {
        this.k.post(runnable);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        c();
        WakeLock a2 = uy.a(this.b, "ProcessCommand");
        try {
            a2.acquire();
            this.f.d.a(new Runnable() {
                public final void run() {
                    tc tcVar;
                    c cVar;
                    synchronized (tc.this.h) {
                        tc.this.i = (Intent) tc.this.h.get(0);
                    }
                    if (tc.this.i != null) {
                        String action = tc.this.i.getAction();
                        int intExtra = tc.this.i.getIntExtra("KEY_START_ID", 0);
                        sg.a();
                        String str = tc.a;
                        String.format("Processing command %s, %s", new Object[]{tc.this.i, Integer.valueOf(intExtra)});
                        WakeLock a2 = uy.a(tc.this.b, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                        try {
                            sg.a();
                            String str2 = tc.a;
                            String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a2});
                            a2.acquire();
                            tc.this.g.a(tc.this.i, intExtra, tc.this);
                            sg.a();
                            String str3 = tc.a;
                            String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a2});
                            a2.release();
                            tcVar = tc.this;
                            cVar = new c(tcVar);
                        } catch (Throwable th) {
                            sg.a();
                            String str4 = tc.a;
                            String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a2});
                            a2.release();
                            tc tcVar2 = tc.this;
                            tcVar2.a((Runnable) new c(tcVar2));
                            throw th;
                        }
                        tcVar.a((Runnable) cVar);
                    }
                }
            });
        } finally {
            a2.release();
        }
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

    /* access modifiers changed from: 0000 */
    public void c() {
        if (this.k.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }
}
