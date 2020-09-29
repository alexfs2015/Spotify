package defpackage;

import android.text.TextPaint;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import java.util.Locale;

/* renamed from: usw reason: default package */
public final class usw {
    private final SuppressLayoutTextView a;
    private final TextView b;
    private float c;
    private ho<Integer, String> d = ho.a(Integer.valueOf(0), "0:00");

    public usw(SuppressLayoutTextView suppressLayoutTextView, TextView textView) {
        this.a = (SuppressLayoutTextView) fay.a(suppressLayoutTextView);
        this.b = (TextView) fay.a(textView);
    }

    public final void a(int i) {
        int max = Math.max(1, (int) (Math.log10((double) (i / 60)) + 1.0d));
        String c2 = c(i);
        if (!c2.equals(this.a.getText())) {
            int a2 = uup.a(this.a.getPaint(), max) + ((int) (a(this.a.getPaint()) + 0.5f)) + uup.a(this.a.getPaint(), 2);
            LayoutParams layoutParams = this.a.getLayoutParams();
            if (layoutParams.width != a2) {
                layoutParams.width = a2;
                this.a.setLayoutParams(layoutParams);
            }
            this.a.a(c2);
        }
    }

    public final void b(int i) {
        this.b.setText(c(i));
    }

    private String c(int i) {
        int max = Math.max(0, i);
        if (((Integer) fay.a(this.d.a)).intValue() != max) {
            int i2 = max % 60;
            int i3 = max / 60;
            this.d = ho.a(Integer.valueOf(max), String.format(Locale.getDefault(), "%d:%02d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}));
        }
        return (String) this.d.b;
    }

    private float a(TextPaint textPaint) {
        if (this.c == 0.0f) {
            float[] fArr = new float[1];
            textPaint.getTextWidths(":", fArr);
            this.c = fArr[0];
        }
        return this.c;
    }
}
