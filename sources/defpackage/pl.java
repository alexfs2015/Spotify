package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.savedstate.Recreator;

/* renamed from: pl reason: default package */
public final class pl {
    public final pk a = new pk();
    private final pm b;

    private pl(pm pmVar) {
        this.b = pmVar;
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

    public static pl a(pm pmVar) {
        return new pl(pmVar);
    }
}
