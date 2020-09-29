package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.Event;

public class FullLifecycleObserverAdapter implements lk {
    private final lg a;
    private final lk b;

    public FullLifecycleObserverAdapter(lg lgVar, lk lkVar) {
        this.a = lgVar;
        this.b = lkVar;
    }

    public final void a(lm lmVar, Event event) {
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
        lk lkVar = this.b;
        if (lkVar != null) {
            lkVar.a(lmVar, event);
        }
    }
}
