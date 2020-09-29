package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.music.R;

/* renamed from: lyf reason: default package */
public final class lyf {
    public final Context a;
    public final afv b;
    public final agm c = this.b.a(0);

    public lyf(Context context, afv afv) {
        this.a = (Context) fbp.a(context);
        this.b = (afv) fbp.a(afv);
        this.c.b(true);
        this.c.a(this.a.getString(R.string.bmw_tooltip_menu));
        this.c.a(1000);
        agm a2 = this.b.a(6);
        a2.a(1009);
        a2.a(this.a.getString(R.string.bmw_tooltip_start_radio));
        a2.a((Object) MediaAction.START_RADIO);
        agm a3 = this.b.a(4);
        a3.a(1012);
        a3.a(this.a.getString(R.string.bmw_tooltip_skip_previous));
        a3.a((Object) MediaAction.SKIP_TO_PREVIOUS);
        agm a4 = this.b.a(5);
        a4.a(1011);
        a4.a(this.a.getString(R.string.bmw_tooltip_skip_next));
        a4.a((Object) MediaAction.SKIP_TO_NEXT);
    }
}
