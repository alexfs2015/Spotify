package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;

/* renamed from: lve reason: default package */
final class lve implements lvk {
    private final GlueHeaderViewV2 a;
    private final lvm b;

    public final void a(CharSequence charSequence) {
    }

    lve(Context context, ViewGroup viewGroup, lvm lvm) {
        fay.a(context);
        this.a = new GlueHeaderViewV2(context);
        this.a.setLayoutParams(fzy.b(context, viewGroup));
        this.a.a(gaa.a(context.getResources()));
        fsi.a(context).a(0.0f);
        this.b = (lvm) fay.a(lvm);
    }

    public final void a(String str) {
        this.b.a((View) this.a, str);
    }

    public final View getView() {
        return this.a;
    }
}
