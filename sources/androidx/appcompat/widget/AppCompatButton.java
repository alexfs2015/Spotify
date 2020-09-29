package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.R;

public class AppCompatButton extends Button implements io, jg {
    private final bo a;
    private final bw b;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(cm.a(context), attributeSet, i);
        this.a = new bo(this);
        this.a.a(attributeSet, i);
        this.b = new bw(this);
        this.b.a(attributeSet, i);
        this.b.a();
    }

    public void a(ColorStateList colorStateList) {
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a(colorStateList);
        }
    }

    public void a(Mode mode) {
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a(mode);
        }
    }

    public Mode b() {
        bo boVar = this.a;
        if (boVar != null) {
            return boVar.c();
        }
        return null;
    }

    public ColorStateList b_() {
        bo boVar = this.a;
        if (boVar != null) {
            return boVar.b();
        }
        return null;
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

    public int getAutoSizeMaxTextSize() {
        if (d) {
            return super.getAutoSizeMaxTextSize();
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            return Math.round(bwVar.c.d);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (d) {
            return super.getAutoSizeMinTextSize();
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            return Math.round(bwVar.c.c);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (d) {
            return super.getAutoSizeStepGranularity();
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            return Math.round(bwVar.c.b);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        bw bwVar = this.b;
        return bwVar != null ? bwVar.c.e : new int[0];
    }

    public int getAutoSizeTextType() {
        if (d) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        bw bwVar = this.b;
        if (bwVar != null) {
            return bwVar.c.a;
        }
        return 0;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.b != null && !d && this.b.c.b()) {
            this.b.c.a();
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

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a(context, i);
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
}
