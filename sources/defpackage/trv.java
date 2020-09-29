package defpackage;

import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;
import java.util.regex.Pattern;

/* renamed from: trv reason: default package */
public final class trv {
    private static final Pattern a = Pattern.compile(" ");
    private final TextView b;
    private final String c;
    private final String d;
    private final defpackage.trx.a e;

    /* renamed from: trv$a */
    public static class a {
        public static trv a(TextView textView, String str, defpackage.trx.a aVar) {
            return new trv((TextView) a(textView, 1), (String) a(str, 2), (defpackage.trx.a) a(aVar, 3));
        }

        private static <T> T a(T t, int i) {
            if (t != null) {
                return t;
            }
            StringBuilder sb = new StringBuilder("Method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    public trv(TextView textView, String str, defpackage.trx.a aVar) {
        this.b = textView;
        this.c = str;
        StringBuilder sb = new StringBuilder("… ");
        sb.append(a.matcher(this.c).replaceAll(" "));
        this.d = sb.toString();
        this.e = aVar;
    }

    public final Spannable a(Spannable spannable) {
        if (this.b.getWidth() == 0) {
            throw new IllegalStateException("TextView's width need to be set, to be able to markup ellipsis");
        } else if (!a((CharSequence) spannable)) {
            return spannable;
        } else {
            SpannableStringBuilder b2 = b(spannable);
            a(spannable, b2);
            return b2;
        }
    }

    private SpannableStringBuilder b(Spannable spannable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable.subSequence(0, b((CharSequence) spannable).getLineEnd(this.b.getMaxLines() - 1)));
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(spannableStringBuilder);
            sb.append(this.d);
            if (b((CharSequence) sb.toString()).getLineCount() <= this.b.getMaxLines()) {
                break;
            }
            int length = spannableStringBuilder.length() - this.d.length();
            if (length <= 0 || length >= spannableStringBuilder.length()) {
                break;
            }
            spannableStringBuilder.delete(length, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    private boolean a(CharSequence charSequence) {
        return this.b.getMaxLines() > 0 && b(charSequence).getLineCount() > this.b.getMaxLines();
    }

    private void a(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append(this.d);
        spannableStringBuilder.setSpan(new trx(this.e, charSequence), spannableStringBuilder.length() - this.c.length(), spannableStringBuilder.length(), 33);
    }

    private Layout b(CharSequence charSequence) {
        int width = (this.b.getWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight();
        Alignment alignment = this.b.getLayout() != null ? this.b.getLayout().getAlignment() : Alignment.ALIGN_NORMAL;
        if (VERSION.SDK_INT >= 23) {
            Builder hyphenationFrequency = Builder.obtain(charSequence, 0, charSequence.length(), this.b.getPaint(), width).setAlignment(alignment).setTextDirection(TextDirectionHeuristics.ANYRTL_LTR).setLineSpacing(this.b.getLineSpacingExtra(), this.b.getLineSpacingMultiplier()).setIncludePad(this.b.getIncludeFontPadding()).setBreakStrategy(this.b.getBreakStrategy()).setHyphenationFrequency(this.b.getHyphenationFrequency());
            if (VERSION.SDK_INT >= 26) {
                hyphenationFrequency.setJustificationMode(this.b.getJustificationMode());
            }
            return hyphenationFrequency.build();
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.b.getPaint(), width, alignment, this.b.getLineSpacingMultiplier(), this.b.getLineSpacingExtra(), this.b.getIncludeFontPadding());
        return staticLayout;
    }
}
