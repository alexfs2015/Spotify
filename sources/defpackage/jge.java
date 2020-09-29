package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import com.spotify.music.R;

/* renamed from: jge reason: default package */
public final class jge extends FrameLayout {
    public a a;
    public FrameLayout b;
    private final Paint c = new Paint();
    private int d;
    private float e;
    /* access modifiers changed from: private */
    public Optional<Object> f = Optional.e();
    private final RectF g = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private final RectF h = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: jge$a */
    public interface a {
        void a();
    }

    public jge(Context context) {
        super(context);
        setId(R.id.tooltip_view);
        setWillNotDraw(false);
        Resources resources = getResources();
        this.c.setStyle(Style.FILL);
        this.c.setAntiAlias(true);
        this.c.setColor(fr.c(getContext(), R.color.cat_light_cyan));
        this.d = resources.getDimensionPixelSize(R.dimen.tooltip_arrow_height);
        this.e = ((float) this.d) / ((float) Math.sqrt(2.0d));
        this.b = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.tooltip_configuration_frame, this, true).findViewById(R.id.tinkerbell_configuration_container);
    }

    static /* synthetic */ void a(jge jge, float f2) {
        float f3 = ((1.0f - f2) * 0.0f) / 2.0f;
        RectF rectF = jge.g;
        rectF.left = 0.0f;
        rectF.top = f3 + 0.0f;
        rectF.right = 0.0f;
        rectF.bottom = 0.0f - f3;
    }

    static /* synthetic */ void b(jge jge, float f2) {
        float f3 = jge.e * f2;
        RectF rectF = jge.h;
        float f4 = -f3;
        rectF.left = f4;
        rectF.top = f4;
        rectF.right = f3;
        rectF.bottom = f3;
    }

    public final void a(boolean z) {
        setVisibility(8);
        if (this.f.b()) {
            this.f.c();
            this.f = Optional.e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.drawRoundRect(this.g, 0.0f, 0.0f, this.c);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
