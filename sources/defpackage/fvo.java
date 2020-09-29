package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fvo reason: default package */
final class fvo extends fvi implements fvn {
    private final TextView a;
    private final TextView b;

    fvo(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908309);
        this.a.setVisibility(0);
        this.b = (TextView) view.findViewById(R.id.metadata);
        this.b.setVisibility(0);
        fze.a(this.a);
        fze.a(view);
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final TextView e() {
        return this.a;
    }

    public final void c(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
