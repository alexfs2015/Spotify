package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.Event;
import java.util.List;

public class ReflectiveGenericLifecycleObserver implements lf {
    private final Object a;
    private final a b = ky.a.b(this.a.getClass());

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
    }

    public final void a(lh lhVar, Event event) {
        a aVar = this.b;
        Object obj = this.a;
        a.a((List) aVar.a.get(event), lhVar, event, obj);
        a.a((List) aVar.a.get(Event.ON_ANY), lhVar, event, obj);
    }
}
