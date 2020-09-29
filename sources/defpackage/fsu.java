package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: fsu reason: default package */
final class fsu implements fsq {
    TextView a;
    TextView b;
    String c;
    String d;
    SpotifyIconV2 e;
    private ImageView f;
    private final int g;

    fsu() {
        this(120);
    }

    private fsu(int i) {
        this.g = 120;
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.glue_dialog_content_connect_style, viewGroup, true);
        this.a = (TextView) inflate.findViewById(R.id.target);
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.f = (ImageView) inflate.findViewById(R.id.icon);
        if (!inflate.isInEditMode()) {
            if (this.f != null) {
                fze.a(this.a);
            } else {
                fze.c(this.a);
            }
            fze.b(this.b);
            fze.a(inflate);
        }
        this.a.setText(this.c);
        this.b.setText(this.d);
        b();
    }

    public final int a() {
        return (int) Math.ceil((double) Math.abs(this.b.getPaint().getFontMetrics().descent));
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        ImageView imageView = this.f;
        if (imageView != null) {
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(imageView.getContext(), this.e, (float) uts.b((float) this.g, this.f.getResources()));
            spotifyIconDrawable.a(-16777216);
            spotifyIconDrawable.b();
            this.f.setImageDrawable(spotifyIconDrawable);
        }
    }
}
