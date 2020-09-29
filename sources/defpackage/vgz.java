package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;

/* renamed from: vgz reason: default package */
public final class vgz implements wgz {
    private final Paint a = new Paint(1);

    public final Bitmap a(Bitmap bitmap) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - min) / 2, (bitmap.getHeight() - min) / 2, min, min);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(min, min, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        TileMode tileMode = TileMode.CLAMP;
        this.a.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        float f = ((float) min) / 2.0f;
        canvas.drawCircle(f, f, f, this.a);
        createBitmap.recycle();
        return createBitmap2;
    }

    public final String a() {
        return "circle";
    }
}
