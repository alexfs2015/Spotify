package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

/* renamed from: jxd reason: default package */
public class jxd<V extends View> extends Drawable {
    public final V a;
    private int b = -1;
    private int c = -1;

    public jxd(V v) {
        this.a = v;
    }

    public int getIntrinsicWidth() {
        return this.b;
    }

    public int getIntrinsicHeight() {
        return this.c;
    }

    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public void setAlpha(int i) {
        this.a.setAlpha((float) i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        V v = this.a;
        if (v instanceof ImageView) {
            ((ImageView) v).setColorFilter(colorFilter);
        }
    }

    public int getOpacity() {
        return this.a.isOpaque() ? -1 : 0;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.measure(MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        this.a.layout(i, i2, i3, i4);
    }
}
