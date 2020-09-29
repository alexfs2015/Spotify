package defpackage;

import android.text.TextUtils;
import com.moat.analytics.mobile.MoatAdEvent;
import java.util.Map;

@cey
/* renamed from: bfp reason: default package */
public final class bfp implements bgl<Object> {
    private final bfq a;

    public bfp(bfq bfq) {
        this.a = bfq;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            cjx cjx = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get(MoatAdEvent.EVENT_TYPE);
                if (!TextUtils.isEmpty(str2)) {
                    cjx = new cjx(str2, parseInt);
                }
            } catch (NumberFormatException unused) {
                cow.a(5);
            }
            this.a.a(cjx);
        } else if ("video_start".equals(str)) {
            this.a.t_();
        } else {
            if ("video_complete".equals(str)) {
                if (((Boolean) dpn.f().a(dsp.av)).booleanValue()) {
                    if (((Boolean) dpn.f().a(dsp.av)).booleanValue()) {
                        this.a.u_();
                    }
                }
            }
        }
    }
}
