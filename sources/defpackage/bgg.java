package defpackage;

import android.text.TextUtils;
import com.moat.analytics.mobile.MoatAdEvent;
import java.util.Map;

@cfp
/* renamed from: bgg reason: default package */
public final class bgg implements bhc<Object> {
    private final bgh a;

    public bgg(bgh bgh) {
        this.a = bgh;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            cko cko = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get(MoatAdEvent.EVENT_TYPE);
                if (!TextUtils.isEmpty(str2)) {
                    cko = new cko(str2, parseInt);
                }
            } catch (NumberFormatException unused) {
                cpn.a(5);
            }
            this.a.a(cko);
        } else if ("video_start".equals(str)) {
            this.a.t_();
        } else {
            if ("video_complete".equals(str)) {
                if (((Boolean) dqe.f().a(dtg.av)).booleanValue()) {
                    if (((Boolean) dqe.f().a(dtg.av)).booleanValue()) {
                        this.a.u_();
                    }
                }
            }
        }
    }
}
