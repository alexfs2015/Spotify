package defpackage;

import android.os.Handler;
import androidx.lifecycle.Lifecycle.Event;

/* renamed from: hhw reason: default package */
public final class hhw {
    public final li a;
    private final Handler b = new Handler();
    private a c;

    /* renamed from: hhw$a */
    static class a implements Runnable {
        private final li a;
        private Event b;
        private boolean c;

        a(li liVar, Event event) {
            this.a = liVar;
            this.b = event;
        }

        public final void run() {
            if (!this.c) {
                this.a.a(this.b);
                this.c = true;
            }
        }
    }

    public hhw(lh lhVar) {
        this.a = new li(lhVar);
    }

    public void a(Event event) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        this.c = new a(this.a, event);
        this.b.postAtFrontOfQueue(this.c);
    }
}
