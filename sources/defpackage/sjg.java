package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: sjg reason: default package */
public final class sjg extends FrameLayout {
    View a;
    View b;
    private View c;
    private View d;
    private final int[] e = new int[2];
    private final int[] f = new int[2];
    private int g;
    private int h;

    sjg(Context context) {
        super(context);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R.layout.education_overlay_view, this, true);
        this.c = findViewById(R.id.bubble);
        this.d = findViewById(R.id.arrow_view);
        ((TextView) findViewById(R.id.text)).setText(R.string.lfs_upgrade_premium);
        setBackgroundColor(fr.c(getContext(), R.color.black_70));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a != null) {
            getLocationInWindow(this.f);
            this.a.getLocationInWindow(this.e);
            int measuredWidth = this.c.getMeasuredWidth();
            int measuredHeight = this.c.getMeasuredHeight();
            int[] iArr = this.e;
            int i5 = iArr[0];
            int[] iArr2 = this.f;
            this.g = (i5 - iArr2[0]) - i;
            this.h = (iArr[1] - iArr2[1]) - i2;
            int width = (getWidth() / 2) - (measuredWidth / 2);
            int i6 = (this.h - measuredHeight) - ((MarginLayoutParams) this.c.getLayoutParams()).bottomMargin;
            this.d.setTranslationX((float) ((((this.e[0] - width) + (this.b.getMeasuredWidth() / 2)) - this.b.getMeasuredWidth()) + 8));
            this.c.layout(width, i6, measuredWidth + width, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.save();
        canvas.translate((float) this.g, (float) this.h);
        this.a.draw(canvas);
        canvas.restore();
    }

    public final void a() {
        setAlpha(0.0f);
        ip.n(this).a(1.0f).a(500).b((Runnable) new $$Lambda$sjg$qxwEeuzerzXg9h4M5LPax7DnjWo(this)).c();
        this.c.setScaleX(0.5f);
        this.c.setScaleY(0.5f);
        this.c.setAlpha(0.0f);
        ip.n(this.c).c(1.0f).d(1.0f).a((Interpolator) new OvershootInterpolator()).a(500).c();
        ip.n(this.c).a(1.0f).a(300).c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        setVisibility(0);
    }

    public final void b() {
        ip.n(this).a(0.0f).a(500).a((Runnable) new $$Lambda$sjg$qH0b5S51_ebFL_rajGXlHghmspE(this)).c();
        ip.n(this.c).a(0.0f).c(0.5f).d(0.5f).a(500).c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        setVisibility(8);
    }
}
