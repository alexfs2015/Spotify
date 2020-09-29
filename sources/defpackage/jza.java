package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.TextView;

/* renamed from: jza reason: default package */
public final class jza {
    final TextView a;
    final float b;
    final TextView c;

    public jza(TextView textView) {
        this(textView, null);
    }

    private jza(TextView textView, TextView textView2) {
        float textSize = textView.getTextSize();
        this.a = textView;
        this.b = textSize;
        this.c = null;
    }

    static boolean a(Layout layout) {
        return ((float) layout.getWidth()) > layout.getPaint().measureText(String.valueOf(layout.getText()));
    }

    public final void a() {
        this.a.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                jza.this.a.removeOnLayoutChangeListener(this);
                jza jza = jza.this;
                Layout layout = jza.a.getLayout();
                if (layout == null) {
                    jza.a();
                    return;
                }
                if (!jza.a(layout)) {
                    TextPaint paint = layout.getPaint();
                    float f = jza.b;
                    float f2 = 1.0f;
                    do {
                        float f3 = (f2 + f) / 2.0f;
                        paint.setTextSize(f3);
                        if (jza.a(layout)) {
                            f2 = f3;
                        } else {
                            f = f3;
                        }
                    } while (f - f2 > 1.0f);
                    jza.a.setTextSize(0, f2);
                    if (jza.c != null) {
                        jza.c.setTextSize(0, f2);
                    }
                }
            }
        });
    }
}
