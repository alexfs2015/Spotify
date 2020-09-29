package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class AppCompatCheckedTextView extends CheckedTextView {
    private static final int[] a = {16843016};
    private final bw b;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(cm.a(context), attributeSet, i);
        this.b = new bw(this);
        this.b.a(attributeSet, i);
        this.b.a();
        cp a2 = cp.a(getContext(), attributeSet, a, i, 0);
        setCheckMarkDrawable(a2.a(0));
        a2.a.recycle();
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ab.b(getContext(), i));
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
        bw bwVar = this.b;
        if (bwVar != null) {
            bwVar.a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return br.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.a((TextView) this, callback));
    }
}
