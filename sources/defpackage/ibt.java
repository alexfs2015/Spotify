package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: ibt reason: default package */
public final class ibt extends ClickableSpan {
    private final int a;
    private final a b;

    /* renamed from: ibt$a */
    public interface a {
        void onLinkClicked();
    }

    public ibt(int i, a aVar) {
        this.a = i;
        this.b = aVar;
    }

    public final void onClick(View view) {
        this.b.onLinkClicked();
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.a);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }
}
