package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;

/* renamed from: lzd reason: default package */
final class lzd implements lzj {
    private final GlueHeaderViewV2 a;
    private final lzl b;

    lzd(Context context, ViewGroup viewGroup, lzl lzl) {
        fbp.a(context);
        this.a = new GlueHeaderViewV2(context);
        this.a.setLayoutParams(gas.b(context, viewGroup));
        this.a.a(gau.a(context.getResources()));
        ftc.a(context).a(0.0f);
        this.b = (lzl) fbp.a(lzl);
    }

    public final void a(CharSequence charSequence) {
    }

    public final void a(String str) {
        this.b.a((View) this.a, str);
    }

    public final View getView() {
        return this.a;
    }
}
