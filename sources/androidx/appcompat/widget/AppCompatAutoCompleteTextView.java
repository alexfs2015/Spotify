package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import com.spotify.music.R;

public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements io {
    private static final int[] a = {16843126};
    private final bo b;
    private final bw c;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(cm.a(context), attributeSet, i);
        cp a2 = cp.a(getContext(), attributeSet, a, i, 0);
        if (a2.f(0)) {
            setDropDownBackgroundDrawable(a2.a(0));
        }
        a2.a.recycle();
        this.b = new bo(this);
        this.b.a(attributeSet, i);
        this.c = new bw(this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    public final void a(ColorStateList colorStateList) {
        bo boVar = this.b;
        if (boVar != null) {
            boVar.a(colorStateList);
        }
    }

    public final void a(Mode mode) {
        bo boVar = this.b;
        if (boVar != null) {
            boVar.a(mode);
        }
    }

    public final Mode b() {
        bo boVar = this.b;
        if (boVar != null) {
            return boVar.c();
        }
        return null;
    }

    public final ColorStateList b_() {
        bo boVar = this.b;
        if (boVar != null) {
            return boVar.b();
        }
        return null;
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return br.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ab.b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.a(context, i);
        }
    }
}
