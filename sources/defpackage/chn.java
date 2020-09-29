package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: chn reason: default package */
public final class chn {
    cga A;
    boolean B = false;
    String C;
    List<String> D;
    boolean E;
    String F;
    ckh G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    String L;
    final cfu M;
    private final long N = -1;
    String a;
    String b;
    String c;
    List<String> d;
    String e;
    String f;
    String g;
    List<String> h;
    List<String> i;
    long j = -1;
    boolean k = false;
    List<String> l;
    long m = -1;
    int n = -1;
    boolean o = false;
    boolean p = false;
    boolean q = false;
    boolean r = true;
    boolean s = true;
    String t = "";
    boolean u = false;
    boolean v = false;
    cjx w;
    List<String> x;
    List<String> y;
    boolean z = false;

    public chn(cfu cfu, String str) {
        this.b = str;
        this.M = cfu;
    }

    private static String a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    private static List<String> c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    private static boolean d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.valueOf((String) list.get(0)).booleanValue();
    }

    private static long b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
                sb.append("Could not parse float from ");
                sb.append(str);
                sb.append(" header: ");
                sb.append(str2);
                sb.toString();
                cow.a(5);
            }
        }
        return -1;
    }

    public final void a(Map<String, List<String>> map) {
        int a2;
        this.a = a(map, "X-Afma-Ad-Size");
        this.F = a(map, "X-Afma-Ad-Slot-Size");
        List<String> c2 = c(map, "X-Afma-Click-Tracking-Urls");
        if (c2 != null) {
            this.d = c2;
        }
        this.e = a(map, "X-Afma-Debug-Signals");
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f = (String) list.get(0);
        }
        List<String> c3 = c(map, "X-Afma-Tracking-Urls");
        if (c3 != null) {
            this.h = c3;
        }
        List<String> c4 = c(map, "X-Afma-Downloaded-Impression-Urls");
        if (c4 != null) {
            this.i = c4;
        }
        long b2 = b(map, "X-Afma-Interstitial-Timeout");
        if (b2 != -1) {
            this.j = b2;
        }
        this.k |= d(map, "X-Afma-Mediation");
        List<String> c5 = c(map, "X-Afma-Manual-Tracking-Urls");
        if (c5 != null) {
            this.l = c5;
        }
        long b3 = b(map, "X-Afma-Refresh-Rate");
        if (b3 != -1) {
            this.m = b3;
        }
        List list2 = (List) map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = (String) list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                a2 = bjl.g().b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                a2 = bjl.g().a();
            }
            this.n = a2;
        }
        this.g = a(map, "X-Afma-ActiveView");
        List list3 = (List) map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.q = Boolean.valueOf((String) list3.get(0)).booleanValue();
        }
        this.o |= d(map, "X-Afma-Custom-Rendering-Allowed");
        String str2 = "X-Afma-Ad-Format";
        this.p = "native".equals(a(map, str2));
        List list4 = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.r = Boolean.valueOf((String) list4.get(0)).booleanValue();
        }
        List list5 = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.s = Boolean.valueOf((String) list5.get(0)).booleanValue();
        }
        List list6 = (List) map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.t = (String) list6.get(0);
        }
        String a3 = a(map, "X-Afma-Fluid");
        if (a3 != null && a3.equals("height")) {
            this.u = true;
        }
        this.v = "native_express".equals(a(map, str2));
        this.w = cjx.a(a(map, "X-Afma-Rewards"));
        if (this.x == null) {
            this.x = c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.y == null) {
            this.y = c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.z |= d(map, "X-Afma-Use-Displayed-Impression");
        this.B |= d(map, "X-Afma-Auto-Collect-Location");
        this.C = a(map, "Set-Cookie");
        String a4 = a(map, "X-Afma-Auto-Protection-Configuration");
        if (a4 == null || TextUtils.isEmpty(a4)) {
            Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f);
            }
            boolean booleanValue = ((Boolean) dpn.f().a(dsp.g)).booleanValue();
            String builder = buildUpon.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(builder).length() + 31);
            sb.append(builder);
            sb.append("&navigationURL={NAVIGATION_URL}");
            this.A = new cga(booleanValue, Arrays.asList(new String[]{sb.toString()}));
        } else {
            try {
                this.A = cga.a(new JSONObject(a4));
            } catch (JSONException unused) {
                cow.a(5);
                this.A = new cga();
            }
        }
        List<String> c6 = c(map, "X-Afma-Remote-Ping-Urls");
        if (c6 != null) {
            this.D = c6;
        }
        String a5 = a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a5)) {
            try {
                this.G = ckh.a(new JSONObject(a5));
            } catch (JSONException unused2) {
                cow.a(5);
            }
        }
        this.E |= d(map, "X-Afma-Render-In-Browser");
        String a6 = a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a6)) {
            try {
                this.H = new JSONObject(a6).getBoolean("never_pool");
            } catch (JSONException unused3) {
                cow.a(5);
            }
        }
        this.I = d(map, "X-Afma-Custom-Close-Blocked");
        this.J = d(map, "X-Afma-Enable-Omid");
        this.K = d(map, "X-Afma-Disable-Closable-Area");
        this.L = a(map, "X-Afma-Omid-Settings");
    }
}
