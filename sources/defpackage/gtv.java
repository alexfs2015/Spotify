package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.Collections;
import java.util.List;

/* renamed from: gtv reason: default package */
public abstract class gtv extends a<u> implements gkv {
    protected final SparseArray<gtw> a = new SparseArray<>();
    protected List<gtw> d = Collections.emptyList();

    private int g(int i) {
        for (gtw b : this.d) {
            int b2 = b.b();
            if (i <= b2 - 1) {
                break;
            }
            i -= b2;
        }
        return i;
    }

    public final int a(int i) {
        gtw gtw = (gtw) this.d.get(f(i));
        g(i);
        int a2 = gtw.a();
        if (this.a.get(a2) == null) {
            this.a.put(a2, gtw);
        }
        return a2;
    }

    public final u a(ViewGroup viewGroup, int i) {
        return ((gtw) this.a.get(i)).a(viewGroup, i);
    }

    /* access modifiers changed from: protected */
    public abstract List<gtw> a();

    public final void a(u uVar, int i) {
        ((gtw) this.d.get(f(i))).a(uVar, g(i));
    }

    public final int b() {
        int i = 0;
        if (this.d.isEmpty()) {
            this.d = a();
            SparseArray sparseArray = new SparseArray();
            for (gtw gtw : this.d) {
                int[] c = gtw.c();
                int length = c.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        int i3 = c[i2];
                        gtw gtw2 = (gtw) sparseArray.get(i3);
                        if (gtw2 == null) {
                            sparseArray.put(i3, gtw);
                            i2++;
                        } else {
                            throw new RuntimeException(String.format("ViewType collision detected. %s is duplicating ViewType %d already used by %s", new Object[]{gtw.getClass().getSimpleName(), Integer.valueOf(i3), gtw2.getClass().getSimpleName()}));
                        }
                    }
                }
            }
        }
        for (gtw b : this.d) {
            i += b.b();
        }
        return i;
    }

    public final long b(int i) {
        return ((gtw) this.d.get(f(i))).a(g(i));
    }

    public final String c(int i) {
        return String.valueOf(b(i));
    }

    /* access modifiers changed from: protected */
    public final int f(int i) {
        int i2 = 0;
        for (gtw b : this.d) {
            int b2 = b.b();
            if (i <= b2 - 1) {
                break;
            }
            i -= b2;
            i2++;
        }
        return i2;
    }
}
