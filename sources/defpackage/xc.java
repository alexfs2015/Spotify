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

/* renamed from: xc reason: default package */
public class xc extends Drawable implements Animatable, Callback {
    public xa a;
    public final abt b = new abt();
    public float c = 1.0f;
    public final ArrayList<a> d = new ArrayList<>();
    public String e;
    public yt f;
    public boolean g;
    private final Matrix h = new Matrix();
    private final Set<Object> i = new HashSet();
    private yu j;
    /* access modifiers changed from: private */
    public aad k;
    private int l = 255;

    /* renamed from: xc$a */
    public interface a {
        void a();
    }

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        xc.class.getSimpleName();
    }

    public xc() {
        this.b.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (xc.this.k != null) {
                    xc.this.k.a(xc.this.b.b());
                }
            }
        });
    }

    public final void a(boolean z) {
        if (this.g != z && VERSION.SDK_INT >= 19) {
            this.g = z;
            if (this.a != null) {
                b();
            }
        }
    }

    public final void a() {
        yu yuVar = this.j;
        if (yuVar != null) {
            yuVar.a();
        }
    }

    public void b() {
        this.k = new aad(this, abb.a(this.a), this.a.g, this.a);
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

    public void invalidateSelf() {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void setAlpha(int i2) {
        this.l = i2;
    }

    public int getAlpha() {
        return this.l;
    }

    public void draw(Canvas canvas) {
        float f2;
        String str = "Drawable#draw";
        wz.c(str);
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
            wz.d(str);
            if (f2 > 1.0f) {
                canvas.restore();
            }
        }
    }

    public void start() {
        d();
    }

    public final void d() {
        if (this.k == null) {
            this.d.add(new a() {
                public final void a() {
                    xc.this.d();
                }
            });
        } else {
            this.b.d();
        }
    }

    public final void a(final int i2) {
        if (this.a == null) {
            this.d.add(new a() {
                public final void a() {
                    xc.this.a(i2);
                }
            });
            return;
        }
        abt abt = this.b;
        abt.a(i2, (int) abt.f);
    }

    public final void a(final float f2) {
        xa xaVar = this.a;
        if (xaVar == null) {
            this.d.add(new a() {
                public final void a() {
                    xc.this.a(f2);
                }
            });
            return;
        }
        float f3 = xaVar.i;
        a((int) (f3 + (f2 * (this.a.j - f3))));
    }

    public final void b(final int i2) {
        if (this.a == null) {
            this.d.add(new a() {
                public final void a() {
                    xc.this.b(i2);
                }
            });
            return;
        }
        abt abt = this.b;
        abt.a((int) abt.e, i2);
    }

    public final void b(final float f2) {
        xa xaVar = this.a;
        if (xaVar == null) {
            this.d.add(new a() {
                public final void a() {
                    xc.this.b(f2);
                }
            });
            return;
        }
        float f3 = xaVar.i;
        b((int) (f3 + (f2 * (this.a.j - f3))));
    }

    public final void c(final int i2) {
        if (this.a == null) {
            this.d.add(new a() {
                public final void a() {
                    xc.this.c(i2);
                }
            });
        } else {
            this.b.a(i2);
        }
    }

    public final void c(final float f2) {
        xa xaVar = this.a;
        if (xaVar == null) {
            this.d.add(new a() {
                public final void a() {
                    xc.this.c(f2);
                }
            });
            return;
        }
        float f3 = xaVar.i;
        c((int) (f3 + (f2 * (this.a.j - f3))));
    }

    public final void d(int i2) {
        this.b.setRepeatMode(i2);
    }

    public final void e(int i2) {
        this.b.setRepeatCount(i2);
    }

    public final void d(float f2) {
        this.c = f2;
        f();
    }

    public final boolean e() {
        return this.a.e.b() > 0;
    }

    public void f() {
        xa xaVar = this.a;
        if (xaVar != null) {
            float f2 = this.c;
            setBounds(0, 0, (int) (((float) xaVar.h.width()) * f2), (int) (((float) this.a.h.height()) * f2));
        }
    }

    public int getIntrinsicWidth() {
        xa xaVar = this.a;
        if (xaVar == null) {
            return -1;
        }
        return (int) (((float) xaVar.h.width()) * this.c);
    }

    public int getIntrinsicHeight() {
        xa xaVar = this.a;
        if (xaVar == null) {
            return -1;
        }
        return (int) (((float) xaVar.h.height()) * this.c);
    }

    private List<yz> a(yz yzVar) {
        if (this.k == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.k.a(yzVar, 0, (List<yz>) arrayList, new yz(new String[0]));
        return arrayList;
    }

    public final <T> void a(final yz yzVar, final T t, final abz<T> abz) {
        if (this.k == null) {
            this.d.add(new a() {
                public final void a() {
                    xc.this.a(yzVar, t, abz);
                }
            });
            return;
        }
        boolean z = true;
        if (yzVar.a != null) {
            yzVar.a.a(t, abz);
        } else {
            List a2 = a(yzVar);
            for (int i2 = 0; i2 < a2.size(); i2++) {
                ((yz) a2.get(i2)).a.a(t, abz);
            }
            if (a2.isEmpty()) {
                z = false;
            }
        }
        if (z) {
            invalidateSelf();
            if (t == xf.w) {
                c(this.b.b());
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void stop() {
        this.d.clear();
        this.b.e();
    }

    public boolean isRunning() {
        return this.b.isRunning();
    }

    public final Bitmap a(String str) {
        yu yuVar;
        if (getCallback() == null) {
            yuVar = null;
        } else {
            yu yuVar2 = this.j;
            if (yuVar2 != null) {
                Callback callback = getCallback();
                Object context = (callback == null || !(callback instanceof View)) ? null : ((View) callback).getContext();
                if (!((context == null && yuVar2.a == null) || yuVar2.a.equals(context))) {
                    this.j.a();
                    this.j = null;
                }
            }
            if (this.j == null) {
                this.j = new yu(getCallback(), this.e, null, this.a.c);
            }
            yuVar = this.j;
        }
        if (yuVar != null) {
            return yuVar.a(str);
        }
        return null;
    }
}
