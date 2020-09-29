package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;

/* renamed from: ltg reason: default package */
public final class ltg implements wgz {
    private final int a;

    public ltg(int i) {
        this.a = i;
    }

    public final Bitmap a(Bitmap bitmap) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        TileMode tileMode = TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        int i = this.a;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public final String a() {
        return "rounded";
    }
}
