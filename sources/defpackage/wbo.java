package defpackage;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: wbo reason: default package */
public final class wbo {
    private static final Pattern a = Pattern.compile("spotify:");
    private static final Pattern b = Pattern.compile("<a href=(\"[^\"]*\")[^<]*</a>");
    /* access modifiers changed from: private */
    public wbm c = new wbk();

    /* renamed from: wbo$a */
    class a extends URLSpan {
        public a(String str) {
            super(str);
        }

        public final void onClick(View view) {
            wbj wbj = new wbj(view.getContext(), getURL());
            if (wbj.b) {
                wbo.this.c.b();
            } else {
                wbo.this.c.a();
            }
            defpackage.de.a aVar = new defpackage.de.a();
            aVar.a(-16777216);
            aVar.a(true);
            aVar.a().a(view.getContext(), Uri.parse(wbj.a));
        }
    }

    private Spanned a(Spanned spanned) {
        URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
        if (uRLSpanArr == null || uRLSpanArr.length == 0) {
            return spanned;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spanned.getSpanStart(uRLSpan);
            int spanEnd = spanned.getSpanEnd(uRLSpan);
            int spanFlags = spanned.getSpanFlags(uRLSpan);
            spannableStringBuilder.removeSpan(uRLSpan);
            spannableStringBuilder.setSpan(new a(uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
        }
        return spannableStringBuilder;
    }

    private static String a(String str) {
        return a.matcher(str).replaceAll("com.spotify.mobile.android.tos:spotify:");
    }

    private static String b(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        Matcher matcher = b.matcher(str);
        int i = 0;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            sb.append(str, i, start);
            sb.append("<strong>");
            sb.append(str, start, end);
            sb.append("</strong>");
            i = end;
        }
        sb.append(str, i, str.length());
        return sb.toString();
    }

    public final void a(TextView textView, String str) {
        String a2 = a(b(str));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(a(jug.a(a2)));
    }

    public final void a(wbm wbm) {
        if (wbm == null) {
            wbm = new wbk();
        }
        this.c = wbm;
    }
}
