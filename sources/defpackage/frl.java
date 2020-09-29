package defpackage;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;

/* renamed from: frl reason: default package */
public final class frl {
    public static CharSequence a(CharSequence charSequence, Drawable drawable) {
        if (drawable == null) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@  ");
        spannableStringBuilder.append(charSequence);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new vgv(drawable), 0, 1, 0);
        return spannableStringBuilder;
    }
}
