package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: ezq reason: default package */
public final class ezq {
    public static final int a;
    public final Paint b = new Paint(1);
    private final a c;
    private final View d;
    private final Path e = new Path();
    private final Paint f = new Paint(7);
    private d g;
    private Drawable h;
    private boolean i;
    private boolean j;

    /* renamed from: ezq$a */
    public interface a {
        void a(Canvas canvas);

        boolean e();
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            a = 2;
        } else if (VERSION.SDK_INT >= 18) {
            a = 1;
        } else {
            a = 0;
        }
    }

    public ezq(a aVar) {
        this.c = aVar;
        this.d = (View) aVar;
        this.d.setWillNotDraw(false);
        this.b.setColor(0);
    }

    private float b(d dVar) {
        return fal.a(dVar.a, dVar.b, 0.0f, 0.0f, (float) this.d.getWidth(), (float) this.d.getHeight());
    }

    private void b(Canvas canvas) {
        if (h()) {
            Rect bounds = this.h.getBounds();
            float width = this.g.a - (((float) bounds.width()) / 2.0f);
            float height = this.g.b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.h.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    private void e() {
        if (a == 1) {
            this.e.rewind();
            d dVar = this.g;
            if (dVar != null) {
                this.e.addCircle(dVar.a, this.g.b, this.g.c, Direction.CW);
            }
        }
        this.d.invalidate();
    }

    private boolean f() {
        d dVar = this.g;
        boolean z = dVar == null || dVar.a();
        return a == 0 ? !z && this.j : !z;
    }

    private boolean g() {
        return !this.i && Color.alpha(this.b.getColor()) != 0;
    }

    private boolean h() {
        return (this.i || this.h == null || this.g == null) ? false : true;
    }

    public final void a() {
        if (a == 0) {
            this.i = true;
            this.j = false;
            this.d.buildDrawingCache();
            Bitmap drawingCache = this.d.getDrawingCache();
            if (!(drawingCache != null || this.d.getWidth() == 0 || this.d.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.d.getWidth(), this.d.getHeight(), Config.ARGB_8888);
                this.d.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f;
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.i = false;
            this.j = true;
        }
    }

    public final void a(int i2) {
        this.b.setColor(i2);
        this.d.invalidate();
    }

    public final void a(Canvas canvas) {
        if (f()) {
            int i2 = a;
            if (i2 == 0) {
                canvas.drawCircle(this.g.a, this.g.b, this.g.c, this.f);
                if (g()) {
                    canvas.drawCircle(this.g.a, this.g.b, this.g.c, this.b);
                }
            } else if (i2 == 1) {
                int save = canvas.save();
                canvas.clipPath(this.e);
                this.c.a(canvas);
                if (g()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.d.getWidth(), (float) this.d.getHeight(), this.b);
                }
                canvas.restoreToCount(save);
            } else if (i2 == 2) {
                this.c.a(canvas);
                if (g()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.d.getWidth(), (float) this.d.getHeight(), this.b);
                }
            } else {
                StringBuilder sb = new StringBuilder("Unsupported strategy ");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            this.c.a(canvas);
            if (g()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.d.getWidth(), (float) this.d.getHeight(), this.b);
            }
        }
        b(canvas);
    }

    public final void a(Drawable drawable) {
        this.h = drawable;
        this.d.invalidate();
    }

    public final void a(d dVar) {
        if (dVar == null) {
            this.g = null;
        } else {
            d dVar2 = this.g;
            if (dVar2 == null) {
                this.g = new d(dVar);
            } else {
                dVar2.a(dVar);
            }
            if (fal.b(dVar.c, b(dVar), 1.0E-4f)) {
                this.g.c = Float.MAX_VALUE;
            }
        }
        e();
    }

    public final void b() {
        if (a == 0) {
            this.j = false;
            this.d.destroyDrawingCache();
            this.f.setShader(null);
            this.d.invalidate();
        }
    }

    public final d c() {
        d dVar = this.g;
        if (dVar == null) {
            return null;
        }
        d dVar2 = new d(dVar);
        if (dVar2.a()) {
            dVar2.c = b(dVar2);
        }
        return dVar2;
    }

    public final boolean d() {
        return this.c.e() && !f();
    }
}
