package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fwi reason: default package */
final class fwi extends fwc implements fwh {
    private final TextView a;
    private final TextView b;

    fwi(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908309);
        this.a.setVisibility(0);
        this.b = (TextView) view.findViewById(R.id.metadata);
        this.b.setVisibility(0);
        fzy.a(this.a);
        fzy.a(view);
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void c(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final TextView e() {
        return this.a;
    }
}
