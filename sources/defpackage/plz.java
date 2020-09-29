package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: plz reason: default package */
public final class plz extends a {
    public pma a;
    public pmc b;
    private int c;
    private int d = -1;

    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final int a(u uVar) {
        return b(3, 0);
    }

    public final boolean a(u uVar, u uVar2) {
        this.d = uVar2.e();
        pmc pmc = this.b;
        if (pmc != null) {
            pmc.e(uVar.e(), uVar2.e());
        }
        return true;
    }

    public final boolean a(RecyclerView recyclerView, u uVar, u uVar2) {
        pma pma = this.a;
        if (pma != null) {
            return pma.c(uVar2.e()) && super.a(recyclerView, uVar, uVar2);
        }
        return super.a(recyclerView, uVar, uVar2);
    }

    public final void a(u uVar, int i) {
        if (i == 2 && (uVar instanceof pnf)) {
            ((pnf) uVar).aC_();
            this.c = uVar.e();
        } else if (i == 0) {
            pma pma = this.a;
            if (pma != null) {
                int i2 = this.d;
                if (i2 >= 0) {
                    pma.c(this.c, i2);
                }
                this.d = -1;
            }
        }
        super.a(uVar, i);
    }

    public final void c(RecyclerView recyclerView, u uVar) {
        super.c(recyclerView, uVar);
        if (uVar instanceof pnf) {
            ((pnf) uVar).b();
        }
    }
}
