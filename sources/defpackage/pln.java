package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.squareup.picasso.Picasso;

/* renamed from: pln reason: default package */
public final class pln extends a<u> implements gjk, pmc {
    public final plp a;
    private final SparseArray<iqv<?>> d = new SparseArray<>(4);
    private final plh e;

    public pln(plh plh, plk plk, pmf pmf, Picasso picasso, Context context, pmd pmd, boolean z) {
        a(z);
        this.e = (plh) fay.a(plh);
        plq plq = new plq();
        plo plo = new plo(context, picasso, pmd);
        this.a = new plp(plk, pmf, pmd);
        this.d.put(4, plq);
        this.d.put(1, plo);
        this.d.put(2, this.a);
        this.d.put(3, this.a);
    }

    public final u a(ViewGroup viewGroup, int i) {
        return ((iqv) this.d.get(i)).a(viewGroup);
    }

    public final void a(u uVar, int i) {
        Object obj;
        plh plh = this.e;
        int a2 = plh.a(i);
        if (a2 == 1) {
            obj = pml.a(plh.b(), false, false, false, false);
        } else if (a2 == 2 || a2 == 3) {
            a aVar = (a) plh.a.get(i);
            if (aVar.c instanceof pml) {
                obj = (pml) aVar.c;
            } else {
                throw new IllegalStateException();
            }
        } else if (a2 != 4) {
            throw new IllegalStateException();
        } else if (plh.a(i) == 4) {
            obj = (tck) ((a) plh.a.get(i)).c;
        } else {
            throw new IllegalStateException();
        }
        ((iqv) this.d.get(this.e.a(i))).a(uVar, obj, i);
    }

    public final long b(int i) {
        return (long) ((a) this.e.a.get(i)).c.hashCode();
    }

    public final int a(int i) {
        return this.e.a(i);
    }

    public final String c(int i) {
        int a2 = a(i);
        if (a2 == 1) {
            return "now-playing";
        }
        if (a2 == 2) {
            return "explicitly-queued";
        }
        if (a2 != 3) {
            return a2 != 4 ? "unknown" : "section-header";
        }
        return "next-from-context";
    }

    public final int b() {
        return this.e.a();
    }

    public final void e(int i, int i2) {
        plh plh = this.e;
        if (i >= 0) {
            int a2 = plh.a(i);
            a aVar = (a) plh.a.remove(i);
            if (a2 == 2 && i < plh.c && i2 >= plh.c) {
                plh.c--;
            } else if (a2 == 3 && i > plh.c && i2 <= plh.c) {
                plh.c++;
            }
            plh.a.add(i2, aVar);
        }
        b(i, i2);
    }
}
