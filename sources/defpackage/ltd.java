package defpackage;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import java.text.NumberFormat;
import java.util.EnumSet;
import java.util.Locale;

/* renamed from: ltd reason: default package */
public final class ltd extends defpackage.rnx.a<a> {
    private final Picasso a;
    private final DisplayMetrics b;

    /* renamed from: ltd$a */
    static class a extends defpackage.gwi.c.a<View> {
        private View b;
        private View c;
        private TextView d = ((TextView) this.c.findViewById(R.id.rankText));
        private View e;
        private TextView f;
        private ImageView g;
        private TextView h;
        private Picasso i;

        a(View view, Picasso picasso, DisplayMetrics displayMetrics) {
            super(view);
            this.i = picasso;
            this.g = (ImageView) view.findViewById(R.id.img_picture);
            this.b = view.findViewById(R.id.artist_verified);
            this.h = (TextView) view.findViewById(R.id.biography);
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(view.getContext(), SpotifyIconV2.CHEVRON_RIGHT, (float) vfj.b(24.0f, view.getResources()));
            spotifyIconDrawable.a(fr.c(view.getContext(), R.color.cat_white));
            this.h.setCompoundDrawablesWithIntrinsicBounds(null, null, spotifyIconDrawable, null);
            this.c = view.findViewById(R.id.rank_layout);
            this.c.setBackgroundResource(R.drawable.artist_rank_shape);
            this.e = view.findViewById(R.id.monthly_listeners_layout);
            this.f = (TextView) this.e.findViewById(R.id.monthly_listeners);
            if (jvi.d(view.getContext())) {
                View findViewById = view.findViewById(R.id.artist_about_card_framelayout);
                LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = (displayMetrics.widthPixels / 4) + findViewById.getResources().getDimensionPixelOffset(R.dimen.std_16dp);
                findViewById.setLayoutParams(layoutParams);
                return;
            }
            this.e.setBackgroundResource(R.drawable.gradient_transparent_to_black_with_point5_opacity);
            this.b.setBackgroundResource(R.drawable.gradient_black_with_point3_opacity_to_transparent);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a(this.a, hcm, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            gwj.a(gwm, this.a, hcm);
            String description = hcm.text().description();
            if (description != null) {
                this.h.setText(jug.a(description).toString());
            }
            hcp background = hcm.images().background();
            this.i.a(background != null ? background.uri() : null).d().b().a((wgz) new ltg(vfj.a(4.0f, this.a.getResources()))).a(this.g);
            int intValue = hcm.custom().intValue("monthly_listeners_count", -1);
            int intValue2 = hcm.custom().intValue("global_chart_position", -1);
            if (intValue > 0) {
                this.f.setText(NumberFormat.getInstance(Locale.getDefault()).format((long) intValue));
                vgl.a(this.a.getContext(), this.f, 2132017673);
                this.e.setVisibility(0);
                if (intValue2 > 0) {
                    this.d.setText(ltf.a(intValue2));
                    this.c.setVisibility(0);
                }
            }
        }
    }

    public ltd(Picasso picasso, DisplayMetrics displayMetrics) {
        this.a = picasso;
        this.b = displayMetrics;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final int b() {
        return R.id.hubs_artist_biography_component;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.artist_about_card, viewGroup, false), this.a, this.b);
    }
}
