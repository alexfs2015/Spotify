package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
import com.spotify.music.R;

public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int a(View view) {
        while (true) {
            int m = ip.m(view);
            if (m <= 0) {
                if (!(view instanceof ViewGroup)) {
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() != 1) {
                    break;
                }
                view = viewGroup.getChildAt(0);
            } else {
                return m;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.g
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L_0x0037
            r4 = 80
            if (r3 == r4) goto L_0x002e
            int r12 = r9.getPaddingTop()
            goto L_0x0041
        L_0x002e:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L_0x0041
        L_0x0037:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r3 + r14
        L_0x0041:
            android.graphics.drawable.Drawable r14 = r9.h
            r0 = 0
            if (r14 != 0) goto L_0x0048
            r14 = 0
            goto L_0x004c
        L_0x0048:
            int r14 = r14.getIntrinsicHeight()
        L_0x004c:
            if (r0 >= r1) goto L_0x00aa
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto L_0x00a7
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x00a7
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r6 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r6
            int r7 = r6.h
            if (r7 >= 0) goto L_0x006f
            r7 = r2
        L_0x006f:
            int r8 = defpackage.ip.f(r9)
            int r7 = defpackage.hx.a(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L_0x0088
            r8 = 5
            if (r7 == r8) goto L_0x0083
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L_0x0093
        L_0x0083:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
            goto L_0x0092
        L_0x0088:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
        L_0x0092:
            int r7 = r7 - r8
        L_0x0093:
            boolean r8 = r9.b(r0)
            if (r8 == 0) goto L_0x009a
            int r12 = r12 + r14
        L_0x009a:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r12 = r12 + r5
        L_0x00a7:
            int r0 = r0 + 1
            goto L_0x004c
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int childCount = getChildCount();
        boolean z = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        int i9 = 0;
        while (true) {
            if (i9 < childCount) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.topPanel) {
                        view = childAt;
                    } else if (id == R.id.buttonPanel) {
                        view2 = childAt;
                    } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i9++;
            } else {
                int mode = MeasureSpec.getMode(i2);
                int size = MeasureSpec.getSize(i2);
                int mode2 = MeasureSpec.getMode(i);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (view != null) {
                    view.measure(i8, 0);
                    paddingTop += view.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i3 = 0;
                }
                if (view2 != null) {
                    view2.measure(i8, 0);
                    i5 = a(view2);
                    i4 = view2.getMeasuredHeight() - i5;
                    paddingTop += i5;
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (view3 != null) {
                    if (mode == 0) {
                        i7 = 0;
                    } else {
                        i7 = MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
                    }
                    view3.measure(i8, i7);
                    i6 = view3.getMeasuredHeight();
                    paddingTop += i6;
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                } else {
                    i6 = 0;
                }
                int i10 = size - paddingTop;
                if (view2 != null) {
                    int i11 = paddingTop - i5;
                    int min = Math.min(i10, i4);
                    if (min > 0) {
                        i10 -= min;
                        i5 += min;
                    }
                    view2.measure(i8, MeasureSpec.makeMeasureSpec(i5, 1073741824));
                    paddingTop = i11 + view2.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                }
                if (view3 != null && i10 > 0) {
                    int i12 = paddingTop - i6;
                    view3.measure(i8, MeasureSpec.makeMeasureSpec(i6 + i10, mode));
                    paddingTop = i12 + view3.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                }
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2.getVisibility() != 8) {
                        i13 = Math.max(i13, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i13 + getPaddingLeft() + getPaddingRight(), i8, i3), View.resolveSizeAndState(paddingTop, i2, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt3 = getChildAt(i15);
                        if (childAt3.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                            if (layoutParams.width == -1) {
                                int i16 = layoutParams.height;
                                layoutParams.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                                layoutParams.height = i16;
                            }
                        }
                    }
                }
                z = true;
            }
        }
        int i17 = i2;
        if (!z) {
            super.onMeasure(i, i2);
        }
    }
}
