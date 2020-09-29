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

/* renamed from: rqq reason: default package */
public final class rqq extends defpackage.rnx.a<a> {
    private final rqw a;
    private final Picasso b;

    /* renamed from: rqq$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final rqw b;
        private final wgj c;
        private final ImageView d;
        private final ImageView e;
        private final TextView f;
        private final Button g;

        protected a(View view, Picasso picasso, rqw rqw) {
            super(view);
            this.b = rqw;
            this.c = new wgj(new wgu(picasso), view.getContext());
            this.d = (ImageView) view.findViewById(R.id.placeholder_image);
            this.e = (ImageView) view.findViewById(R.id.image);
            this.f = (TextView) view.findViewById(R.id.title);
            this.g = (Button) view.findViewById(R.id.button);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            CardSize cardSize = CardSize.MEDIUM;
            this.b.a(this.d, cardSize);
            this.b.a(this.a, cardSize);
            this.f.setText(hcm.text().title());
            this.g.setText(hcm.text().accessory());
            hcp main = hcm.images().main();
            Uri parse = (main == null || main.uri() == null) ? Uri.EMPTY : Uri.parse(main.uri());
            Drawable drawable = this.e.getContext().getResources().getDrawable(R.drawable.home_card_podcast_call_to_action_placeholder);
            wgr a = this.c.a(parse);
            a.a(drawable);
            a.b(drawable);
            a.a(vhj.a(this.e, vgt.a((float) this.a.getResources().getDimensionPixelSize(R.dimen.episode_card_corner_radius))));
            hdl.a((View) this.g);
            vfz.c(this.g).a();
            hdl.a(gwm.c).a("click").a(hcm).a(this.a).a();
        }
    }

    public rqq(rqw rqw, Picasso picasso) {
        this.a = rqw;
        this.b = picasso;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD, Trait.ONE_COLUMN);
    }

    public final int b() {
        return R.id.home_card_podcast_call_to_action;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_card_podcast_call_to_action, viewGroup, false), this.b, this.a);
    }
}
