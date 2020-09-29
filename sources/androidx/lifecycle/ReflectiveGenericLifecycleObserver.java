package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.Event;
import java.util.List;

public class ReflectiveGenericLifecycleObserver implements lk {
    private final Object a;
    private final a b = ld.a.b(this.a.getClass());

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
    }

    public final void a(lm lmVar, Event event) {
        a aVar = this.b;
        Object obj = this.a;
        a.a((List) aVar.a.get(event), lmVar, event, obj);
        a.a((List) aVar.a.get(Event.ON_ANY), lmVar, event, obj);
    }
}
