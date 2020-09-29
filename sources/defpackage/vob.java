package defpackage;

import android.content.Context;
import com.spotify.music.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: vob reason: default package */
public final class vob {
    final String a;
    final boolean b;
    private final CharSequence c;

    public vob(Context context, String str) {
        if (str.startsWith("com.spotify.mobile.android.tos:spotify:internal:signup:tos")) {
            this.a = a(str, context.getString(R.string.terms_and_conditions_url));
            this.c = context.getText(R.string.terms_and_conditions_title_terms_and_conditions);
            this.b = false;
        } else if (str.startsWith("com.spotify.mobile.android.tos:spotify:internal:signup:policy")) {
            this.a = a(str, context.getString(R.string.terms_and_conditions_privacy_policy_url));
            this.c = context.getText(R.string.terms_and_conditions_title_privacy_policy);
            this.b = true;
        } else {
            this.a = context.getString(R.string.terms_and_conditions_url);
            this.c = context.getText(R.string.terms_and_conditions_title_terms_and_conditions);
            this.b = false;
        }
    }

    private static String a(String str, String str2) {
        Matcher matcher = Pattern.compile("https?://(www\\.)?spotify\\.com.*").matcher(str);
        return matcher.find() ? matcher.group() : str2;
    }
}
