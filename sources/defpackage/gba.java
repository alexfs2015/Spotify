package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: gba reason: default package */
public final class gba {
    public static void a(EditText editText) {
        fay.a(editText);
        editText.requestFocus();
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
    }

    public static void b(EditText editText) {
        fay.a(editText);
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }
}
