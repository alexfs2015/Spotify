package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

/* renamed from: gxa reason: default package */
public final class gxa extends gwh {

    /* renamed from: gxa$a */
    public static class a extends defpackage.gwh.a {
        private vsr g;
        private String h;

        protected a(ViewGroup viewGroup, gum gum) {
            super(viewGroup, gum);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            super.a(gzt, gum, bVar);
            gzw background = gzt.images().background();
            Picasso a = ((uvt) ggw.a(uvt.class)).a();
            String uri = background != null ? background.uri() : null;
            if (!faw.a(this.h, uri)) {
                vsr vsr = this.g;
                if (vsr != null) {
                    a.d(vsr);
                }
                if (uri != null) {
                    this.g = new uvq(this.a, uvq.a);
                    a.a(uri).a((vst) uvk.a).a(this.g);
                } else {
                    this.g = null;
                    ((RecyclerView) this.a).setBackgroundResource(0);
                }
                this.h = uri;
            }
        }
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(viewGroup, gum);
    }
}
