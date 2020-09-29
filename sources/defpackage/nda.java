package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;

/* renamed from: nda reason: default package */
public final class nda extends gyi implements rnw<View> {
    private final vgw a;

    /* renamed from: nda$a */
    static class a extends defpackage.gyi.a {
        private final vgw g;
        private final Resources h;
        private final vhh<View> i = new vhh<>(new b() {
            public final void a() {
                Logger.e("Failed to extract color for background in freetier:onDemandContainer component.", new Object[0]);
                a.this.a();
            }

            public final void a(int i) {
                ip.a(a.this.a, a.this.a(i));
            }
        });

        protected a(ViewGroup viewGroup, gwm gwm, vgw vgw) {
            super(viewGroup, gwm);
            this.g = vgw;
            this.h = viewGroup.getContext().getResources();
            ((RecyclerView) this.a).setPadding(viewGroup.getPaddingLeft(), vfj.b(16.0f, this.h), viewGroup.getPaddingRight(), vfj.b(12.0f, this.h));
        }

        /* access modifiers changed from: 0000 */
        public Drawable a(int i2) {
            int c = gd.c(gb.b(this.h, R.color.gray_7, null), 102);
            int c2 = gd.c(gb.b(this.h, R.color.gray_7, null), 229);
            int a = gd.a(c, i2);
            int a2 = gd.a(c2, i2);
            return new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{a, a2});
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            ip.a(this.a, a(gb.b(this.h, R.color.gray_background_30, null)));
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            super.a(hcm, gwm, bVar);
            hcp background = hcm.images().background();
            if (background != null) {
                this.g.a(background.uri()).a((wgx) this.i);
            } else {
                a();
            }
        }
    }

    public nda(vgw vgw) {
        this.a = vgw;
    }

    public final int b() {
        return R.id.free_tier_on_demand_container;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(viewGroup, gwm, this.a);
    }
}
