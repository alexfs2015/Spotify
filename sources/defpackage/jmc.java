package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnContextClickListener;
import com.spotify.music.R;

/* renamed from: jmc reason: default package */
public final class jmc implements OnContextClickListener {
    private final Context a;
    private final sih b;

    public jmc(Context context, sih sih) {
        this.a = context;
        this.b = sih;
    }

    public final boolean onContextClick(View view) {
        Object tag = view.getTag(R.id.context_menu_tag);
        if (tag == null) {
            return false;
        }
        ((jny) tag).a(this.a, this.b);
        return true;
    }
}
