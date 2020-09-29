package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.util.SparseArray;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: jyw reason: default package */
public final class jyw extends Drawable implements Callback {
    private final SparseArray<Drawable> a = new SparseArray<>();
    private int b;
    private int c;
    private int d;
    private final boolean e;

    private jyw(Context context) {
        this.b = context.getResources().getDimensionPixelSize(R.dimen.drawable_group_spacing);
        this.e = vgi.a(context);
    }

    public static <T extends Drawable> T a(Context context, TextView textView, int i, int i2, fbu<T> fbu) {
        Drawable drawable = jm.b(textView)[0];
        jyw jyw = drawable instanceof jyw ? (jyw) drawable : new jyw(context);
        T t = (Drawable) jyw.a.get(i2);
        if (t == null) {
            t = (Drawable) fbu.get();
            t.setBounds(0, 0, t.getIntrinsicWidth(), t.getIntrinsicHeight());
            jyw.a(i2);
            jyw.a.append(i2, t);
            t.setCallback(jyw);
            jyw.a();
        }
        a(textView, 0, (Drawable) jyw);
        return t;
    }

    private void a() {
        this.d = 0;
        this.c = 0;
        for (int i = 0; i < this.a.size(); i++) {
            Drawable drawable = (Drawable) this.a.valueAt(i);
            this.d = Math.max(this.d, drawable.getIntrinsicHeight());
            this.c += drawable.getIntrinsicWidth();
        }
        if (this.b > 0 && this.a.size() > 0) {
            this.c += this.b * (this.a.size() - 1);
        }
        setBounds(0, 0, this.c, this.d);
        invalidateSelf();
    }

    private void a(int i) {
        Drawable drawable = (Drawable) this.a.get(i);
        if (drawable != null) {
            this.a.remove(i);
            drawable.setCallback(null);
            a();
        }
    }

    public static void a(TextView textView, int i, int i2) {
        Drawable drawable = jm.b(textView)[0];
        jyw jyw = null;
        if (drawable instanceof jyw) {
            jyw jyw2 = (jyw) drawable;
            jyw2.a(i2);
            if (jyw2.a.size() != 0) {
                jyw = jyw2;
            }
        }
        a(textView, 0, (Drawable) jyw);
    }

    private static void a(TextView textView, int i, Drawable drawable) {
        fbp.a(i >= 0 && i <= 3, (Object) "Direction should be between 0 and 3.");
        Drawable[] b2 = jm.b(textView);
        b2[i] = drawable;
        jm.b(textView, b2[0], b2[1], b2[2], b2[3]);
    }

    public final void draw(Canvas canvas) {
        int i = 0;
        if (this.e) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Drawable drawable = (Drawable) this.a.valueAt(size);
                canvas.save();
                canvas.translate((float) i, (((float) this.d) / 2.0f) - (((float) drawable.getIntrinsicHeight()) / 2.0f));
                drawable.draw(canvas);
                i += drawable.getIntrinsicWidth() + this.b;
                canvas.restore();
            }
            return;
        }
        int i2 = 0;
        while (i < this.a.size()) {
            Drawable drawable2 = (Drawable) this.a.valueAt(i);
            canvas.save();
            canvas.translate((float) i2, (((float) this.d) / 2.0f) - (((float) drawable2.getIntrinsicHeight()) / 2.0f));
            drawable2.draw(canvas);
            i2 += drawable2.getIntrinsicWidth() + this.b;
            canvas.restore();
            i++;
        }
    }

    public final int getIntrinsicHeight() {
        return this.d;
    }

    public final int getIntrinsicWidth() {
        return this.c;
    }

    public final int getOpacity() {
        return 0;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            ((Drawable) this.a.valueAt(i2)).setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        for (int i = 0; i < this.a.size(); i++) {
            ((Drawable) this.a.valueAt(i)).setColorFilter(colorFilter);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}