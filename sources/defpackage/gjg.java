package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import com.spotify.music.R;

@Deprecated
/* renamed from: gjg reason: default package */
public abstract class gjg implements OnClickListener {
    public static String a(View view) {
        String str;
        Object tag = view.getTag(R.id.interaction_id);
        while (true) {
            str = (String) tag;
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof View) || str != null) {
                return str;
            }
            view = (View) parent;
            tag = view.getTag(R.id.interaction_id);
        }
        return str;
    }
}
