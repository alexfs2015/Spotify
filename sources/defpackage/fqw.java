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
import com.spotify.android.glue.components.cards.effects.GlueRippleCoverArtShape;

/* renamed from: fqw reason: default package */
public final class fqw implements vst {
    private static final Paint a = new Paint(1);
    private final String b;
    private final Drawable c;
    private final GlueRippleCoverArtShape d;

    public fqw(Context context, boolean z) {
        this(context, z ? GlueRippleCoverArtShape.CIRCLE : GlueRippleCoverArtShape.SQUARE);
    }

    private fqw(Context context, GlueRippleCoverArtShape glueRippleCoverArtShape) {
        this.d = glueRippleCoverArtShape;
        StringBuilder sb = new StringBuilder("GlueRadioCardRippleTransformation (");
        sb.append(this.d);
        sb.append(')');
        this.b = sb.toString();
        this.c = fr.a(context, glueRippleCoverArtShape.mDrawableResId);
    }

    public final Bitmap a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        TileMode tileMode = TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        int b2 = uvj.b(uus.a(bitmap).a());
        Rect clipBounds = canvas.getClipBounds();
        float centerX = (float) clipBounds.centerX();
        float centerY = (float) clipBounds.centerY();
        int round = Math.round(((float) Math.min(canvas.getWidth(), canvas.getHeight())) / 2.0f);
        float f = (float) round;
        matrix.preTranslate(-centerX, -centerY);
        bitmapShader.setLocalMatrix(matrix);
        canvas.drawColor(b2);
        canvas.save();
        canvas.translate(centerX, centerY);
        int i = -round;
        this.c.setBounds(i, i, round, round);
        this.c.draw(canvas);
        canvas.restore();
        canvas.save();
        a.setStyle(Style.FILL);
        a.setShader(bitmapShader);
        canvas.translate(centerX, centerY);
        canvas.scale(0.5f, 0.5f);
        this.d.a(canvas, f, a);
        canvas.restore();
        bitmap.recycle();
        return createBitmap;
    }

    public final String a() {
        return this.b;
    }
}
