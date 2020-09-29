package defpackage;

import android.view.View;
import com.spotify.music.R;
import java.util.Set;

/* renamed from: gvu reason: default package */
public final class gvu extends a {
    public final void a(int i, View view, gzt gzt, gum gum) {
        super.a(i, view, gzt, gum);
        Set keySet = gzt.logging().keySet();
        String str = "interaction:intent";
        String str2 = "interaction:item_id";
        if (keySet.contains(str) || keySet.contains(str2)) {
            gjd.a(view, gzt.logging().string(str2), gzt.logging().string(str));
        }
    }

    public final void a(int i, View view, gum gum) {
        super.a(i, view, gum);
        view.setTag(R.id.hubs_component, Boolean.TRUE);
    }
}
