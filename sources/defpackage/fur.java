package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fur reason: default package */
final class fur implements fuq {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(16908308));
    private final TextView c = ((TextView) this.a.findViewById(16908309));

    public fur(View view) {
        this.a = view;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.glue_empty_state_error_state_line_height);
        fze.b(this.c);
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

    public final View getView() {
        return this.a;
    }
}
