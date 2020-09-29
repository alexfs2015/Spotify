package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

/* renamed from: gzl reason: default package */
public final class gzl extends gyi {
    private final Picasso a;

    /* renamed from: gzl$a */
    public static class a extends defpackage.gyi.a {
        private wgx g;
        private String h;
        private final Picasso i;

        protected a(ViewGroup viewGroup, gwm gwm, Picasso picasso) {
            super(viewGroup, gwm);
            this.i = picasso;
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            super.a(hcm, gwm, bVar);
            hcp background = hcm.images().background();
            String uri = background != null ? background.uri() : null;
            if (!fbn.a(this.h, uri)) {
                wgx wgx = this.g;
                if (wgx != null) {
                    this.i.d(wgx);
                }
                if (uri != null) {
                    this.g = new vhh(this.a, vhh.a);
                    this.i.a(uri).a((wgz) vhb.a).a(this.g);
                } else {
                    this.g = null;
                    ((RecyclerView) this.a).setBackgroundResource(0);
                }
                this.h = uri;
            }
        }
    }

    public gzl(Picasso picasso) {
        this.a = picasso;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(viewGroup, gwm, this.a);
    }
}
