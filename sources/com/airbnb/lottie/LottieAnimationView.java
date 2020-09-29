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
    public final xc a = new xc();
    private final xe<xa> b = new xe<xa>() {
        public final /* bridge */ /* synthetic */ void a(Object obj) {
            LottieAnimationView.this.a((xa) obj);
        }
    };
    private final xe<Throwable> c = new xe<Throwable>() {
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
    private xh<xa> j;
    private xa k;

    static class a extends BaseSavedState {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, 0);
            }
        };
        String a;
        int b;
        float c;
        boolean d;
        String e;
        int f;
        int g;

        /* synthetic */ a(Parcel parcel, byte b2) {
            this(parcel);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

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
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.xj.a.a);
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(defpackage.xj.a.i);
            boolean hasValue2 = obtainStyledAttributes.hasValue(defpackage.xj.a.e);
            boolean hasValue3 = obtainStyledAttributes.hasValue(defpackage.xj.a.m);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            } else if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(defpackage.xj.a.i, 0);
                if (resourceId != 0) {
                    b(resourceId);
                }
            } else if (hasValue2) {
                String string = obtainStyledAttributes.getString(defpackage.xj.a.e);
                if (string != null) {
                    a(string);
                }
            } else if (hasValue3) {
                String string2 = obtainStyledAttributes.getString(defpackage.xj.a.m);
                if (string2 != null) {
                    b(string2);
                }
            }
        }
        if (obtainStyledAttributes.getBoolean(defpackage.xj.a.b, false)) {
            this.f = true;
            this.g = true;
        }
        if (obtainStyledAttributes.getBoolean(defpackage.xj.a.g, false)) {
            this.a.e(-1);
        }
        if (obtainStyledAttributes.hasValue(defpackage.xj.a.k)) {
            c(obtainStyledAttributes.getInt(defpackage.xj.a.k, 1));
        }
        if (obtainStyledAttributes.hasValue(defpackage.xj.a.j)) {
            a(obtainStyledAttributes.getInt(defpackage.xj.a.j, -1));
        }
        c(obtainStyledAttributes.getString(defpackage.xj.a.f));
        c(obtainStyledAttributes.getFloat(defpackage.xj.a.h, 0.0f));
        a(obtainStyledAttributes.getBoolean(defpackage.xj.a.d, false));
        if (obtainStyledAttributes.hasValue(defpackage.xj.a.c)) {
            xk xkVar = new xk(obtainStyledAttributes.getColor(defpackage.xj.a.c, 0));
            a(new yz("**"), xf.x, new abz(xkVar));
        }
        if (obtainStyledAttributes.hasValue(defpackage.xj.a.l)) {
            this.a.d(obtainStyledAttributes.getFloat(defpackage.xj.a.l, 1.0f));
        }
        obtainStyledAttributes.recycle();
        setLayerType(1, null);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        xc xcVar = this.a;
        if (drawable2 == xcVar) {
            super.invalidateDrawable(xcVar);
        } else {
            super.invalidateDrawable(drawable);
        }
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
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g && this.f) {
            e();
        }
    }

    private void a(boolean z) {
        this.a.a(z);
    }

    private void b(int i2) {
        this.e = i2;
        this.d = null;
        a(xb.a(getContext(), i2));
    }

    private void a(String str) {
        this.d = str;
        this.e = 0;
        a(xb.b(getContext(), str));
    }

    private void b(String str) {
        a(xb.a(getContext(), str));
    }

    private void a(xh<xa> xhVar) {
        i();
        h();
        this.j = xhVar.a(this.b).c(this.c);
    }

    private void h() {
        xh<xa> xhVar = this.j;
        if (xhVar != null) {
            xhVar.b(this.b);
            this.j.d(this.c);
        }
    }

    public final void a(xa xaVar) {
        boolean z = wz.a;
        this.a.setCallback(this);
        this.k = xaVar;
        xc xcVar = this.a;
        boolean z2 = false;
        if (xcVar.a != xaVar) {
            xcVar.c();
            xcVar.a = xaVar;
            xcVar.b();
            abt abt = xcVar.b;
            boolean z3 = abt.g == null;
            abt.g = xaVar;
            if (z3) {
                abt.a((int) Math.max(abt.e, xaVar.i), (int) Math.min(abt.f, xaVar.j));
            } else {
                abt.a((int) xaVar.i, (int) xaVar.j);
            }
            abt.a((int) abt.d);
            abt.c = System.nanoTime();
            xcVar.c(xcVar.b.getAnimatedFraction());
            xcVar.d(xcVar.c);
            xcVar.f();
            Iterator it = new ArrayList(xcVar.d).iterator();
            while (it.hasNext()) {
                ((defpackage.xc.a) it.next()).a();
                it.remove();
            }
            xcVar.d.clear();
            xaVar.a.a = false;
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

    public final void e() {
        this.a.d();
        setLayerType(1, null);
    }

    public final void a(float f2) {
        this.a.a(f2);
    }

    public final void b(float f2) {
        this.a.b(f2);
    }

    private void c(int i2) {
        this.a.d(i2);
    }

    public final void a(int i2) {
        this.a.e(i2);
    }

    public final boolean f() {
        return this.a.b.isRunning();
    }

    private void c(String str) {
        this.a.e = str;
    }

    private <T> void a(yz yzVar, T t, abz<T> abz) {
        this.a.a(yzVar, t, abz);
    }

    public final void g() {
        xc xcVar = this.a;
        xcVar.d.clear();
        xcVar.b.f();
        setLayerType(1, null);
    }

    public final void c(float f2) {
        this.a.c(f2);
    }

    private void i() {
        this.k = null;
        this.a.c();
    }

    public void setImageResource(int i2) {
        this.a.a();
        h();
        super.setImageResource(i2);
    }

    public void setImageDrawable(Drawable drawable) {
        xc xcVar = this.a;
        if (drawable != xcVar) {
            xcVar.a();
        }
        h();
        super.setImageDrawable(drawable);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.a.a();
        h();
        super.setImageBitmap(bitmap);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.a.b.isRunning()) {
            xc xcVar = this.a;
            xcVar.d.clear();
            xcVar.b.cancel();
            setLayerType(1, null);
            this.f = true;
        }
        this.a.a();
        super.onDetachedFromWindow();
    }
}
