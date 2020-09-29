package com.moat.analytics.mobile.spot;

import android.os.Handler;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

abstract class c<PlayerOrIMAAd> extends b {
    static final MoatAdEventType[] f = {MoatAdEventType.AD_EVT_FIRST_QUARTILE, MoatAdEventType.AD_EVT_MID_POINT, MoatAdEventType.AD_EVT_THIRD_QUARTILE};
    final Map<MoatAdEventType, Integer> g;
    final Handler h;
    Map<String, String> i;
    WeakReference<PlayerOrIMAAd> j;
    WeakReference<View> k;
    private boolean l;
    private Double m;
    /* access modifiers changed from: private */
    public final g n = new g(a.a(), a.VIDEO);
    private final String o;

    c(String str) {
        super(null, false, true);
        p.a(3, "BaseVideoTracker", (Object) this, "Initializing.");
        this.o = str;
        this.n.a(str);
        super.a(this.n.b);
        super.a(this.n.a);
        this.g = new HashMap();
        this.h = new Handler();
        this.l = false;
        this.m = Double.valueOf(1.0d);
    }

    private void b(MoatAdEvent moatAdEvent) {
        JSONObject a = a(moatAdEvent);
        String str = "BaseVideoTracker";
        p.a(3, str, (Object) this, String.format("Received event: %s", new Object[]{a.toString()}));
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(String.format(" Received event: %s", new Object[]{a.toString()}));
        p.a("[SUCCESS] ", sb.toString());
        this.a.a(this.n.c, a);
        MoatAdEventType moatAdEventType = moatAdEvent.d;
        if (moatAdEventType == MoatAdEventType.AD_EVT_COMPLETE || moatAdEventType == MoatAdEventType.AD_EVT_STOPPED || moatAdEventType == MoatAdEventType.AD_EVT_SKIPPED) {
            this.g.put(moatAdEventType, Integer.valueOf(1));
            h();
        }
    }

    private void j() {
        Map g2 = g();
        Integer num = (Integer) g2.get("width");
        Integer num2 = (Integer) g2.get("height");
        Integer num3 = (Integer) g2.get("duration");
        p.a(3, "BaseVideoTracker", (Object) this, String.format(Locale.ROOT, "Player metadata: height = %d, width = %d, duration = %d", new Object[]{num2, num, num3}));
        this.n.a(this.o, this.i, num, num2, num3);
        super.changeTargetView((View) this.k.get());
        super.b();
    }

    /* access modifiers changed from: 0000 */
    public JSONObject a(MoatAdEvent moatAdEvent) {
        if (Double.isNaN(moatAdEvent.c.doubleValue())) {
            try {
                moatAdEvent.c = Double.valueOf(s.a());
            } catch (Exception unused) {
                moatAdEvent.c = Double.valueOf(1.0d);
            }
        }
        String format = String.format(Locale.ROOT, "adVolume before adjusting for player volume %f", new Object[]{moatAdEvent.c});
        String str = "BaseVideoTracker";
        p.a(3, str, (Object) this, format);
        moatAdEvent.c = Double.valueOf(moatAdEvent.c.doubleValue() * this.m.doubleValue());
        p.a(3, str, (Object) this, String.format(Locale.ROOT, "adVolume after adjusting for player volume %f", new Object[]{moatAdEvent.c}));
        return new JSONObject(moatAdEvent.a());
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Integer num, Integer num2) {
        int abs = Math.abs(num2.intValue() - num.intValue());
        double intValue = (double) num2.intValue();
        Double.isNaN(intValue);
        return ((double) abs) <= Math.min(750.0d, intValue * 0.05d);
    }

