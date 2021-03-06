package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: fzv reason: default package */
public final class fzv {
    private static final Locale[] a = {new Locale("th"), new Locale("vi")};

    public static void a(TextView textView, Context context, AttributeSet attributeSet, int i) {
        boolean z;
        Locale a2 = jrq.a(context);
        Locale[] localeArr = a;
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                z = false;
                break;
            }
            if (a2.getLanguage().equals(localeArr[i2].getLanguage())) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            if (!textView.isInEditMode()) {
                Typeface a3 = utw.a(context, attributeSet, i);
                if (a3 != null) {
                    textView.setTypeface(a3);
                }
            }
            if (!textView.isInEditMode()) {
                int a4 = utv.a(context, attributeSet, i);
                if (a4 != 0) {
                    utv.a(textView, (float) a4);
                }
            }
            TextPaint paint = textView.getPaint();
            paint.setFlags(paint.getFlags() | 128 | 1);
            paint.setHinting(0);
        }
    }
}
