package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: frc reason: default package */
final class frc extends fra implements frb {
    private final TextView a;

    public frc(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908308);
        uui.b(getView().findViewById(R.id.row_view)).a(this.a).a();
    }

    public final TextView b() {
        return this.a;
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void a(int i) {
        if (i != this.a.getMaxLines()) {
            this.a.setMaxLines(i);
        }
    }
}
