package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: qkg reason: default package */
public final class qkg implements c<hcs, hcs> {
    private static boolean a(hcm hcm) {
        hci hci = (hci) hcm.events().get("click");
        String string = hci != null ? hci.data().string("uri") : null;
        if (string == null) {
            return false;
        }
        return LinkType.TRACK == jva.a(string).b;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcm b(hcm hcm) {
        if (!a(hcm)) {
            return null;
        }
        String str = "click";
        hci hci = (hci) hcm.events().get(str);
        if (hci == null) {
            return null;
        }
        hci a = qke.a(hci.data().string("uri"));
        String str2 = "secondary_icon";
        return !(SpotifyIconV2.X == hcm.custom().get(str2)) ? hcm.toBuilder().a(str, a).c(str2, IdHelperAndroid.NO_ID_AVAILABLE).a() : (!a(hcm) || !hci.data().boolValue("onDemand", false)) ? hcm.toBuilder().a(str, a).a() : hcm;
    }

    public final /* synthetic */ Object call(Object obj) {
        return ((xii) obj).e((xiy<? super T, ? extends R>) new $$Lambda$qkg$t4XMZ0zhaoZnBVtUniFYoE8yu8<Object,Object>(new $$Lambda$qkg$v95oDKBzKTXYsO0fHdKv2penh48(this)));
    }
}
