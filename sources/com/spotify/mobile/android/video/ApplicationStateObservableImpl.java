package com.spotify.mobile.android.video;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import java.util.Collections;
import java.util.Set;

public class ApplicationStateObservableImpl implements kdt, le {
    private final Lifecycle a;
    private final Set<kdu> b = Collections.newSetFromMap(gcm.a());

    public ApplicationStateObservableImpl(Lifecycle lifecycle) {
        this.a = lifecycle;
        this.a.a(this);
    }

    public final void a() {
        for (kdu g : this.b) {
            g.g();
        }
    }

    public final void a(kdu kdu) {
        this.b.add(kdu);
    }

    public final void b() {
        for (kdu h : this.b) {
            h.h();
        }
    }

    public final void b(kdu kdu) {
        this.b.remove(kdu);
    }

    public final boolean c() {
        return !this.a.a().a(State.RESUMED);
    }
}
