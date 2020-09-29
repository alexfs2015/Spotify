package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.spotify.music.R;

public class AppCompatCheckBox extends CheckBox implements io, jn {
    private final bp a;
    private final bo b;
    private final bw c;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(cm.a(context), attributeSet, i);
        this.a = new bp(this);
        this.a.a(attributeSet, i);
        this.b = new bo(this);
        this.b.a(attributeSet, i);
        this.c = new bw(this);
        this.c.a(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        bp bpVar = this.a;
        if (bpVar != null) {
            bpVar.a();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(ab.b(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        bp bpVar = this.a;
        return bpVar != null ? bpVar.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public final void b(ColorStateList colorStateList) {
        bp bpVar = this.a;
        if (bpVar != null) {
            bpVar.a(colorStateList);
        }
    }

    public final void b(Mode mode) {
        bp bpVar = this.a;
        if (bpVar != null) {
            bpVar.a(mode);
        }
    }

    public final void a(ColorStateList colorStateList) {
        bo boVar = this.b;
        if (boVar != null) {
            boVar.a(colorStateList);
        }
    }

    public final ColorStateList b_() {
        bo boVar = this.b;
        if (boVar != null) {
            return boVar.b();
        }
        return null;
    }

    public final void a(Mode mode) {
        bo boVar = this.b;
        if (boVar != null) {
            boVar.a(mode);
        }
    }

    public final Mode aA_() {
        bo boVar = this.b;
        if (boVar != null) {
            return boVar.c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        bo boVar = this.b;
        if (boVar != null) {
            boVar.a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        bo boVar = this.b;
        if (boVar != null) {
            boVar.a(i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        bo boVar = this.b;
        if (boVar != null) {
            boVar.d();
        }
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.a();
        }
    }
}
