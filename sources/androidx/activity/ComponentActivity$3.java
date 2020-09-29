package androidx.activity;

import androidx.lifecycle.Lifecycle.Event;

public class ComponentActivity$3 implements lf {
    private /* synthetic */ k a;

    public ComponentActivity$3(k kVar) {
        this.a = kVar;
    }

    public final void a(lh lhVar, Event event) {
        if (event == Event.ON_DESTROY && !this.a.isChangingConfigurations()) {
            this.a.ar_().a();
        }
    }
}
