package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fwn reason: default package */
final class fwn extends fwo implements fwm {
    private final TextView a;

    fwn(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R.id.metadata);
        fzy.a(this.a);
        fzy.a(view);
    }

    public final void c(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
