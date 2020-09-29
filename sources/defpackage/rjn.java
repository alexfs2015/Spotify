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

/* renamed from: rjn reason: default package */
public final class rjn extends defpackage.rev.a<a> {
    private final Picasso a;

    /* renamed from: rjn$a */
    static class a extends defpackage.gui.c.a<View> {
        private final TextView b = ((TextView) this.a.findViewById(R.id.title));
        private final TextView c = ((TextView) this.a.findViewById(R.id.subtitle));
        private final ImageView d = ((ImageView) this.a.findViewById(R.id.image));
        private final ImageView e = ((ImageView) this.a.findViewById(R.id.shuffle_badge));
        private final Drawable f;
        private final Drawable g;
        private final Picasso h;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup, Picasso picasso) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_row_large_component_layout, viewGroup, false));
            this.h = picasso;
            this.f = fqx.a(viewGroup.getContext());
            this.g = fr.a(viewGroup.getContext(), (int) R.drawable.shuffle_badge_stroke);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            String str;
            String title = gzt.text().title();
            String subtitle = gzt.text().subtitle();
            this.b.setText(fax.b(title));
            if (fax.a(subtitle)) {
                this.c.setVisibility(8);
            } else {
                this.c.setVisibility(0);
                this.c.setText(subtitle);
            }
            if (gzt.custom().boolValue("shuffleBadge", false)) {
                this.e.setVisibility(0);
                this.e.setImageDrawable(this.f);
                this.e.setBackground(this.g);
            } else {
                this.e.setVisibility(8);
            }
            gzw main = gzt.images().main();
            if (main == null) {
                str = null;
            } else {
                str = main.uri();
            }
            this.h.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a((int) R.color.image_placeholder_color).b((int) R.color.image_placeholder_color).a(this.d);
            uui.b(this.a).b(this.d, this.e).a(this.b, this.c).a();
            has.a(gum.c).a("click").a(gzt).a(this.a).a();
        }
    }

    public final int b() {
        return R.id.home_row_large_component;
    }

    public rjn(Picasso picasso) {
        this.a = picasso;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(viewGroup, this.a);
    }
}
