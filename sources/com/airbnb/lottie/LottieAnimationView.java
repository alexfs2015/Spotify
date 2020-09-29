package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LottieAnimationView extends AppCompatImageView {
    public final xq a = new xq();
    private final xs<xo> b = new xs<xo>() {
        public final /* bridge */ /* synthetic */ void a(Object obj) {
            LottieAnimationView.this.a((xo) obj);
        }
    };
    private final xs<Throwable> c = new xs<Throwable>() {
        public final /* synthetic */ void a(Object obj) {
            throw new IllegalStateException("Unable to parse composition", (Throwable) obj);
        }
    };
    private String d;
    private int e;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private Set<Object> i = new HashSet();
    private xv<xo> j;
    private xo k;

    static class a extends BaseSavedState {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, 0);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        String a;
        int b;
        float c;
        boolean d;
        String e;
        int f;
        int g;

        private a(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.c = parcel.readFloat();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.d = z;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        /* synthetic */ a(Parcel parcel, byte b2) {
            this(parcel);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    static {
        LottieAnimationView.class.getSimpleName();
    }

    public LottieAnimationView(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.xx.a.a);
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(defpackage.xx.a.i);
            boolean hasValue2 = obtainStyledAttributes.hasValue(defpackage.xx.a.e);
            boolean hasValue3 = obtainStyledAttributes.hasValue(defpackage.xx.a.m);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            } else if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(defpackage.xx.a.i, 0);
                if (resourceId != 0) {
                    b(resourceId);
                }
            } else if (hasValue2) {
                String string = obtainStyledAttributes.getString(defpackage.xx.a.e);
                if (string != null) {
                    a(string);
                }
            } else if (hasValue3) {
                String string2 = obtainStyledAttributes.getString(defpackage.xx.a.m);
                if (string2 != null) {
                    b(string2);
                }
            }
        }
        if (obtainStyledAttributes.getBoolean(defpackage.xx.a.b, false)) {
            this.f = true;
            this.g = true;
        }
        if (obtainStyledAttributes.getBoolean(defpackage.xx.a.g, false)) {
            this.a.e(-1);
        }
        if (obtainStyledAttributes.hasValue(defpackage.xx.a.k)) {
            c(obtainStyledAttributes.getInt(defpackage.xx.a.k, 1));
        }
        if (obtainStyledAttributes.hasValue(defpackage.xx.a.j)) {
            a(obtainStyledAttributes.getInt(defpackage.xx.a.j, -1));
        }
        c(obtainStyledAttributes.getString(defpackage.xx.a.f));
        c(obtainStyledAttributes.getFloat(defpackage.xx.a.h, 0.0f));
        a(obtainStyledAttributes.getBoolean(defpackage.xx.a.d, false));
        if (obtainStyledAttributes.hasValue(defpackage.xx.a.c)) {
            xy xyVar = new xy(obtainStyledAttributes.getColor(defpackage.xx.a.c, 0));
            a(new zn("**"), xt.x, new acn(xyVar));
        }
        if (obtainStyledAttributes.hasValue(defpackage.xx.a.l)) {
            this.a.d(obtainStyledAttributes.getFloat(defpackage.xx.a.l, 1.0f));
        }
        obtainStyledAttributes.recycle();
        setLayerType(1, null);
    }

    private void a(String str) {
        this.d = str;
        this.e = 0;
        a(xp.b(getContext(), str));
    }

    private void a(xv<xo> xvVar) {
        i();
        h();
        this.j = xvVar.a(this.b).c(this.c);
    }

    private <T> void a(zn znVar, T t, acn<T> acn) {
        this.a.a(znVar, t, acn);
    }

    private void a(boolean z) {
        this.a.a(z);
    }

    private void b(int i2) {
        this.e = i2;
        this.d = null;
        a(xp.a(getContext(), i2));
    }

    private void b(String str) {
        a(xp.a(getContext(), str));
    }

    private void c(int i2) {
        this.a.d(i2);
    }

    private void c(String str) {
        this.a.e = str;
    }

    private void h() {
        xv<xo> xvVar = this.j;
        if (xvVar != null) {
            xvVar.b(this.b);
            this.j.d(this.c);
        }
    }

    private void i() {
        this.k = null;
        this.a.c();
    }

    public final void a(float f2) {
        this.a.a(f2);
    }

    public final void a(int i2) {
        this.a.e(i2);
    }

    public final void a(xo xoVar) {
        boolean z = xn.a;
        this.a.setCallback(this);
        this.k = xoVar;
        xq xqVar = this.a;
        boolean z2 = false;
        if (xqVar.a != xoVar) {
            xqVar.c();
            xqVar.a = xoVar;
            xqVar.b();
            ach ach = xqVar.b;
            boolean z3 = ach.g == null;
            ach.g = xoVar;
            if (z3) {
                ach.a((int) Math.max(ach.e, xoVar.i), (int) Math.min(ach.f, xoVar.j));
            } else {
                ach.a((int) xoVar.i, (int) xoVar.j);
            }
            ach.a((int) ach.d);
            ach.c = System.nanoTime();
            xqVar.c(xqVar.b.getAnimatedFraction());
            xqVar.d(xqVar.c);
            xqVar.f();
            Iterator it = new ArrayList(xqVar.d).iterator();
            while (it.hasNext()) {
                ((defpackage.xq.a) it.next()).a();
                it.remove();
            }
            xqVar.d.clear();
            xoVar.a.a = false;
            z2 = true;
        }
        setLayerType(1, null);
        if (getDrawable() != this.a || z2) {
            setImageDrawable(null);
            setImageDrawable(this.a);
            requestLayout();
            Iterator it2 = this.i.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public final void b(float f2) {
        this.a.b(f2);
    }

    public final void c(float f2) {
        this.a.c(f2);
    }

    public final void e() {
        this.a.d();
        setLayerType(1, null);
    }

    public final boolean f() {
        return this.a.b.isRunning();
    }

    public final void g() {
        xq xqVar = this.a;
        xqVar.d.clear();
        xqVar.b.f();
        setLayerType(1, null);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        xq xqVar = this.a;
        if (drawable2 == xqVar) {
            super.invalidateDrawable(xqVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g && this.f) {
            e();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.a.b.isRunning()) {
            xq xqVar = this.a;
            xqVar.d.clear();
            xqVar.b.cancel();
            setLayerType(1, null);
            this.f = true;
        }
        this.a.a();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.d = aVar.a;
        if (!TextUtils.isEmpty(this.d)) {
            a(this.d);
        }
        this.e = aVar.b;
        int i2 = this.e;
        if (i2 != 0) {
            b(i2);
        }
        c(aVar.c);
        if (aVar.d) {
            e();
        }
        this.a.e = aVar.e;
        c(aVar.f);
        a(aVar.g);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.a = this.d;
        aVar.b = this.e;
        aVar.c = this.a.b.b();
        aVar.d = this.a.b.isRunning();
        aVar.e = this.a.e;
        aVar.f = this.a.b.getRepeatMode();
        aVar.g = this.a.b.getRepeatCount();
        return aVar;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.a.a();
        h();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        xq xqVar = this.a;
        if (drawable != xqVar) {
            xqVar.a();
        }
        h();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i2) {
        this.a.a();
        h();
        super.setImageResource(i2);
    }
}
