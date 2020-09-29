package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fvt reason: default package */
final class fvt extends fvu implements fvs {
    private final TextView a;

    fvt(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R.id.metadata);
        fze.a(this.a);
        fze.a(view);
    }

    public final void c(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
