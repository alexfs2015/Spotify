package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;

/* renamed from: iby reason: default package */
public final class iby {
    public static Spannable a(String str, String str2, int i, a aVar) {
        int length = str2.length();
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ibt(i, aVar), 0, length, 17);
        if (fax.a(str)) {
            return spannableString;
        }
        return SpannableStringBuilder.valueOf(str).append(" ").append(spannableString);
    }
}
