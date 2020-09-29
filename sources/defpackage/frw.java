package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: frw reason: default package */
final class frw extends fru implements frv {
    private final TextView a;

    public frw(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908308);
        vfz.b(getView().findViewById(R.id.row_view)).a(this.a).a();
    }

    public final void a(int i) {
        if (i != this.a.getMaxLines()) {
            this.a.setMaxLines(i);
        }
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final TextView b() {
        return this.a;
    }
}
