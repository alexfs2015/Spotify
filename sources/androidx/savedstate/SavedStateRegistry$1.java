package androidx.savedstate;

import androidx.lifecycle.Lifecycle.Event;

public class SavedStateRegistry$1 implements li {
    private /* synthetic */ pp a;

    public SavedStateRegistry$1(pp ppVar) {
        this.a = ppVar;
    }

    public final void a(lm lmVar, Event event) {
        if (event == Event.ON_START) {
            this.a.c = true;
            return;
        }
        if (event == Event.ON_STOP) {
            this.a.c = false;
        }
    }
}
