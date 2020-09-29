package defpackage;

import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* renamed from: jrx reason: default package */
public final class jrx {

    /* renamed from: jrx$a */
    public interface a {
        boolean onClick(String str);
    }

    /* renamed from: jrx$b */
    static class b extends URLSpan {
        private final a a;

        public final void onClick(View view) {
            a aVar = this.a;
            if (!(aVar != null ? aVar.onClick(getURL()) : false)) {
                super.onClick(view);
            }
            view.invalidate();
        }

        public b(String str, a aVar) {
            super(str);
            this.a = aVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public static void a(Spannable spannable, a aVar) {
        URLSpan[] uRLSpanArr;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new b(uRLSpan.getURL(), aVar), spanStart, spanEnd, 0);
        }
    }
}
