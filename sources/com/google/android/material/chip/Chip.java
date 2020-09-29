package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.spotify.music.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends AppCompatCheckBox implements defpackage.ezo.a {
    /* access modifiers changed from: private */
    public static final Rect c = new Rect();
    private static final int[] d = {16842913};
    /* access modifiers changed from: 0000 */
    public ezo a;
    OnCheckedChangeListener b;
    private RippleDrawable e;
    private boolean f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final a k;
    private final Rect l;
    private final RectF m;
    private final defpackage.gb.a n;

    class a extends ju {
        a(Chip chip) {
            super(chip);
        }

        public final int a(float f2, float f3) {
            return (!Chip.this.h() || !Chip.this.i().contains(f2, f3)) ? -1 : 0;
        }

        public final void a(ja jaVar) {
            CharSequence charSequence = "";
            if (Chip.this.h()) {
                Chip chip = Chip.this;
                if (chip.a != null) {
                    ezo ezo = chip.a;
                }
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                Object[] objArr = new Object[1];
                if (TextUtils.isEmpty(text)) {
                    text = charSequence;
                }
                objArr[0] = text;
                jaVar.e((CharSequence) context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                jaVar.b(Chip.this.j());
                jaVar.a(defpackage.ja.a.c);
                jaVar.i(Chip.this.isEnabled());
                return;
            }
            jaVar.e(charSequence);
            jaVar.b(Chip.c);
        }

        public final void a(List<Integer> list) {
            if (Chip.this.h()) {
                list.add(Integer.valueOf(0));
            }
        }

        public final void b(ja jaVar) {
            jaVar.a(Chip.this.a != null && Chip.this.a.i);
            jaVar.b((CharSequence) Chip.class.getName());
            CharSequence text = Chip.this.getText();
            if (VERSION.SDK_INT >= 23) {
                jaVar.c(text);
            } else {
                jaVar.e(text);
            }
        }

        public final boolean b(int i, int i2) {
            if (i2 == 16 && i == 0) {
                return Chip.this.d();
            }
            return false;
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g = Integer.MIN_VALUE;
        this.l = new Rect();
        this.m = new RectF();
        this.n = new defpackage.gb.a() {
            public final void a(int i) {
            }

            public final void a(Typeface typeface) {
                Chip chip = Chip.this;
                chip.setText(chip.getText());
                Chip.this.requestLayout();
                Chip.this.invalidate();
            }
        };
        if (attributeSet != null) {
            String str = "http://schemas.android.com/apk/res/android";
            if (attributeSet.getAttributeValue(str, "background") != null) {
                throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
            } else if (attributeSet.getAttributeValue(str, "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue(str, "drawableStart") == null) {
                String str2 = "Please set end drawable using R.attr#closeIcon.";
                if (attributeSet.getAttributeValue(str, "drawableEnd") != null) {
                    throw new UnsupportedOperationException(str2);
                } else if (attributeSet.getAttributeValue(str, "drawableRight") != null) {
                    throw new UnsupportedOperationException(str2);
                } else if (attributeSet.getAttributeBooleanValue(str, "singleLine", true) && attributeSet.getAttributeIntValue(str, "lines", 1) == 1 && attributeSet.getAttributeIntValue(str, "minLines", 1) == 1 && attributeSet.getAttributeIntValue(str, "maxLines", 1) == 1) {
                    attributeSet.getAttributeIntValue(str, "gravity", 8388627);
                } else {
                    throw new UnsupportedOperationException("Chip does not support multi-line text");
                }
            } else {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
        }
        ezo a2 = ezo.a(context, attributeSet, i2, 2132018000);
        ezo ezo = this.a;
        if (ezo != a2) {
            if (ezo != null) {
                ezo.a((defpackage.ezo.a) null);
            }
            this.a = a2;
            this.a.a((defpackage.ezo.a) this);
            if (fao.a) {
                this.e = new RippleDrawable(fao.a(this.a.a), this.a, null);
                this.a.a(false);
                ip.a((View) this, (Drawable) this.e);
            } else {
                this.a.a(true);
                ip.a((View) this, (Drawable) this.a);
            }
        }
        this.k = new a(this);
        ip.a((View) this, (ht) this.k);
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    if (Chip.this.a != null) {
                        Chip.this.a.getOutline(outline);
                    } else {
                        outline.setAlpha(0.0f);
                    }
                }
            });
        }
        setChecked(this.f);
        a2.u = false;
        setText(a2.b);
        setEllipsize(a2.t);
        setIncludeFontPadding(false);
        if (k() != null) {
            a(k());
        }
        setSingleLine();
        setGravity(8388627);
        f();
    }

    private void a(int i2) {
        int i3 = this.g;
        if (i3 != i2) {
            if (i3 == 0) {
                d(false);
            }
            this.g = i2;
            if (i2 == 0) {
                d(true);
            }
        }
    }

    private void a(fan fan) {
        TextPaint paint = getPaint();
        paint.drawableState = this.a.getState();
        fan.a(getContext(), paint, this.n);
    }

    private boolean a(MotionEvent motionEvent) {
        String str = "Unable to send Accessibility Exit event";
        String str2 = "Chip";
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = ju.class.getDeclaredField("e");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.k)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = ju.class.getDeclaredMethod("a", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.k, new Object[]{Integer.valueOf(Integer.MIN_VALUE)});
                    return true;
                }
            } catch (NoSuchMethodException e2) {
                Log.e(str2, str, e2);
            } catch (IllegalAccessException e3) {
                Log.e(str2, str, e3);
            } catch (InvocationTargetException e4) {
                Log.e(str2, str, e4);
            } catch (NoSuchFieldException e5) {
                Log.e(str2, str, e5);
            }
        }
        return false;
    }

    private boolean a(boolean z) {
        g();
        if (z) {
            if (this.g == -1) {
                a(0);
                return true;
            }
        } else if (this.g == 0) {
            a(-1);
            return true;
        }
        return false;
    }

    private void b(boolean z) {
        if (this.h != z) {
            this.h = z;
            refreshDrawableState();
        }
    }

    private void c(boolean z) {
        if (this.i != z) {
            this.i = z;
            refreshDrawableState();
        }
    }

    private void d(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
        }
    }

    private void f() {
        if (!TextUtils.isEmpty(getText())) {
            ezo ezo = this.a;
            if (ezo != null) {
                float f2 = ezo.l + this.a.s + this.a.o + this.a.p;
                if ((this.a.d && this.a.c() != null) || (this.a.k != null && this.a.j && isChecked())) {
                    f2 += this.a.m + this.a.n + this.a.e;
                }
                if (this.a.f && this.a.d() != null) {
                    f2 += this.a.q + this.a.r + this.a.h;
                }
                if (((float) ip.j(this)) != f2) {
                    ip.b(this, ip.i(this), getPaddingTop(), (int) f2, getPaddingBottom());
                }
            }
        }
    }

    private void g() {
        if (this.g == Integer.MIN_VALUE) {
            a(-1);
        }
    }

    /* access modifiers changed from: private */
    public boolean h() {
        ezo ezo = this.a;
        return (ezo == null || ezo.d() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public RectF i() {
        this.m.setEmpty();
        if (h()) {
            this.a.a(this.m);
        }
        return this.m;
    }

    /* access modifiers changed from: private */
    public Rect j() {
        RectF i2 = i();
        this.l.set((int) i2.left, (int) i2.top, (int) i2.right, (int) i2.bottom);
        return this.l;
    }

    private fan k() {
        ezo ezo = this.a;
        if (ezo != null) {
            return ezo.c;
        }
        return null;
    }

    public final void c() {
        f();
        requestLayout();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public final boolean d() {
        playSoundEffect(0);
        this.k.a(0, 1);
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return a(motionEvent) || this.k.a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.k.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        ezo ezo = this.a;
        int i2 = 0;
        if (ezo != null && ezo.a(ezo.g)) {
            ezo ezo2 = this.a;
            int i3 = isEnabled() ? 1 : 0;
            if (this.j) {
                i3++;
            }
            if (this.i) {
                i3++;
            }
            if (this.h) {
                i3++;
            }
            if (isChecked()) {
                i3++;
            }
            int[] iArr = new int[i3];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.j) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.i) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.h) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            i2 = ezo2.a(iArr);
        }
        if (i2 != 0) {
            invalidate();
        }
    }

    public TruncateAt getEllipsize() {
        ezo ezo = this.a;
        if (ezo != null) {
            return ezo.t;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.g == 0) {
            rect.set(j());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public CharSequence getText() {
        ezo ezo = this.a;
        return ezo != null ? ezo.b : "";
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!TextUtils.isEmpty(getText())) {
            ezo ezo = this.a;
            if (ezo != null && !ezo.u) {
                int save = canvas.save();
                ezo ezo2 = this.a;
                float b2 = (ezo2 != null ? ezo2.l : 0.0f) + ezo2.b();
                ezo ezo3 = this.a;
                float f2 = b2 + (ezo3 != null ? ezo3.o : 0.0f);
                if (ip.f(this) != 0) {
                    f2 = -f2;
                }
                canvas.translate(f2, 0.0f);
                super.onDraw(canvas);
                canvas.restoreToCount(save);
                return;
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (z) {
            a(-1);
        } else {
            a(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z, i2, rect);
        a aVar = this.k;
        if (aVar.d != Integer.MIN_VALUE) {
            aVar.c(aVar.d);
        }
        if (z) {
            aVar.a(i2, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            c(i().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            c(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getKeyCode()
            r1 = 61
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0041
            r1 = 66
            if (r0 == r1) goto L_0x0031
            switch(r0) {
                case 21: goto L_0x0022;
                case 22: goto L_0x0012;
                case 23: goto L_0x0031;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x006d
        L_0x0012:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006d
            boolean r0 = defpackage.fak.a(r6)
            r0 = r0 ^ r3
            boolean r2 = r6.a(r0)
            goto L_0x006d
        L_0x0022:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006d
            boolean r0 = defpackage.fak.a(r6)
            boolean r2 = r6.a(r0)
            goto L_0x006d
        L_0x0031:
            int r0 = r6.g
            r1 = -1
            if (r0 == r1) goto L_0x003d
            if (r0 == 0) goto L_0x0039
            goto L_0x006d
        L_0x0039:
            r6.d()
            return r3
        L_0x003d:
            r6.performClick()
            return r3
        L_0x0041:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x0052
        L_0x0049:
            boolean r0 = r8.hasModifiers(r3)
            if (r0 == 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 == 0) goto L_0x006d
            android.view.ViewParent r1 = r6.getParent()
            r4 = r6
        L_0x0059:
            android.view.View r4 = r4.focusSearch(r0)
            if (r4 == 0) goto L_0x0067
            if (r4 == r6) goto L_0x0067
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == r1) goto L_0x0059
        L_0x0067:
            if (r4 == 0) goto L_0x006d
            r4.requestFocus()
            return r3
        L_0x006d:
            if (r2 == 0) goto L_0x0073
            r6.invalidate()
            return r3
        L_0x0073:
            boolean r7 = super.onKeyDown(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!i().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.i()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.h
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.b(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.h
            if (r0 == 0) goto L_0x0034
            r5.d()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.b(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.b(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x004b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            return r2
        L_0x004b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == this.a || drawable == this.e) {
            super.setBackground(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
    }

    public void setBackgroundColor(int i2) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == this.a || drawable == this.e) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int i2) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(Mode mode) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setChecked(boolean z) {
        ezo ezo = this.a;
        if (ezo == null) {
            this.f = z;
            return;
        }
        if (ezo.i) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z) {
                OnCheckedChangeListener onCheckedChangeListener = this.b;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(this, z);
                }
            }
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TruncateAt truncateAt) {
        if (this.a != null) {
            if (truncateAt != TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                ezo ezo = this.a;
                if (ezo != null) {
                    ezo.t = truncateAt;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setGravity(int i2) {
        if (i2 == 8388627) {
            super.setGravity(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        ezo ezo = this.a;
        if (ezo != null) {
            ezo.v = i2;
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (this.a != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            CharSequence a2 = he.a().a(charSequence);
            if (this.a.u) {
                a2 = null;
            }
            super.setText(a2, bufferType);
            ezo ezo = this.a;
            if (ezo != null) {
                ezo.a(charSequence);
            }
        }
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        ezo ezo = this.a;
        if (ezo != null) {
            ezo.a(i2);
        }
        if (k() != null) {
            k().b(getContext(), getPaint(), this.n);
            a(k());
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        ezo ezo = this.a;
        if (ezo != null) {
            ezo.a(i2);
        }
        if (k() != null) {
            k().b(context, getPaint(), this.n);
            a(k());
        }
    }
}
