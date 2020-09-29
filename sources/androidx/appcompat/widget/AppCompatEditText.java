package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.music.R;

public class AppCompatEditText extends EditText implements io {
    private final bo a;
    private final bw b;
    private final bv c;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(cm.a(context), attributeSet, i);
        this.a = new bo(this);
        this.a.a(attributeSet, i);
        this.b = new bw(this);
        this.b.a(attributeSet, i);
        this.b.a();
        this.c = new bv(this);
    }

    public Editable getText() {
        if (VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
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

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a(context, i);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return br.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.a((TextView) this, callback));
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
}
