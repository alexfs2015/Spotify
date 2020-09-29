package defpackage;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import java.util.Locale;

/* renamed from: ltf reason: default package */
public final class ltf {
    private static final String[] a;

    static {
        String str = "th";
        a = new String[]{str, "st", "nd", "rd", str, str, str, str, str, str};
    }

    public static CharSequence a(int i) {
        if (!"en".equals(gos.a(Locale.getDefault()))) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i));
        int length = sb.length();
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                sb.append("th");
                break;
            default:
                sb.append(a[i % 10]);
                break;
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new RelativeSizeSpan(0.5f), length, sb.length(), 0);
        return spannableString;
    }
}
