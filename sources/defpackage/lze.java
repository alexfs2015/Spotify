package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.music.R;

/* renamed from: lze reason: default package */
final class lze implements lzj {
    private final GlueHeaderViewV2 a;
    private final lzl b;
    private final lzo c;

    lze(Context context, ViewGroup viewGroup, lzl lzl, boolean z) {
        fbp.a(context);
        this.a = new GlueHeaderViewV2(context);
        this.a.setLayoutParams(gas.b(context, viewGroup));
        this.a.a(gau.a(context.getResources()));
        if (z) {
            ftc.a(context).a(0.0f);
        } else {
            this.a.a((fvu) new $$Lambda$lze$XjLIJQtn8MKfAS4PEKzRQ4rrXxM(this, context, new AccelerateInterpolator(3.0f)));
        }
        this.c = new lzo(context, this.a, R.layout.browse_header);
        this.a.a((fxe) this.c);
        this.b = (lzl) fbp.a(lzl);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, Interpolator interpolator, float f) {
        ftc.a(context).a(interpolator.getInterpolation(f));
        this.a.setAlpha(Math.max(0.7f, 1.0f - f));
    }

    public final void a(CharSequence charSequence) {
        this.c.a.setText(charSequence);
    }

    public final void a(String str) {
        this.b.a((View) this.a, str);
    }

    public final View getView() {
        return this.a;
    }
}
