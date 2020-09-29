package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.music.R;

/* renamed from: lug reason: default package */
public final class lug {
    public final Context a;
    public final afh b;
    public final afy c = this.b.a(0);

    public lug(Context context, afh afh) {
        this.a = (Context) fay.a(context);
        this.b = (afh) fay.a(afh);
        this.c.b(true);
        this.c.a(this.a.getString(R.string.bmw_tooltip_menu));
        this.c.a(1000);
        afy a2 = this.b.a(6);
        a2.a(1009);
        a2.a(this.a.getString(R.string.bmw_tooltip_start_radio));
        a2.a((Object) MediaAction.START_RADIO);
        afy a3 = this.b.a(4);
        a3.a(1012);
        a3.a(this.a.getString(R.string.bmw_tooltip_skip_previous));
        a3.a((Object) MediaAction.SKIP_TO_PREVIOUS);
        afy a4 = this.b.a(5);
        a4.a(1011);
        a4.a(this.a.getString(R.string.bmw_tooltip_skip_next));
        a4.a((Object) MediaAction.SKIP_TO_NEXT);
    }
}
