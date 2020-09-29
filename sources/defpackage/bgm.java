package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcj;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: bgm reason: default package */
public final class bgm {
    public static final bhc<cti> a = bgn.a;
    public static final bhc<cti> b = bgo.a;
    public static final bhc<cti> c = bgp.a;
    public static final bhc<cti> d = new bgu();
    public static final bhc<cti> e = new bgv();
    public static final bhc<cti> f = bgq.a;
    public static final bhc<Object> g = new bgw();
    public static final bhc<cti> h = new bgx();
    public static final bhc<cti> i = bgr.a;
    public static final bhc<cti> j = new bgy();
    public static final bhc<cti> k = new bgz();
    public static final bhc<csh> l = new cso();
    public static final bhc<csh> m = new csp();
    public static final bhc<cti> n = new bgl();
    public static final bge o = new bge();
    public static final bhc<cti> p = new bha();
    public static final bhc<cti> q = new bhb();
    public static final bhc<cti> r = new bgt();

    static {
        new bgs();
    }

    static final /* synthetic */ void a(cud cud, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            cpn.a(5);
        } else {
            new cor(cud.getContext(), ((cun) cud).k().a, str).h();
        }
    }

    static final /* synthetic */ void a(cul cul, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            dio A = cul.A();
            if (A != null) {
                A.b.a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            cpn.a(5);
        }
    }

    static final /* synthetic */ void a(dzx dzx, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            cpn.a(5);
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            dio A = ((cul) dzx).A();
            if (A != null && A.a(parse)) {
                parse = A.a(parse, ((cud) dzx).getContext(), ((cuo) dzx).o(), ((cud) dzx).d());
            }
        } catch (zzcj unused) {
            String str2 = "Unable to append parameter to URL: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            cpn.a(5);
        }
        cud cud = (cud) dzx;
        Context context = cud.getContext();
        if (((Boolean) dqe.f().a(dtg.aq)).booleanValue() && bkc.B().a(context)) {
            String str3 = "fbs_aeid";
            if (TextUtils.isEmpty(parse.getQueryParameter(str3))) {
                String i2 = bkc.B().i(context);
                parse = clk.a(parse.toString(), str3, i2);
                bkc.B().c(context, i2);
            }
        }
        new cor(cud.getContext(), ((cun) dzx).k().a, parse.toString()).h();
    }

    static final /* synthetic */ void b(cud cud, Map map) {
        Throwable th;
        String str;
        String str2 = "openableIntents";
        PackageManager packageManager = cud.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e2) {
                                URISyntaxException uRISyntaxException = e2;
                                String str3 = "Error parsing the url: ";
                                String valueOf = String.valueOf(optString7);
                                cml.a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e3) {
                            th = e3;
                            str = "Error constructing openable urls response.";
                        }
                    } catch (JSONException e4) {
                        th = e4;
                        str = "Error parsing the intent data.";
                        cml.a(str, th);
                    }
                }
                ((dzx) cud).a(str2, jSONObject);
            } catch (JSONException unused) {
                ((dzx) cud).a(str2, new JSONObject());
            }
        } catch (JSONException unused2) {
            ((dzx) cud).a(str2, new JSONObject());
        }
    }

    static final /* synthetic */ void c(cud cud, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            cpn.a(5);
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = cud.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((dzx) cud).a("openableURLs", (Map<String, ?>) hashMap);
    }
}
