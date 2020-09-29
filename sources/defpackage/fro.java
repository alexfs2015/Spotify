package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.android.paste.widget.RoundedCornerImageView;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.spotify.paste.widgets.layouts.AspectRatioView;

/* renamed from: fro reason: default package */
final class fro implements frn {
    private final AspectRatioView a;
    private final TextView b = ((TextView) this.a.findViewById(16908308));
    private final RoundedCornerImageView c = ((RoundedCornerImageView) this.a.findViewById(R.id.category_card_background));
    private final SpotifyIconView d = ((SpotifyIconView) this.a.findViewById(16908295));

    fro(View view) {
        this.a = (AspectRatioView) view;
        View findViewById = this.a.findViewById(R.id.background);
        vfz.a(findViewById).b(this.d, this.c).a(this.b).a();
        a(true);
    }

    public final ImageView a() {
        return this.c;
    }

    public final void a(SpotifyIconV2 spotifyIconV2) {
        if (spotifyIconV2 != null) {
            this.d.a(spotifyIconV2);
            this.d.setVisibility(0);
            return;
        }
        this.d.setVisibility(8);
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void a(boolean z) {
        this.c.a(z);
    }

    public final TextView b() {
        return this.b;
    }

    public final View getView() {
        return this.a;
    }
}
