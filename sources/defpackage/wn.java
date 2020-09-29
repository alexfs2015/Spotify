package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.TrackingState;
import com.spotify.cosmos.router.Request;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wn reason: default package */
public final class wn {
    static String a;

    /* renamed from: wn$a */
    static class a implements b {
        a() {
        }

        public final void a(HttpsURLConnection httpsURLConnection, String str) {
            httpsURLConnection.setRequestProperty("Client-SDK", str);
            httpsURLConnection.setConnectTimeout(60000);
            httpsURLConnection.setReadTimeout(60000);
            if (wn.a != null) {
                httpsURLConnection.setRequestProperty("User-Agent", wn.a);
            }
        }
    }

    /* renamed from: wn$b */
    public interface b {
        void a(HttpsURLConnection httpsURLConnection, String str);
    }

    public static wg a(String str, ActivityPackage activityPackage, int i) {
        DataOutputStream dataOutputStream = null;
        try {
            HttpsURLConnection a2 = vh.a(new URL(str));
            HashMap hashMap = new HashMap(activityPackage.parameters);
            vh.k().a(a2, activityPackage.clientSdk);
            String a3 = a(hashMap);
            String b2 = b(hashMap);
            c(hashMap);
            String a4 = a(hashMap, a3, b2, activityPackage.activityKind.toString());
            if (a4 != null) {
                a2.setRequestProperty("Authorization", a4);
            }
            a2.setRequestMethod(Request.POST);
            a2.setUseCaches(false);
            a2.setDoInput(true);
            a2.setDoOutput(true);
            DataOutputStream dataOutputStream2 = new DataOutputStream(a2.getOutputStream());
            try {
                dataOutputStream2.writeBytes(a((Map<String, String>) hashMap, i));
                wg a5 = a(a2, activityPackage);
                try {
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                } catch (Exception unused) {
                }
                return a5;
            } catch (Exception e) {
                e = e;
                dataOutputStream = dataOutputStream2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            throw e;
        }
    }

    public static wg a(ActivityPackage activityPackage, String str) {
        try {
            HashMap hashMap = new HashMap(activityPackage.parameters);
            String a2 = a(hashMap);
            String b2 = b(hashMap);
            c(hashMap);
            HttpsURLConnection a3 = vh.a(new URL(a(activityPackage.path, (Map<String, String>) hashMap, str).toString()));
            vh.k().a(a3, activityPackage.clientSdk);
            String a4 = a(hashMap, a2, b2, activityPackage.activityKind.toString());
            if (a4 != null) {
                a3.setRequestProperty("Authorization", a4);
            }
            a3.setRequestMethod(Request.GET);
            return a(a3, activityPackage);
        } catch (Exception e) {
            throw e;
        }
    }

    private static wg a(HttpsURLConnection httpsURLConnection, ActivityPackage activityPackage) {
        InputStream inputStream;
        JSONObject jSONObject;
        StringBuffer stringBuffer = new StringBuffer();
        vr a2 = vh.a();
        wg a3 = wg.a(activityPackage);
        try {
            httpsURLConnection.connect();
            Integer valueOf = Integer.valueOf(httpsURLConnection.getResponseCode());
            if (valueOf.intValue() >= 400) {
                inputStream = httpsURLConnection.getErrorStream();
            } else {
                inputStream = httpsURLConnection.getInputStream();
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            String stringBuffer2 = stringBuffer.toString();
            a2.a("Response: %s", stringBuffer2);
            if (valueOf.intValue() == 429) {
                a2.f("Too frequent requests to the endpoint (429)", new Object[0]);
                return a3;
            }
            if (!(stringBuffer2 == null || stringBuffer2.length() == 0)) {
                try {
                    jSONObject = new JSONObject(stringBuffer2);
                } catch (JSONException e) {
                    String a4 = wm.a("Failed to parse json response. (%s)", e.getMessage());
                    a2.f(a4, new Object[0]);
                    a3.e = a4;
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return a3;
                }
                a3.g = jSONObject;
                String optString = jSONObject.optString("message", null);
                a3.e = optString;
                a3.f = jSONObject.optString("timestamp", null);
                a3.d = jSONObject.optString("adid", null);
                String optString2 = jSONObject.optString("tracking_state", null);
                if (optString2 != null && optString2.equals("opted_out")) {
                    a3.h = TrackingState.OPTED_OUT;
                }
                if (optString == null) {
                    optString = "No message found";
                }
                String str = "%s";
                if (valueOf == null || valueOf.intValue() != 200) {
                    a2.f(str, optString);
                } else {
                    a2.c(str, optString);
                    a3.b = true;
                }
            }
            return a3;
        } catch (Exception e2) {
            a2.f("Failed to read response. (%s)", e2.getMessage());
            throw e2;
        } catch (Throwable th) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    private static String a(Map<String, String> map, int i) {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        while (true) {
            str = "=";
            str2 = "&";
            str3 = "UTF-8";
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            String encode = URLEncoder.encode((String) entry.getKey(), str3);
            String str4 = (String) entry.getValue();
            String encode2 = str4 != null ? URLEncoder.encode(str4, str3) : "";
            if (sb.length() > 0) {
                sb.append(str2);
            }
            sb.append(encode);
            sb.append(str);
            sb.append(encode2);
        }
        String format = wm.b.format(Long.valueOf(System.currentTimeMillis()));
        sb.append(str2);
        sb.append(URLEncoder.encode("sent_at", str3));
        sb.append(str);
        sb.append(URLEncoder.encode(format, str3));
        if (i > 0) {
            sb.append(str2);
            sb.append(URLEncoder.encode("queue_size", str3));
            sb.append(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb.append(URLEncoder.encode(sb2.toString(), str3));
        }
        return sb.toString();
    }

    private static Uri a(String str, Map<String, String> map, String str2) {
        String str3;
        Builder builder = new Builder();
        String str4 = "https";
        String str5 = "app.adjust.com";
        try {
            String i = vh.i();
            if (str2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(str2);
                i = sb.toString();
            }
            URL url = new URL(i);
            str4 = url.getProtocol();
            str5 = url.getAuthority();
            str3 = url.getPath();
        } catch (MalformedURLException e) {
            vh.a().f("Unable to parse endpoint (%s)", e.getMessage());
            str3 = "";
        }
        builder.scheme(str4);
        builder.encodedAuthority(str5);
        builder.path(str3);
        builder.appendPath(str);
        for (Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String str6 = "sent_at";
        builder.appendQueryParameter(str6, wm.b.format(Long.valueOf(System.currentTimeMillis())));
        return builder.build();
    }

    private static String a(Map<String, String> map) {
        return (String) map.remove("app_secret");
    }

    private static String b(Map<String, String> map) {
        return (String) map.remove("secret_id");
    }

    private static void c(Map<String, String> map) {
        map.remove("event_callback_id");
    }

    private static String a(Map<String, String> map, String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Map a2 = a(map, str3, str);
        String c = wm.c((String) a2.get("clear_signature"));
        String str4 = (String) a2.get("fields");
        String a3 = wm.a("Signature %s,%s,%s,%s", wm.a("secret_id=\"%s\"", str2), wm.a("signature=\"%s\"", c), wm.a("algorithm=\"%s\"", "sha256"), wm.a("headers=\"%s\"", str4));
        vh.a().a("authorizationHeader: %s", a3);
        return a3;
    }

    private static Map<String, String> a(Map<String, String> map, String str, String str2) {
        String str3 = "created_at";
        String str4 = (String) map.get(str3);
        String d = d(map);
        String str5 = (String) map.get(d);
        HashMap hashMap = new HashMap();
        hashMap.put("app_secret", str2);
        hashMap.put(str3, str4);
        hashMap.put("activity_kind", str);
        hashMap.put(d, str5);
        String str6 = "";
        String str7 = str6;
        for (Entry entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str6);
                sb.append((String) entry.getKey());
                sb.append(" ");
                str6 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str7);
                sb2.append((String) entry.getValue());
                str7 = sb2.toString();
            }
        }
        String substring = str6.substring(0, str6.length() - 1);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("clear_signature", str7);
        hashMap2.put("fields", substring);
        return hashMap2;
    }

    private static String d(Map<String, String> map) {
        String str = "gps_adid";
        if (map.get(str) != null) {
            return str;
        }
        String str2 = "fire_adid";
        if (map.get(str2) != null) {
            return str2;
        }
        String str3 = "android_id";
        if (map.get(str3) != null) {
            return str3;
        }
        String str4 = "mac_sha1";
        if (map.get(str4) != null) {
            return str4;
        }
        String str5 = "mac_md5";
        if (map.get(str5) != null) {
            return str5;
        }
        String str6 = "android_uuid";
        if (map.get(str6) != null) {
            return str6;
        }
        return null;
    }
}
