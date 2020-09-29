package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.music.lyrics.views.LyricsAppearance;

/* renamed from: svt reason: default package */
public final class svt extends FrameLayout implements Checkable {
    final TextView a = ((TextView) findViewById(R.id.text_view));
    public int b;
    private boolean c;
    private final int d;
    private final int e;
    private final LyricsAppearance f;

    public svt(Context context, int i, int i2, LyricsAppearance lyricsAppearance) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.lyrics_line_view, this);
        vgl.a(context, this.a, lyricsAppearance.mTextStyle);
        this.a.setTextColor(i2);
        this.d = i;
        this.e = i2;
        this.f = lyricsAppearance;
    }

    public final boolean isChecked() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i2);
        int b2 = vfj.b((float) this.f.mLineHeight, getResources());
        int i3 = size / b2;
        int i4 = i3 - (i3 % 2);
        if (i4 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size2 = MeasureSpec.getSize(i);
        int i5 = size / i4;
        if (i5 == b2) {
            i5 = b2;
        }
        int i6 = 0;
        int ceil = (int) Math.ceil((double) this.a.getPaint().measureText(this.a.getText().toString()));
        while (ceil > 0) {
            ceil -= size2;
            i6++;
        }
        if (i6 == 0) {
            i6 = 1;
        }
        this.b = i6;
        this.a.setHeight(this.b * i5);
        if (this.b > 1) {
            this.a.setLineSpacing(0.0f, ((float) i5) / ((float) this.a.getPaint().getFontMetricsInt(null)));
        }
        super.onMeasure(i, i2);
    }

    public final void setChecked(boolean z) {
        if (this.c != z) {
            this.c = z;
            if (z) {
                this.a.setTextColor(this.d);
                return;
            }
            this.a.setTextColor(this.e);
        }
    }

    public final void toggle() {
        setChecked(!this.c);
    }
}
