package defpackage;

import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: udp reason: default package */
final class udp {
    final TextPaint a;
    final int b;
    final Path c = new Path();
    int d;
    int e;
    CharSequence f;
    StaticLayout g;
    Rect h;
    private final int i;

    udp(TextPaint textPaint, int i2, int i3) {
        this.b = i3;
        this.a = textPaint;
        this.i = i2;
    }

    private static int a(int i2, int i3, int i4) {
        return i2 == -1 ? (-i3) - i4 : i4;
    }

    private void a(Layout layout, Rect rect) {
        this.d = a(layout.getParagraphDirection(0), layout.getWidth() - rect.width(), this.b);
    }

    private static boolean a(Rect rect) {
        return rect != null && rect.width() > 0 && rect.height() > 0;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (a(this.h) && !TextUtils.isEmpty(this.f)) {
            if (VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.f;
                this.g = Builder.obtain(charSequence, 0, ((CharSequence) fbp.a(charSequence)).length(), this.a, this.e).setAlignment(Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 0.9f).setIncludePad(false).build();
            } else {
                StaticLayout staticLayout = new StaticLayout(this.f, this.a, this.e, Alignment.ALIGN_NORMAL, 0.9f, 0.0f, false);
                this.g = staticLayout;
            }
            this.c.reset();
            Path path = this.c;
            RectF rectF = new RectF(this.h);
            int i2 = this.i;
            path.addRoundRect(rectF, (float) i2, (float) i2, Direction.CW);
            a(this.g, this.h);
        }
    }
}
