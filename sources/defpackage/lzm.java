package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.music.R;

/* renamed from: lzm reason: default package */
final class lzm {
    fyt a;
    private final Context b;
    private final a c;
    private final boolean d;
    private final boolean e;

    /* renamed from: lzm$a */
    static class a {
        final gvd a;
        gvh<?> b;

        public a(gvd gvd) {
            this.a = gvd;
        }
    }

    lzm(Context context, a aVar, boolean z, boolean z2) {
        this.b = (Context) fay.a(context);
        this.c = (a) fay.a(aVar);
        this.d = z;
        this.e = z2;
    }

    public final void a(GlueHeaderLayout glueHeaderLayout, gzt gzt) {
        glueHeaderLayout.d((View) null);
        String str = "primary_buttons";
        int i = 0;
        if (gzt != null && !gzt.childGroup(str).isEmpty()) {
            gzt gzt2 = (gzt) gzt.childGroup(str).get(0);
            a aVar = this.c;
            aVar.b = aVar.a.a(aVar.b, gzt2, glueHeaderLayout, 0);
            V v = aVar.b.b;
            fyt fyt = this.a;
            if (this.d && fyt != null) {
                if (v.getParent() != null) {
                    ((ViewGroup) v.getParent()).removeView(v);
                }
                FrameLayout frameLayout = new FrameLayout(this.b);
                frameLayout.setLayoutParams(new LayoutParams(-2, -2));
                frameLayout.addView(v);
                fyu a2 = fyt.a(R.id.actionbar_item_radio, "").a((View) frameLayout);
                frameLayout.getClass();
                a2.a((Runnable) new $$Lambda$MVkYf3BuVxXy7rxrXvHR4SUXEU(frameLayout));
            } else if (!this.d || this.e) {
                glueHeaderLayout.a((View) v, true);
                i = uts.b(24.0f, this.b.getResources());
            }
        }
        View e2 = glueHeaderLayout.e(true);
        if (e2 instanceof GlueHeaderViewV2) {
            GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) e2;
            int a3 = gaa.a(this.b.getResources());
            if (!this.e) {
                a3 += uuu.c(this.b, R.attr.actionBarSize);
            }
            glueHeaderViewV2.a = a3 + i;
            glueHeaderViewV2.b(i);
        }
    }
}
