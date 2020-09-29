package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;

public class SwitchCompat extends CompoundButton {
    private static final int[] O = {16842912};
    private static final Property<SwitchCompat, Float> c = new Property<SwitchCompat, Float>(Float.class, "thumbPos") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(((SwitchCompat) obj).b);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((SwitchCompat) obj).a(((Float) obj2).floatValue());
        }
    };
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private final TextPaint G;
    private ColorStateList H;
    private Layout I;
    private Layout J;
    private TransformationMethod K;
    private ObjectAnimator L;
    private final bw M;
    private final Rect N;
    public Drawable a;
    float b;
    private ColorStateList d;
    private Mode e;
    private boolean f;
    private boolean g;
    private Drawable h;
    private ColorStateList i;
    private Mode j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private CharSequence q;
    private CharSequence r;
    private boolean s;
    private int t;
    private int u;
    private float v;
    private float w;
    private VelocityTracker x;
    private int y;
    private int z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.x = VelocityTracker.obtain();
        this.N = new Rect();
        boolean z2 = true;
        this.G = new TextPaint(1);
        this.G.density = getResources().getDisplayMetrics().density;
        cp a2 = cp.a(context, attributeSet, a.cx, i2, 0);
        this.a = a2.a(a.cA);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.h = a2.a(a.cJ);
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.q = a2.c(a.cy);
        this.r = a2.c(a.cz);
        this.s = a2.a(a.cB, true);
        this.m = a2.e(a.cG, 0);
        this.n = a2.e(a.cD, 0);
        this.o = a2.e(a.cE, 0);
        this.p = a2.a(a.cC, false);
        ColorStateList e2 = a2.e(a.cH);
        if (e2 != null) {
            this.d = e2;
            this.f = true;
        }
        Mode a3 = ca.a(a2.a(a.cI, -1), null);
        if (this.e != a3) {
            this.e = a3;
            this.g = true;
        }
        if ((this.f || this.g) && this.a != null && (this.f || this.g)) {
            this.a = gm.f(this.a).mutate();
            if (this.f) {
                gm.a(this.a, this.d);
            }
            if (this.g) {
                gm.a(this.a, this.e);
            }
            if (this.a.isStateful()) {
                this.a.setState(getDrawableState());
            }
        }
        ColorStateList e3 = a2.e(a.cK);
        if (e3 != null) {
            this.i = e3;
            this.k = true;
        }
        Mode a4 = ca.a(a2.a(a.cL, -1), null);
        if (this.j != a4) {
            this.j = a4;
            this.l = true;
        }
        if ((this.k || this.l) && this.h != null && (this.k || this.l)) {
            this.h = gm.f(this.h).mutate();
            if (this.k) {
                gm.a(this.h, this.i);
            }
            if (this.l) {
                gm.a(this.h, this.j);
            }
            if (this.h.isStateful()) {
                this.h.setState(getDrawableState());
            }
        }
        int g2 = a2.g(a.cF, 0);
        if (g2 != 0) {
            cp a5 = cp.a(context, g2, a.cM);
            ColorStateList e4 = a5.e(a.cQ);
            if (e4 != null) {
                this.H = e4;
            } else {
                this.H = getTextColors();
            }
            int e5 = a5.e(a.cN, 0);
            if (e5 != 0) {
                float f2 = (float) e5;
                if (f2 != this.G.getTextSize()) {
                    this.G.setTextSize(f2);
                    requestLayout();
                }
            }
            int a6 = a5.a(a.cO, -1);
            int a7 = a5.a(a.cP, -1);
            Typeface typeface = a6 != 1 ? a6 != 2 ? a6 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            float f3 = 0.0f;
            if (a7 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(a7) : Typeface.create(typeface, a7);
                a(defaultFromStyle);
                int style = (-1 ^ (defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & a7;
                TextPaint textPaint = this.G;
                if ((style & 1) == 0) {
                    z2 = false;
                }
                textPaint.setFakeBoldText(z2);
                TextPaint textPaint2 = this.G;
                if ((style & 2) != 0) {
                    f3 = -0.25f;
                }
                textPaint2.setTextSkewX(f3);
            } else {
                this.G.setFakeBoldText(false);
                this.G.setTextSkewX(0.0f);
                a(typeface);
            }
            if (a5.a(a.db, false)) {
                this.K = new ah(getContext());
            } else {
                this.K = null;
            }
            a5.a.recycle();
        }
        this.M = new bw(this);
        this.M.a(attributeSet, i2);
        a2.a.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private Layout a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.G;
        StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        return staticLayout;
    }

    private void a(Typeface typeface) {
        if ((this.G.getTypeface() != null && !this.G.getTypeface().equals(typeface)) || (this.G.getTypeface() == null && typeface != null)) {
            this.G.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    private boolean a() {
        return this.b > 0.5f;
    }

    private int b() {
        return (int) (((cv.a(this) ? 1.0f - this.b : this.b) * ((float) c())) + 0.5f);
    }

    private int c() {
        Drawable drawable = this.h;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.N;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect a2 = drawable2 != null ? ca.a(drawable2) : ca.a;
        return ((((this.z - this.B) - rect.left) - rect.right) - a2.left) - a2.right;
    }

    /* access modifiers changed from: 0000 */
    public final void a(float f2) {
        this.b = f2;
        invalidate();
    }

    public void draw(Canvas canvas) {
        int i2;
        int i3;
        Rect rect = this.N;
        int i4 = this.C;
        int i5 = this.D;
        int i6 = this.E;
        int i7 = this.F;
        int b2 = b() + i4;
        Drawable drawable = this.a;
        Rect a2 = drawable != null ? ca.a(drawable) : ca.a;
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            b2 += rect.left;
            if (a2 != null) {
                if (a2.left > rect.left) {
                    i4 += a2.left - rect.left;
                }
                i2 = a2.top > rect.top ? (a2.top - rect.top) + i5 : i5;
                if (a2.right > rect.right) {
                    i6 -= a2.right - rect.right;
                }
                if (a2.bottom > rect.bottom) {
                    i3 = i7 - (a2.bottom - rect.bottom);
                    this.h.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.h.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i8 = b2 - rect.left;
            int i9 = b2 + this.B + rect.right;
            this.a.setBounds(i8, i5, i9, i7);
            Drawable background = getBackground();
            if (background != null) {
                gm.a(background, i8, i5, i9, i7);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f2, float f3) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            gm.a(drawable, f2, f3);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            gm.a(drawable2, f2, f3);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!cv.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.z;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.o;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (cv.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.z;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.o;
        }
        return compoundPaddingRight;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.L.end();
            this.L = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, O);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        Rect rect = this.N;
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.D + rect.top;
        int i4 = this.F - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.p || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a2 = ca.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a2.left;
                rect.right -= a2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = a() ? this.I : this.J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.H;
            if (colorStateList != null) {
                this.G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i2 = bounds.left + bounds.right;
            } else {
                i2 = getWidth();
            }
            canvas.translate((float) ((i2 / 2) - (layout.getWidth() / 2)), (float) (((i3 + i4) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.q : this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        super.onLayout(z2, i2, i3, i4, i5);
        int i12 = 0;
        if (this.a != null) {
            Rect rect = this.N;
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a2 = ca.a(this.a);
            i6 = Math.max(0, a2.left - rect.left);
            i12 = Math.max(0, a2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (cv.a(this)) {
            i8 = getPaddingLeft() + i6;
            i7 = ((this.z + i8) - i6) - i12;
        } else {
            i7 = (getWidth() - getPaddingRight()) - i12;
            i8 = (i7 - this.z) + i6 + i12;
        }
        int gravity = getGravity() & ContentType.LONG_FORM_ON_DEMAND;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i11 = this.A;
            i10 = paddingTop - (i11 / 2);
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i11 = this.A;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.A;
            this.C = i8;
            this.D = i10;
            this.F = i9;
            this.E = i7;
        }
        i9 = i11 + i10;
        this.C = i8;
        this.D = i10;
        this.F = i9;
        this.E = i7;
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.s) {
            if (this.I == null) {
                this.I = a(this.q);
            }
            if (this.J == null) {
                this.J = a(this.r);
            }
        }
        Rect rect = this.N;
        Drawable drawable = this.a;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.a.getIntrinsicHeight();
        } else {
            i5 = 0;
            i4 = 0;
        }
        this.B = Math.max(this.s ? Math.max(this.I.getWidth(), this.J.getWidth()) + (this.m << 1) : 0, i5);
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect a2 = ca.a(drawable3);
            i7 = Math.max(i7, a2.left);
            i8 = Math.max(i8, a2.right);
        }
        int max = Math.max(this.n, (this.B * 2) + i7 + i8);
        int max2 = Math.max(i6, i4);
        this.z = max;
        this.A = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.q : this.r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != 3) goto L_0x0158;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r0 = r9.x
            r0.addMovement(r10)
            int r0 = r10.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0102
            r3 = 3
            r4 = 2
            r5 = 0
            if (r0 == r2) goto L_0x0095
            if (r0 == r4) goto L_0x0018
            if (r0 == r3) goto L_0x0095
            goto L_0x0158
        L_0x0018:
            int r0 = r9.t
            if (r0 == 0) goto L_0x0158
            if (r0 == r2) goto L_0x0061
            if (r0 == r4) goto L_0x0022
            goto L_0x0158
        L_0x0022:
            float r10 = r10.getX()
            int r0 = r9.c()
            float r1 = r9.v
            float r1 = r10 - r1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0036
            float r0 = (float) r0
            float r0 = r1 / r0
            goto L_0x003f
        L_0x0036:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003f
        L_0x003d:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003f:
            boolean r1 = defpackage.cv.a(r9)
            if (r1 == 0) goto L_0x0046
            float r0 = -r0
        L_0x0046:
            float r1 = r9.b
            float r0 = r0 + r1
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x004f
            r0 = 0
            goto L_0x0055
        L_0x004f:
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0055
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0055:
            float r1 = r9.b
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0060
            r9.v = r10
            r9.a(r0)
        L_0x0060:
            return r2
        L_0x0061:
            float r0 = r10.getX()
            float r1 = r10.getY()
            float r3 = r9.v
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            int r5 = r9.u
            float r5 = (float) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0087
            float r3 = r9.w
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r5 = r9.u
            float r5 = (float) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0158
        L_0x0087:
            r9.t = r4
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r2)
            r9.v = r0
            r9.w = r1
            return r2
        L_0x0095:
            int r0 = r9.t
            if (r0 != r4) goto L_0x00fa
            r9.t = r1
            int r0 = r10.getAction()
            if (r0 != r2) goto L_0x00a9
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00a9
            r0 = 1
            goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            boolean r4 = r9.isChecked()
            if (r0 == 0) goto L_0x00e0
            android.view.VelocityTracker r0 = r9.x
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r9.x
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r9.y
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00db
            boolean r6 = defpackage.cv.a(r9)
            if (r6 == 0) goto L_0x00d3
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d9
            goto L_0x00d7
        L_0x00d3:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d9
        L_0x00d7:
            r0 = 1
            goto L_0x00e1
        L_0x00d9:
            r0 = 0
            goto L_0x00e1
        L_0x00db:
            boolean r0 = r9.a()
            goto L_0x00e1
        L_0x00e0:
            r0 = r4
        L_0x00e1:
            if (r0 == r4) goto L_0x00e6
            r9.playSoundEffect(r1)
        L_0x00e6:
            r9.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            r0.setAction(r3)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r10)
            return r2
        L_0x00fa:
            r9.t = r1
            android.view.VelocityTracker r0 = r9.x
            r0.clear()
            goto L_0x0158
        L_0x0102:
            float r0 = r10.getX()
            float r3 = r10.getY()
            boolean r4 = r9.isEnabled()
            if (r4 == 0) goto L_0x0158
            android.graphics.drawable.Drawable r4 = r9.a
            if (r4 == 0) goto L_0x0150
            int r4 = r9.b()
            android.graphics.drawable.Drawable r5 = r9.a
            android.graphics.Rect r6 = r9.N
            r5.getPadding(r6)
            int r5 = r9.D
            int r6 = r9.u
            int r5 = r5 - r6
            int r7 = r9.C
            int r7 = r7 + r4
            int r7 = r7 - r6
            int r4 = r9.B
            int r4 = r4 + r7
            android.graphics.Rect r6 = r9.N
            int r6 = r6.left
            int r4 = r4 + r6
            android.graphics.Rect r6 = r9.N
            int r6 = r6.right
            int r4 = r4 + r6
            int r6 = r9.u
            int r4 = r4 + r6
            int r8 = r9.F
            int r8 = r8 + r6
            float r6 = (float) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0150
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0150
            float r4 = (float) r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0150
            float r4 = (float) r8
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0150
            r1 = 1
        L_0x0150:
            if (r1 == 0) goto L_0x0158
            r9.t = r2
            r9.v = r0
            r9.w = r3
        L_0x0158:
            boolean r10 = super.onTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        float f2 = 1.0f;
        if (getWindowToken() == null || !ip.B(this)) {
            ObjectAnimator objectAnimator = this.L;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!isChecked) {
                f2 = 0.0f;
            }
            a(f2);
            return;
        }
        if (!isChecked) {
            f2 = 0.0f;
        }
        this.L = ObjectAnimator.ofFloat(this, c, new float[]{f2});
        this.L.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.L.setAutoCancel(true);
        }
        this.L.start();
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.a((TextView) this, callback));
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.h;
    }
}
