package defpackage;

import android.view.View;
import com.spotify.music.R;
import java.util.Set;

/* renamed from: gxv reason: default package */
public final class gxv extends a {
    public final void a(int i, View view, gwm gwm) {
        super.a(i, view, gwm);
        view.setTag(R.id.hubs_component, Boolean.TRUE);
    }

    public final void a(int i, View view, hcm hcm, gwm gwm) {
        super.a(i, view, hcm, gwm);
        Set keySet = hcm.logging().keySet();
        String str = "interaction:intent";
        String str2 = "interaction:item_id";
        if (keySet.contains(str) || keySet.contains(str2)) {
            gko.a(view, hcm.logging().string(str2), hcm.logging().string(str));
        }
    }
}
