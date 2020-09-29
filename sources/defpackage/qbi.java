package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: qbi reason: default package */
public final class qbi implements c<gzz, gzz> {
    public final /* synthetic */ Object call(Object obj) {
        return ((wud) obj).f(new $$Lambda$qbi$5r3xhQqMi2zNPWfPZUVtMxB_E(new $$Lambda$qbi$ob1QeNp_QHRTHIoZfmdNqnd4tB0(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzt b(gzt gzt) {
        if (!a(gzt)) {
            return null;
        }
        String str = "click";
        gzp gzp = (gzp) gzt.events().get(str);
        if (gzp == null) {
            return null;
        }
        gzp a = qbg.a(gzp.data().string("uri"));
        String str2 = "secondary_icon";
        if (!(SpotifyIconV2.X == gzt.custom().get(str2))) {
            return gzt.toBuilder().a(str, a).c(str2, IdHelperAndroid.NO_ID_AVAILABLE).a();
        }
        if (!a(gzt) || !gzp.data().boolValue("onDemand", false)) {
            return gzt.toBuilder().a(str, a).a();
        }
        return gzt;
    }

    private static boolean a(gzt gzt) {
        gzp gzp = (gzp) gzt.events().get("click");
        String string = gzp != null ? gzp.data().string("uri") : null;
        if (string == null) {
            return false;
        }
        if (LinkType.TRACK == jst.a(string).b) {
            return true;
        }
        return false;
    }
}
