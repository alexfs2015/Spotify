package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import java.util.List;
import java.util.Random;

/* renamed from: fsk reason: default package */
public final class fsk {
    final SpannableStringBuilder a = new SpannableStringBuilder();
    Random b = new Random();
    final List<CharSequence> c = Lists.a();
    final List<CharSequence> d = Lists.a();
    boolean e;
    public String f;
    int g;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.c.size()) {
            if (this.e || i3 > 0) {
                i2 = ((CharSequence) this.d.get(i3)).length() + i4;
            } else {
                i2 = i4;
            }
            int length = i2 + ((CharSequence) this.c.get(i3)).length();
            if (length >= i) {
                break;
            }
            i3++;
            i4 = length;
        }
        return i4;
    }

    /* access modifiers changed from: 0000 */
    public void a(TextView textView, int i) {
        this.d.clear();
        Context context = textView.getContext();
        int i2 = 0;
        while (i2 < i) {
            if (this.e) {
                List<CharSequence> list = this.d;
                int c2 = fr.c(context, R.color.white);
                StringBuilder sb = new StringBuilder();
                sb.append(i2 == 0 ? "" : "  ");
                sb.append(i2 + 1);
                sb.append(". ");
                SpannableString spannableString = new SpannableString(sb.toString());
                spannableString.setSpan(new ForegroundColorSpan(c2), 0, spannableString.length(), 17);
                list.add(spannableString);
            } else {
                this.d.add(a(context));
            }
            i2++;
        }
    }

    public static SpannableString a(Context context) {
        int c2 = fr.c(context, R.color.gray_70);
        SpannableString spannableString = new SpannableString("  •  ");
        spannableString.setSpan(new ForegroundColorSpan(c2), 0, spannableString.length(), 33);
        return spannableString;
    }
}
