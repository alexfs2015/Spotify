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

@cey
/* renamed from: bfv reason: default package */
public final class bfv {
    public static final bgl<csr> a = bfw.a;
    public static final bgl<csr> b = bfx.a;
    public static final bgl<csr> c = bfy.a;
    public static final bgl<csr> d = new bgd();
    public static final bgl<csr> e = new bge();
    public static final bgl<csr> f = bfz.a;
    public static final bgl<Object> g = new bgf();
    public static final bgl<csr> h = new bgg();
    public static final bgl<csr> i = bga.a;
    public static final bgl<csr> j = new bgh();
    public static final bgl<csr> k = new bgi();
    public static final bgl<crq> l = new crx();
    public static final bgl<crq> m = new cry();
    public static final bgl<csr> n = new bfu();
    public static final bfn o = new bfn();
    public static final bgl<csr> p = new bgj();
    public static final bgl<csr> q = new bgk();
    public static final bgl<csr> r = new bgc();

    static {
        new bgb();
    }

    static final /* synthetic */ void b(ctm ctm, Map map) {
        Throwable th;
        String str;
        String str2 = "openableIntents";
        PackageManager packageManager = ctm.getContext().getPackageManager();
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
                                clu.a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), uRISyntaxException);
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
                        clu.a(str, th);
                    }
                }
                ((dzg) ctm).a(str2, jSONObject);
            } catch (JSONException unused) {
                ((dzg) ctm).a(str2, new JSONObject());
            }
        } catch (JSONException unused2) {
            ((dzg) ctm).a(str2, new JSONObject());
        }
    }

    static final /* synthetic */ void a(ctu ctu, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            dhx A = ctu.A();
            if (A != null) {
                A.b.a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            cow.a(5);
        }
    }

    static final /* synthetic */ void a(ctm ctm, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            cow.a(5);
        } else {
            new coa(ctm.getContext(), ((ctw) ctm).k().a, str).h();
        }
    }

    static final /* synthetic */ void a(dzg dzg, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            cow.a(5);
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            dhx A = ((ctu) dzg).A();
            if (A != null && A.a(parse)) {
                parse = A.a(parse, ((ctm) dzg).getContext(), ((ctx) dzg).o(), ((ctm) dzg).d());
            }
        } catch (zzcj unused) {
            String str2 = "Unable to append parameter to URL: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            cow.a(5);
        }
        ctm ctm = (ctm) dzg;
        Context context = ctm.getContext();
        if (((Boolean) dpn.f().a(dsp.aq)).booleanValue() && bjl.B().a(context)) {
            String str3 = "fbs_aeid";
            if (TextUtils.isEmpty(parse.getQueryParameter(str3))) {
                String i2 = bjl.B().i(context);
                parse = ckt.a(parse.toString(), str3, i2);
                bjl.B().c(context, i2);
            }
        }
        new coa(ctm.getContext(), ((ctw) dzg).k().a, parse.toString()).h();
    }

    static final /* synthetic */ void c(ctm ctm, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            cow.a(5);
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = ctm.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((dzg) ctm).a("openableURLs", (Map<String, ?>) hashMap);
    }
}
