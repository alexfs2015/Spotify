package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.spotify.music.R;

/* renamed from: jop reason: default package */
public final class jop implements OnLongClickListener, OnItemLongClickListener {
    private final Context a;
    private final sso b;

    public jop(Context context, sso sso) {
        this.a = context;
        this.b = sso;
    }

    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        return onLongClick(view);
    }

    public final boolean onLongClick(View view) {
        Object tag = view.getTag(R.id.context_menu_tag);
        if (tag == null) {
            return false;
        }
        ((jqk) tag).a(this.a, this.b);
        return true;
    }
}
