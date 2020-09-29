package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.savedstate.Recreator;

/* renamed from: pq reason: default package */
public final class pq {
    public final pp a = new pp();
    private final pr b;

    private pq(pr prVar) {
        this.b = prVar;
    }

    public static pq a(pr prVar) {
        return new pq(prVar);
    }

    public final void a(Bundle bundle) {
        Lifecycle Y_ = this.b.Y_();
        if (Y_.a() == State.INITIALIZED) {
            Y_.a(new Recreator(this.b));
            this.a.a(Y_, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void b(Bundle bundle) {
        this.a.a(bundle);
    }
}
