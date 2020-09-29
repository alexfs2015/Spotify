package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: kwa reason: default package */
public final class kwa implements xiy<String, CharSequence> {
    private final int a;

    public kwa(int i) {
        this.a = i;
    }

    /* renamed from: a */
    public final CharSequence call(String str) {
        Pattern compile = Pattern.compile("\\[(.*?)\\]", 40);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Matcher matcher = compile.matcher(str);
        int i = 0;
        while (matcher.find()) {
            int i2 = i << 1;
            int start = matcher.start() - i2;
            int end = matcher.end() - i2;
            int i3 = start + 1;
            int i4 = end - 1;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.a), i3, i4, 0);
            spannableStringBuilder.delete(start, i3);
            spannableStringBuilder.delete(end - 2, i4);
            i++;
        }
        return spannableStringBuilder;
    }
}
