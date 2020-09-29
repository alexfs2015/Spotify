package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.util.Map;

@cfp
/* renamed from: bgj reason: default package */
public final class bgj implements bhc<Object> {
    private final bgk a;

    public bgj(bgk bgk) {
        this.a = bgk;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            cpn.a(5);
        } else {
            this.a.a(str, (String) map.get(LogMessage.SEVERITY_INFO));
        }
    }
}
