package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: klx reason: default package */
public final class klx implements rue {
    public final PendingIntent a(Context context, String str) {
        Intent intent;
        jst a = jst.a(str);
        if (a.b == LinkType.PLAYER_VIEW || !jst.h(str)) {
            intent = kmf.b(context).a;
        } else {
            intent = kmf.a(context, (String) fay.a(a.h())).a;
        }
        return PendingIntent.getActivity(context, 9876, intent, 134217728);
    }
}
