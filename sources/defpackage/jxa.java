package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.TextView;

/* renamed from: jxa reason: default package */
public final class jxa {
    final TextView a;
    final float b;
    final TextView c;

    public jxa(TextView textView) {
        this(textView, null);
    }

    private jxa(TextView textView, TextView textView2) {
        float textSize = textView.getTextSize();
        this.a = textView;
        this.b = textSize;
        this.c = null;
    }

    public final void a() {
        this.a.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                jxa.this.a.removeOnLayoutChangeListener(this);
                jxa jxa = jxa.this;
                Layout layout = jxa.a.getLayout();
                if (layout == null) {
                    jxa.a();
                    return;
                }
                if (!jxa.a(layout)) {
                    TextPaint paint = layout.getPaint();
                    float f = jxa.b;
                    float f2 = 1.0f;
                    do {
                        float f3 = (f2 + f) / 2.0f;
                        paint.setTextSize(f3);
                        if (jxa.a(layout)) {
                            f2 = f3;
                        } else {
                            f = f3;
                        }
                    } while (f - f2 > 1.0f);
                    jxa.a.setTextSize(0, f2);
                    if (jxa.c != null) {
                        jxa.c.setTextSize(0, f2);
                    }
                }
            }
        });
    }

    static boolean a(Layout layout) {
        return ((float) layout.getWidth()) > layout.getPaint().measureText(String.valueOf(layout.getText()));
    }
}
