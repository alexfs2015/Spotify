package com.spotify.android.glue.components.card.glue;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.glue.components.card.Card.TextLayout;
import com.spotify.android.glue.components.card.CardAppearance;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable;
import com.spotify.paste.widgets.internal.PasteLinearLayout;

public class CardView extends PasteLinearLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public CardAccessoryDrawable d;
    public float e;
    private final vfu f;

    /* renamed from: com.spotify.android.glue.components.card.glue.CardView$1 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[CardAppearance.values().length];
        static final /* synthetic */ int[] b = new int[TextLayout.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0072 */
        static {
            /*
                com.spotify.android.glue.components.card.Card$TextLayout[] r0 = com.spotify.android.glue.components.card.Card.TextLayout.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.android.glue.components.card.Card$TextLayout r2 = com.spotify.android.glue.components.card.Card.TextLayout.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.android.glue.components.card.Card$TextLayout r3 = com.spotify.android.glue.components.card.Card.TextLayout.DOUBLE_LINE_TITLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.android.glue.components.card.Card$TextLayout r4 = com.spotify.android.glue.components.card.Card.TextLayout.DOUBLE_LINE_SUBTITLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.spotify.android.glue.components.card.CardAppearance[] r3 = com.spotify.android.glue.components.card.CardAppearance.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x003d }
                com.spotify.android.glue.components.card.CardAppearance r4 = com.spotify.android.glue.components.card.CardAppearance.NO_TEXT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.spotify.android.glue.components.card.CardAppearance r3 = com.spotify.android.glue.components.card.CardAppearance.TITLE_ONLY     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.spotify.android.glue.components.card.CardAppearance r1 = com.spotify.android.glue.components.card.CardAppearance.TITLE_AND_SUBTITLE     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.spotify.android.glue.components.card.CardAppearance r1 = com.spotify.android.glue.components.card.CardAppearance.TITLE_AND_METADATA     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0067 }
                com.spotify.android.glue.components.card.CardAppearance r1 = com.spotify.android.glue.components.card.CardAppearance.DESCRIPTION_ONLY     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.spotify.android.glue.components.card.CardAppearance r1 = com.spotify.android.glue.components.card.CardAppearance.LARGE_DESCRIPTION_ONLY     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007d }
                com.spotify.android.glue.components.card.CardAppearance r1 = com.spotify.android.glue.components.card.CardAppearance.LARGE_NO_TEXT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.android.glue.components.card.glue.CardView.AnonymousClass1.<clinit>():void");
        }
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 1.0f;
        this.f = new vfu(this);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.glue_card, this);
        this.a = (ImageView) findViewById(16908294);
        this.b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.subtitle);
        setGravity(1);
        fzy.a(this.b, this.c);
        fzy.a((View) this);
        setClickable(true);
        vfz.a(this).b(this.a).a(this.b, this.c).a();
        if (!isInEditMode()) {
            this.c.setVisibility(8);
        }
    }

    private int a(int i) {
        return Math.round((((float) i) * (1.0f - this.e)) / 2.0f);
    }

    private static int a(TextView textView) {
        if (textView.getVisibility() == 8) {
            return 0;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) textView.getLayoutParams();
        return textView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static int a(TextView textView, int i) {
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) textView.getLayoutParams();
        return (i * ((fontMetricsInt.bottom - fontMetricsInt.top) + fontMetricsInt.leading)) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int b(int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        float f2 = (float) i;
        int round = Math.round(this.e * f2);
        int round2 = Math.round(f2 * ((this.e * 0.5f) + 0.5f));
        this.b.measure(MeasureSpec.makeMeasureSpec(round2, 1073741824), makeMeasureSpec);
        this.c.measure(MeasureSpec.makeMeasureSpec(round2, 1073741824), makeMeasureSpec);
        this.a.measure(MeasureSpec.makeMeasureSpec(round, 1073741824), makeMeasureSpec);
        return i;
    }

    public final void a(TextLayout textLayout) {
        int i = AnonymousClass1.b[textLayout.ordinal()];
        if (i == 1) {
            this.b.setMaxLines(1);
            this.c.setMaxLines(1);
        } else if (i != 2) {
            if (i == 3) {
                this.b.setMaxLines(1);
                this.c.setMaxLines(2);
            }
        } else {
            this.b.setMaxLines(2);
            this.c.setMaxLines(1);
        }
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        CardAccessoryDrawable cardAccessoryDrawable = this.d;
        if (cardAccessoryDrawable != null) {
            canvas.save();
            if (vgi.a((View) this)) {
                canvas.translate((float) (cardAccessoryDrawable.a + a(getMeasuredWidth())), (float) ((this.a.getMeasuredHeight() - cardAccessoryDrawable.getIntrinsicHeight()) - cardAccessoryDrawable.a));
            } else {
                canvas.translate((float) (((canvas.getWidth() - cardAccessoryDrawable.getIntrinsicWidth()) - cardAccessoryDrawable.a) - a(getMeasuredWidth())), (float) ((this.a.getMeasuredHeight() - cardAccessoryDrawable.getIntrinsicHeight()) - cardAccessoryDrawable.a));
            }
            cardAccessoryDrawable.draw(canvas);
            canvas.restore();
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        boolean z = false;
        for (int i = 0; i < drawableState.length; i++) {
            z |= drawableState[i] == -16842910;
        }
        if (z) {
            setAlpha(0.4f);
        }
        this.f.a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f.b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = (getMeasuredWidth() / 2) - (this.a.getMeasuredWidth() / 2);
        int measuredWidth2 = this.a.getMeasuredWidth() + measuredWidth;
        int measuredWidth3 = (getMeasuredWidth() / 2) - (this.b.getMeasuredWidth() / 2);
        int measuredWidth4 = this.b.getMeasuredWidth() + measuredWidth3;
        int measuredHeight = this.a.getMeasuredHeight() + 0;
        this.a.layout(measuredWidth, 0, measuredWidth2, measuredHeight);
        if (this.b.getVisibility() != 8) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.b.getLayoutParams();
            int i5 = measuredHeight + marginLayoutParams.topMargin;
            TextView textView = this.b;
            textView.layout(measuredWidth3, i5, measuredWidth4, textView.getMeasuredHeight() + i5);
            measuredHeight = i5 + this.b.getMeasuredHeight() + marginLayoutParams.bottomMargin;
        }
        if (this.c.getVisibility() != 8) {
            int i6 = measuredHeight + ((MarginLayoutParams) this.c.getLayoutParams()).topMargin;
            TextView textView2 = this.c;
            textView2.layout(measuredWidth3, i6, measuredWidth4, textView2.getMeasuredHeight() + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i);
        boolean z = false;
        if (!jum.a(i) || !jum.a(i2)) {
            boolean b2 = jum.b(i);
            boolean b3 = jum.b(i2);
            if (b2 == b3) {
                super.onMeasure(i, i2);
                return;
            }
            if (b3) {
                i3 = b(size2);
            } else {
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                TextView textView = this.b;
                int a2 = a(textView, jm.a(textView));
                TextView textView2 = this.c;
                int round = Math.round(((float) ((size - a2) - a(textView2, jm.a(textView2)))) / this.e);
                float f2 = (float) round;
                int round2 = Math.round(this.e * f2);
                int round3 = Math.round(f2 * ((this.e * 0.5f) + 0.5f));
                int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(round2, 1073741824);
                int makeMeasureSpec3 = MeasureSpec.makeMeasureSpec(round3, 1073741824);
                this.b.measure(makeMeasureSpec3, makeMeasureSpec);
                this.c.measure(makeMeasureSpec3, makeMeasureSpec);
                this.a.measure(makeMeasureSpec2, makeMeasureSpec);
                i3 = round;
            }
            int measuredHeight = this.a.getMeasuredHeight();
            if (this.b.getVisibility() != 8) {
                measuredHeight += a(this.b);
            }
            if (this.c.getVisibility() != 8) {
                measuredHeight += a(this.c);
            }
            setMeasuredDimension(i3, measuredHeight);
            return;
        }
        if (size2 < size) {
            z = true;
        }
        fbp.a(z);
        setMeasuredDimension(b(size2), size);
    }
}
