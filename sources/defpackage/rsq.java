package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;

/* renamed from: rsq reason: default package */
public final class rsq extends defpackage.rnx.a<a> {
    private final Picasso a;

    /* renamed from: rsq$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final TextView b = ((TextView) this.a.findViewById(R.id.title));
        private final TextView c = ((TextView) this.a.findViewById(R.id.subtitle));
        private final ImageView d = ((ImageView) this.a.findViewById(R.id.image));
        private final ImageView e = ((ImageView) this.a.findViewById(R.id.shuffle_badge));
        private final Drawable f;
        private final Drawable g;
        private final Picasso h;

        protected a(ViewGroup viewGroup, Picasso picasso) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_row_large_component_layout, viewGroup, false));
            this.h = picasso;
            this.f = frr.a(viewGroup.getContext());
            this.g = fr.a(viewGroup.getContext(), (int) R.drawable.shuffle_badge_stroke);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            String title = hcm.text().title();
            String subtitle = hcm.text().subtitle();
            this.b.setText(fbo.b(title));
            if (fbo.a(subtitle)) {
                this.c.setVisibility(8);
            } else {
                this.c.setVisibility(0);
                this.c.setText(subtitle);
            }
            if (hcm.custom().boolValue("shuffleBadge", false)) {
                this.e.setVisibility(0);
                this.e.setImageDrawable(this.f);
                this.e.setBackground(this.g);
            } else {
                this.e.setVisibility(8);
            }
            hcp main = hcm.images().main();
            String uri = main == null ? null : main.uri();
            this.h.a(!TextUtils.isEmpty(uri) ? Uri.parse(uri) : Uri.EMPTY).a((int) R.color.image_placeholder_color).b((int) R.color.image_placeholder_color).a(this.d);
            vfz.b(this.a).b(this.d, this.e).a(this.b, this.c).a();
            hdl.a(gwm.c).a("click").a(hcm).a(this.a).a();
        }
    }

    public rsq(Picasso picasso) {
        this.a = picasso;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final int b() {
        return R.id.home_row_large_component;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(viewGroup, this.a);
    }
}
