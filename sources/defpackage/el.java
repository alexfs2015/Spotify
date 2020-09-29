package defpackage;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.Arrays;

/* renamed from: el reason: default package */
public class el extends ConstraintWidget {
    protected ConstraintWidget[] ae = new ConstraintWidget[4];
    protected int af = 0;

    public final void a(ConstraintWidget constraintWidget) {
        int i = this.af + 1;
        ConstraintWidget[] constraintWidgetArr = this.ae;
        if (i > constraintWidgetArr.length) {
            this.ae = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length << 1);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.ae;
        int i2 = this.af;
        constraintWidgetArr2[i2] = constraintWidget;
        this.af = i2 + 1;
    }

    public final void A() {
        this.af = 0;
    }
}
