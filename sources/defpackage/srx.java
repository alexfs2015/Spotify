package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: srx reason: default package */
public final class srx extends Drawable {
    public static final Property<srx, Integer> a = new Property<srx, Integer>(Integer.class, "level") {
        public final /* synthetic */ Object get(Object obj) {
            return Integer.valueOf(((srx) obj).getLevel());
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((srx) obj).setLevel(((Integer) obj2).intValue());
        }
    };
    public final Paint b;
    private final vgd c;
    private final vgd d;
    private final vgd e;
    private vgd f;
    private vgd g;
    private final RectF h;

    public srx(int i, int i2, int i3) {
        this(i, i, i2, i3);
    }

    public srx(int i, int i2, int i3, int i4) {
        this.f = vgd.a(0.0f, 0.0f);
        this.g = vgd.a(0.0f, 0.0f);
        this.b = new Paint();
        this.h = new RectF();
        this.b.setColor(i4);
        vgd a2 = vgd.a(0.0f, 255.0f);
        this.d = a2.b((float) i, 0.0f).a();
        this.c = a2.b((float) i2, 0.0f).a();
        this.e = a2.b((float) i3, 0.0f).a();
    }

    private void a() {
        float a2 = this.d.a((float) getLevel());
        float a3 = this.c.a((float) getLevel());
        float a4 = this.f.a((float) getLevel());
        float a5 = this.g.a((float) getLevel());
        this.h.set(getBounds());
        float f2 = a5 / 2.0f;
        float f3 = a4 / 2.0f;
        this.h.offset(f2 - f3, 0.0f);
        this.h.inset(a2 + f3 + f2, a3);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float a2 = this.e.a((float) getLevel());
        canvas.drawRoundRect(this.h, a2, a2, this.b);
    }

    public final int getOpacity() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        a();
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        a();
        return true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
