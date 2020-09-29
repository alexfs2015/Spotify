package defpackage;

import com.google.android.gms.ads.internal.gmsg.HttpClient;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: bgm reason: default package */
public final class bgm implements Runnable {
    final /* synthetic */ dzg a;
    private final /* synthetic */ Map b;
    private final /* synthetic */ HttpClient c;

    public bgm(HttpClient httpClient, Map map, dzg dzg) {
        this.c = httpClient;
        this.b = map;
        this.a = dzg;
    }

    public final void run() {
        cow.a(3);
        try {
            JSONObject send = this.c.send(new JSONObject((String) this.b.get("http_request")));
            if (send == null) {
                clu.a("Response should not be null.");
            } else {
                cmd.a.post(new bgn(this, send));
            }
        } catch (Exception e) {
            clu.a("Error converting request to json.", e);
        }
    }
}
