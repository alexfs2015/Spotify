package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: xq reason: default package */
public class xq extends Drawable implements Animatable, Callback {
    public xo a;
    public final ach b = new ach();
    public float c = 1.0f;
    public final ArrayList<a> d = new ArrayList<>();
    public String e;
    public zh f;
    public boolean g;
    private final Matrix h = new Matrix();
    private final Set<Object> i = new HashSet();
    private zi j;
    /* access modifiers changed from: private */
    public aar k;
    private int l = 255;

    /* renamed from: xq$a */
    public interface a {
        void a();
    }

    static {
        xq.class.getSimpleName();
    }

    public xq() {
        this.b.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (xq.this.k != null) {
                    xq.this.k.a(xq.this.b.b());
                }
            }
        });
    }

    private List<zn> a(zn znVar) {
        if (this.k == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.k.a(znVar, 0, (List<zn>) arrayList, new zn(new String[0]));
        return arrayList;
    }

    public final Bitmap a(String str) {
        zi ziVar;
        if (getCallback() == null) {
            ziVar = null;
        } else {
            zi ziVar2 = this.j;
            if (ziVar2 != null) {
                Callback callback = getCallback();
                Object context = (callback == null || !(callback instanceof View)) ? null : ((View) callback).getContext();
                if (!((context == null && ziVar2.a == null) || ziVar2.a.equals(context))) {
                    this.j.a();
                    this.j = null;
                }
            }
            if (this.j == null) {
                this.j = new zi(getCallback(), this.e, null, this.a.c);
            }
            ziVar = this.j;
        }
        if (ziVar != null) {
            return ziVar.a(str);
        }
        return null;
    }

    public final void a() {
        zi ziVar = this.j;
        if (ziVar != null) {
            ziVar.a();
        }
    }

    public final void a(final float f2) {
        xo xoVar = this.a;
        if (xoVar == null) {
            this.d.add(new a() {
                public final void a() {
                    xq.this.a(f2);
                }
            });
            return;
        }
        float f3 = xoVar.i;
        a((int) (f3 + (f2 * (this.a.j - f3))));
    }

    public final void a(final int i2) {
        if (this.a == null) {
            this.d.add(new a() {
                public final void a() {
                    xq.this.a(i2);
                }
            });
            return;
        }
        ach ach = this.b;
        ach.a(i2, (int) ach.f);
    }

    public final <T> void a(final zn znVar, final T t, final acn<T> acn) {
        if (this.k == null) {
            this.d.add(new a() {
                public final void a() {
                    xq.this.a(znVar, t, acn);
                }
            });
            return;
        }
        boolean z = true;
        if (znVar.a != null) {
            znVar.a.a(t, acn);
        } else {
            List a2 = a(znVar);
            for (int i2 = 0; i2 < a2.size(); i2++) {
                ((zn) a2.get(i2)).a.a(t, acn);
            }
            if (a2.isEmpty()) {
                z = false;
            }
        }
        if (z) {
            invalidateSelf();
            if (t == xt.w) {
                c(this.b.b());
            }
        }
    }

    public final void a(boolean z) {
        if (this.g != z && VERSION.SDK_INT >= 19) {
            this.g = z;
            if (this.a != null) {
                b();
            }
        }
    }

    public void b() {
        this.k = new aar(this, abp.a(this.a), this.a.g, this.a);
    }

    public final void b(final float f2) {
        xo xoVar = this.a;
        if (xoVar == null) {
            this.d.add(new a() {
                public final void a() {
                    xq.this.b(f2);
                }
            });
            return;
        }
        float f3 = xoVar.i;
        b((int) (f3 + (f2 * (this.a.j - f3))));
    }

    public final void b(final int i2) {
        if (this.a == null) {
            this.d.add(new a() {
                public final void a() {
                    xq.this.b(i2);
                }
            });
            return;
        }
        ach ach = this.b;
        ach.a((int) ach.e, i2);
    }

    public final void c() {
        a();
        if (this.b.isRunning()) {
            this.b.cancel();
        }
        this.a = null;
        this.k = null;
        this.j = null;
        this.b.c();
        invalidateSelf();
    }

    public final void c(final float f2) {
        xo xoVar = this.a;
        if (xoVar == null) {
            this.d.add(new a() {
                public final void a() {
                    xq.this.c(f2);
                }
            });
            return;
        }
        float f3 = xoVar.i;
        c((int) (f3 + (f2 * (this.a.j - f3))));
    }

    public final void c(final int i2) {
        if (this.a == null) {
            this.d.add(new a() {
                public final void a() {
                    xq.this.c(i2);
                }
            });
        } else {
            this.b.a(i2);
        }
    }

    public final void d() {
        if (this.k == null) {
            this.d.add(new a() {
                public final void a() {
                    xq.this.d();
                }
            });
        } else {
            this.b.d();
        }
    }

    public final void d(float f2) {
        this.c = f2;
        f();
    }

    public final void d(int i2) {
        this.b.setRepeatMode(i2);
    }

    public void draw(Canvas canvas) {
        float f2;
        String str = "Drawable#draw";
        xn.c(str);
        if (this.k != null) {
            float f3 = this.c;
            float min = Math.min(((float) canvas.getWidth()) / ((float) this.a.h.width()), ((float) canvas.getHeight()) / ((float) this.a.h.height()));
            if (f3 > min) {
                f2 = this.c / min;
            } else {
                min = f3;
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                canvas.save();
                float width = ((float) this.a.h.width()) / 2.0f;
                float height = ((float) this.a.h.height()) / 2.0f;
                float f4 = width * min;
                float f5 = height * min;
                float f6 = this.c;
                canvas.translate((width * f6) - f4, (f6 * height) - f5);
                canvas.scale(f2, f2, f4, f5);
            }
            this.h.reset();
            this.h.preScale(min, min);
            this.k.a(canvas, this.h, this.l);
            xn.d(str);
            if (f2 > 1.0f) {
                canvas.restore();
            }
        }
    }

    public final void e(int i2) {
        this.b.setRepeatCount(i2);
    }

    public final boolean e() {
        return this.a.e.b() > 0;
    }

    public void f() {
        xo xoVar = this.a;
        if (xoVar != null) {
            float f2 = this.c;
            setBounds(0, 0, (int) (((float) xoVar.h.width()) * f2), (int) (((float) this.a.h.height()) * f2));
        }
    }

    public int getAlpha() {
        return this.l;
    }

    public int getIntrinsicHeight() {
        xo xoVar = this.a;
        if (xoVar == null) {
            return -1;
        }
        return (int) (((float) xoVar.h.height()) * this.c);
    }

    public int getIntrinsicWidth() {
        xo xoVar = this.a;
        if (xoVar == null) {
            return -1;
        }
        return (int) (((float) xoVar.h.width()) * this.c);
    }

    public int getOpacity() {
        return -3;
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isRunning() {
        return this.b.isRunning();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        this.l = i2;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void start() {
        d();
    }

    public void stop() {
        this.d.clear();
        this.b.e();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
