package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.util.SparseArray;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: jwu reason: default package */
public final class jwu extends Drawable implements Callback {
    private final SparseArray<Drawable> a = new SparseArray<>();
    private int b;
    private int c;
    private int d;
    private final boolean e;

    public final int getOpacity() {
        return 0;
    }

    private jwu(Context context) {
        this.b = context.getResources().getDimensionPixelSize(R.dimen.drawable_group_spacing);
        this.e = uur.a(context);
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

    public final int getIntrinsicHeight() {
        return this.d;
    }

    public final int getIntrinsicWidth() {
        return this.c;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
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

    private static void a(TextView textView, int i, Drawable drawable) {
        fay.a(i >= 0 && i <= 3, (Object) "Direction should be between 0 and 3.");
        Drawable[] b2 = jm.b(textView);
        b2[i] = drawable;
        jm.b(textView, b2[0], b2[1], b2[2], b2[3]);
    }

    public static <T extends Drawable> T a(Context context, TextView textView, int i, int i2, fbd<T> fbd) {
        jwu jwu;
        Drawable drawable = jm.b(textView)[0];
        if (drawable instanceof jwu) {
            jwu = (jwu) drawable;
        } else {
            jwu = new jwu(context);
        }
        T t = (Drawable) jwu.a.get(i2);
        if (t == null) {
            t = (Drawable) fbd.get();
            t.setBounds(0, 0, t.getIntrinsicWidth(), t.getIntrinsicHeight());
            jwu.a(i2);
            jwu.a.append(i2, t);
            t.setCallback(jwu);
            jwu.a();
        }
        a(textView, 0, (Drawable) jwu);
        return t;
    }

    public static void a(TextView textView, int i, int i2) {
        Drawable drawable = jm.b(textView)[0];
        jwu jwu = null;
        if (drawable instanceof jwu) {
            jwu jwu2 = (jwu) drawable;
            jwu2.a(i2);
            if (jwu2.a.size() != 0) {
                jwu = jwu2;
            }
        }
        a(textView, 0, (Drawable) jwu);
    }
}
