package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@androidx.coordinatorlayout.widget.CoordinatorLayout.b(a = Behavior.class)
public class AppBarLayout extends LinearLayout {
    boolean a;
    int b;
    iw c;
    boolean d;
    private int e;
    private int f;
    private int g;
    private List<a> h;
    private boolean i;
    private boolean j;
    private int[] k;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        /* access modifiers changed from: private */
        public int b;
        private int c;
        private ValueAnimator d;
        private int e = -1;
        private boolean f;
        private float g;
        private WeakReference<View> h;
        private a i;

        public static abstract class a<T extends AppBarLayout> {
        }

        public static class b extends jt {
            public static final Creator<b> CREATOR = new ClassLoaderCreator<b>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new b[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
                }
            };
            int a;
            float b;
            boolean e;

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.a = parcel.readInt();
                this.b = parcel.readFloat();
                this.e = parcel.readByte() != 0;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.a);
                parcel.writeFloat(this.b);
                parcel.writeByte(this.e ? (byte) 1 : 0);
            }
        }

        private static boolean a(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ int a(View view) {
            return ((AppBarLayout) view).b();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ int a(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                r2 = r9
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                int r9 = r7.a()
                r0 = 0
                if (r11 == 0) goto L_0x00ae
                if (r9 < r11) goto L_0x00ae
                if (r9 > r12) goto L_0x00ae
                int r3 = defpackage.gw.a(r10, r11, r12)
                if (r9 == r3) goto L_0x00b0
                boolean r10 = r2.a
                if (r10 == 0) goto L_0x0085
                int r10 = java.lang.Math.abs(r3)
                int r11 = r2.getChildCount()
                r12 = 0
            L_0x0021:
                if (r12 >= r11) goto L_0x0085
                android.view.View r1 = r2.getChildAt(r12)
                android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
                android.view.animation.Interpolator r5 = r4.b
                int r6 = r1.getTop()
                if (r10 < r6) goto L_0x0082
                int r6 = r1.getBottom()
                if (r10 > r6) goto L_0x0082
                if (r5 == 0) goto L_0x0085
                int r11 = r4.a
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0057
                int r12 = r1.getHeight()
                int r6 = r4.topMargin
                int r12 = r12 + r6
                int r4 = r4.bottomMargin
                int r12 = r12 + r4
                int r0 = r0 + r12
                r11 = r11 & 2
                if (r11 == 0) goto L_0x0057
                int r11 = defpackage.ip.m(r1)
                int r0 = r0 - r11
            L_0x0057:
                boolean r11 = defpackage.ip.t(r1)
                if (r11 == 0) goto L_0x0062
                int r11 = r2.f()
                int r0 = r0 - r11
            L_0x0062:
                if (r0 <= 0) goto L_0x0085
                int r11 = r1.getTop()
                int r10 = r10 - r11
                float r11 = (float) r0
                float r10 = (float) r10
                float r10 = r10 / r11
                float r10 = r5.getInterpolation(r10)
                float r11 = r11 * r10
                int r10 = java.lang.Math.round(r11)
                int r11 = java.lang.Integer.signum(r3)
                int r12 = r1.getTop()
                int r12 = r12 + r10
                int r10 = r11 * r12
                goto L_0x0086
            L_0x0082:
                int r12 = r12 + 1
                goto L_0x0021
            L_0x0085:
                r10 = r3
            L_0x0086:
                boolean r11 = r7.b(r10)
                int r12 = r9 - r3
                int r10 = r3 - r10
                r7.b = r10
                if (r11 != 0) goto L_0x0099
                boolean r10 = r2.a
                if (r10 == 0) goto L_0x0099
                r8.a(r2)
            L_0x0099:
                int r10 = r7.b()
                r2.a(r10)
                if (r3 >= r9) goto L_0x00a5
                r9 = -1
                r4 = -1
                goto L_0x00a7
            L_0x00a5:
                r9 = 1
                r4 = 1
            L_0x00a7:
                r5 = 0
                r0 = r7
                r1 = r8
                r0.a(r1, (T) r2, r3, r4, r5)
                goto L_0x00b1
            L_0x00ae:
                r7.b = r0
            L_0x00b0:
                r12 = 0
            L_0x00b1:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ int b(View view) {
            return -((AppBarLayout) view).d();
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ boolean c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.i != null) {
                return false;
            }
            WeakReference<View> weakReference = this.h;
            if (weakReference != null) {
                View view2 = (View) weakReference.get();
                if (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            return true;
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int[] iArr, int i4) {
            int i5;
            int i6;
            if (i3 != 0) {
                if (i3 < 0) {
                    int i7 = -t.b();
                    i6 = i7;
                    i5 = t.c() + i7;
                } else {
                    i6 = -t.b();
                    i5 = 0;
                }
                if (i6 != i5) {
                    iArr[1] = b(coordinatorLayout, t, i3, i6, i5);
                    a(i3, t, view, i4);
                }
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int i4, int i5, int i6) {
            if (i5 < 0) {
                b(coordinatorLayout, t, i5, -t.d(), 0);
                a(i5, t, view, i6);
            }
            if (t.d) {
                t.a(view.getScrollY() > 0);
            }
        }

        private void a(int i2, T t, View view, int i3) {
            if (i3 == 1) {
                int a2 = a();
                if ((i2 < 0 && a2 == 0) || (i2 > 0 && a2 == (-t.d()))) {
                    ip.e(view, 1);
                }
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i2) {
            if (this.c == 0 || i2 == 1) {
                b(coordinatorLayout, t);
            }
            this.h = new WeakReference<>(view);
        }

        public void a(a aVar) {
            this.i = aVar;
        }

        private void a(final CoordinatorLayout coordinatorLayout, final T t, int i2, float f2) {
            int i3;
            int abs = Math.abs(a() - i2);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                i3 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i3 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            int a2 = a();
            if (a2 == i2) {
                ValueAnimator valueAnimator = this.d;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.d.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 == null) {
                this.d = new ValueAnimator();
                this.d.setInterpolator(eyd.e);
                this.d.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseBehavior.this.a_(coordinatorLayout, t, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.d.setDuration((long) Math.min(i3, 600));
            this.d.setIntValues(new int[]{a2, i2});
            this.d.start();
        }

        private static int a(T t, int i2) {
            int childCount = t.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = t.getChildAt(i3);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (a(layoutParams.a, 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i4 = -i2;
                if (top <= i4 && bottom >= i4) {
                    return i3;
                }
            }
            return -1;
        }

        /* access modifiers changed from: private */
        public void b(CoordinatorLayout coordinatorLayout, T t) {
            int a2 = a();
            int a3 = a(t, a2);
            if (a3 >= 0) {
                View childAt = t.getChildAt(a3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i2 = layoutParams.a;
                if ((i2 & 17) == 17) {
                    int i3 = -childAt.getTop();
                    int i4 = -childAt.getBottom();
                    if (a3 == t.getChildCount() - 1) {
                        i4 += t.f();
                    }
                    if (a(i2, 2)) {
                        i4 += ip.m(childAt);
                    } else if (a(i2, 5)) {
                        int m = ip.m(childAt) + i4;
                        if (a2 < m) {
                            i3 = m;
                        } else {
                            i4 = m;
                        }
                    }
                    if (a(i2, 32)) {
                        i3 += layoutParams.topMargin;
                        i4 -= layoutParams.bottomMargin;
                    }
                    if (a2 < (i4 + i3) / 2) {
                        i3 = i4;
                    }
                    a(coordinatorLayout, t, gw.a(i3, -t.b(), 0), 0.0f);
                }
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4, int i5) {
            if (((d) t.getLayoutParams()).height != -2) {
                return super.a(coordinatorLayout, t, i2, i3, i4, i5);
            }
            coordinatorLayout.a((View) t, i2, i3, MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i2) {
            int i3;
            boolean a2 = super.a(coordinatorLayout, t, i2);
            int i4 = t.b;
            int i5 = this.e;
            if (i5 >= 0 && (i4 & 8) == 0) {
                View childAt = t.getChildAt(i5);
                int i6 = -childAt.getBottom();
                if (this.f) {
                    i3 = ip.m(childAt) + t.f();
                } else {
                    i3 = Math.round(((float) childAt.getHeight()) * this.g);
                }
                a_(coordinatorLayout, t, i6 + i3);
            } else if (i4 != 0) {
                boolean z = (i4 & 4) != 0;
                if ((i4 & 2) != 0) {
                    int i7 = -t.b();
                    if (z) {
                        a(coordinatorLayout, t, i7, 0.0f);
                    } else {
                        a_(coordinatorLayout, t, i7);
                    }
                } else if ((i4 & 1) != 0) {
                    if (z) {
                        a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        a_(coordinatorLayout, t, 0);
                    }
                }
            }
            t.b = 0;
            this.e = -1;
            b(gw.a(b(), -t.b(), 0));
            a(coordinatorLayout, t, b(), 0, true);
            t.a(b());
            return a2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
                android.view.View r0 = b(r7, r8)
                if (r0 == 0) goto L_0x006a
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
                int r1 = r1.a
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003f
                int r2 = defpackage.ip.m(r0)
                if (r9 <= 0) goto L_0x002d
                r9 = r1 & 12
                if (r9 == 0) goto L_0x002d
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.f()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x003f
            L_0x002b:
                r8 = 1
                goto L_0x0040
            L_0x002d:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x003f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.f()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x003f
                goto L_0x002b
            L_0x003f:
                r8 = 0
            L_0x0040:
                boolean r9 = r7.d
                if (r9 == 0) goto L_0x0053
                android.view.View r9 = a(r6)
                if (r9 == 0) goto L_0x0053
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L_0x0052
                r8 = 1
                goto L_0x0053
            L_0x0052:
                r8 = 0
            L_0x0053:
                boolean r8 = r7.a(r8)
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r9 < r0) goto L_0x006a
                if (r10 != 0) goto L_0x0067
                if (r8 == 0) goto L_0x006a
                boolean r6 = c(r6, r7)
                if (r6 == 0) goto L_0x006a
            L_0x0067:
                r7.jumpDrawablesToCurrentState()
            L_0x006a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        private static boolean c(CoordinatorLayout coordinatorLayout, T t) {
            List c2 = coordinatorLayout.c((View) t);
            int size = c2.size();
            int i2 = 0;
            while (i2 < size) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((d) ((View) c2.get(i2)).getLayoutParams()).a;
                if (!(behavior instanceof ScrollingViewBehavior)) {
                    i2++;
                } else if (((ScrollingViewBehavior) behavior).c != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        private static View b(AppBarLayout appBarLayout, int i2) {
            int abs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private static View a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt instanceof id) {
                    return childAt;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final int a() {
            return b() + this.b;
        }

        public Parcelable a(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable a2 = super.a(coordinatorLayout, t);
            int b2 = b();
            int childCount = t.getChildCount();
            boolean z = false;
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = t.getChildAt(i2);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 > 0 || bottom < 0) {
                    i2++;
                } else {
                    b bVar = new b(a2);
                    bVar.a = i2;
                    if (bottom == ip.m(childAt) + t.f()) {
                        z = true;
                    }
                    bVar.e = z;
                    bVar.b = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return a2;
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof b) {
                b bVar = (b) parcelable;
                super.a(coordinatorLayout, t, bVar.d);
                this.e = bVar.a;
                this.g = bVar.b;
                this.f = bVar.e;
                return;
            }
            super.a(coordinatorLayout, t, parcelable);
            this.e = -1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (((r3.b() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002a
                boolean r5 = r3.d
                if (r5 != 0) goto L_0x002b
                int r5 = r3.b()
                if (r5 == 0) goto L_0x0012
                r5 = 1
                goto L_0x0013
            L_0x0012:
                r5 = 0
            L_0x0013:
                if (r5 == 0) goto L_0x0026
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                if (r2 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r6 = 0
            L_0x002b:
                if (r6 == 0) goto L_0x0034
                android.animation.ValueAnimator r2 = r1.d
                if (r2 == 0) goto L_0x0034
                r2.cancel()
            L_0x0034:
                r2 = 0
                r1.h = r2
                r1.c = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class a extends a<AppBarLayout> {
        }

        public final /* bridge */ /* synthetic */ Parcelable a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.a(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.a(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.a(coordinatorLayout, appBarLayout, view, i);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            super.a(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        public final /* bridge */ /* synthetic */ void a(a aVar) {
            super.a(aVar);
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.a(coordinatorLayout, appBarLayout, i);
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.a(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        public final /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public final /* bridge */ /* synthetic */ boolean b(int i) {
            return super.b(i);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public int a = 1;
        Interpolator b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eyc.a.h);
            this.a = obtainStyledAttributes.getInt(defpackage.eyc.a.i, 0);
            if (obtainStyledAttributes.hasValue(defpackage.eyc.a.j)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(defpackage.eyc.a.j, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(-1, -2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        /* access modifiers changed from: 0000 */
        public final /* synthetic */ View a(List list) {
            return b(list);
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.a(coordinatorLayout, view, i);
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, view, i, i2, i3, i4);
        }

        public final /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public final /* bridge */ /* synthetic */ boolean b(int i) {
            return super.b(i);
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eyc.a.bX);
            this.c = obtainStyledAttributes.getDimensionPixelSize(defpackage.eyc.a.bY, 0);
            obtainStyledAttributes.recycle();
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = b(coordinatorLayout.b(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b.a(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final float a(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int b = appBarLayout.b();
                int c = appBarLayout.c();
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((d) appBarLayout.getLayoutParams()).a;
                int a = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).a() : 0;
                if (c != 0 && b + a <= c) {
                    return 0.0f;
                }
                int i = b - c;
                if (i != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static AppBarLayout b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final int b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).b();
            }
            return super.b(view);
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((d) view2.getLayoutParams()).a;
            if (behavior instanceof BaseBehavior) {
                ip.f(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).b) + this.b) - c(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.d) {
                    appBarLayout.a(view.getScrollY() > 0);
                }
            }
            return false;
        }
    }

    public interface a<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    public interface b extends a<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.b = 0;
        setOrientation(1);
        if (VERSION.SDK_INT >= 21) {
            eyo.a(this);
            eyo.a(this, attributeSet, 0, 2132017899);
        }
        TypedArray a2 = ezs.a(context, attributeSet, defpackage.eyc.a.a, 0, 2132017899, new int[0]);
        ip.a((View) this, a2.getDrawable(defpackage.eyc.a.b));
        if (a2.hasValue(defpackage.eyc.a.f)) {
            a(a2.getBoolean(defpackage.eyc.a.f, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && a2.hasValue(defpackage.eyc.a.e)) {
            eyo.a(this, (float) a2.getDimensionPixelSize(defpackage.eyc.a.e, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (a2.hasValue(defpackage.eyc.a.d)) {
                setKeyboardNavigationCluster(a2.getBoolean(defpackage.eyc.a.d, false));
            }
            if (a2.hasValue(defpackage.eyc.a.c)) {
                setTouchscreenBlocksFocus(a2.getBoolean(defpackage.eyc.a.c, false));
            }
        }
        this.d = a2.getBoolean(defpackage.eyc.a.g, false);
        a2.recycle();
        ip.a((View) this, (il) new il() {
            public final iw onApplyWindowInsets(View view, iw iwVar) {
                AppBarLayout appBarLayout = AppBarLayout.this;
                iw iwVar2 = ip.t(appBarLayout) ? iwVar : null;
                if (!hn.a(appBarLayout.c, iwVar2)) {
                    appBarLayout.c = iwVar2;
                    appBarLayout.a();
                }
                return iwVar;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r3 != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r1.a()
            r2 = 0
            r1.a = r2
            int r3 = r1.getChildCount()
            r4 = 0
        L_0x000e:
            r5 = 1
            if (r4 >= r3) goto L_0x0025
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r6 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r6
            android.view.animation.Interpolator r6 = r6.b
            if (r6 == 0) goto L_0x0022
            r1.a = r5
            goto L_0x0025
        L_0x0022:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0025:
            boolean r3 = r1.d
            if (r3 != 0) goto L_0x0052
            int r3 = r1.getChildCount()
            r4 = 0
        L_0x002e:
            if (r4 >= r3) goto L_0x004f
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r6 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r6
            int r0 = r6.a
            r0 = r0 & r5
            if (r0 != r5) goto L_0x0047
            int r6 = r6.a
            r6 = r6 & 10
            if (r6 == 0) goto L_0x0047
            r6 = 1
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            if (r6 == 0) goto L_0x004c
            r3 = 1
            goto L_0x0050
        L_0x004c:
            int r4 = r4 + 1
            goto L_0x002e
        L_0x004f:
            r3 = 0
        L_0x0050:
            if (r3 == 0) goto L_0x0053
        L_0x0052:
            r2 = 1
        L_0x0053:
            boolean r3 = r1.i
            if (r3 == r2) goto L_0x005c
            r1.i = r2
            r1.refreshDrawableState()
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.e = -1;
        this.f = -1;
        this.g = -1;
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void a(boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i2 = 8;
        }
        this.b = i3 | i2;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    private static LayoutParams g() {
        return new LayoutParams(-1, -2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private static LayoutParams a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
            return new LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public final int b() {
        int i2 = this.e;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = layoutParams.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((i5 & 2) != 0) {
                i4 -= ip.m(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4 - f());
        this.e = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public final int c() {
        int i2;
        int i3 = this.f;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = layoutParams.a;
            if ((i5 & 5) != 5) {
                if (i4 > 0) {
                    break;
                }
            } else {
                int i6 = i4 + layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i5 & 8) != 0) {
                    i4 = i6 + ip.m(childAt);
                } else {
                    if ((i5 & 2) != 0) {
                        i2 = ip.m(childAt);
                    } else {
                        i2 = f();
                    }
                    i4 = i6 + (measuredHeight - i2);
                }
            }
        }
        int max = Math.max(0, i4);
        this.f = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public final int d() {
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i5 = layoutParams.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= ip.m(childAt) + f();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.g = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        List<a> list = this.h;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = (a) this.h.get(i3);
                if (aVar != null) {
                    aVar.onOffsetChanged(this, i2);
                }
            }
        }
    }

    public final int e() {
        int f2 = f();
        int m = ip.m(this);
        if (m == 0) {
            int childCount = getChildCount();
            m = childCount > 0 ? ip.m(getChildAt(childCount - 1)) : 0;
            if (m == 0) {
                return getHeight() / 3;
            }
        }
        return (m << 1) + f2;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        if (this.k == null) {
            this.k = new int[4];
        }
        int[] iArr = this.k;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        iArr[0] = this.i ? R.attr.state_liftable : -2130969404;
        iArr[1] = (!this.i || !this.j) ? -2130969405 : R.attr.state_lifted;
        iArr[2] = this.i ? R.attr.state_collapsible : -2130969403;
        iArr[3] = (!this.i || !this.j) ? -2130969402 : R.attr.state_collapsed;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(boolean z) {
        if (this.j == z) {
            return false;
        }
        this.j = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final int f() {
        iw iwVar = this.c;
        if (iwVar != null) {
            return iwVar.b();
        }
        return 0;
    }

    public final void a(b bVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (bVar != null && !this.h.contains(bVar)) {
            this.h.add(bVar);
        }
    }

    public final void b(b bVar) {
        List<a> list = this.h;
        if (list != null && bVar != null) {
            list.remove(bVar);
        }
    }
}
