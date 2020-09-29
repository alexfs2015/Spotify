package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import com.spotify.music.R;

/* renamed from: oex reason: default package */
final class oex {
    public static CharSequence a(Context context, ofm ofm) {
        String str;
        String str2;
        String a = ofm.a(context.getResources());
        String b = ofm.b(context.getResources());
        if (vgi.a(context)) {
            boolean z = !fbo.a(b);
            if (z) {
                str2 = context.getString(R.string.npb_track_title_artist, new Object[]{b, a});
            } else {
                str2 = a;
            }
            SpannableString valueOf = SpannableString.valueOf(str2);
            if (z) {
                b(context, valueOf, 0, valueOf.length() - a.length());
                a(context, valueOf, b.length() + 1, valueOf.length());
            } else {
                a(context, valueOf, 0, a.length());
            }
            return valueOf;
        }
        boolean z2 = !fbo.a(b);
        if (z2) {
            str = context.getString(R.string.npb_track_title_artist, new Object[]{a, b});
        } else {
            str = a;
        }
        SpannableString valueOf2 = SpannableString.valueOf(str);
        if (z2) {
            a(context, valueOf2, 0, a.length());
            b(context, valueOf2, a.length() + 1, valueOf2.length());
        } else {
            a(context, valueOf2, 0, a.length());
        }
        return valueOf2;
    }

    private static void a(Context context, SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(new TextAppearanceSpan(context, 2132017661), i, i2, 33);
    }

    private static void b(Context context, SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(new TextAppearanceSpan(context, 2132017660), i, i2, 34);
    }
}
