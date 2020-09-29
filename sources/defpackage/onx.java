package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.spotify.music.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: onx reason: default package */
final class onx {
    private final Context a;
    private final fss b;

    public onx(Context context, fss fss) {
        this.a = context;
        this.b = fss;
    }

    public final void a() {
        String str = "ICON_ICON";
        SpannableString spannableString = new SpannableString(this.a.getString(R.string.playlist_shuffle_dialog_preview_education_body, new Object[]{str}));
        Matcher matcher = Pattern.compile(str).matcher(spannableString);
        if (matcher.find()) {
            Drawable a2 = fqx.a(this.a, (float) uts.c(16.0f, this.a.getResources()));
            a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
            spannableString.setSpan(new ImageSpan(a2, 1), matcher.start(), matcher.end(), 17);
        }
        this.b.a(this.a.getString(R.string.playlist_shuffle_dialog_preview_education_title), spannableString).a(this.a.getString(R.string.playlist_shuffle_dialog_preview_education_button), $$Lambda$onx$2lLxDrEzwSc6FDnwNS2FCLOKZ8.INSTANCE).a().a();
    }
}
