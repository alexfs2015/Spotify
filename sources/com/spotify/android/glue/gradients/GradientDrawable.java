package com.spotify.android.glue.gradients;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

public final class GradientDrawable extends Drawable {
    private fte a;
    private final Paint b = new Paint();
    private boolean c;
    private Type d;
    private int e;
    private int f;
    private float g;

    public enum Type {
        LINEAR {
            /* access modifiers changed from: 0000 */
            public final fte a(int i, int i2, float f) {
                return new ftf(i, i2, f);
            }
        },
        BURST_TRIANGLES {
            /* access modifiers changed from: 0000 */
            public final fte a(int i, int i2, float f) {
                return new fth(i, i2);
            }
        },
        BURST_CIRCLES {
            /* access modifiers changed from: 0000 */
            public final fte a(int i, int i2, float f) {
                return new ftd(i, i2);
            }
        },
        BURST_RECTS {
            /* access modifiers changed from: 0000 */
            public final fte a(int i, int i2, float f) {
                return new ftg(i, i2);
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract fte a(int i, int i2, float f);

        static {
            values();
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static GradientDrawable a(Type type, int i, int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable(type, i, i2, false, f2);
        return gradientDrawable;
    }

    public static GradientDrawable a(Type type, int i, int i2) {
        return a(type, i, i2, 0.0f);
    }

    private GradientDrawable(Type type, int i, int i2, boolean z, float f2) {
        this.d = type;
        this.g = f2;
        this.e = i;
        this.f = i2;
        this.a = this.d.a(i, i2, f2);
        invalidateSelf();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -15592942, TileMode.REPEAT);
        this.b.setShader(linearGradient);
        this.c = z;
    }

    public final void draw(Canvas canvas) {
        this.a.a(canvas);
        if (this.c) {
            canvas.save();
            canvas.scale((float) canvas.getWidth(), (float) (canvas.getHeight() + 1));
            canvas.drawRect(0.0f, 0.0f, 1.0f, 1.0f, this.b);
            canvas.restore();
        }
    }
}
