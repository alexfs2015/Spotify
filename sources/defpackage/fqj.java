package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fqj reason: default package */
public final class fqj implements fqi {
    private final View a;
    private final TextView b;
    private final TextView c;

    public fqj(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(16908308);
        this.c = (TextView) view.findViewById(R.id.value_row_value);
    }

    public final View getView() {
        return this.a;
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
