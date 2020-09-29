package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: vhd reason: default package */
final class vhd extends Drawable {
    private static final Paint a = new Paint();
    private Drawable b;
    private final Drawable c;
    private long d;
    private boolean e;
    private int f = 255;
    private final boolean g;
    private final float h;
    private final LoadedFrom i;

    /* renamed from: vhd$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LoadedFrom.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.squareup.picasso.Picasso$LoadedFrom[] r0 = com.squareup.picasso.Picasso.LoadedFrom.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.DISK     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.NETWORK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vhd.AnonymousClass1.<clinit>():void");
        }
    }

    private vhd(Context context, Drawable drawable, Drawable drawable2, LoadedFrom loadedFrom, boolean z) {
        this.c = drawable;
        this.g = z;
        this.h = context.getResources().getDisplayMetrics().density;
        this.i = loadedFrom;
        if (loadedFrom != LoadedFrom.MEMORY) {
            this.b = drawable2;
            this.e = true;
            this.d = SystemClock.uptimeMillis();
        }
    }

    private static Path a(Point point, int i2) {
        Point point2 = new Point(point.x + i2, point.y);
        Point point3 = new Point(point.x, point.y + i2);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    static void a(ImageView imageView, int i2, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    static void a(ImageView imageView, Drawable drawable, LoadedFrom loadedFrom, boolean z) {
        Drawable drawable2 = imageView.getDrawable();
        if (drawable2 instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable2).stop();
        }
        vhd vhd = new vhd(imageView.getContext(), drawable, drawable2, loadedFrom, z);
        imageView.setImageDrawable(vhd);
    }

    public final void draw(Canvas canvas) {
        int i2;
        if (!this.e) {
            this.c.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.d)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.e = false;
                this.b = null;
                this.c.draw(canvas);
            } else {
                Drawable drawable = this.b;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                this.c.setAlpha((int) (((float) this.f) * uptimeMillis));
                this.c.draw(canvas);
                this.c.setAlpha(this.f);
                invalidateSelf();
            }
        }
        if (this.g) {
            a.setColor(-1);
            canvas.drawPath(a(new Point(0, 0), (int) (this.h * 16.0f)), a);
            Paint paint = a;
            int i3 = AnonymousClass1.a[this.i.ordinal()];
            if (i3 == 1) {
                i2 = -256;
            } else if (i3 == 2) {
                i2 = -65536;
            } else if (i3 == 3) {
                i2 = -16711936;
            } else {
                throw new IllegalStateException("Unknown LoadedFrom type.");
            }
            paint.setColor(i2);
            canvas.drawPath(a(new Point(0, 0), (int) (this.h * 15.0f)), a);
        }
    }

    public final int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return this.c.getOpacity();
    }

    public final int[] getState() {
        return this.c.getState();
    }

    public final boolean isStateful() {
        return this.c.isStateful();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.c.setBounds(rect);
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        return this.c.setState(iArr);
    }

    public final void setAlpha(int i2) {
        this.f = i2;
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        this.c.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.c.setColorFilter(colorFilter);
    }

    public final boolean setState(int[] iArr) {
        return this.c.setState(iArr);
    }
}
