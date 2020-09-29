package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: fsi reason: default package */
final class fsi extends fse implements fsh {
    private final TextView a;

    public fsi(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R.id.paste_listtile_number);
        this.a.getLayoutParams().width = vgg.a(this.a.getPaint(), 2);
        vfz.b(getView().findViewById(R.id.row_view)).a(b(), d(), this.a).a();
    }

    public final void a(int i) {
        this.a.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i)}));
    }

    public final void a(Drawable drawable) {
        this.a.setCompoundDrawables(null, null, null, drawable);
    }
}
