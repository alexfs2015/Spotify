package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.spotify.music.R;

public class TextInputLayout extends LinearLayout {
    private int A;
    private int B;
    private Drawable C;
    private final Rect D;
    private final RectF E;
    private boolean F;
    private Drawable G;
    private CharSequence H;
    private CheckableImageButton I;
    private boolean J;
    private Drawable K;
    private Drawable L;
    private ColorStateList M;
    private boolean N;
    private Mode O;
    private boolean P;
    private ColorStateList Q;
    private ColorStateList R;
    private final int S;
    private final int T;
    private int U;
    private final int V;
    private boolean W;
    public EditText a;
    private boolean aa;
    private ValueAnimator ab;
    private boolean ac;
    private boolean ad;
    /* access modifiers changed from: private */
    public boolean ae;
    boolean b;
    boolean c;
    TextView d;
    boolean e;
    final ezj f;
    private final FrameLayout g;
    private CharSequence h;
    private final fak i;
    private int j;
    private final int k;
    private final int l;
    private boolean m;
    private CharSequence n;
    private GradientDrawable o;
    private final int p;
    private final int q;
    private int r;
    private final int s;
    private float t;
    private float u;
    private float v;
    private float w;
    private int x;
    private final int y;
    private final int z;

    public static class a extends ht {
        private final TextInputLayout c;

        public a(TextInputLayout textInputLayout) {
            this.c = textInputLayout;
        }

        public final void a(View view, ja jaVar) {
            super.a(view, jaVar);
            EditText editText = this.c.a;
            CharSequence charSequence = null;
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence a = this.c.a();
            CharSequence c2 = this.c.c();
            TextInputLayout textInputLayout = this.c;
            if (textInputLayout.b && textInputLayout.c && textInputLayout.d != null) {
                charSequence = textInputLayout.d.getContentDescription();
            }
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(a);
            boolean z3 = !TextUtils.isEmpty(c2);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(charSequence);
            if (z) {
                jaVar.c(text);
            } else if (z2) {
                jaVar.c(a);
            }
            if (z2) {
                if (VERSION.SDK_INT >= 26) {
                    jaVar.a.setHintText(a);
                } else if (VERSION.SDK_INT >= 19) {
                    jaVar.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", a);
                }
                if (!z && z2) {
                    z4 = true;
                }
                if (VERSION.SDK_INT >= 26) {
                    jaVar.a.setShowingHintText(z4);
                } else {
                    jaVar.a(4, z4);
                }
            }
            if (z5) {
                if (z3) {
                    charSequence = c2;
                }
                if (VERSION.SDK_INT >= 21) {
                    jaVar.a.setError(charSequence);
                }
                if (VERSION.SDK_INT >= 19) {
                    jaVar.a.setContentInvalid(true);
                }
            }
        }

