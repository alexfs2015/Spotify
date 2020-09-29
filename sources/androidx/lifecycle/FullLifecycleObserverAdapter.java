package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.Event;

public class FullLifecycleObserverAdapter implements lf {
    private final lb a;
    private final lf b;

    public FullLifecycleObserverAdapter(lb lbVar, lf lfVar) {
        this.a = lbVar;
        this.b = lfVar;
    }

    public final void a(lh lhVar, Event event) {
        switch (event) {
            case ON_RESUME:
                this.a.a();
                break;
            case ON_PAUSE:
                this.a.b();
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        lf lfVar = this.b;
        if (lfVar != null) {
            lfVar.a(lhVar, event);
        }
    }
}
