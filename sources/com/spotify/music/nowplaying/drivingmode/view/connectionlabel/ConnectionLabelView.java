package com.spotify.music.nowplaying.drivingmode.view.connectionlabel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.R;

public final class ConnectionLabelView extends AppCompatTextView implements tpg {
    private final Handler a = new Handler();
    private final Runnable b = new Runnable() {
        public final void run() {
            ConnectionLabelView.this.f();
        }
    };

    public ConnectionLabelView(Context context) {
        super(context);
        vgl.a(context, this, 2132017606);
    }

    public ConnectionLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vgl.a(context, this, 2132017606);
    }

    public ConnectionLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vgl.a(context, this, 2132017606);
    }

    private void a(String str, Drawable drawable) {
        setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        setText(str);
    }

    private void e() {
        ip.n(this).b();
        ip.n(this).a(300).a(fuh.c).a(1.0f).c();
    }

    /* access modifiers changed from: private */
    public void f() {
        ip.n(this).b();
        ip.n(this).a(300).a(fuh.c).a(0.0f).c();
    }

    private void g() {
        h();
        e();
    }

    private void h() {
        this.a.removeCallbacks(this.b);
    }

    public final void a(String str, boolean z) {
        Drawable e = tou.e(getContext());
        e.setAlpha(179);
        setTextColor(fr.c(getContext(), R.color.white_70));
        a(str, e);
        g();
        if (z) {
            this.a.postDelayed(this.b, 5000);
        }
    }

    public final void c() {
        a(getResources().getString(R.string.driving_label_unknown), false);
    }

    public final void d() {
        Drawable e = tou.e(getContext());
        setTextColor(fr.c(getContext(), R.color.white));
        a(getResources().getString(R.string.driving_label_disconnected), e);
        g();
    }
}