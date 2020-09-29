package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: sk reason: default package */
final class sk {
    private static final MarginLayoutParams a;
    private LinearLayoutManager b;

    static {
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, -1);
        a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    sk(LinearLayoutManager linearLayoutManager) {
        this.b = linearLayoutManager;
    }

    private static boolean a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean b() {
        int r = this.b.r();
        for (int i = 0; i < r; i++) {
            if (a(this.b.g(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        if (r4[r0 - 1][1] >= r3) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r11 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r11.b
            int r0 = r0.r()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x009e
            androidx.recyclerview.widget.LinearLayoutManager r3 = r11.b
            int r3 = r3.c
            if (r3 != 0) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            r4 = 2
            int[] r4 = new int[]{r0, r4}
            java.lang.Class<int> r5 = int.class
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r5, r4)
            int[][] r4 = (int[][]) r4
            r5 = 0
        L_0x0021:
            if (r5 >= r0) goto L_0x006b
            androidx.recyclerview.widget.LinearLayoutManager r6 = r11.b
            android.view.View r6 = r6.g(r5)
            if (r6 == 0) goto L_0x0063
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            boolean r8 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L_0x0036
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L_0x0038
        L_0x0036:
            android.view.ViewGroup$MarginLayoutParams r7 = a
        L_0x0038:
            r8 = r4[r5]
            if (r3 == 0) goto L_0x0043
            int r9 = r6.getLeft()
            int r10 = r7.leftMargin
            goto L_0x0049
        L_0x0043:
            int r9 = r6.getTop()
            int r10 = r7.topMargin
        L_0x0049:
            int r9 = r9 - r10
            r8[r1] = r9
            r8 = r4[r5]
            if (r3 == 0) goto L_0x0057
            int r6 = r6.getRight()
            int r7 = r7.rightMargin
            goto L_0x005d
        L_0x0057:
            int r6 = r6.getBottom()
            int r7 = r7.bottomMargin
        L_0x005d:
            int r6 = r6 + r7
            r8[r2] = r6
            int r5 = r5 + 1
            goto L_0x0021
        L_0x0063:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L_0x006b:
            sk$1 r3 = new sk$1
            r3.<init>()
            java.util.Arrays.sort(r4, r3)
            r3 = 1
        L_0x0074:
            if (r3 >= r0) goto L_0x0086
            int r5 = r3 + -1
            r5 = r4[r5]
            r5 = r5[r2]
            r6 = r4[r3]
            r6 = r6[r1]
            if (r5 == r6) goto L_0x0083
            goto L_0x009c
        L_0x0083:
            int r3 = r3 + 1
            goto L_0x0074
        L_0x0086:
            r3 = r4[r1]
            r3 = r3[r2]
            r5 = r4[r1]
            r5 = r5[r1]
            int r3 = r3 - r5
            r5 = r4[r1]
            r5 = r5[r1]
            if (r5 > 0) goto L_0x009c
            int r0 = r0 - r2
            r0 = r4[r0]
            r0 = r0[r2]
            if (r0 >= r3) goto L_0x009e
        L_0x009c:
            r0 = 0
            goto L_0x009f
        L_0x009e:
            r0 = 1
        L_0x009f:
            if (r0 == 0) goto L_0x00a9
            androidx.recyclerview.widget.LinearLayoutManager r0 = r11.b
            int r0 = r0.r()
            if (r0 > r2) goto L_0x00b0
        L_0x00a9:
            boolean r0 = r11.b()
            if (r0 == 0) goto L_0x00b0
            return r2
        L_0x00b0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk.a():boolean");
    }
}
