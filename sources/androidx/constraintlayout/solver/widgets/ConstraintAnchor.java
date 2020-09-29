package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;

public final class ConstraintAnchor {
    public eo a = new eo(this);
    public final ConstraintWidget b;
    public final Type c;
    public ConstraintAnchor d;
    public int e = 0;
    public Strength f = Strength.NONE;
    public int g = 0;
    public SolverVariable h;
    private int i = -1;
    private ConnectionType j = ConnectionType.RELAXED;

    public enum ConnectionType {
        RELAXED,
        STRICT
    }

    public enum Strength {
        NONE,
        STRONG,
        WEAK
    }

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.b = constraintWidget;
        this.c = type;
    }

    public final void a() {
        SolverVariable solverVariable = this.h;
        if (solverVariable == null) {
            this.h = new SolverVariable(androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.a();
        }
    }

    public final int b() {
        if (this.b.U == 8) {
            return 0;
        }
        if (this.i >= 0) {
            ConstraintAnchor constraintAnchor = this.d;
            if (constraintAnchor != null && constraintAnchor.b.U == 8) {
                return this.i;
            }
        }
        return this.e;
    }

    public final void c() {
        this.d = null;
        this.e = 0;
        this.i = -1;
        this.f = Strength.STRONG;
        this.g = 0;
        this.j = ConnectionType.RELAXED;
        this.a.b();
    }

    public final boolean a(ConstraintAnchor constraintAnchor, int i2, int i3, Strength strength, int i4, boolean z) {
        if (constraintAnchor == null) {
            this.d = null;
            this.e = 0;
            this.i = -1;
            this.f = Strength.NONE;
            this.g = 2;
            return true;
        } else if (!z && !a(constraintAnchor)) {
            return false;
        } else {
            this.d = constraintAnchor;
            if (i2 > 0) {
                this.e = i2;
            } else {
                this.e = 0;
            }
            this.i = i3;
            this.f = strength;
            this.g = i4;
            return true;
        }
    }

    public final boolean d() {
        return this.d != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.V);
        sb.append(":");
        sb.append(this.c.toString());
        return sb.toString();
    }

    private boolean a(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type type = constraintAnchor.c;
        Type type2 = this.c;
        if (type != type2) {
            switch (this.c) {
                case CENTER:
                    if (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                case LEFT:
                case RIGHT:
                    boolean z = type == Type.LEFT || type == Type.RIGHT;
                    if (constraintAnchor.b instanceof ek) {
                        z = z || type == Type.CENTER_X;
                    }
                    return z;
                case TOP:
                case BOTTOM:
                    boolean z2 = type == Type.TOP || type == Type.BOTTOM;
                    if (constraintAnchor.b instanceof ek) {
                        z2 = z2 || type == Type.CENTER_Y;
                    }
                    return z2;
                case BASELINE:
                case CENTER_X:
                case CENTER_Y:
                case NONE:
                    return false;
                default:
                    throw new AssertionError(this.c.name());
            }
        } else if (type2 != Type.BASELINE || (constraintAnchor.b.u() && this.b.u())) {
            return true;
        } else {
            return false;
        }
    }
}
