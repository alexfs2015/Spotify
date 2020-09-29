package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.music.R;

/* renamed from: frz reason: default package */
public final class frz extends fsa implements fry {
    private final ImageView b;

    public frz(View view) {
        super(view);
        this.b = (ImageView) view.findViewById(16908294);
        vfz.b(getView().findViewById(R.id.row_view)).a(this.a).b(this.b).a();
    }

    public final ImageView c() {
        return this.b;
    }
}
