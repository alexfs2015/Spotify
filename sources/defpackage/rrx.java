package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: rrx reason: default package */
public final class rrx implements rry {
    private final Picasso a;
    private final HubsGlueImageDelegate b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.title));
    private final TextView e = ((TextView) this.c.findViewById(R.id.subtitle));
    private final TextView f = ((TextView) this.c.findViewById(R.id.accessoryText));
    private final ImageView g = ((ImageView) this.c.findViewById(R.id.image));
    private final Context h = this.c.getContext();

    public rrx(Context context, Picasso picasso, HubsGlueImageDelegate hubsGlueImageDelegate, ViewGroup viewGroup) {
        this.c = LayoutInflater.from((Context) fbp.a(context)).inflate(R.layout.home_premium_promo_card, viewGroup, false);
        this.a = (Picasso) fbp.a(picasso);
        this.b = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.d.setText(charSequence);
            this.d.setVisibility(0);
        }
    }

    public final void a(String str, String str2) {
        SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) a.a.a(str2).a(SpotifyIconV2.PLAYLIST);
        Context context = this.h;
        Drawable a2 = gaa.a(context, spotifyIconV2, (float) vfj.b(64.0f, context.getResources()));
        this.a.a(this.b.a(str)).a(a2).b(a2).a(this.g);
    }

    public final void b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.e.setText(charSequence);
            this.e.setVisibility(0);
        }
    }

    public final void c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f.setText(charSequence);
            this.f.setVisibility(0);
        }
    }

    public final View getView() {
        return this.c;
    }
}
