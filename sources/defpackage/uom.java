package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: uom reason: default package */
public final class uom {
    private final Context a;

    /* renamed from: uom$a */
    static class a extends Drawable {
        private final String a;
        private final int b;
        private final int c;
        private final Paint d = new Paint();
        private final Rect e = new Rect();

        public a(Context context, String str, int i, int i2) {
            this.a = str;
            this.b = -1;
            this.c = i2;
            this.d.setAntiAlias(true);
            this.d.setStyle(Style.FILL);
            this.d.setTextAlign(Align.CENTER);
            this.d.setTypeface(vfn.b(context, R.attr.pasteTextAppearanceBodyMediumBold));
        }

        public final void draw(Canvas canvas) {
            Rect bounds = getBounds();
            int width = bounds.width();
            int height = bounds.height();
            float f = (float) (width < height ? width : height);
            float f2 = f / 3.0f;
            this.d.setColor(this.c);
            float f3 = ((float) width) / 2.0f;
            float f4 = ((float) height) / 2.0f;
            canvas.drawCircle(f3, f4, f / 2.0f, this.d);
            this.d.setColor(this.b);
            this.d.setTextSize(f2);
            Paint paint = this.d;
            String str = this.a;
            paint.getTextBounds(str, 0, str.length(), this.e);
            canvas.drawText(this.a, f3, f4 - this.e.exactCenterY(), this.d);
        }

        public final int getOpacity() {
            return -3;
        }

        public final void setAlpha(int i) {
            this.d.setAlpha(i);
        }

        public final void setColorFilter(ColorFilter colorFilter) {
            this.d.setColorFilter(colorFilter);
        }
    }

    public uom(Context context) {
        this.a = context;
    }

    public final Drawable a(String str) {
        return a(str.substring(0, 1).toUpperCase(Locale.getDefault()), this.a.getResources().getColor(uoo.a(str)));
    }

    public final Drawable a(String str, int i) {
        return new a(this.a, str, -1, i);
    }
}
