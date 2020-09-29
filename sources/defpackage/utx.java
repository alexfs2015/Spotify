package defpackage;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: utx reason: default package */
public final class utx extends MetricAffectingSpan {
    private Typeface a;

    public static CharSequence a(CharSequence charSequence, Typeface typeface) {
        if (charSequence == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new utx(typeface), 0, charSequence.length(), 33);
        return spannableString;
    }

    private utx(Typeface typeface) {
        this.a = typeface;
    }

    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }

    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    private void a(TextPaint textPaint) {
        Typeface typeface = this.a;
        if (typeface != null) {
            Typeface typeface2 = textPaint.getTypeface();
            if (typeface2 != null) {
                int style = typeface2.getStyle();
                if (typeface.getStyle() != style) {
                    typeface = Typeface.create(typeface, style);
                }
                this.a = typeface;
            }
            textPaint.setTypeface(typeface);
        }
    }
}
