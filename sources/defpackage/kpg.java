package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: kpg reason: default package */
public final class kpg implements sdr {
    public final PendingIntent a(Context context, String str) {
        jva a = jva.a(str);
        return PendingIntent.getActivity(context, 9876, (a.b == LinkType.PLAYER_VIEW || !jva.h(str)) ? kpo.b(context).a : kpo.a(context, (String) fbp.a(a.h())).a, 134217728);
    }
}
