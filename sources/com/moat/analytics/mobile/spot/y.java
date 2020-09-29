package com.moat.analytics.mobile.spot;

import android.view.View;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

class y extends c<Object> implements ReactiveVideoTracker {
    private Integer l;

    public y(String str) {
        super(str);
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(" created");
        p.a("[SUCCESS] ", sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public String a() {
        return "ReactiveVideoTracker";
    }

    /* access modifiers changed from: protected */
    public JSONObject a(MoatAdEvent moatAdEvent) {
        if (moatAdEvent.d == MoatAdEventType.AD_EVT_COMPLETE && !moatAdEvent.b.equals(MoatAdEvent.a) && !a(moatAdEvent.b, this.l)) {
            moatAdEvent.d = MoatAdEventType.AD_EVT_STOPPED;
        }
        return super.a(moatAdEvent);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> g() {
        Integer num;
        HashMap hashMap = new HashMap();
        View view = (View) this.k.get();
        Integer valueOf = Integer.valueOf(0);
        if (view != null) {
            valueOf = Integer.valueOf(view.getWidth());
            num = Integer.valueOf(view.getHeight());
        } else {
            num = valueOf;
        }
        hashMap.put("duration", this.l);
        hashMap.put("width", valueOf);
        hashMap.put("height", num);
        return hashMap;
    }

    public boolean trackVideoAd(Map<String, String> map, Integer num, View view) {
        String str = "ReactiveVideoTracker";
        if (this.e) {
            p.a(3, str, (Object) this, "trackVideoAd already called");
            StringBuilder sb = new StringBuilder();
            sb.append(a());
            sb.append(" trackVideoAd can't be called twice");
            p.a("[ERROR] ", sb.toString());
            return false;
        } else if (num.intValue() < 1000) {
            p.a(3, str, (Object) this, String.format(Locale.ROOT, "Invalid duration = %d. Please make sure duration is in milliseconds.", new Object[]{num}));
            return false;
        } else {
            this.l = num;
            return super.a(map, new Object(), view);
        }
    }
}
