package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.Collections;
import java.util.List;

/* renamed from: grt reason: default package */
public abstract class grt extends a<u> implements gjk {
    protected final SparseArray<gru> a = new SparseArray<>();
    protected List<gru> d = Collections.emptyList();

    /* access modifiers changed from: protected */
    public abstract List<gru> a();

    public final u a(ViewGroup viewGroup, int i) {
        return ((gru) this.a.get(i)).a(viewGroup, i);
    }

    public final void a(u uVar, int i) {
        ((gru) this.d.get(f(i))).a(uVar, g(i));
    }

    public final int a(int i) {
        gru gru = (gru) this.d.get(f(i));
        g(i);
        int a2 = gru.a();
        if (this.a.get(a2) == null) {
            this.a.put(a2, gru);
        }
        return a2;
    }

    public final int b() {
        int i = 0;
        if (this.d.isEmpty()) {
            this.d = a();
            SparseArray sparseArray = new SparseArray();
            for (gru gru : this.d) {
                int[] c = gru.c();
                int length = c.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        int i3 = c[i2];
                        gru gru2 = (gru) sparseArray.get(i3);
                        if (gru2 == null) {
                            sparseArray.put(i3, gru);
                            i2++;
                        } else {
                            throw new RuntimeException(String.format("ViewType collision detected. %s is duplicating ViewType %d already used by %s", new Object[]{gru.getClass().getSimpleName(), Integer.valueOf(i3), gru2.getClass().getSimpleName()}));
                        }
                    }
                }
            }
        }
        for (gru b : this.d) {
            i += b.b();
        }
        return i;
    }

    public final long b(int i) {
        return ((gru) this.d.get(f(i))).a(g(i));
    }

    public final String c(int i) {
        return String.valueOf(b(i));
    }

    /* access modifiers changed from: protected */
    public final int f(int i) {
        int i2 = 0;
        for (gru b : this.d) {
            int b2 = b.b();
            if (i <= b2 - 1) {
                break;
            }
            i -= b2;
            i2++;
        }
        return i2;
    }

    private int g(int i) {
        for (gru b : this.d) {
            int b2 = b.b();
            if (i <= b2 - 1) {
                break;
            }
            i -= b2;
        }
        return i;
    }
}
