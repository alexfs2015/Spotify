package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition.c;
import org.xmlpull.v1.XmlPullParser;

public abstract class Visibility extends Transition {
    private static final String[] m = {"android:visibility:visibility", "android:visibility:parent"};
    int a = 3;

    static class a extends AnimatorListenerAdapter implements c, defpackage.qf.a {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean d;
        private boolean e;
        private boolean f = false;

        a(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = true;
            a(true);
        }

        private void a(boolean z) {
            if (this.d && this.e != z) {
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    this.e = z;
                    rf.a(viewGroup, z);
                }
            }
        }

        private void d() {
            if (!this.f) {
                rj.a(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        public final void a() {
            a(false);
        }

        public final void a(Transition transition) {
            d();
            transition.b((c) this);
        }

        public final void b() {
            a(true);
        }

        public final void c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        public final void onAnimationEnd(Animator animator) {
            d();
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f) {
                rj.a(this.a, this.b);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f) {
                rj.a(this.a, 0);
            }
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    static class b {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        b() {
        }
    }

    public Visibility() {
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qu.c);
        int a2 = gc.a(obtainStyledAttributes, (XmlPullParser) (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (a2 != 0) {
            b(a2);
        }
    }

    private static b b(qz qzVar, qz qzVar2) {
        b bVar = new b();
        bVar.a = false;
        bVar.b = false;
        String str = "android:visibility:parent";
        String str2 = "android:visibility:visibility";
        if (qzVar == null || !qzVar.a.containsKey(str2)) {
            bVar.c = -1;
            bVar.e = null;
        } else {
            bVar.c = ((Integer) qzVar.a.get(str2)).intValue();
            bVar.e = (ViewGroup) qzVar.a.get(str);
        }
        if (qzVar2 == null || !qzVar2.a.containsKey(str2)) {
            bVar.d = -1;
            bVar.f = null;
        } else {
            bVar.d = ((Integer) qzVar2.a.get(str2)).intValue();
            bVar.f = (ViewGroup) qzVar2.a.get(str);
        }
        if (qzVar == null || qzVar2 == null) {
            if (qzVar == null && bVar.d == 0) {
                bVar.b = true;
                bVar.a = true;
            } else if (qzVar2 == null && bVar.c == 0) {
                bVar.b = false;
                bVar.a = true;
            }
        } else if (bVar.c == bVar.d && bVar.e == bVar.f) {
            return bVar;
        } else {
            if (bVar.c != bVar.d) {
                if (bVar.c == 0) {
                    bVar.b = false;
                    bVar.a = true;
                } else if (bVar.d == 0) {
                    bVar.b = true;
                    bVar.a = true;
                }
            } else if (bVar.f == null) {
                bVar.b = false;
                bVar.a = true;
            } else if (bVar.e == null) {
                bVar.b = true;
                bVar.a = true;
            }
        }
        return bVar;
    }

    private static void d(qz qzVar) {
        String str = "android:visibility:visibility";
        qzVar.a.put(str, Integer.valueOf(qzVar.b.getVisibility()));
        qzVar.a.put("android:visibility:parent", qzVar.b.getParent());
        int[] iArr = new int[2];
        qzVar.b.getLocationOnScreen(iArr);
        qzVar.a.put("android:visibility:screenLocation", iArr);
    }

    public Animator a(ViewGroup viewGroup, View view, qz qzVar) {
        return null;
    }

    public Animator a(ViewGroup viewGroup, View view, qz qzVar, qz qzVar2) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator a(android.view.ViewGroup r9, defpackage.qz r10, defpackage.qz r11) {
        /*
            r8 = this;
            androidx.transition.Visibility$b r0 = b(r10, r11)
            boolean r1 = r0.a
            r2 = 0
            if (r1 == 0) goto L_0x012d
            android.view.ViewGroup r1 = r0.e
            if (r1 != 0) goto L_0x0011
            android.view.ViewGroup r1 = r0.f
            if (r1 == 0) goto L_0x012d
        L_0x0011:
            boolean r1 = r0.b
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0042
            int r0 = r8.a
            r0 = r0 & r4
            if (r0 != r4) goto L_0x0041
            if (r11 != 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            if (r10 != 0) goto L_0x003a
            android.view.View r0 = r11.b
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            qz r1 = r8.b(r0, r3)
            qz r0 = r8.a(r0, r3)
            androidx.transition.Visibility$b r0 = b(r1, r0)
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x003a
            return r2
        L_0x003a:
            android.view.View r0 = r11.b
            android.animation.Animator r9 = r8.a(r9, r0, r10, r11)
            return r9
        L_0x0041:
            return r2
        L_0x0042:
            int r0 = r0.d
            int r1 = r8.a
            r5 = 2
            r1 = r1 & r5
            if (r1 != r5) goto L_0x012d
            if (r10 == 0) goto L_0x004f
            android.view.View r1 = r10.b
            goto L_0x0050
        L_0x004f:
            r1 = r2
        L_0x0050:
            if (r11 == 0) goto L_0x0055
            android.view.View r11 = r11.b
            goto L_0x0056
        L_0x0055:
            r11 = r2
        L_0x0056:
            if (r11 == 0) goto L_0x0073
            android.view.ViewParent r6 = r11.getParent()
            if (r6 != 0) goto L_0x005f
            goto L_0x0073
        L_0x005f:
            r6 = 4
            if (r0 != r6) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            if (r1 != r11) goto L_0x0068
        L_0x0065:
            r1 = r11
            r11 = r2
            goto L_0x00b6
        L_0x0068:
            android.view.ViewParent r11 = r1.getParent()
            android.view.View r11 = (android.view.View) r11
            android.view.View r11 = defpackage.qy.a(r9, r1, r11)
            goto L_0x0075
        L_0x0073:
            if (r11 == 0) goto L_0x0077
        L_0x0075:
            r1 = r2
            goto L_0x00b6
        L_0x0077:
            if (r1 == 0) goto L_0x00b4
            android.view.ViewParent r11 = r1.getParent()
            if (r11 != 0) goto L_0x0081
            r11 = r1
            goto L_0x0075
        L_0x0081:
            android.view.ViewParent r11 = r1.getParent()
            boolean r11 = r11 instanceof android.view.View
            if (r11 == 0) goto L_0x00b4
            android.view.ViewParent r11 = r1.getParent()
            android.view.View r11 = (android.view.View) r11
            qz r6 = r8.a(r11, r4)
            qz r7 = r8.b(r11, r4)
            androidx.transition.Visibility$b r6 = b(r6, r7)
            boolean r6 = r6.a
            if (r6 != 0) goto L_0x00a4
            android.view.View r11 = defpackage.qy.a(r9, r1, r11)
            goto L_0x0075
        L_0x00a4:
            android.view.ViewParent r1 = r11.getParent()
            if (r1 != 0) goto L_0x00b4
            int r11 = r11.getId()
            r1 = -1
            if (r11 == r1) goto L_0x00b4
            r9.findViewById(r11)
        L_0x00b4:
            r11 = r2
            r1 = r11
        L_0x00b6:
            if (r11 == 0) goto L_0x010b
            if (r10 == 0) goto L_0x010b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r0 = r0.get(r1)
            int[] r0 = (int[]) r0
            r1 = r0[r3]
            r0 = r0[r4]
            int[] r2 = new int[r5]
            r9.getLocationOnScreen(r2)
            r3 = r2[r3]
            int r1 = r1 - r3
            int r3 = r11.getLeft()
            int r1 = r1 - r3
            r11.offsetLeftAndRight(r1)
            r1 = r2[r4]
            int r0 = r0 - r1
            int r1 = r11.getTop()
            int r0 = r0 - r1
            r11.offsetTopAndBottom(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L_0x00ef
            rd r0 = new rd
            r0.<init>(r9)
            goto L_0x00f5
        L_0x00ef:
            ri r0 = defpackage.ri.c(r9)
            rc r0 = (defpackage.rc) r0
        L_0x00f5:
            r0.a(r11)
            android.animation.Animator r9 = r8.a(r9, r11, r10)
            if (r9 != 0) goto L_0x0102
            r0.b(r11)
            goto L_0x010a
        L_0x0102:
            androidx.transition.Visibility$1 r10 = new androidx.transition.Visibility$1
            r10.<init>(r0, r11)
            r9.addListener(r10)
        L_0x010a:
            return r9
        L_0x010b:
            if (r1 == 0) goto L_0x012d
            int r11 = r1.getVisibility()
            defpackage.rj.a(r1, r3)
            android.animation.Animator r9 = r8.a(r9, r1, r10)
            if (r9 == 0) goto L_0x0129
            androidx.transition.Visibility$a r10 = new androidx.transition.Visibility$a
            r10.<init>(r1, r0, r4)
            r9.addListener(r10)
            defpackage.qf.a(r9, r10)
            r8.a(r10)
            goto L_0x012c
        L_0x0129:
            defpackage.rj.a(r1, r11)
        L_0x012c:
            return r9
        L_0x012d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.a(android.view.ViewGroup, qz, qz):android.animation.Animator");
    }

    public void a(qz qzVar) {
        d(qzVar);
    }

    public final boolean a(qz qzVar, qz qzVar2) {
        if (qzVar == null && qzVar2 == null) {
            return false;
        }
        if (!(qzVar == null || qzVar2 == null)) {
            String str = "android:visibility:visibility";
            if (qzVar2.a.containsKey(str) != qzVar.a.containsKey(str)) {
                return false;
            }
        }
        b b2 = b(qzVar, qzVar2);
        return b2.a && (b2.c == 0 || b2.d == 0);
    }

    public final String[] a() {
        return m;
    }

    public final void b(int i) {
        if ((i & -4) == 0) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public void b(qz qzVar) {
        d(qzVar);
    }
}