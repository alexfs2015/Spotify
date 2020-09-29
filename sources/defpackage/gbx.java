package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: gbx reason: default package */
public final class gbx {
    public static void a(EditText editText) {
        fbp.a(editText);
        editText.requestFocus();
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
    }

    public static void b(EditText editText) {
        fbp.a(editText);
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }
}
