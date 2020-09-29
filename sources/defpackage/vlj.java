package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.playlist.models.offline.WaitingReason;
import java.util.Map;

/* renamed from: vlj reason: default package */
public final class vlj {
    private static final Map<String, WaitingReason> a;

    static {
        String str = "waitingOfflineMode";
        String str2 = "waitingSyncNotAllowed";
        String str3 = "waitingNoConnection";
        a = ImmutableMap.g().b("waiting", WaitingReason.IN_QUEUE).b(str, WaitingReason.OFFLINE_MODE).b(str2, WaitingReason.SYNC_NOT_ALLOWED).b(str3, WaitingReason.NO_CONNECTION).b();
    }

    public static vli a(String str, int i) {
        if ("no".equals(str)) {
            return new f();
        }
        if ("yes".equals(str)) {
            return new a();
        }
        if (LogMessage.SEVERITY_ERROR.equals(str)) {
            return new c();
        }
        if ("expired".equals(str)) {
            return new e();
        }
        if ("exceeded".equals(str)) {
            return new d();
        }
        if ("resync".equals(str)) {
            return new g();
        }
        if ("downloading".equals(str)) {
            return vli.a(i);
        }
        WaitingReason waitingReason = (WaitingReason) a.get(str);
        return waitingReason != null ? i == 100 ? new a() : vli.a(waitingReason, i) : new f();
    }
}
