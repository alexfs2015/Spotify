package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: phf reason: default package */
public final class phf implements fvf {
    final TextView a = ((TextView) this.b.findViewById(R.id.subtitle));
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));

    public final boolean b() {
        return false;
    }

    public final int c() {
        return 0;
    }

    public final int d() {
        return 0;
    }

    public phf(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b = layoutInflater.inflate(R.layout.premium_offers_header, viewGroup, false);
    }

    public final void a(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final View getView() {
        return this.b;
    }
}
