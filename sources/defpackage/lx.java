package defpackage;

import android.os.Handler;
import androidx.lifecycle.Lifecycle.Event;

/* renamed from: lx reason: default package */
public final class lx {
    final ln a;
    private final Handler b = new Handler();
    private a c;

    /* renamed from: lx$a */
    static class a implements Runnable {
        private final ln a;
        private Event b;
        private boolean c = false;

        a(ln lnVar, Event event) {
            this.a = lnVar;
            this.b = event;
        }

        public final void run() {
            if (!this.c) {
                this.a.a(this.b);
                this.c = true;
            }
        }
    }

    public lx(lm lmVar) {
        this.a = new ln(lmVar);
    }

    /* access modifiers changed from: 0000 */
    public void a(Event event) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        this.c = new a(this.a, event);
        this.b.postAtFrontOfQueue(this.c);
    }
}
