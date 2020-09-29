package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: fag reason: default package */
public final class fag {
    private static fag e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            fag fag = fag.this;
            b bVar = (b) message.obj;
            synchronized (fag.a) {
                if (fag.c == bVar || fag.d == bVar) {
                    fag.a(bVar, 2);
                }
            }
            return true;
        }
    });
    public b c;
    public b d;

    /* renamed from: fag$a */
    public interface a {
        void a();

        void a(int i);
    }

    /* renamed from: fag$b */
    public static class b {
        final WeakReference<a> a;
        public int b;
        boolean c;

        public b(int i, a aVar) {
            this.a = new WeakReference<>(aVar);
            this.b = i;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(a aVar) {
            return aVar != null && this.a.get() == aVar;
        }
    }

    public static fag a() {
        if (e == null) {
            e = new fag();
        }
        return e;
    }

    private fag() {
    }

    public final void a(a aVar, int i) {
        synchronized (this.a) {
            if (g(aVar)) {
                a(this.c, i);
            } else if (h(aVar)) {
                a(this.d, i);
            }
        }
    }

    public final void a(a aVar) {
        synchronized (this.a) {
            if (g(aVar)) {
                this.c = null;
                if (this.d != null) {
                    b();
                }
            }
        }
    }

    public final void b(a aVar) {
        synchronized (this.a) {
            if (g(aVar)) {
                a(this.c);
            }
        }
    }

    public final void c(a aVar) {
        synchronized (this.a) {
            if (g(aVar) && !this.c.c) {
                this.c.c = true;
                this.b.removeCallbacksAndMessages(this.c);
            }
        }
    }

    public final void d(a aVar) {
        synchronized (this.a) {
            if (g(aVar) && this.c.c) {
                this.c.c = false;
                a(this.c);
            }
        }
    }

    public final boolean e(a aVar) {
        boolean g;
        synchronized (this.a) {
            g = g(aVar);
        }
        return g;
    }

    public final boolean f(a aVar) {
        boolean z;
        synchronized (this.a) {
            if (!g(aVar)) {
                if (!h(aVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void b() {
        b bVar = this.d;
        if (bVar != null) {
            this.c = bVar;
            this.d = null;
            a aVar = (a) this.c.a.get();
            if (aVar != null) {
                aVar.a();
                return;
            }
            this.c = null;
        }
    }

    public boolean a(b bVar, int i) {
        a aVar = (a) bVar.a.get();
        if (aVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(bVar);
        aVar.a(i);
        return true;
    }

    public boolean g(a aVar) {
        b bVar = this.c;
        return bVar != null && bVar.a(aVar);
    }

    public boolean h(a aVar) {
        b bVar = this.d;
        return bVar != null && bVar.a(aVar);
    }

    public void a(b bVar) {
        if (bVar.b != -2) {
            int i = 2750;
            if (bVar.b > 0) {
                i = bVar.b;
            } else if (bVar.b == -1) {
                i = 1500;
            }
            this.b.removeCallbacksAndMessages(bVar);
            Handler handler = this.b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), (long) i);
        }
    }
}