    public boolean a(Map<String, String> map, PlayerOrIMAAd playerorimaad, View view) {
        boolean z;
        String str;
        Map<String, String> map2 = map;
        PlayerOrIMAAd playerorimaad2 = playerorimaad;
        View view2 = view;
        String str2 = "BaseVideoTracker";
        boolean z2 = false;
        try {
            String str3 = "[ERROR] ";
            if (this.e) {
                p.a(3, str2, (Object) this, "trackVideoAd already called");
                StringBuilder sb = new StringBuilder();
                sb.append(a());
                sb.append(" trackVideoAd can't be called twice");
                p.a(str3, sb.toString());
                z = false;
            } else {
                z = true;
            }
            if (map2 == null) {
                p.a(3, str2, (Object) this, "trackVideoAd received null adIds object. Not tracking.");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a());
                sb2.append(" trackVideoAd failed, received null adIds object");
                p.a(str3, sb2.toString());
                z = false;
            }
            if (view2 == null) {
                p.a(3, str2, (Object) this, "trackVideoAd received null video view instance");
            }
            if (playerorimaad2 == null) {
                p.a(3, str2, (Object) this, "trackVideoAd received null ad instance. Not tracking.");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a());
                sb3.append(" trackVideoAd failed, received null ad instance");
                p.a(str3, sb3.toString());
                z = false;
            }
            if (z) {
                String str4 = "trackVideoAd tracking ids: %s | ad: %s | view: %s";
                Object[] objArr = new Object[3];
                objArr[0] = new JSONObject(map2).toString();
                objArr[1] = playerorimaad.toString();
                String str5 = "@";
                String str6 = "null";
                if (view2 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(view.getClass().getSimpleName());
                    sb4.append(str5);
                    sb4.append(view.hashCode());
                    str = sb4.toString();
                } else {
                    str = str6;
                }
                objArr[2] = str;
                p.a(3, str2, (Object) this, String.format(str4, objArr));
                String str7 = "[SUCCESS] ";
                StringBuilder sb5 = new StringBuilder();
                sb5.append(a());
                String str8 = " trackVideoAd succeeded with ids: %s | ad: %s | view: %s";
                Object[] objArr2 = new Object[3];
                objArr2[0] = new JSONObject(map2).toString();
                objArr2[1] = playerorimaad.toString();
                if (view2 != null) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(view.getClass().getSimpleName());
                    sb6.append(str5);
                    sb6.append(view.hashCode());
                    str6 = sb6.toString();
                }
                objArr2[2] = str6;
                sb5.append(String.format(str8, objArr2));
                p.a(str7, sb5.toString());
                this.i = map2;
                this.j = new WeakReference<>(playerorimaad2);
                this.k = new WeakReference<>(view2);
                j();
            }
            z2 = z;
        } catch (Exception e) {
            m.a(e);
        }
        StringBuilder sb7 = new StringBuilder("Attempt to start tracking ad was ");
        sb7.append(z2 ? "" : "un");
        sb7.append("successful.");
        p.a(3, str2, (Object) this, sb7.toString());
        return z2;
    }

    public void changeTargetView(View view) {
        String str;
        if (view != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(view.getClass().getSimpleName());
            sb.append("@");
            sb.append(view.hashCode());
            str = sb.toString();
        } else {
            str = "null";
        }
        StringBuilder sb2 = new StringBuilder("changing view to ");
        sb2.append(str);
        p.a(3, "BaseVideoTracker", (Object) this, sb2.toString());
        this.k = new WeakReference<>(view);
        try {
            super.changeTargetView(view);
        } catch (Exception e) {
            m.a(e);
        }
    }

    public void dispatchEvent(MoatAdEvent moatAdEvent) {
        try {
            b(moatAdEvent);
        } catch (Exception e) {
            m.a(e);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Map<String, Object> g();

    /* access modifiers changed from: 0000 */
    public void h() {
        if (!this.l) {
            this.h.postDelayed(new Runnable() {
                public void run() {
                    try {
                        p.a(3, "BaseVideoTracker", (Object) this, "Shutting down.");
                        c.this.n.a();
                    } catch (Exception e) {
                        m.a(e);
                    }
                }
            }, 500);
            this.l = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return this.g.containsKey(MoatAdEventType.AD_EVT_COMPLETE) || this.g.containsKey(MoatAdEventType.AD_EVT_STOPPED) || this.g.containsKey(MoatAdEventType.AD_EVT_SKIPPED);
    }

    public void setPlayerVolume(Double d) {
        if (!d.equals(this.m)) {
            p.a(3, "BaseVideoTracker", (Object) this, String.format(Locale.ROOT, "player volume changed to %f ", new Object[]{d}));
            this.m = d;
            dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_VOLUME_CHANGE, MoatAdEvent.a));
        }
    }

    public void stopTracking() {
        try {
            boolean c = super.c();
            String str = c ? "[SUCCESS] " : "[ERROR] ";
            StringBuilder sb = new StringBuilder();
            sb.append(a());
            sb.append(" stopTracking ");
            sb.append(c ? "succeeded" : "failed");
            sb.append(" for ");
            sb.append(e());
            p.a(str, sb.toString());
            h();
        } catch (Exception e) {
            m.a(e);
        }
    }
}
