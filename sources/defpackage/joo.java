package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnContextClickListener;
import com.spotify.music.R;

/* renamed from: joo reason: default package */
public final class joo implements OnContextClickListener {
    private final Context a;
    private final sso b;

    public joo(Context context, sso sso) {
        this.a = context;
        this.b = sso;
    }

    public final boolean onContextClick(View view) {
        Object tag = view.getTag(R.id.context_menu_tag);
        if (tag == null) {
            return false;
        }
        ((jqk) tag).a(this.a, this.b);
        return true;
    }
}
