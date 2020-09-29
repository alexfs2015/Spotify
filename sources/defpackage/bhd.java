package defpackage;

import com.google.android.gms.ads.internal.gmsg.HttpClient;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: bhd reason: default package */
public final class bhd implements Runnable {
    final /* synthetic */ dzx a;
    private final /* synthetic */ Map b;
    private final /* synthetic */ HttpClient c;

    public bhd(HttpClient httpClient, Map map, dzx dzx) {
        this.c = httpClient;
        this.b = map;
        this.a = dzx;
    }

    public final void run() {
        cpn.a(3);
        try {
            JSONObject send = this.c.send(new JSONObject((String) this.b.get("http_request")));
            if (send == null) {
                cml.a("Response should not be null.");
            } else {
                cmu.a.post(new bhe(this, send));
            }
        } catch (Exception e) {
            cml.a("Error converting request to json.", e);
        }
    }
}
