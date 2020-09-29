package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle.Event;

public class ComponentActivity$2 implements lf {
    private /* synthetic */ k a;

    public ComponentActivity$2(k kVar) {
        this.a = kVar;
    }

    public final void a(lh lhVar, Event event) {
        if (event == Event.ON_STOP) {
            Window window = this.a.getWindow();
            View peekDecorView = window != null ? window.peekDecorView() : null;
            if (peekDecorView != null) {
                peekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