        public final void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            EditText editText = this.c.a;
            CharSequence text = editText != null ? editText.getText() : null;
            if (TextUtils.isEmpty(text)) {
                text = this.c.a();
            }
            if (!TextUtils.isEmpty(text)) {
                accessibilityEvent.getText().add(text);
            }
        }
    }

    static class b extends jt {
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
        CharSequence a;
        boolean b;

        b(Parcelable parcelable) {
            super(parcelable);
        }

        b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.b = z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.a, parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.a);
            sb.append("}");
            return sb.toString();
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = new fak(this);
        this.D = new Rect();
        this.E = new RectF();
        this.f = new ezj(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.g = new FrameLayout(context);
        this.g.setAddStatesFromChildren(true);
        addView(this.g);
        this.f.a(eyd.a);
        ezj ezj = this.f;
        ezj.g = eyd.a;
        ezj.b();
        this.f.b(8388659);
        cp b2 = ezs.b(context, attributeSet, defpackage.eyc.a.cV, i2, 2132017908, new int[0]);
        this.m = b2.a(defpackage.eyc.a.dq, true);
        a(b2.c(defpackage.eyc.a.cX));
        this.aa = b2.a(defpackage.eyc.a.dp, true);
        this.p = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_bottom_offset);
        this.q = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.s = b2.d(defpackage.eyc.a.da, 0);
        this.t = b2.b(defpackage.eyc.a.de, 0.0f);
        this.u = b2.b(defpackage.eyc.a.dd, 0.0f);
        this.v = b2.b(defpackage.eyc.a.db, 0.0f);
        this.w = b2.b(defpackage.eyc.a.dc, 0.0f);
        this.B = b2.b(defpackage.eyc.a.cY, 0);
        this.U = b2.b(defpackage.eyc.a.df, 0);
        this.y = context.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default);
        this.z = context.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused);
        this.x = this.y;
        int a2 = b2.a(defpackage.eyc.a.cZ, 0);
        if (a2 != this.r) {
            this.r = a2;
            f();
        }
        if (b2.f(defpackage.eyc.a.cW)) {
            ColorStateList e2 = b2.e(defpackage.eyc.a.cW);
            this.R = e2;
            this.Q = e2;
        }
        this.S = fr.c(context, R.color.mtrl_textinput_default_box_stroke_color);
        this.V = fr.c(context, R.color.mtrl_textinput_disabled_color);
        this.T = fr.c(context, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b2.g(defpackage.eyc.a.dr, -1) != -1) {
            this.f.c(b2.g(defpackage.eyc.a.dr, 0));
            this.R = this.f.c;
            if (this.a != null) {
                a(false, false);
                i();
            }
        }
        int g2 = b2.g(defpackage.eyc.a.dl, 0);
        boolean a3 = b2.a(defpackage.eyc.a.dk, false);
        int g3 = b2.g(defpackage.eyc.a.f9do, 0);
        boolean a4 = b2.a(defpackage.eyc.a.dn, false);
        CharSequence c2 = b2.c(defpackage.eyc.a.dm);
        boolean a5 = b2.a(defpackage.eyc.a.dg, false);
        int a6 = b2.a(defpackage.eyc.a.dh, -1);
        if (this.j != a6) {
            if (a6 > 0) {
                this.j = a6;
            } else {
                this.j = -1;
            }
            if (this.b) {
                EditText editText = this.a;
                a(editText == null ? 0 : editText.getText().length());
            }
        }
        this.l = b2.g(defpackage.eyc.a.dj, 0);
        this.k = b2.g(defpackage.eyc.a.di, 0);
        this.F = b2.a(defpackage.eyc.a.du, false);
        this.G = b2.a(defpackage.eyc.a.dt);
        this.H = b2.c(defpackage.eyc.a.ds);
        if (b2.f(defpackage.eyc.a.dv)) {
            this.N = true;
            this.M = b2.e(defpackage.eyc.a.dv);
        }
        if (b2.f(defpackage.eyc.a.dw)) {
            this.P = true;
            this.O = ezt.a(b2.a(defpackage.eyc.a.dw, -1), null);
        }
        b2.a.recycle();
        c(a4);
        if (!TextUtils.isEmpty(c2)) {
            if (!this.i.h) {
                c(true);
            }
            fak fak = this.i;
            fak.b();
            fak.g = c2;
            fak.i.setText(c2);
            if (fak.b != 2) {
                fak.c = 2;
            }
            fak.a(fak.b, fak.c, fak.a(fak.i, c2));
        } else if (this.i.h) {
            c(false);
        }
        this.i.b(g3);
        b(a3);
        this.i.a(g2);
        if (this.b != a5) {
            if (a5) {
                this.d = new AppCompatTextView(getContext());
                this.d.setId(R.id.textinput_counter);
                this.d.setMaxLines(1);
                a(this.d, this.l);
                this.i.a(this.d, 2);
                EditText editText2 = this.a;
                if (editText2 == null) {
                    a(0);
                } else {
                    a(editText2.getText().length());
                }
            } else {
                this.i.b(this.d, 2);
                this.d = null;
            }
            this.b = a5;
        }
        if (this.G != null && (this.N || this.P)) {
            this.G = gm.f(this.G).mutate();
            if (this.N) {
                gm.a(this.G, this.M);
            }
            if (this.P) {
                gm.a(this.G, this.O);
            }
            CheckableImageButton checkableImageButton = this.I;
            if (checkableImageButton != null) {
                Drawable drawable = checkableImageButton.getDrawable();
                Drawable drawable2 = this.G;
                if (drawable != drawable2) {
                    this.I.setImageDrawable(drawable2);
                }
            }
        }
        ip.b((View) this, 2);
    }

    public void addView(View view, int i2, LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.g.addView(view, layoutParams2);
            this.g.setLayoutParams(layoutParams);
            i();
            EditText editText = (EditText) view;
            if (this.a == null) {
                this.a = editText;
                f();
                a aVar = new a(this);
                EditText editText2 = this.a;
                if (editText2 != null) {
                    ip.a((View) editText2, (ht) aVar);
                }
                if (!r()) {
                    ezj ezj = this.f;
                    Typeface typeface = this.a.getTypeface();
                    ezj.e = typeface;
                    ezj.d = typeface;
                    ezj.b();
                }
                ezj ezj2 = this.f;
                float textSize = this.a.getTextSize();
                if (ezj2.b != textSize) {
                    ezj2.b = textSize;
                    ezj2.b();
                }
                int gravity = this.a.getGravity();
                this.f.b((gravity & -113) | 48);
                this.f.a(gravity);
                this.a.addTextChangedListener(new TextWatcher() {
                    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public final void afterTextChanged(Editable editable) {
                        TextInputLayout textInputLayout = TextInputLayout.this;
                        textInputLayout.a(!textInputLayout.ae, false);
                        if (TextInputLayout.this.b) {
                            TextInputLayout.this.a(editable.length());
                        }
                    }
                });
                if (this.Q == null) {
                    this.Q = this.a.getHintTextColors();
                }
                if (this.m) {
                    if (TextUtils.isEmpty(this.n)) {
                        this.h = this.a.getHint();
                        a(this.h);
                        this.a.setHint(null);
                    }
                    this.e = true;
                }
                if (this.d != null) {
                    a(this.a.getText().length());
                }
                this.i.c();
                q();
                a(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i2, layoutParams);
    }

    private Drawable e() {
        int i2 = this.r;
        if (i2 == 1 || i2 == 2) {
            return this.o;
        }
        throw new IllegalStateException();
    }

    private void f() {
        g();
        if (this.r != 0) {
            i();
        }
        j();
    }

    private void g() {
        int i2 = this.r;
        if (i2 == 0) {
            this.o = null;
        } else if (i2 != 2 || !this.m || (this.o instanceof faj)) {
            if (!(this.o instanceof GradientDrawable)) {
                this.o = new GradientDrawable();
            }
        } else {
            this.o = new faj();
        }
    }

    private float[] h() {
        if (!ezt.a(this)) {
            float f2 = this.t;
            float f3 = this.u;
            float f4 = this.v;
            float f5 = this.w;
            return new float[]{f2, f2, f3, f3, f4, f4, f5, f5};
        }
        float f6 = this.u;
        float f7 = this.t;
        float f8 = this.w;
        float f9 = this.v;
        return new float[]{f6, f6, f7, f7, f8, f8, f9, f9};
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        if (this.h != null) {
            EditText editText = this.a;
            if (editText != null) {
                boolean z2 = this.e;
                this.e = false;
                CharSequence hint = editText.getHint();
                this.a.setHint(this.h);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i2);
                    return;
                } finally {
                    this.a.setHint(hint);
                    this.e = z2;
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i2);
    }

    private void i() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g.getLayoutParams();
        int l2 = l();
        if (l2 != layoutParams.topMargin) {
            layoutParams.topMargin = l2;
            this.g.requestLayout();
        }
    }

    public void a(boolean z2, boolean z3) {
        boolean isEnabled = isEnabled();
        EditText editText = this.a;
        boolean z4 = true;
        boolean z5 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.a;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        }
        boolean d2 = this.i.d();
        ColorStateList colorStateList = this.Q;
        if (colorStateList != null) {
            this.f.a(colorStateList);
            this.f.b(this.Q);
        }
        if (!isEnabled) {
            this.f.a(ColorStateList.valueOf(this.V));
            this.f.b(ColorStateList.valueOf(this.V));
        } else if (d2) {
            this.f.a(this.i.f());
        } else {
            if (this.c) {
                TextView textView = this.d;
                if (textView != null) {
                    this.f.a(textView.getTextColors());
                }
            }
            if (z4) {
                ColorStateList colorStateList2 = this.R;
                if (colorStateList2 != null) {
                    this.f.a(colorStateList2);
                }
            }
        }
        if (z5 || (isEnabled() && (z4 || d2))) {
            if (z3 || this.W) {
                d(z2);
            }
        } else if (z3 || !this.W) {
            e(z2);
        }
    }

    private void a(CharSequence charSequence) {
        if (this.m) {
            b(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    private void b(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.n)) {
            this.n = charSequence;
            this.f.a(charSequence);
            if (!this.W) {
                u();
            }
        }
    }

    public final CharSequence a() {
        if (this.m) {
            return this.n;
        }
        return null;
    }

    private void b(boolean z2) {
        this.i.a(z2);
    }

    private void c(boolean z2) {
        this.i.b(z2);
    }

    public void setEnabled(boolean z2) {
        a((ViewGroup) this, z2);
        super.setEnabled(z2);
    }

    private static void a(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        boolean z2 = this.c;
        if (this.j == -1) {
            this.d.setText(String.valueOf(i2));
            this.d.setContentDescription(null);
            this.c = false;
        } else {
            if (ip.h(this.d) == 1) {
                ip.d((View) this.d, 0);
            }
            this.c = i2 > this.j;
            boolean z3 = this.c;
            if (z2 != z3) {
                a(this.d, z3 ? this.k : this.l);
                if (this.c) {
                    ip.d((View) this.d, 1);
                }
            }
            this.d.setText(getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.j)}));
            this.d.setContentDescription(getContext().getString(R.string.character_counter_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.j)}));
        }
        if (this.a != null && z2 != this.c) {
            a(false, false);
            d();
            b();
        }
    }

    public final void a(TextView textView, int i2) {
        boolean z2 = true;
        try {
            jm.a(textView, i2);
            if (VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            jm.a(textView, (int) com.moat.analytics.mobile.R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(fr.c(getContext(), R.color.design_error));
        }
    }

    private void j() {
        if (this.r != 0 && this.o != null && this.a != null && getRight() != 0) {
            int left = this.a.getLeft();
            int k2 = k();
            int right = this.a.getRight();
            int bottom = this.a.getBottom() + this.p;
            if (this.r == 2) {
                int i2 = this.z;
                left += i2 / 2;
                k2 -= i2 / 2;
                right -= i2 / 2;
                bottom += i2 / 2;
            }
            this.o.setBounds(left, k2, right, bottom);
            o();
            m();
        }
    }

    private int k() {
        EditText editText = this.a;
        if (editText == null) {
            return 0;
        }
        int i2 = this.r;
        if (i2 == 1) {
            return editText.getTop();
        }
        if (i2 != 2) {
            return 0;
        }
        return editText.getTop() + l();
    }

    private int l() {
        float a2;
        if (!this.m) {
            return 0;
        }
        int i2 = this.r;
        if (i2 == 0 || i2 == 1) {
            a2 = this.f.a();
        } else if (i2 != 2) {
            return 0;
        } else {
            a2 = this.f.a() / 2.0f;
        }
        return (int) a2;
    }

    private void m() {
        EditText editText = this.a;
        if (editText != null) {
            Drawable background = editText.getBackground();
            if (background != null) {
                if (ca.c(background)) {
                    background = background.mutate();
                }
                ezk.a((ViewGroup) this, (View) this.a, new Rect());
                Rect bounds = background.getBounds();
                if (bounds.left != bounds.right) {
                    Rect rect = new Rect();
                    background.getPadding(rect);
                    background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right << 1), this.a.getBottom());
                }
            }
        }
    }

    private void n() {
        int i2 = this.r;
        if (i2 != 1) {
            if (i2 == 2 && this.U == 0) {
                this.U = this.R.getColorForState(getDrawableState(), this.R.getDefaultColor());
            }
            return;
        }
        this.x = 0;
    }

    private void o() {
        if (this.o != null) {
            n();
            EditText editText = this.a;
            if (editText != null && this.r == 2) {
                if (editText.getBackground() != null) {
                    this.C = this.a.getBackground();
                }
                ip.a((View) this.a, (Drawable) null);
            }
            EditText editText2 = this.a;
            if (editText2 != null && this.r == 1) {
                Drawable drawable = this.C;
                if (drawable != null) {
                    ip.a((View) editText2, drawable);
                }
            }
            int i2 = this.x;
            if (i2 >= 0) {
                int i3 = this.A;
                if (i3 != 0) {
                    this.o.setStroke(i2, i3);
                }
            }
            this.o.setCornerRadii(h());
            this.o.setColor(this.B);
            invalidate();
        }
    }

    public final void b() {
        EditText editText = this.a;
        if (editText != null) {
            Drawable background = editText.getBackground();
            if (background != null) {
                p();
                if (ca.c(background)) {
                    background = background.mutate();
                }
                if (this.i.d()) {
                    background.setColorFilter(bq.a(this.i.e(), Mode.SRC_IN));
                    return;
                }
                if (this.c) {
                    TextView textView = this.d;
                    if (textView != null) {
                        background.setColorFilter(bq.a(textView.getCurrentTextColor(), Mode.SRC_IN));
                        return;
                    }
                }
                gm.e(background);
                this.a.refreshDrawableState();
            }
        }
    }

    private void p() {
        int i2 = VERSION.SDK_INT;
        if (i2 == 21 || i2 == 22) {
            Drawable background = this.a.getBackground();
            if (background != null && !this.ac) {
                Drawable newDrawable = background.getConstantState().newDrawable();
                if (background instanceof DrawableContainer) {
                    this.ac = ezl.a((DrawableContainer) background, newDrawable.getConstantState());
                }
                if (!this.ac) {
                    ip.a((View) this.a, newDrawable);
                    this.ac = true;
                    f();
                }
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        if (this.i.d()) {
            bVar.a = c();
        }
        bVar.b = this.J;
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRestoreInstanceState(android.os.Parcelable r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.material.textfield.TextInputLayout.b
            if (r0 != 0) goto L_0x0008
            super.onRestoreInstanceState(r7)
            return
        L_0x0008:
            com.google.android.material.textfield.TextInputLayout$b r7 = (com.google.android.material.textfield.TextInputLayout.b) r7
            android.os.Parcelable r0 = r7.d
            super.onRestoreInstanceState(r0)
            java.lang.CharSequence r0 = r7.a
            fak r1 = r6.i
            boolean r1 = r1.e
            r2 = 1
            if (r1 != 0) goto L_0x0021
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x004c
            r6.b(r2)
        L_0x0021:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0047
            fak r1 = r6.i
            r1.b()
            r1.d = r0
            android.widget.TextView r3 = r1.f
            r3.setText(r0)
            int r3 = r1.b
            if (r3 == r2) goto L_0x0039
            r1.c = r2
        L_0x0039:
            int r3 = r1.b
            int r4 = r1.c
            android.widget.TextView r5 = r1.f
            boolean r0 = r1.a(r5, r0)
            r1.a(r3, r4, r0)
            goto L_0x004c
        L_0x0047:
            fak r0 = r6.i
            r0.a()
        L_0x004c:
            boolean r7 = r7.b
            if (r7 == 0) goto L_0x0053
            r6.a(r2)
        L_0x0053:
            r6.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onRestoreInstanceState(android.os.Parcelable):void");
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.ae = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.ae = false;
    }

    public final CharSequence c() {
        if (this.i.e) {
            return this.i.d;
        }
        return null;
    }

    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.o;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.m) {
            this.f.a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        q();
        super.onMeasure(i2, i3);
    }

    private void q() {
        if (this.a != null) {
            if (s()) {
                if (this.I == null) {
                    this.I = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_password_icon, this.g, false);
                    this.I.setImageDrawable(this.G);
                    this.I.setContentDescription(this.H);
                    this.g.addView(this.I);
                    this.I.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            TextInputLayout.this.a(false);
                        }
                    });
                }
                EditText editText = this.a;
                if (editText != null && ip.m(editText) <= 0) {
                    this.a.setMinimumHeight(ip.m(this.I));
                }
                this.I.setVisibility(0);
                this.I.setChecked(this.J);
                if (this.K == null) {
                    this.K = new ColorDrawable();
                }
                this.K.setBounds(0, 0, this.I.getMeasuredWidth(), 1);
                Drawable[] b2 = jm.b(this.a);
                if (b2[2] != this.K) {
                    this.L = b2[2];
                }
                jm.a(this.a, b2[0], b2[1], this.K, b2[3]);
                this.I.setPadding(this.a.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight(), this.a.getPaddingBottom());
                return;
            }
            CheckableImageButton checkableImageButton = this.I;
            if (checkableImageButton != null && checkableImageButton.getVisibility() == 0) {
                this.I.setVisibility(8);
            }
            if (this.K != null) {
                Drawable[] b3 = jm.b(this.a);
                if (b3[2] == this.K) {
                    jm.a(this.a, b3[0], b3[1], this.L, b3[3]);
                    this.K = null;
                }
            }
        }
    }

    public final void a(boolean z2) {
        if (this.F) {
            int selectionEnd = this.a.getSelectionEnd();
            if (r()) {
                this.a.setTransformationMethod(null);
                this.J = true;
            } else {
                this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.J = false;
            }
            this.I.setChecked(this.J);
            if (z2) {
                this.I.jumpDrawablesToCurrentState();
            }
            this.a.setSelection(selectionEnd);
        }
    }

    private boolean r() {
        EditText editText = this.a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private boolean s() {
        return this.F && (r() || this.J);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.o != null) {
            j();
        }
        if (this.m) {
            EditText editText = this.a;
            if (editText != null) {
                Rect rect = this.D;
                ezk.a((ViewGroup) this, (View) editText, rect);
                int compoundPaddingLeft = rect.left + this.a.getCompoundPaddingLeft();
                int compoundPaddingRight = rect.right - this.a.getCompoundPaddingRight();
                int i7 = this.r;
                if (i7 == 1) {
                    i6 = e().getBounds().top + this.s;
                } else if (i7 != 2) {
                    i6 = getPaddingTop();
                } else {
                    i6 = e().getBounds().top - l();
                }
                this.f.a(compoundPaddingLeft, rect.top + this.a.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.a.getCompoundPaddingBottom());
                this.f.b(compoundPaddingLeft, i6, compoundPaddingRight, (i5 - i3) - getPaddingBottom());
                this.f.b();
                if (t() && !this.W) {
                    u();
                }
            }
        }
    }

    private void d(boolean z2) {
        ValueAnimator valueAnimator = this.ab;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.ab.cancel();
        }
        if (!z2 || !this.aa) {
            this.f.a(1.0f);
        } else {
            a(1.0f);
        }
        this.W = false;
        if (t()) {
            u();
        }
    }

    private boolean t() {
        return this.m && !TextUtils.isEmpty(this.n) && (this.o instanceof faj);
    }

    private void u() {
        if (t()) {
            RectF rectF = this.E;
            this.f.a(rectF);
            a(rectF);
            ((faj) this.o).a(rectF);
        }
    }

    private void v() {
        if (t()) {
            ((faj) this.o).a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void a(RectF rectF) {
        rectF.left -= (float) this.q;
        rectF.top -= (float) this.q;
        rectF.right += (float) this.q;
        rectF.bottom += (float) this.q;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.ad) {
            boolean z2 = true;
            this.ad = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!ip.B(this) || !isEnabled()) {
                z2 = false;
            }
            a(z2, false);
            b();
            j();
            d();
            if (this.f.a(drawableState) || false) {
                invalidate();
            }
            this.ad = false;
        }
    }

    public final void d() {
        if (this.o != null && this.r != 0) {
            EditText editText = this.a;
            boolean z2 = true;
            boolean z3 = editText != null && editText.hasFocus();
            EditText editText2 = this.a;
            if (editText2 == null || !editText2.isHovered()) {
                z2 = false;
            }
            if (this.r == 2) {
                if (!isEnabled()) {
                    this.A = this.V;
                } else if (this.i.d()) {
                    this.A = this.i.e();
                } else {
                    if (this.c) {
                        TextView textView = this.d;
                        if (textView != null) {
                            this.A = textView.getCurrentTextColor();
                        }
                    }
                    if (z3) {
                        this.A = this.U;
                    } else if (z2) {
                        this.A = this.T;
                    } else {
                        this.A = this.S;
                    }
                }
                if ((z2 || z3) && isEnabled()) {
                    this.x = this.z;
                } else {
                    this.x = this.y;
                }
                o();
            }
        }
    }

    private void e(boolean z2) {
        ValueAnimator valueAnimator = this.ab;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.ab.cancel();
        }
        if (!z2 || !this.aa) {
            this.f.a(0.0f);
        } else {
            a(0.0f);
        }
        if (t() && ((faj) this.o).a()) {
            v();
        }
        this.W = true;
    }

    private void a(float f2) {
        if (this.f.a != f2) {
            if (this.ab == null) {
                this.ab = new ValueAnimator();
                this.ab.setInterpolator(eyd.b);
                this.ab.setDuration(167);
                this.ab.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TextInputLayout.this.f.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
            }
            this.ab.setFloatValues(new float[]{this.f.a, f2});
            this.ab.start();
        }
    }
}
