package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: rle reason: default package */
public abstract class rle implements rlh {
    private final Collection<rlh> a = new ArrayList();

    public final void a(rlh rlh) {
        synchronized (this.a) {
            this.a.add(rlh);
        }
    }

    public final void b(rlh rlh) {
        synchronized (this.a) {
            this.a.remove(rlh);
        }
    }

    public void a(aia aia, boolean z) {
        synchronized (this.a) {
            for (rlh a2 : this.a) {
                a2.a(aia, z);
            }
        }
    }
}
