package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.squareup.picasso.Picasso;

/* renamed from: puj reason: default package */
public final class puj extends a<u> implements gkv, puy {
    public final pul a;
    private final SparseArray<iti<?>> d = new SparseArray<>(4);
    private final pud e;

    public puj(pud pud, pug pug, pvb pvb, Picasso picasso, Context context, puz puz, boolean z) {
        a(z);
        this.e = (pud) fbp.a(pud);
        pum pum = new pum();
        puk puk = new puk(context, picasso, puz);
        this.a = new pul(pug, pvb, puz);
        this.d.put(4, pum);
        this.d.put(1, puk);
        this.d.put(2, this.a);
        this.d.put(3, this.a);
    }

    public final int a(int i) {
        return this.e.a(i);
    }

    public final u a(ViewGroup viewGroup, int i) {
        return ((iti) this.d.get(i)).a(viewGroup);
    }

    public final void a(u uVar, int i) {
        Object obj;
        pud pud = this.e;
        int a2 = pud.a(i);
        if (a2 == 1) {
            obj = pvh.a(pud.b(), false, false, false, false);
        } else if (a2 == 2 || a2 == 3) {
            a aVar = (a) pud.a.get(i);
            if (aVar.c instanceof pvh) {
                obj = (pvh) aVar.c;
            } else {
                throw new IllegalStateException();
            }
        } else if (a2 != 4) {
            throw new IllegalStateException();
        } else if (pud.a(i) == 4) {
            obj = (tmr) ((a) pud.a.get(i)).c;
        } else {
            throw new IllegalStateException();
        }
        ((iti) this.d.get(this.e.a(i))).a(uVar, obj, i);
    }

    public final int b() {
        return this.e.a();
    }

    public final long b(int i) {
        return (long) ((a) this.e.a.get(i)).c.hashCode();
    }

    public final String c(int i) {
        int a2 = a(i);
        return a2 != 1 ? a2 != 2 ? a2 != 3 ? a2 != 4 ? "unknown" : "section-header" : "next-from-context" : "explicitly-queued" : "now-playing";
    }

    public final void e(int i, int i2) {
        pud pud = this.e;
        if (i >= 0) {
            int a2 = pud.a(i);
            a aVar = (a) pud.a.remove(i);
            if (a2 == 2 && i < pud.c && i2 >= pud.c) {
                pud.c--;
            } else if (a2 == 3 && i > pud.c && i2 <= pud.c) {
                pud.c++;
            }
            pud.a.add(i2, aVar);
        }
        b(i, i2);
    }
}
