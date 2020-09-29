package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: fro reason: default package */
final class fro extends frk implements frn {
    private final TextView a;

    public fro(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R.id.paste_listtile_number);
        this.a.getLayoutParams().width = uup.a(this.a.getPaint(), 2);
        uui.b(getView().findViewById(R.id.row_view)).a(b(), d(), this.a).a();
    }

    public final void a(int i) {
        this.a.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i)}));
    }

    public final void a(Drawable drawable) {
        this.a.setCompoundDrawables(null, null, null, drawable);
    }
}
