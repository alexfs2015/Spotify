package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: frg reason: default package */
class frg extends fra implements frd {
    final TextView a;

    public frg(View view) {
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
}
