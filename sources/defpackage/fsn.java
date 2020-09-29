package defpackage;

import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.glue.components.common.SpotifyIconSpan;
import com.spotify.android.glue.components.common.SpotifyIconSpan.Alignment;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: fsn reason: default package */
class fsn implements fsm {
    private final View a;
    private final TextView b;
    private CharSequence c;
    private final SpotifyIconDrawable d = new SpotifyIconDrawable(this.b.getContext(), SpotifyIconV2.CHEVRON_RIGHT, this.b.getTextSize() / 2.0f);
    private boolean e;

    fsn(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(16908308);
        this.d.a(vfj.b(6.0f, this.b.getResources()), 0, 0, 0);
        SpotifyIconDrawable spotifyIconDrawable = this.d;
        spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), this.d.getIntrinsicHeight());
        fzy.a(this.b);
        fzy.a(view);
    }

    private void c() {
        SpannableString spannableString;
        if (this.e) {
            CharSequence charSequence = this.c;
            String a2 = this.d.a();
            int b2 = vfj.b(6.0f, this.b.getResources());
            if (vgi.a(this.a.getContext())) {
                this.d.a(0, 0, b2, 0);
                StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(charSequence);
                spannableString = new SpannableString(sb.toString());
                spannableString.setSpan(new SpotifyIconSpan(this.d, Alignment.SMALL_LETTER_MIDDLE), 0, 1, 18);
            } else {
                this.d.a(b2, 0, 0, 0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(charSequence);
                sb2.append(a2);
                spannableString = new SpannableString(sb2.toString());
                spannableString.setSpan(new SpotifyIconSpan(this.d, Alignment.SMALL_LETTER_MIDDLE), charSequence.length(), charSequence.length() + 1, 18);
            }
            this.b.setText(spannableString);
            return;
        }
        this.b.setText(this.c);
    }

    public TextView a() {
        return this.b;
    }

    public void a(CharSequence charSequence) {
        this.c = charSequence;
        c();
    }

    public void a(String str) {
        this.a.setContentDescription(str);
    }

    public void a(boolean z) {
        this.e = z;
        getView().setClickable(z);
        c();
    }

    public View b() {
        return getView();
    }

    public void b(boolean z) {
    }

    public View getView() {
        return this.a;
    }
}
