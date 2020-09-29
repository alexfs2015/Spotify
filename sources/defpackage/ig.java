package defpackage;

import android.view.View;
import android.view.ViewParent;

/* renamed from: ig reason: default package */
public final class ig {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public ig(View view) {
        this.d = view;
    }

    private void a(int i, ViewParent viewParent) {
        if (i != 0) {
            if (i == 1) {
                this.c = viewParent;
            }
            return;
        }
        this.b = viewParent;
    }

    private int[] a() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    private boolean b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (this.a) {
            ViewParent c2 = c(i5);
            if (c2 == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr4 != null) {
                    this.d.getLocationInWindow(iArr4);
                    i7 = iArr4[0];
                    i6 = iArr4[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                if (iArr2 == null) {
                    int[] a2 = a();
                    a2[0] = 0;
                    a2[1] = 0;
                    iArr3 = a2;
                } else {
                    iArr3 = iArr2;
                }
                ir.a(c2, this.d, i, i2, i3, i4, i5, iArr3);
                if (iArr4 != null) {
                    this.d.getLocationInWindow(iArr4);
                    iArr4[0] = iArr4[0] - i7;
                    iArr4[1] = iArr4[1] - i6;
                }
                return true;
            } else if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
        }
        return false;
    }

    private ViewParent c(int i) {
        if (i == 0) {
            return this.b;
        }
        if (i != 1) {
            return null;
        }
        return this.c;
    }

    public final void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void a(boolean z) {
        if (this.a) {
            ip.z(this.d);
        }
        this.a = z;
    }

    public final boolean a(float f, float f2) {
        if (this.a) {
            ViewParent c2 = c(0);
            if (c2 != null) {
                return ir.a(c2, this.d, f, f2);
            }
        }
        return false;
    }

    public final boolean a(float f, float f2, boolean z) {
        if (this.a) {
            ViewParent c2 = c(0);
            if (c2 != null) {
                return ir.a(c2, this.d, f, f2, z);
            }
        }
        return false;
    }

    public final boolean a(int i) {
        return c(i) != null;
    }

    public final boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (this.a) {
            View view = this.d;
            for (ViewParent parent = this.d.getParent(); parent != null; parent = parent.getParent()) {
                if (ir.a(parent, view, this.d, i, i2)) {
                    a(i2, parent);
                    ir.b(parent, view, this.d, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return b(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        if (this.a) {
            ViewParent c2 = c(i3);
            if (c2 == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.d.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    iArr = a();
                }
                iArr[0] = 0;
                iArr[1] = 0;
                ir.a(c2, this.d, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public final void b(int i) {
        ViewParent c2 = c(i);
        if (c2 != null) {
            ir.a(c2, this.d, i);
            a(i, (ViewParent) null);
        }
    }
}
