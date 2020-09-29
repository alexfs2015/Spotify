package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.k;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.r.a;
import androidx.recyclerview.widget.RecyclerView.r.b;

/* renamed from: or reason: default package */
public abstract class or extends k {
    RecyclerView a;
    private Scroller b;
    private final m c = new m() {
        private boolean a = false;

        public final void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                or.this.a();
            }
        }

        public final void a(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.a = true;
            }
        }
    };

    public abstract int a(i iVar, int i, int i2);

    public abstract View a(i iVar);

    /* access modifiers changed from: 0000 */
    public final void a() {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            i d = recyclerView.d();
            if (d != null) {
                View a2 = a(d);
                if (a2 != null) {
                    int[] a3 = a(d, a2);
                    if (!(a3[0] == 0 && a3[1] == 0)) {
                        this.a.a(a3[0], a3[1], (Interpolator) null);
                    }
                }
            }
        }
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.b(this.c);
                this.a.z = null;
            }
            this.a = recyclerView;
            RecyclerView recyclerView3 = this.a;
            if (recyclerView3 != null) {
                if (recyclerView3.z == null) {
                    this.a.a(this.c);
                    RecyclerView recyclerView4 = this.a;
                    recyclerView4.z = this;
                    this.b = new Scroller(recyclerView4.getContext(), new DecelerateInterpolator());
                    a();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, int r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.a
            androidx.recyclerview.widget.RecyclerView$i r0 = r0.d()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            androidx.recyclerview.widget.RecyclerView r2 = r4.a
            androidx.recyclerview.widget.RecyclerView$a r2 = r2.c()
            if (r2 != 0) goto L_0x0013
            return r1
        L_0x0013:
            androidx.recyclerview.widget.RecyclerView r2 = r4.a
            int r2 = r2.A
            int r3 = java.lang.Math.abs(r6)
            if (r3 > r2) goto L_0x0023
            int r3 = java.lang.Math.abs(r5)
            if (r3 <= r2) goto L_0x0042
        L_0x0023:
            boolean r2 = r0 instanceof androidx.recyclerview.widget.RecyclerView.r.b
            r3 = 1
            if (r2 != 0) goto L_0x002a
        L_0x0028:
            r5 = 0
            goto L_0x003f
        L_0x002a:
            oi r2 = r4.b(r0)
            if (r2 != 0) goto L_0x0031
            goto L_0x0028
        L_0x0031:
            int r5 = r4.a(r0, r5, r6)
            r6 = -1
            if (r5 != r6) goto L_0x0039
            goto L_0x0028
        L_0x0039:
            r2.b = r5
            r0.a(r2)
            r5 = 1
        L_0x003f:
            if (r5 == 0) goto L_0x0042
            return r3
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or.a(int, int):boolean");
    }

    public abstract int[] a(i iVar, View view);

    /* access modifiers changed from: protected */
    @Deprecated
    public oi b(i iVar) {
        if (!(iVar instanceof b)) {
            return null;
        }
        return new oi(this.a.getContext()) {
            /* access modifiers changed from: protected */
            public final float a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            public final void a(View view, a aVar) {
                if (or.this.a != null) {
                    or orVar = or.this;
                    int[] a = orVar.a(orVar.a.d(), view);
                    int i2 = a[0];
                    int i3 = a[1];
                    int a2 = a(Math.max(Math.abs(i2), Math.abs(i3)));
                    if (a2 > 0) {
                        aVar.a(i2, i3, a2, this.a);
                    }
                }
            }
        };
    }

    public final int[] b(int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    public final r c(i iVar) {
        return b(iVar);
    }
}
