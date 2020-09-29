package defpackage;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: iut reason: default package */
public final class iut {
    public static void a(TextView textView, Context context, int i) {
        textView.setTextSize(context.getResources().getDimension(R.dimen.concert_entity_subtitle_text));
        vgl.b(context, textView, R.attr.pasteTextAppearanceArticle);
        textView.setMaxLines(1);
        textView.setEllipsize(TruncateAt.END);
        textView.setGravity(1);
        textView.setTextColor(i);
        textView.setLayoutParams(new LayoutParams(-2, -2));
    }
}
