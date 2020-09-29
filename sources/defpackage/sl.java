package defpackage;

import androidx.viewpager2.widget.ViewPager2.e;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: sl reason: default package */
public final class sl extends e {
    private final List<e> a = new ArrayList(3);

    public sl(int i) {
    }

    private static void a(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    public final void a(int i) {
        try {
            for (e a2 : this.a) {
                a2.a(i);
            }
        } catch (ConcurrentModificationException e) {
            a(e);
        }
    }

    public final void a(int i, float f, int i2) {
        try {
            for (e a2 : this.a) {
                a2.a(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            a(e);
        }
    }

    public final void a(e eVar) {
        this.a.add(eVar);
    }

    public final void b(int i) {
        try {
            for (e b : this.a) {
                b.b(i);
            }
        } catch (ConcurrentModificationException e) {
            a(e);
        }
    }
}
