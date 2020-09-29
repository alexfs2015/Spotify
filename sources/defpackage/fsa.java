package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fsa reason: default package */
class fsa extends fru implements frx {
    final TextView a;

    public fsa(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908308);
        vfz.b(getView().findViewById(R.id.row_view)).a(this.a).a();
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final TextView b() {
        return this.a;
    }
}
