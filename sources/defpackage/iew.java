package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;

/* renamed from: iew reason: default package */
public final class iew implements vst {
    public final Bitmap a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = height / 3;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        TileMode tileMode = TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f = (float) width;
        float f2 = (float) height;
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, f, f2), 10.0f, 10.0f, paint);
        float f3 = (float) (height - i);
        LinearGradient linearGradient = new LinearGradient(0.0f, f3, 0.0f, f2, 0, -1728053248, TileMode.CLAMP);
        paint.setShader(linearGradient);
        canvas.drawRoundRect(new RectF(0.0f, f3, f, f2), 10.0f, 10.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    public final String a() {
        return getClass().getSimpleName();
    }
}
