package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public class AppCompatTextView extends TextView implements io, jg, jo {
    private final bo a;
    private final bw b;
    private final bv c;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(cm.a(context), attributeSet, i);
        this.a = new bo(this);
        this.a.a(attributeSet, i);
        this.b = new bw(this);
        this.b.a(attributeSet, i);
        this.b.a();
        this.c = new bv(this);
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a();
        }
    }

    public final void a(ColorStateList colorStateList) {
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a(colorStateList);
        }
    }

    public final ColorStateList b_() {
        bo boVar = this.a;
        if (boVar != null) {
            return boVar.b();
        }
        return null;
    }

    public final void a(Mode mode) {
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a(mode);
        }
    }

    public final Mode aA_() {
        bo boVar = this.a;
        if (boVar != null) {
            return boVar.c();
        }
        return null;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        bo boVar = this.a;
        if (boVar != null) {
            boVar.d();
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.b();
        }
    }

    public void setTextSize(int i, float f) {
        if (d) {
            super.setTextSize(i, f);
            return;
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a(i, f);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.b != null && !d && this.b.c.b()) {
            this.b.c.a();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (d) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        if (!d) {
            bw bwVar = this.b;
            if (bwVar != null) {
                return bwVar.c();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (d) {
            return super.getAutoSizeStepGranularity();
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            return bwVar.d();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (d) {
            return super.getAutoSizeMinTextSize();
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            return bwVar.e();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (d) {
            return super.getAutoSizeMaxTextSize();
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            return bwVar.f();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        bw bwVar = this.b;
        return bwVar != null ? bwVar.g() : new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return br.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            jm.b(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            jm.c(this, i);
        }
    }

    public void setLineHeight(int i) {
        jm.d(this, i);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.a((TextView) this, callback));
    }

    public CharSequence getText() {
        return super.getText();
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            bv bvVar = this.c;
            if (bvVar != null) {
                bvVar.a = textClassifier;
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            bv bvVar = this.c;
            if (bvVar != null) {
                return bvVar.a();
            }
        }
        return super.getTextClassifier();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i != 0 ? ab.b(context, i) : null;
        Drawable b3 = i2 != 0 ? ab.b(context, i2) : null;
        Drawable b4 = i3 != 0 ? ab.b(context, i3) : null;
        if (i4 != 0) {
            drawable = ab.b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, drawable);
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i != 0 ? ab.b(context, i) : null;
        Drawable b3 = i2 != 0 ? ab.b(context, i2) : null;
        Drawable b4 = i3 != 0 ? ab.b(context, i3) : null;
        if (i4 != 0) {
            drawable = ab.b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b2, b3, b4, drawable);
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a();
        }
    }

    public final void b(ColorStateList colorStateList) {
        bw bwVar = this.b;
        if (bwVar.b == null) {
            bwVar.b = new cn();
        }
        bwVar.b.a = colorStateList;
        bwVar.b.d = colorStateList != null;
        bwVar.h();
        this.b.a();
    }

    public final void b(Mode mode) {
        bw bwVar = this.b;
        if (bwVar.b == null) {
            bwVar.b = new cn();
        }
        bwVar.b.b = mode;
        bwVar.b.c = mode != null;
        bwVar.h();
        this.b.a();
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a2 = (typeface == null || i <= 0) ? null : gf.a(getContext(), typeface, i);
        if (a2 != null) {
            typeface = a2;
        }
        super.setTypeface(typeface, i);
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }
}
