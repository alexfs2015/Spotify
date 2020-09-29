package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: vne reason: default package */
public abstract class vne implements TextWatcher {
    public abstract void a(CharSequence charSequence);

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        a(charSequence);
    }
}
