package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: uea reason: default package */
public final class uea extends ClickableSpan {
    private final a a;
    private final CharSequence b;

    /* renamed from: uea$a */
    public interface a {
        void onPostfixClicked(CharSequence charSequence);
    }

    public uea(a aVar, CharSequence charSequence) {
        this.a = aVar;
        this.b = charSequence;
    }

    public final void onClick(View view) {
        this.a.onPostfixClicked(this.b);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }
}
