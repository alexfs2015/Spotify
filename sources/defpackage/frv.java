package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: frv reason: default package */
public final class frv extends frt implements fru {
    private final TextView a;
    private final ImageButton b;
    private final View c;

    public final /* bridge */ /* synthetic */ TextView a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ void a(CharSequence charSequence) {
        super.a(charSequence);
    }

    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public final /* bridge */ /* synthetic */ void a(boolean z) {
        super.a(z);
    }

    public final /* bridge */ /* synthetic */ View b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ void b(boolean z) {
        super.b(z);
    }

    public final /* bridge */ /* synthetic */ View getView() {
        return super.getView();
    }

    public frv(View view) {
        super(view);
        this.c = view.findViewById(R.id.extender_header_gradient);
        this.a = (TextView) view.findViewById(16908309);
        this.b = (ImageButton) view.findViewById(R.id.icon);
        fze.a(this.a);
        fze.a(view);
    }

    public final TextView c() {
        return this.a;
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final View d() {
        return this.b;
    }

    public final void a(OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public final void a(SpotifyIcon spotifyIcon) {
        ColorStateList d = uuu.d(getView().getContext(), R.attr.pasteColorAccessory);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getView().getContext(), spotifyIcon);
        float b2 = (float) uts.b(24.0f, getView().getResources());
        spotifyIconDrawable.a(b2);
        spotifyIconDrawable.a(d);
        this.b.setBaseline((int) ((Math.abs(super.a().getPaint().getFontMetrics().ascent) + b2) / 2.0f));
        this.b.setImageDrawable(spotifyIconDrawable);
    }
}
