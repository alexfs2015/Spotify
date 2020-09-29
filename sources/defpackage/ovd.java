package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.spotify.music.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ovd reason: default package */
final class ovd {
    private final Context a;
    private final ftm b;

    public ovd(Context context, ftm ftm) {
        this.a = context;
        this.b = ftm;
    }

    public final void a() {
        String str = "ICON_ICON";
        SpannableString spannableString = new SpannableString(this.a.getString(R.string.playlist_shuffle_dialog_preview_education_body, new Object[]{str}));
        Matcher matcher = Pattern.compile(str).matcher(spannableString);
        if (matcher.find()) {
            Drawable a2 = frr.a(this.a, (float) vfj.c(16.0f, this.a.getResources()));
            a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
            spannableString.setSpan(new ImageSpan(a2, 1), matcher.start(), matcher.end(), 17);
        }
        this.b.a(this.a.getString(R.string.playlist_shuffle_dialog_preview_education_title), spannableString).a(this.a.getString(R.string.playlist_shuffle_dialog_preview_education_button), $$Lambda$ovd$DzNwkBWbFSSCd_hTo1AQ6xyNti4.INSTANCE).a().a();
    }
}
