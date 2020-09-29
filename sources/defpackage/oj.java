package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: oj reason: default package */
public final class oj extends ht {
    final RecyclerView c;
    public final ht d = new a(this);

    /* renamed from: oj$a */
    public static class a extends ht {
        private oj c;

        public a(oj ojVar) {
            this.c = ojVar;
        }

        public final void a(View view, ja jaVar) {
            super.a(view, jaVar);
            if (!this.c.c.l() && this.c.c.d() != null) {
                this.c.c.d().a(view, jaVar);
            }
        }

        public final boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (!this.c.c.l() && this.c.c.d() != null) {
                this.c.c.d();
            }
            return false;
        }
    }

    public oj(RecyclerView recyclerView) {
        this.c = recyclerView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.a(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L_0x0008
            return r6
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r4 = r3.c
            boolean r4 = r4.l()
            r0 = 0
            if (r4 != 0) goto L_0x0093
            androidx.recyclerview.widget.RecyclerView r4 = r3.c
            androidx.recyclerview.widget.RecyclerView$i r4 = r4.d()
            if (r4 == 0) goto L_0x0093
            androidx.recyclerview.widget.RecyclerView r4 = r3.c
            androidx.recyclerview.widget.RecyclerView$i r4 = r4.d()
            androidx.recyclerview.widget.RecyclerView r1 = r4.h
            if (r1 != 0) goto L_0x0024
            return r0
        L_0x0024:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L_0x005d
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r1) goto L_0x002f
            r5 = 0
        L_0x002d:
            r1 = 0
            goto L_0x0087
        L_0x002f:
            androidx.recyclerview.widget.RecyclerView r5 = r4.h
            r1 = -1
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L_0x0046
            int r5 = r4.v
            int r2 = r4.getPaddingTop()
            int r5 = r5 - r2
            int r2 = r4.getPaddingBottom()
            int r5 = r5 - r2
            int r5 = -r5
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            androidx.recyclerview.widget.RecyclerView r2 = r4.h
            boolean r1 = r2.canScrollHorizontally(r1)
            if (r1 == 0) goto L_0x002d
            int r1 = r4.u
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r1 = -r1
            goto L_0x0087
        L_0x005d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.h
            boolean r5 = r5.canScrollVertically(r6)
            if (r5 == 0) goto L_0x0072
            int r5 = r4.v
            int r1 = r4.getPaddingTop()
            int r5 = r5 - r1
            int r1 = r4.getPaddingBottom()
            int r5 = r5 - r1
            goto L_0x0073
        L_0x0072:
            r5 = 0
        L_0x0073:
            androidx.recyclerview.widget.RecyclerView r1 = r4.h
            boolean r1 = r1.canScrollHorizontally(r6)
            if (r1 == 0) goto L_0x002d
            int r1 = r4.u
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
        L_0x0087:
            if (r5 != 0) goto L_0x008c
            if (r1 != 0) goto L_0x008c
            return r0
        L_0x008c:
            androidx.recyclerview.widget.RecyclerView r4 = r4.h
            r0 = 0
            r4.a(r1, r5, r0)
            return r6
        L_0x0093:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj.a(android.view.View, int, android.os.Bundle):boolean");
    }

    public final void a(View view, ja jaVar) {
        b bVar;
        super.a(view, jaVar);
        jaVar.b((CharSequence) RecyclerView.class.getName());
        if (!this.c.l() && this.c.d() != null) {
            i d2 = this.c.d();
            o oVar = d2.h.e;
            s sVar = d2.h.E;
            if (d2.h.canScrollVertically(-1) || d2.h.canScrollHorizontally(-1)) {
                jaVar.a(8192);
                jaVar.j(true);
            }
            if (d2.h.canScrollVertically(1) || d2.h.canScrollHorizontally(1)) {
                jaVar.a(4096);
                jaVar.j(true);
            }
            int a2 = d2.a(oVar, sVar);
            int b = d2.b(oVar, sVar);
            if (VERSION.SDK_INT >= 21) {
                bVar = new b(CollectionInfo.obtain(a2, b, false, 0));
            } else if (VERSION.SDK_INT >= 19) {
                bVar = new b(CollectionInfo.obtain(a2, b, false));
            } else {
                bVar = new b(null);
            }
            if (VERSION.SDK_INT >= 19) {
                jaVar.a.setCollectionInfo((CollectionInfo) bVar.a);
            }
        }
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.c.l()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.d() != null) {
                recyclerView.d().a(accessibilityEvent);
            }
        }
    }
}
