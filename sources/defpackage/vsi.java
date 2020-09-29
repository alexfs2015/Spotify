package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: vsi reason: default package */
final class vsi extends BitmapDrawable {
    private static final Paint a = new Paint();
    private final boolean b;
    private final float c;
    private final LoadedFrom d;
    private Drawable e;
    private long f;
    private boolean g;
    private int h = 255;

    static void a(ImageView imageView, Context context, Bitmap bitmap, LoadedFrom loadedFrom, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        vsi vsi = new vsi(context, bitmap, drawable, loadedFrom, z, z2);
        imageView.setImageDrawable(vsi);
    }

    static void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    private vsi(Context context, Bitmap bitmap, Drawable drawable, LoadedFrom loadedFrom, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.b = z2;
        this.c = context.getResources().getDisplayMetrics().density;
        this.d = loadedFrom;
        if (loadedFrom != LoadedFrom.MEMORY && !z) {
            this.e = drawable;
            this.g = true;
            this.f = SystemClock.uptimeMillis();
        }
    }

    public final void draw(Canvas canvas) {
        if (!this.g) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.g = false;
                this.e = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.e;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.h) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.h);
                if (VERSION.SDK_INT <= 10) {
                    invalidateSelf();
                }
            }
        }
        if (this.b) {
            a.setColor(-1);
            canvas.drawPath(a(new Point(0, 0), (int) (this.c * 16.0f)), a);
            a.setColor(this.d.debugColor);
            canvas.drawPath(a(new Point(0, 0), (int) (this.c * 15.0f)), a);
        }
    }

    public final void setAlpha(int i) {
        this.h = i;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    private static Path a(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }
}
