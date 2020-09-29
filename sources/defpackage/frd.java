package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: frd reason: default package */
public final class frd implements frc {
    private final View a;
    private final TextView b;
    private final TextView c;

    public frd(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(16908308);
        this.c = (TextView) view.findViewById(R.id.value_row_value);
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final View getView() {
        return this.a;
    }
}
