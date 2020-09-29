package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;

/* renamed from: rho reason: default package */
public final class rho extends defpackage.rev.a<a> {
    private final rhu a;
    private final Picasso b;

    /* renamed from: rho$a */
    static class a extends defpackage.gui.c.a<View> {
        private final rhu b;
        private final vsd c;
        private final ImageView d;
        private final ImageView e;
        private final TextView f;
        private final Button g;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(View view, Picasso picasso, rhu rhu) {
            super(view);
            this.b = rhu;
            this.c = new vsd(new vso(picasso), view.getContext());
            this.d = (ImageView) view.findViewById(R.id.placeholder_image);
            this.e = (ImageView) view.findViewById(R.id.image);
            this.f = (TextView) view.findViewById(R.id.title);
            this.g = (Button) view.findViewById(R.id.button);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            CardSize cardSize = CardSize.MEDIUM;
            this.b.a(this.d, cardSize);
            this.b.a(this.a, cardSize);
            this.f.setText(gzt.text().title());
            this.g.setText(gzt.text().accessory());
            gzw main = gzt.images().main();
            Uri parse = (main == null || main.uri() == null) ? Uri.EMPTY : Uri.parse(main.uri());
            Drawable drawable = this.e.getContext().getResources().getDrawable(R.drawable.home_card_podcast_call_to_action_placeholder);
            vsl a = this.c.a(parse);
            a.a(drawable);
            a.b(drawable);
            a.a(uvt.a(this.e, uvc.a((float) this.a.getResources().getDimensionPixelSize(R.dimen.episode_card_corner_radius))));
            has.a((View) this.g);
            uui.c(this.g).a();
            has.a(gum.c).a("click").a(gzt).a(this.a).a();
        }
    }

    public final int b() {
        return R.id.home_card_podcast_call_to_action;
    }

    public rho(rhu rhu, Picasso picasso) {
        this.a = rhu;
        this.b = picasso;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD, Trait.ONE_COLUMN);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_card_podcast_call_to_action, viewGroup, false), this.b, this.a);
    }
}
