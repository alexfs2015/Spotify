package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: jxb reason: default package */
public final class jxb {
    public static void a(Context context, TextView textView, String str) {
        if (a(str)) {
            a(context, textView, true);
        } else {
            b(context, textView, str);
        }
    }

    private static boolean a(String str) {
        if (str != null) {
            if ("EXPLICIT".equals(str.toUpperCase(Locale.US))) {
                return true;
            }
        }
        return false;
    }

    private static void b(Context context, TextView textView, String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            textView.setText(a(context, textView.getText(), str, 0));
        }
    }

    public static String a(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled() ? "EXPLICIT" : "E";
    }

    public static void a(Context context, TextView textView, boolean z) {
        if (z) {
            b(context, textView, a(context));
        }
    }

    public static void a(Context context, TextView textView, boolean z, String str) {
        if (z) {
            b(context, textView, str);
        }
    }

    public static void b(Context context, TextView textView, boolean z) {
        if (z) {
            b(context, textView, "PREMIUM");
        }
    }

    public static CharSequence a(Context context, CharSequence charSequence, String str, int i) {
        fay.a(i == 0 || i <= charSequence.length(), (Object) "Label position is outside of text bounds");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence b = jsd.b(charSequence.subSequence(0, i));
        CharSequence b2 = jsd.b(charSequence.subSequence(i, charSequence.length()));
        if (!TextUtils.isEmpty(b)) {
            spannableStringBuilder.append(b);
            spannableStringBuilder.append(' ');
        }
        spannableStringBuilder.append(str);
        if (!TextUtils.isEmpty(b2)) {
            spannableStringBuilder.append(' ');
            spannableStringBuilder.append(b2);
        }
        spannableStringBuilder.setSpan(new fzd(context, uts.b(3.0f, context.getResources())), i, str.length() + i, 33);
        return spannableStringBuilder;
    }
}
