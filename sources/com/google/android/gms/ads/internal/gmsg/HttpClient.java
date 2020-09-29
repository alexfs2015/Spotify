package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cey
public class HttpClient implements bgl<dzg> {
    private final Context mContext;
    private final coy zzyf;

    @cey
    static class a {
        final String a;
        final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    @cey
    static class b {
        final String a;
        final URL b;
        final ArrayList<a> c;
        final String d;

        b(String str, URL url, ArrayList<a> arrayList, String str2) {
            this.a = str;
            this.b = url;
            this.c = arrayList;
            this.d = str2;
        }
    }

    @cey
    class c {
        final d a;
        final boolean b;
        final String c;

        public c(boolean z, d dVar, String str) {
            this.b = z;
            this.a = dVar;
            this.c = str;
        }
    }

    @cey
    static class d {
        final String a;
        final int b;
        final List<a> c;
        final String d;

        d(String str, int i, List<a> list, String str2) {
            this.a = str;
            this.b = i;
            this.c = list;
            this.d = str2;
        }
    }

    public HttpClient(Context context, coy coy) {
        this.mContext = context;
        this.zzyf = coy;
    }

    private static b zzc(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        URL url = null;
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            clu.a("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new b(optString, url, arrayList, optString3);
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        cmb.a((Runnable) new bgm(this, map, (dzg) obj));
    }

    private static JSONObject zza(d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", dVar.a);
            if (dVar.d != null) {
                jSONObject.put("body", dVar.d);
            }
            JSONArray jSONArray = new JSONArray();
            for (a aVar : dVar.c) {
                jSONArray.put(new JSONObject().put("key", aVar.a).put("value", aVar.b));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", dVar.b);
        } catch (JSONException e) {
            clu.a("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.ads.internal.gmsg.HttpClient.c zza(com.google.android.gms.ads.internal.gmsg.HttpClient.b r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = r13.b     // Catch:{ Exception -> 0x00de, all -> 0x00db }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x00de, all -> 0x00db }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x00de, all -> 0x00db }
            cmd r3 = defpackage.bjl.e()     // Catch:{ Exception -> 0x00d9 }
            android.content.Context r4 = r12.mContext     // Catch:{ Exception -> 0x00d9 }
            coy r5 = r12.zzyf     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r5 = r5.a     // Catch:{ Exception -> 0x00d9 }
            r3.a(r4, r5, r2)     // Catch:{ Exception -> 0x00d9 }
            java.util.ArrayList<com.google.android.gms.ads.internal.gmsg.HttpClient$a> r3 = r13.c     // Catch:{ Exception -> 0x00d9 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ Exception -> 0x00d9 }
            int r4 = r3.size()     // Catch:{ Exception -> 0x00d9 }
            r5 = 0
        L_0x0020:
            if (r5 >= r4) goto L_0x0032
            java.lang.Object r6 = r3.get(r5)     // Catch:{ Exception -> 0x00d9 }
            int r5 = r5 + 1
            com.google.android.gms.ads.internal.gmsg.HttpClient$a r6 = (com.google.android.gms.ads.internal.gmsg.HttpClient.a) r6     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r7 = r6.a     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r6 = r6.b     // Catch:{ Exception -> 0x00d9 }
            r2.addRequestProperty(r7, r6)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x0020
        L_0x0032:
            java.lang.String r3 = r13.d     // Catch:{ Exception -> 0x00d9 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00d9 }
            r4 = 1
            if (r3 != 0) goto L_0x0058
            r2.setDoOutput(r4)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r3 = r13.d     // Catch:{ Exception -> 0x00d9 }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x00d9 }
            int r5 = r3.length     // Catch:{ Exception -> 0x00d9 }
            r2.setFixedLengthStreamingMode(r5)     // Catch:{ Exception -> 0x00d9 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00d9 }
            java.io.OutputStream r6 = r2.getOutputStream()     // Catch:{ Exception -> 0x00d9 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00d9 }
            r5.write(r3)     // Catch:{ Exception -> 0x00d9 }
            r5.close()     // Catch:{ Exception -> 0x00d9 }
            goto L_0x0059
        L_0x0058:
            r3 = r1
        L_0x0059:
            cop r5 = new cop     // Catch:{ Exception -> 0x00d9 }
            r5.<init>()     // Catch:{ Exception -> 0x00d9 }
            r5.a(r2, r3)     // Catch:{ Exception -> 0x00d9 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00d9 }
            r3.<init>()     // Catch:{ Exception -> 0x00d9 }
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00d9 }
            if (r6 == 0) goto L_0x00a9
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00d9 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ Exception -> 0x00d9 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x00d9 }
        L_0x0078:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x00d9 }
            if (r7 == 0) goto L_0x00a9
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x00d9 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x00d9 }
            java.lang.Object r8 = r7.getValue()     // Catch:{ Exception -> 0x00d9 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x00d9 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x00d9 }
        L_0x008e:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x00d9 }
            if (r9 == 0) goto L_0x0078
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00d9 }
            com.google.android.gms.ads.internal.gmsg.HttpClient$a r10 = new com.google.android.gms.ads.internal.gmsg.HttpClient$a     // Catch:{ Exception -> 0x00d9 }
            java.lang.Object r11 = r7.getKey()     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00d9 }
            r10.<init>(r11, r9)     // Catch:{ Exception -> 0x00d9 }
            r3.add(r10)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x008e
        L_0x00a9:
            com.google.android.gms.ads.internal.gmsg.HttpClient$d r6 = new com.google.android.gms.ads.internal.gmsg.HttpClient$d     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r13 = r13.a     // Catch:{ Exception -> 0x00d9 }
            int r7 = r2.getResponseCode()     // Catch:{ Exception -> 0x00d9 }
            defpackage.bjl.e()     // Catch:{ Exception -> 0x00d9 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00d9 }
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ Exception -> 0x00d9 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r8 = defpackage.cmd.a(r8)     // Catch:{ Exception -> 0x00d9 }
            r6.<init>(r13, r7, r3, r8)     // Catch:{ Exception -> 0x00d9 }
            int r13 = r6.b     // Catch:{ Exception -> 0x00d9 }
            r5.a(r2, r13)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r13 = r6.d     // Catch:{ Exception -> 0x00d9 }
            r5.a(r13)     // Catch:{ Exception -> 0x00d9 }
            com.google.android.gms.ads.internal.gmsg.HttpClient$c r13 = new com.google.android.gms.ads.internal.gmsg.HttpClient$c     // Catch:{ Exception -> 0x00d9 }
            r13.<init>(r4, r6, r1)     // Catch:{ Exception -> 0x00d9 }
            if (r2 == 0) goto L_0x00d8
            r2.disconnect()
        L_0x00d8:
            return r13
        L_0x00d9:
            r13 = move-exception
            goto L_0x00e0
        L_0x00db:
            r13 = move-exception
            r2 = r1
            goto L_0x00f0
        L_0x00de:
            r13 = move-exception
            r2 = r1
        L_0x00e0:
            com.google.android.gms.ads.internal.gmsg.HttpClient$c r3 = new com.google.android.gms.ads.internal.gmsg.HttpClient$c     // Catch:{ all -> 0x00ef }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00ef }
            r3.<init>(r0, r1, r13)     // Catch:{ all -> 0x00ef }
            if (r2 == 0) goto L_0x00ee
            r2.disconnect()
        L_0x00ee:
            return r3
        L_0x00ef:
            r13 = move-exception
        L_0x00f0:
            if (r2 == 0) goto L_0x00f5
            r2.disconnect()
        L_0x00f5:
            goto L_0x00f7
        L_0x00f6:
            throw r13
        L_0x00f7:
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.HttpClient.zza(com.google.android.gms.ads.internal.gmsg.HttpClient$b):com.google.android.gms.ads.internal.gmsg.HttpClient$c");
    }

    public JSONObject send(JSONObject jSONObject) {
        String str = "reason";
        String str2 = "success";
        String str3 = "response";
        String str4 = "http_request_id";
        JSONObject jSONObject2 = new JSONObject();
        String str5 = "";
        try {
            String optString = jSONObject.optString(str4);
            c zza = zza(zzc(jSONObject));
            if (zza.b) {
                jSONObject2.put(str3, zza(zza.a));
                jSONObject2.put(str2, true);
            } else {
                jSONObject2.put(str3, new JSONObject().put(str4, optString));
                jSONObject2.put(str2, false);
                jSONObject2.put(str, zza.c);
            }
        } catch (Exception e) {
            String str6 = "Error executing http request.";
            clu.a(str6, e);
            try {
                jSONObject2.put(str3, new JSONObject().put(str4, str5));
                jSONObject2.put(str2, false);
                jSONObject2.put(str, e.toString());
            } catch (JSONException e2) {
                clu.a(str6, e2);
            }
        }
        return jSONObject2;
    }
}
