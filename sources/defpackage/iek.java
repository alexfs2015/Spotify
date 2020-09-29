package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;

/* renamed from: iek reason: default package */
public final class iek {
    public static Spannable a(String str, String str2, int i, a aVar) {
        int length = str2.length();
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ief(i, aVar), 0, length, 17);
        return fbo.a(str) ? spannableString : SpannableStringBuilder.valueOf(str).append(" ").append(spannableString);
    }
}
