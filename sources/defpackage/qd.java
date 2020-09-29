package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/* renamed from: qd reason: default package */
public final class qd extends ImageView {
    public AnimationListener a;
    int b;

    /* renamed from: qd$a */
    class a extends OvalShape {
        private RadialGradient a;
        private Paint b = new Paint();

        a(int i) {
            qd.this.b = i;
            a((int) rect().width());
        }

        private void a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) qd.this.b, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.a = radialGradient;
            this.b.setShader(this.a);
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = qd.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (qd.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.b);
            canvas.drawCircle(f, height, (float) (width - qd.this.b), paint);
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f, float f2) {
            super.onResize(f, f2);
            a((int) f);
        }
    }

    public qd(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.b = (int) (3.5f * f);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ip.e((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this.b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.b, (float) i3, (float) i2, 503316480);
            int i4 = this.b;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(-328966);
        ip.a((View) this, (Drawable) shapeDrawable);
    }

    private static boolean a() {
        return VERSION.SDK_INT >= 21;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.b << 1), getMeasuredHeight() + (this.b << 1));
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
