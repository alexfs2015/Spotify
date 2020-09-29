package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fup reason: default package */
final class fup implements fuo {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(16908308));
    private final TextView c = ((TextView) this.a.findViewById(16908309));
    private final Button d = ((Button) this.a.findViewById(R.id.empty_view_button));

    public fup(View view) {
        this.a = view;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.glue_empty_state_error_state_line_height);
        fze.a(this.b);
        fze.a(this.c);
        fze.a(this.c, dimensionPixelSize);
        fze.a(this.a);
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void a(int i) {
        this.b.setText(i);
    }

    public final TextView b() {
        return this.b;
    }

    public final void b(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void b(int i) {
        this.c.setText(i);
    }

    public final TextView c() {
        return this.c;
    }

    public final void c(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void c(int i) {
        this.d.setText(i);
    }

    public final Button V_() {
        return this.d;
    }

    public final View getView() {
        return this.a;
    }
}
