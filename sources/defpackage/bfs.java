package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.util.Map;

@cey
/* renamed from: bfs reason: default package */
public final class bfs implements bgl<Object> {
    private final bft a;

    public bfs(bft bft) {
        this.a = bft;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            cow.a(5);
        } else {
            this.a.a(str, (String) map.get(LogMessage.SEVERITY_INFO));
        }
    }
}
