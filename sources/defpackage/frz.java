package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: frz reason: default package */
final class frz extends frt implements fry {
    private final TextView a;

    public frz(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R.id.metadata);
        fze.a(this.a);
        fze.a(view);
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
