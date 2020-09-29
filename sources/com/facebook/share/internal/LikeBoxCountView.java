package com.facebook.share.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.music.R;

@Deprecated
public final class LikeBoxCountView extends FrameLayout {
    private TextView a;
    private LikeBoxCountViewCaretPosition b = LikeBoxCountViewCaretPosition.LEFT;
    private float c;
    private float d;
    private float e;
    private Paint f;
    private int g;
    private int h;

    /* renamed from: com.facebook.share.internal.LikeBoxCountView$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LikeBoxCountViewCaretPosition.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition[] r0 = com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition r1 = com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition r1 = com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.TOP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition r1 = com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.RIGHT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition r1 = com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.LikeBoxCountView.AnonymousClass1.<clinit>():void");
        }
    }

    public enum LikeBoxCountViewCaretPosition {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    @Deprecated
    public LikeBoxCountView(Context context) {
        super(context);
        setWillNotDraw(false);
        this.c = getResources().getDimension(R.dimen.com_facebook_likeboxcountview_caret_height);
        this.d = getResources().getDimension(R.dimen.com_facebook_likeboxcountview_caret_width);
        this.e = getResources().getDimension(R.dimen.com_facebook_likeboxcountview_border_radius);
        this.f = new Paint();
        this.f.setColor(getResources().getColor(R.color.com_facebook_likeboxcountview_border_color));
        this.f.setStrokeWidth(getResources().getDimension(R.dimen.com_facebook_likeboxcountview_border_width));
        this.f.setStyle(Style.STROKE);
        this.a = new TextView(context);
        this.a.setLayoutParams(new LayoutParams(-1, -1));
        this.a.setGravity(17);
        this.a.setTextSize(0, getResources().getDimension(R.dimen.com_facebook_likeboxcountview_text_size));
        this.a.setTextColor(getResources().getColor(R.color.com_facebook_likeboxcountview_text_color));
        this.g = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeboxcountview_text_padding);
        this.h = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeboxcountview_caret_height);
        addView(this.a);
        a(this.b);
    }

    @Deprecated
    public final void a(String str) {
        this.a.setText(str);
    }

    @Deprecated
    public final void a(LikeBoxCountViewCaretPosition likeBoxCountViewCaretPosition) {
        this.b = likeBoxCountViewCaretPosition;
        int i = AnonymousClass1.a[likeBoxCountViewCaretPosition.ordinal()];
        if (i == 1) {
            a(this.h, 0, 0, 0);
        } else if (i == 2) {
            a(0, this.h, 0, 0);
        } else if (i != 3) {
            if (i == 4) {
                a(0, 0, 0, this.h);
            }
        } else {
            a(0, 0, this.h, 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int i = AnonymousClass1.a[this.b.ordinal()];
        if (i == 1) {
            paddingLeft = (int) (((float) paddingLeft) + this.c);
        } else if (i == 2) {
            paddingTop = (int) (((float) paddingTop) + this.c);
        } else if (i == 3) {
            width = (int) (((float) width) - this.c);
        } else if (i == 4) {
            height = (int) (((float) height) - this.c);
        }
        float f2 = (float) paddingLeft;
        float f3 = (float) paddingTop;
        float f4 = (float) width;
        float f5 = (float) height;
        Path path = new Path();
        float f6 = this.e * 2.0f;
        float f7 = f2 + f6;
        float f8 = f3 + f6;
        path.addArc(new RectF(f2, f3, f7, f8), -180.0f, 90.0f);
        if (this.b == LikeBoxCountViewCaretPosition.TOP) {
            float f9 = f4 - f2;
            path.lineTo(((f9 - this.d) / 2.0f) + f2, f3);
            path.lineTo((f9 / 2.0f) + f2, f3 - this.c);
            path.lineTo(((f9 + this.d) / 2.0f) + f2, f3);
        }
        path.lineTo(f4 - this.e, f3);
        float f10 = f4 - f6;
        path.addArc(new RectF(f10, f3, f4, f8), -90.0f, 90.0f);
        if (this.b == LikeBoxCountViewCaretPosition.RIGHT) {
            float f11 = f5 - f3;
            path.lineTo(f4, ((f11 - this.d) / 2.0f) + f3);
            path.lineTo(this.c + f4, (f11 / 2.0f) + f3);
            path.lineTo(f4, ((f11 + this.d) / 2.0f) + f3);
        }
        path.lineTo(f4, f5 - this.e);
        float f12 = f5 - f6;
        path.addArc(new RectF(f10, f12, f4, f5), 0.0f, 90.0f);
        if (this.b == LikeBoxCountViewCaretPosition.BOTTOM) {
            float f13 = f4 - f2;
            path.lineTo(((this.d + f13) / 2.0f) + f2, f5);
            path.lineTo((f13 / 2.0f) + f2, this.c + f5);
            path.lineTo(((f13 - this.d) / 2.0f) + f2, f5);
        }
        path.lineTo(this.e + f2, f5);
        path.addArc(new RectF(f2, f12, f7, f5), 90.0f, 90.0f);
        if (this.b == LikeBoxCountViewCaretPosition.LEFT) {
            float f14 = f5 - f3;
            path.lineTo(f2, ((this.d + f14) / 2.0f) + f3);
            path.lineTo(f2 - this.c, (f14 / 2.0f) + f3);
            path.lineTo(f2, ((f14 - this.d) / 2.0f) + f3);
        }
        path.lineTo(f2, f3 + this.e);
        canvas.drawPath(path, this.f);
    }

    private void a(int i, int i2, int i3, int i4) {
        TextView textView = this.a;
        int i5 = this.g;
        textView.setPadding(i + i5, i2 + i5, i3 + i5, i5 + i4);
    }
}
