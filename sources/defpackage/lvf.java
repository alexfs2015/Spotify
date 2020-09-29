package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.music.R;

/* renamed from: lvf reason: default package */
final class lvf implements lvk {
    private final GlueHeaderViewV2 a;
    private final lvm b;
    private final lvp c;

    lvf(Context context, ViewGroup viewGroup, lvm lvm, boolean z) {
        fay.a(context);
        this.a = new GlueHeaderViewV2(context);
        this.a.setLayoutParams(fzy.b(context, viewGroup));
        this.a.a(gaa.a(context.getResources()));
        if (z) {
            fsi.a(context).a(0.0f);
        } else {
            this.a.a((fva) new $$Lambda$lvf$81NZ1JFl2jMfrI1nMKDRv2_5lNA(this, context, new AccelerateInterpolator(3.0f)));
        }
        this.c = new lvp(context, this.a, R.layout.browse_header);
        this.a.a((fwk) this.c);
        this.b = (lvm) fay.a(lvm);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, Interpolator interpolator, float f) {
        fsi.a(context).a(interpolator.getInterpolation(f));
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
