package com.spotify.mobile.android.video;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import java.util.Collections;
import java.util.Set;

public class ApplicationStateObservableImpl implements kbt, kz {
    private final Lifecycle a;
    private final Set<kbu> b = Collections.newSetFromMap(gbo.a());

    public ApplicationStateObservableImpl(Lifecycle lifecycle) {
        this.a = lifecycle;
        this.a.a(this);
    }

    public final boolean c() {
        return !this.a.a().a(State.RESUMED);
    }

    public final void a(kbu kbu) {
        this.b.add(kbu);
    }

    public final void b(kbu kbu) {
        this.b.remove(kbu);
    }

    public final void a() {
        for (kbu g : this.b) {
            g.g();
        }
    }

    public final void b() {
        for (kbu h : this.b) {
            h.h();
        }
    }
}
