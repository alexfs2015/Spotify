package androidx.savedstate;

import androidx.lifecycle.Lifecycle.Event;

public class SavedStateRegistry$1 implements ld {
    private /* synthetic */ pk a;

    public SavedStateRegistry$1(pk pkVar) {
        this.a = pkVar;
    }

    public final void a(lh lhVar, Event event) {
        if (event == Event.ON_START) {
            this.a.c = true;
            return;
        }
        if (event == Event.ON_STOP) {
            this.a.c = false;
        }
    }
}
