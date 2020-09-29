package defpackage;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.spotify.android.glue.components.common.SpotifyIconSpan;
import com.spotify.android.glue.components.common.SpotifyIconSpan.Alignment;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: pkw reason: default package */
public class pkw implements frs {
    private final View a;
    private final TextView b;
    private CharSequence c;
    private final SpotifyIconDrawable d = new SpotifyIconDrawable(this.b.getContext(), SpotifyIcon.CHEVRON_RIGHT_16, this.b.getTextSize() / 2.0f);
    private boolean e;

    public pkw(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(16908308);
        this.d.a(uts.b(6.0f, this.b.getResources()), 0, 0, 0);
        SpotifyIconDrawable spotifyIconDrawable = this.d;
        spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), this.d.getIntrinsicHeight());
    }

    public View getView() {
        return this.a;
    }

    public TextView a() {
        return this.b;
    }

    public void a(boolean z) {
        this.e = z;
        getView().setClickable(z);
        c();
    }

    public void a(CharSequence charSequence) {
        this.c = charSequence;
        c();
    }

    public void a(String str) {
        this.a.setContentDescription(str);
    }

    public View b() {
        return getView();
    }

    public void b(boolean z) {
        ((MarginLayoutParams) this.b.getLayoutParams()).topMargin = uts.a(z ? 16.0f : 48.0f, this.a.getResources());
    }

    private void c() {
        if (this.e) {
            CharSequence charSequence = this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence);
            sb.append(SpotifyIcon.CHEVRON_RIGHT_16.toString());
            SpannableString spannableString = new SpannableString(sb.toString());
            spannableString.setSpan(new SpotifyIconSpan(this.d, Alignment.SMALL_LETTER_MIDDLE), charSequence.length(), charSequence.length() + 1, 18);
            this.b.setText(spannableString);
            return;
        }
        this.b.setText(this.c);
    }
}
