package defpackage;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* renamed from: es reason: default package */
public class es extends ConstraintWidget {
    protected ArrayList<ConstraintWidget> ar = new ArrayList<>();

    public void f() {
        this.ar.clear();
        super.f();
    }

    public final void a(ConstraintWidget constraintWidget) {
        this.ar.add(constraintWidget);
        if (constraintWidget.D != null) {
            ((es) constraintWidget.D).b(constraintWidget);
        }
        constraintWidget.D = this;
    }

    public final void b(ConstraintWidget constraintWidget) {
        this.ar.remove(constraintWidget);
        constraintWidget.D = null;
    }

    public final void b(int i, int i2) {
        super.b(i, i2);
        int size = this.ar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ConstraintWidget) this.ar.get(i3)).b(q(), r());
        }
    }

    public final void w() {
        super.w();
        ArrayList<ConstraintWidget> arrayList = this.ar;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) this.ar.get(i);
                constraintWidget.b(o(), p());
                if (!(constraintWidget instanceof ei)) {
                    constraintWidget.w();
                }
            }
        }
    }

    public void A() {
        w();
        ArrayList<ConstraintWidget> arrayList = this.ar;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) this.ar.get(i);
                if (constraintWidget instanceof es) {
                    ((es) constraintWidget).A();
                }
            }
        }
    }

    public final void a(dz dzVar) {
        super.a(dzVar);
        int size = this.ar.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.ar.get(i)).a(dzVar);
        }
    }

    public final void E() {
        this.ar.clear();
    }

    public final ei D() {
        ConstraintWidget constraintWidget = this.D;
        ei eiVar = (ei) this;
        while (constraintWidget != null) {
            ConstraintWidget constraintWidget2 = constraintWidget.D;
            if (constraintWidget instanceof ei) {
                eiVar = (ei) constraintWidget;
            }
            constraintWidget = constraintWidget2;
        }
        return eiVar;
    }
}
