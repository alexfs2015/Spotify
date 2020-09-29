package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@cfp
/* renamed from: ecz reason: default package */
public final class ecz {
    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public static List<String> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void a(Context context, String str, clq clq, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY;
            for (String a : list) {
                String str4 = "@gw_seqnum@";
                String str5 = "@gw_adnetstatus@";
                String a2 = a(a(a(a(a(a(a(a, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", clq.r.i), "@gw_sdkver@", str), "@gw_sessid@", dqe.c()), str4, clq.j), str5, clq.t);
                if (clq.o != null) {
                    a2 = a(a(a2, "@gw_adnetid@", clq.o.b), "@gw_allocid@", clq.o.d);
                }
                String a3 = clk.a(a2, context);
                bkc.e();
                cmu.a(context, str, a3);
            }
        }
    }

    public static void a(Context context, String str, List<String> list, String str2, cko cko) {
        if (list != null && !list.isEmpty()) {
            if (!TextUtils.isEmpty(str2) && cpg.c()) {
                str2 = "fakeUserForAdDebugLog";
            }
            long a = bkc.l().a();
            for (String a2 : list) {
                String str3 = "@gw_tmstmp@";
                String a3 = a(a(a2, "@gw_rwd_userid@", Uri.encode(str2)), str3, Long.toString(a));
                if (cko != null) {
                    String str4 = "@gw_rwd_amt@";
                    a3 = a(a(a3, "@gw_rwd_itm@", Uri.encode(cko.a)), str4, Integer.toString(cko.b));
                }
                bkc.e();
                cmu.a(context, str, a3);
            }
        }
    }

    public static boolean a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(split[0]);
            iArr[1] = Integer.parseInt(split[1]);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
