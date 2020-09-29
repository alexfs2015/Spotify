package com.spotify.mobile.android.ui.view.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class SnackBar extends ViewGroup {
    public static final b d = new b() {
        public final void onAnimationFrame(View view, float f) {
        }
    };
    public final List<SnackItem> a = Lists.a();
    public int b;
    public b c = d;
    private final BitSet e = new BitSet();
    private boolean f;
    private jtz g = new jtp();
    private final TimeInterpolator h = fuh.d;
    private long i;
    private Optional<Integer> j = Optional.e();
    private SnackAnimation k = SnackAnimation.BOTTOM_TO_TOP;
    private final List<c> l = new ArrayList(4);
    private boolean m;

    public enum SnackAnimation {
        BOTTOM_TO_TOP {
            /* access modifiers changed from: 0000 */
            public final void a(SnackBar snackBar, View view, float f) {
                SnackBar.a(snackBar, view, f, 1);
            }
        },
        TOP_TO_BOTTOM {
            /* access modifiers changed from: 0000 */
            public final void a(SnackBar snackBar, View view, float f) {
                SnackBar.a(snackBar, view, f, -1);
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract void a(SnackBar snackBar, View view, float f);
    }

    static class a extends BaseSavedState {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, 0);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        boolean[] a;

        private a(Parcel parcel) {
            super(parcel);
            this.a = new boolean[parcel.readInt()];
            parcel.readBooleanArray(this.a);
        }

        /* synthetic */ a(Parcel parcel, byte b) {
            this(parcel);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a.length);
            parcel.writeBooleanArray(this.a);
        }
    }

    public interface b {
        void onAnimationFrame(View view, float f);
    }

    public interface c {
        void a();

        void b();
    }

    public SnackBar(Context context) {
        super(context);
    }

    public SnackBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SnackBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    private void a(int i2) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(i2);
        addView(frameLayout);
        setBackgroundColor(0);
        frameLayout.setVisibility(8);
        frameLayout.setTag(Integer.valueOf(this.a.size() - 1));
    }

    static /* synthetic */ void a(SnackBar snackBar, View view, float f2, int i2) {
        int i3;
        fbp.b(snackBar.j.b());
        int intValue = ((Integer) snackBar.j.c()).intValue();
        boolean aF_ = ((SnackItem) snackBar.a.get(intValue)).aF_();
        int measuredHeight = snackBar.getChildAt(intValue).getMeasuredHeight();
        float interpolation = snackBar.h.getInterpolation(f2);
        int i4 = 0;
        if (aF_) {
            i3 = i2 * measuredHeight;
        } else {
            int i5 = i2 * measuredHeight;
            int i6 = i5;
            i4 = i5;
            i3 = 0;
        }
        float f3 = ((float) i3) + (((float) (i4 - i3)) * interpolation);
        view.setTranslationY(f3);
        snackBar.c.onAnimationFrame(view, f3);
    }

    private ViewGroup b(int i2) {
        return (ViewGroup) getChildAt(i2);
    }

    private boolean b() {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            z2 |= this.e.get(i2);
            z3 |= ((SnackItem) this.a.get(i2)).aF_();
        }
        if (!z2 && z3) {
            z = true;
        }
        return z;
    }

    private boolean c(int i2) {
        return this.j.b() && i2 == ((Integer) this.j.c()).intValue();
    }

    public void a() {
        if (b()) {
            for (c b2 : this.l) {
                b2.b();
            }
        }
        if (!this.f) {
            requestLayout();
            this.f = true;
        }
    }

    public final void a(SnackAnimation snackAnimation) {
        this.k = (SnackAnimation) fbp.a(snackAnimation);
    }

    public final void a(c cVar) {
        this.l.add(cVar);
    }

    public final void a(SnackItem snackItem) {
        this.a.add(snackItem);
        a(snackItem.a());
        int size = this.a.size() - 1;
        snackItem.a(b(size));
        if (snackItem.aF_()) {
            this.e.set(size);
            if (this.a.size() == 1) {
                for (c b2 : this.l) {
                    b2.b();
                }
            }
        } else {
            this.e.clear(size);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        if (this.j.b()) {
            int intValue = ((Integer) this.j.c()).intValue();
            boolean aF_ = ((SnackItem) this.a.get(intValue)).aF_();
            if (this.i == 0) {
                this.i = this.g.d();
            }
            float d2 = ((float) (this.g.d() - this.i)) / 400.0f;
            float f2 = 1.0f;
            boolean z2 = false;
            if (d2 > 1.0f) {
                z = true;
            } else {
                ip.d(this);
                float f3 = d2;
                f2 = d2;
                z = false;
            }
            int i2 = intValue;
            for (int i3 = intValue; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    this.k.a(this, childAt, f2);
                }
            }
            if (z) {
                this.i = 0;
                this.j = Optional.e();
                if (aF_) {
                    this.e.set(intValue);
                } else {
                    this.e.clear(intValue);
                }
                a();
                for (SnackItem aF_2 : this.a) {
                    z2 |= aF_2.aF_();
                }
                if (!z2) {
                    for (c a2 : this.l) {
                        a2.a();
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r3 = 0
            r1 = 3
            r4 = 0
            r5 = 0
            r1 = r5
        L_0x0005:
            java.util.List<com.spotify.mobile.android.ui.view.snackbar.SnackItem> r6 = r2.a
            int r6 = r6.size()
            r1 = 2
            if (r4 >= r6) goto L_0x004a
            android.view.ViewGroup r6 = r2.b(r4)
            r1 = 2
            java.util.BitSet r7 = r2.e
            boolean r7 = r7.get(r4)
            r1 = 0
            if (r7 != 0) goto L_0x002a
            r1 = 7
            boolean r7 = r2.c(r4)
            r1 = 5
            if (r7 == 0) goto L_0x0026
            r1 = 7
            goto L_0x002a
        L_0x0026:
            r1 = 5
            r7 = 0
            r1 = 3
            goto L_0x002c
        L_0x002a:
            r1 = 5
            r7 = 1
        L_0x002c:
            r1 = 3
            if (r7 == 0) goto L_0x0045
            r1 = 7
            int r7 = r6.getMeasuredHeight()
            r1 = 4
            int r0 = r2.getMeasuredWidth()
            int r7 = r7 + r5
            r1 = 7
            r6.layout(r3, r5, r0, r7)
            r1 = 2
            r5 = 0
            r1 = 5
            r6.setTranslationY(r5)
            r5 = r7
        L_0x0045:
            r1 = 1
            int r4 = r4 + 1
            r1 = 4
            goto L_0x0005
        L_0x004a:
            r1 = 7
            boolean r4 = r2.m
            r1 = 3
            if (r4 == 0) goto L_0x0053
            defpackage.ip.d(r2)
        L_0x0053:
            r2.f = r3
            r1 = 1
            r2.m = r3
            r1 = 7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.ui.view.snackbar.SnackBar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        Optional<Integer> optional;
        int i4;
        fbp.b(getChildCount() == this.a.size());
        this.b = 0;
        if (this.j.b()) {
            optional = this.j;
        } else {
            int i5 = 0;
            while (true) {
                if (i5 >= this.a.size()) {
                    i5 = -1;
                    break;
                }
                boolean z = this.e.get(i5);
                boolean aF_ = ((SnackItem) this.a.get(i5)).aF_();
                if (z && !aF_) {
                    break;
                }
                i5++;
            }
            if (i4 == -1) {
                i4 = 0;
                while (true) {
                    if (i4 >= this.a.size()) {
                        i4 = -1;
                        break;
                    }
                    boolean z2 = this.e.get(i4);
                    boolean aF_2 = ((SnackItem) this.a.get(i4)).aF_();
                    if (!z2 && aF_2) {
                        break;
                    }
                    i4++;
                }
            }
            optional = i4 != -1 ? Optional.b(Integer.valueOf(i4)) : Optional.e();
        }
        this.j = optional;
        this.m = this.j.b();
        boolean z3 = true | false;
        int i6 = 0;
        for (int i7 = 0; i7 < this.a.size(); i7++) {
            ViewGroup b2 = b(i7);
            b2.measure(i2, MeasureSpec.makeMeasureSpec(0, 0));
            b2.setLayerType(0, null);
            if (this.e.get(i7) || c(i7)) {
                b2.setVisibility(0);
                i6 += b2.getMeasuredHeight();
            } else {
                b2.setVisibility(8);
            }
            if (this.e.get(i7) && !c(i7)) {
                this.b += b2.getMeasuredHeight();
            }
        }
        setMeasuredDimension(MeasureSpec.getSize(i2), i6);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        boolean[] zArr = aVar.a;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            SnackItem snackItem = (SnackItem) this.a.get(i2);
            boolean z = zArr[i2];
            snackItem.a(z);
            if (z) {
                this.e.set(i2);
            } else {
                this.e.clear(i2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        boolean[] zArr = new boolean[this.a.size()];
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            zArr[i2] = ((SnackItem) this.a.get(i2)).aF_();
        }
        aVar.a = zArr;
        return aVar;
    }
}
