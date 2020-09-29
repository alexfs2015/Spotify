package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;

/* renamed from: jqe reason: default package */
public final class jqe implements vst {
    private final Drawable a;
    private final String b;
    private final boolean c;

    public jqe(Context context, boolean z) {
        this.a = fr.a(context, (int) R.drawable.collection_station_ripple);
        this.c = z;
        StringBuilder sb = new StringBuilder("RippleListItemTransformation");
        sb.append(this.c ? '1' : '0');
        this.b = sb.toString();
    }

    public final Bitmap a(Bitmap bitmap) {
        Drawable drawable = this.a;
        boolean z = this.c;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Matrix matrix = new Matrix();
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Rect clipBounds = canvas.getClipBounds();
        float centerX = (float) clipBounds.centerX();
        float centerY = (float) clipBounds.centerY();
        int min = Math.min(canvas.getWidth(), canvas.getHeight()) / 2;
        matrix.postTranslate(-centerX, -centerY);
        bitmapShader.setLocalMatrix(matrix);
        paint.setStyle(Style.FILL);
        paint.setShader(bitmapShader);
        canvas.save();
        canvas.translate(centerX, centerY);
        int i = -min;
        drawable.setBounds(i, i, min, min);
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.scale(0.63f, 0.63f);
        if (z) {
            canvas.drawCircle(0.0f, 0.0f, (float) min, paint);
        } else {
            float f = (float) i;
            float f2 = (float) min;
            canvas.drawRect(f, f, f2, f2, paint);
        }
        canvas.restore();
        bitmap.recycle();
        return createBitmap;
    }

    public final String a() {
        return this.b;
    }
}
