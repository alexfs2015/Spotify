package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: nlv reason: default package */
public final class nlv extends FrameLayout {
    private View a;
    private View b;
    private View c;
    private TextView d;
    private final int[] e = new int[2];
    private final int[] f = new int[2];
    private boolean g;

    private nlv(Context context, View view, String str) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.home_mix_education_view, this, true);
        this.c = findViewById(R.id.arrow_view);
        this.a = findViewById(R.id.frameLayout);
        this.d = (TextView) findViewById(R.id.textSuggestion);
        this.d.setText(str);
        this.b = view;
        int i = (int) (getResources().getDisplayMetrics().density * 8.0f);
        ((LayoutParams) this.a.getLayoutParams()).setMargins(i, 0, i, 0);
    }

    public static nlv a(Context context, View view, String str) {
        nlv nlv = new nlv(context, view, str);
        nlv.g = true;
        int i = (int) (nlv.getResources().getDisplayMetrics().density * 24.0f);
        ((LayoutParams) nlv.a.getLayoutParams()).setMargins(i, 0, i, 0);
        return nlv;
    }

    public static nlv b(Context context, View view, String str) {
        return new nlv(context, view, str);
    }

    public final void a(String str) {
        this.d.setText(str);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (this.b != null) {
            getLocationInWindow(this.e);
            this.b.getLocationInWindow(this.f);
            int measuredWidth = this.a.getMeasuredWidth() + this.a.getPaddingLeft() + this.a.getPaddingRight();
            int measuredHeight = this.a.getMeasuredHeight() + this.a.getPaddingTop() + this.a.getPaddingBottom();
            int[] iArr = this.f;
            int i6 = (iArr[0] - this.e[0]) - i;
            if (this.g) {
                i5 = i2;
            } else {
                i5 = iArr[1] + this.b.getMeasuredHeight();
            }
            int measuredWidth2 = (i6 + (this.b.getMeasuredWidth() / 2)) - (this.c.getMeasuredWidth() / 2);
            int width = (getWidth() / 2) - (measuredWidth / 2);
            if (!this.g) {
                i2 = this.f[1] + this.b.getMeasuredHeight();
            }
            int measuredHeight2 = i2 + this.c.getMeasuredHeight();
            View view = this.c;
            view.layout(measuredWidth2, i5, view.getMeasuredWidth() + measuredWidth2, this.c.getMeasuredHeight() + i5);
            this.a.layout(width, measuredHeight2, measuredWidth + width, measuredHeight + measuredHeight2);
        }
    }
}
