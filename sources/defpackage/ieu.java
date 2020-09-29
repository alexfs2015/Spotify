package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;

/* renamed from: ieu reason: default package */
public final class ieu implements vst {
    public final Bitmap a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double min = (double) Math.min(width, height);
        Double.isNaN(min);
        int i = (int) (min * 0.06d);
        int i2 = i << 1;
        int i3 = width + i2;
        int i4 = height + i2;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f = (float) i4;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f, -11645362, -14013910, TileMode.CLAMP);
        paint.setShader(linearGradient);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) i3, f), 10.0f, 10.0f, paint);
        paint.setShader(null);
        float f2 = (float) i;
        canvas.drawBitmap(bitmap, f2, f2, paint);
        bitmap.recycle();
        return createBitmap;
    }

    public final String a() {
        return getClass().getSimpleName();
    }
}
