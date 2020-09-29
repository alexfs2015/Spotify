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
    public b c;
    private final BitSet e = new BitSet();
    private boolean f;
    private final jrp g;
    private final TimeInterpolator h;
    private long i;
    private Optional<Integer> j;
    private SnackAnimation k;
    private final List<c> l;
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
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, 0);
            }
        };
        boolean[] a;

        /* synthetic */ a(Parcel parcel, byte b) {
            this(parcel);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        private a(Parcel parcel) {
            super(parcel);
            this.a = new boolean[parcel.readInt()];
            parcel.readBooleanArray(this.a);
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
        ggw.a(gbd.class);
        this.g = gbd.a();
        this.h = ftn.d;
        this.j = Optional.e();
        this.k = SnackAnimation.BOTTOM_TO_TOP;
        this.l = new ArrayList(4);
        this.c = d;
    }

    public SnackBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ggw.a(gbd.class);
        this.g = gbd.a();
        this.h = ftn.d;
        this.j = Optional.e();
        this.k = SnackAnimation.BOTTOM_TO_TOP;
        this.l = new ArrayList(4);
        this.c = d;
    }

    public SnackBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        ggw.a(gbd.class);
        this.g = gbd.a();
        this.h = ftn.d;
        this.j = Optional.e();
        this.k = SnackAnimation.BOTTOM_TO_TOP;
        this.l = new ArrayList(4);
        this.c = d;
    }

    public final void a(SnackAnimation snackAnimation) {
        this.k = (SnackAnimation) fay.a(snackAnimation);
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

    private void a(int i2) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(i2);
        addView(frameLayout);
        setBackgroundColor(0);
        frameLayout.setVisibility(8);
        frameLayout.setTag(Integer.valueOf(this.a.size() - 1));
    }

    public final void a(SnackItem snackItem) {
        this.a.add(snackItem);
        a(snackItem.a());
        int size = this.a.size() - 1;
        snackItem.a(b(size));
        if (snackItem.aH_()) {
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

    private ViewGroup b(int i2) {
        return (ViewGroup) getChildAt(i2);
    }

    private boolean b() {
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            z |= this.e.get(i2);
            z2 |= ((SnackItem) this.a.get(i2)).aH_();
        }
        if (z || !z2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        Optional<Integer> optional;
        int i4;
        fay.b(getChildCount() == this.a.size());
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
                boolean aH_ = ((SnackItem) this.a.get(i5)).aH_();
                if (z && !aH_) {
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
                    boolean aH_2 = ((SnackItem) this.a.get(i4)).aH_();
                    if (!z2 && aH_2) {
                        break;
                    }
                    i4++;
                }
            }
            if (i4 != -1) {
                optional = Optional.b(Integer.valueOf(i4));
            } else {
                optional = Optional.e();
            }
        }
        this.j = optional;
        this.m = this.j.b();
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

    private boolean c(int i2) {
        return this.j.b() && i2 == ((Integer) this.j.c()).intValue();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < this.a.size(); i7++) {
            ViewGroup b2 = b(i7);
            if (this.e.get(i7) || c(i7)) {
                int measuredHeight = b2.getMeasuredHeight() + i6;
                b2.layout(0, i6, getMeasuredWidth(), measuredHeight);
                b2.setTranslationY(0.0f);
                i6 = measuredHeight;
            }
        }
        if (this.m) {
            ip.d(this);
        }
        this.f = false;
        this.m = false;
    }

    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        boolean[] zArr = new boolean[this.a.size()];
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            zArr[i2] = ((SnackItem) this.a.get(i2)).aH_();
        }
        aVar.a = zArr;
        return aVar;
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

    public final void a(c cVar) {
        this.l.add(cVar);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        if (this.j.b()) {
            int intValue = ((Integer) this.j.c()).intValue();
            boolean aH_ = ((SnackItem) this.a.get(intValue)).aH_();
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
                f2 = d2;
                z = false;
            }
            for (int i2 = intValue; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    this.k.a(this, childAt, f2);
                }
            }
            if (z) {
                this.i = 0;
                this.j = Optional.e();
                if (aH_) {
                    this.e.set(intValue);
                } else {
                    this.e.clear(intValue);
                }
                a();
                for (SnackItem aH_2 : this.a) {
                    z2 |= aH_2.aH_();
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

    static /* synthetic */ void a(SnackBar snackBar, View view, float f2, int i2) {
        int i3;
        fay.b(snackBar.j.b());
        int intValue = ((Integer) snackBar.j.c()).intValue();
        boolean aH_ = ((SnackItem) snackBar.a.get(intValue)).aH_();
        int measuredHeight = snackBar.getChildAt(intValue).getMeasuredHeight();
        float interpolation = snackBar.h.getInterpolation(f2);
        int i4 = 0;
        if (aH_) {
            i3 = i2 * measuredHeight;
        } else {
            i4 = i2 * measuredHeight;
            i3 = 0;
        }
        float f3 = ((float) i3) + (((float) (i4 - i3)) * interpolation);
        view.setTranslationY(f3);
        snackBar.c.onAnimationFrame(view, f3);
    }
}
