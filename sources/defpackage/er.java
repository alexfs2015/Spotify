package defpackage;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Strength;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* renamed from: er reason: default package */
public final class er {
    int a;
    int b;
    int c;
    int d;
    ArrayList<a> e = new ArrayList<>();

    /* renamed from: er$a */
    static class a {
        ConstraintAnchor a;
        ConstraintAnchor b;
        int c;
        Strength d;
        int e;

        public a(ConstraintAnchor constraintAnchor) {
            this.a = constraintAnchor;
            this.b = constraintAnchor.d;
            this.c = constraintAnchor.b();
            this.d = constraintAnchor.f;
            this.e = constraintAnchor.g;
        }
    }

    public er(ConstraintWidget constraintWidget) {
        this.a = constraintWidget.k();
        this.b = constraintWidget.l();
        this.c = constraintWidget.m();
        this.d = constraintWidget.n();
        ArrayList v = constraintWidget.v();
        int size = v.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new a((ConstraintAnchor) v.get(i)));
        }
    }

    public final void a(ConstraintWidget constraintWidget) {
        constraintWidget.c(this.a);
        constraintWidget.d(this.b);
        constraintWidget.e(this.c);
        constraintWidget.f(this.d);
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.e.get(i);
            constraintWidget.a(aVar.a.c).a(aVar.b, aVar.c, -1, aVar.d, aVar.e, false);
        }
    }
}
