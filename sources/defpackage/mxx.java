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

/* renamed from: mxx reason: default package */
public final class mxx extends gwh implements reu<View> {
    private final uvf a;

    /* renamed from: mxx$a */
    static class a extends defpackage.gwh.a {
        private final uvf g;
        private final Resources h;
        private final uvq<View> i = new uvq<>(new b() {
            public final void a(int i) {
                ip.a(a.this.a, a.this.a(i));
            }

            public final void a() {
                Logger.e("Failed to extract color for background in freetier:onDemandContainer component.", new Object[0]);
                a.this.a();
            }
        });

        protected a(ViewGroup viewGroup, gum gum, uvf uvf) {
            super(viewGroup, gum);
            this.g = uvf;
            this.h = viewGroup.getContext().getResources();
            ((RecyclerView) this.a).setPadding(viewGroup.getPaddingLeft(), uts.b(16.0f, this.h), viewGroup.getPaddingRight(), uts.b(12.0f, this.h));
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            super.a(gzt, gum, bVar);
            gzw background = gzt.images().background();
            if (background != null) {
                this.g.a(background.uri()).a((vsr) this.i);
            } else {
                a();
            }
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
    }

    public final int b() {
        return R.id.free_tier_on_demand_container;
    }

    public mxx(uvf uvf) {
        this.a = uvf;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(viewGroup, gum, this.a);
    }
}
