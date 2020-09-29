package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: puv reason: default package */
public final class puv extends a {
    public puw a;
    public puy b;
    private int c;
    private int d = -1;

    public final int a(u uVar) {
        return b(3, 0);
    }

    public final void a(u uVar, int i) {
        if (i == 2 && (uVar instanceof pwb)) {
            ((pwb) uVar).aA_();
            this.c = uVar.e();
        } else if (i == 0) {
            puw puw = this.a;
            if (puw != null) {
                int i2 = this.d;
                if (i2 >= 0) {
                    puw.c(this.c, i2);
                }
                this.d = -1;
            }
        }
        super.a(uVar, i);
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(u uVar, u uVar2) {
        this.d = uVar2.e();
        puy puy = this.b;
        if (puy != null) {
            puy.e(uVar.e(), uVar2.e());
        }
        return true;
    }

    public final boolean a(RecyclerView recyclerView, u uVar, u uVar2) {
        puw puw = this.a;
        return puw != null ? puw.c(uVar2.e()) && super.a(recyclerView, uVar, uVar2) : super.a(recyclerView, uVar, uVar2);
    }

    public final boolean b() {
        return false;
    }

    public final void c(RecyclerView recyclerView, u uVar) {
        super.c(recyclerView, uVar);
        if (uVar instanceof pwb) {
            ((pwb) uVar).b();
        }
    }
}
