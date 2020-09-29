package defpackage;

import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: akg reason: default package */
public class akg {
    private static final String c = akg.class.getSimpleName();
    public final JSONObject a;
    public final FacebookRequestError b;
    private final HttpURLConnection d;
    private final JSONArray e;
    private final String f;
    private final akd g;

    private akg(akd akd, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(akd, httpURLConnection, str, jSONObject, null, null);
    }

    private akg(akd akd, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(akd, httpURLConnection, str, null, jSONArray, null);
    }

    private akg(akd akd, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(akd, httpURLConnection, null, null, null, facebookRequestError);
    }

    private akg(akd akd, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.g = akd;
        this.d = httpURLConnection;
        this.f = str;
        this.a = jSONObject;
        this.e = jSONArray;
        this.b = facebookRequestError;
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            String str2 = "%d";
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(this.d != null ? this.d.getResponseCode() : 200);
            str = String.format(locale, str2, objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sb = new StringBuilder("{Response: ");
        sb.append(" responseCode: ");
        sb.append(str);
        sb.append(", graphObject: ");
        sb.append(this.a);
        sb.append(", error: ");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    static List<akg> a(HttpURLConnection httpURLConnection, akf akf) {
        InputStream inputStream;
        String str = "Response <Error>: %s";
        String str2 = "Response";
        InputStream inputStream2 = null;
        try {
            if (akc.b()) {
                if (httpURLConnection.getResponseCode() >= 400) {
                    inputStream = httpURLConnection.getErrorStream();
                } else {
                    inputStream = httpURLConnection.getInputStream();
                }
                String a2 = amw.a(inputStream2);
                amp.a(LoggingBehavior.INCLUDE_RAW_RESPONSES, str2, "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(a2.length()), a2);
                List<akg> a3 = a(httpURLConnection, (List<akd>) akf, new JSONTokener(a2).nextValue());
                amp.a(LoggingBehavior.REQUESTS, str2, "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", akf.c, Integer.valueOf(a2.length()), a3);
                return a3;
            }
            String str3 = "GraphRequest can't be used when Facebook SDK isn't fully initialized";
            Log.e(c, str3);
            throw new FacebookException(str3);
        } catch (FacebookException e2) {
            amp.a(LoggingBehavior.REQUESTS, str2, str, e2);
            return a((List<akd>) akf, httpURLConnection, e2);
        } catch (Exception e3) {
            amp.a(LoggingBehavior.REQUESTS, str2, str, e3);
            return a((List<akd>) akf, httpURLConnection, new FacebookException((Throwable) e3));
        } finally {
            amw.a(inputStream2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<defpackage.akg> a(java.net.HttpURLConnection r9, java.util.List<defpackage.akd> r10, java.lang.Object r11) {
        /*
            int r0 = r10.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.lang.String r2 = "body"
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L_0x0051
            java.lang.Object r4 = r10.get(r3)
            akd r4 = (defpackage.akd) r4
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.put(r2, r11)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            if (r9 == 0) goto L_0x0024
            int r6 = r9.getResponseCode()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0026
        L_0x0024:
            r6 = 200(0xc8, float:2.8E-43)
        L_0x0026:
            java.lang.String r7 = "code"
            r5.put(r7, r6)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r6.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r6.put(r5)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0052
        L_0x0034:
            r5 = move-exception
            akg r6 = new akg
            com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
            r7.<init>(r9, r5)
            r6.<init>(r4, r9, r7)
            r1.add(r6)
            goto L_0x0051
        L_0x0043:
            r5 = move-exception
            akg r6 = new akg
            com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
            r7.<init>(r9, r5)
            r6.<init>(r4, r9, r7)
            r1.add(r6)
        L_0x0051:
            r6 = r11
        L_0x0052:
            boolean r4 = r6 instanceof org.json.JSONArray
            if (r4 == 0) goto L_0x0127
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            int r4 = r6.length()
            if (r4 != r0) goto L_0x0127
        L_0x005e:
            int r0 = r6.length()
            if (r3 >= r0) goto L_0x0126
            java.lang.Object r0 = r10.get(r3)
            akd r0 = (defpackage.akd) r0
            java.lang.Object r4 = r6.get(r3)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            boolean r5 = r4 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            r7 = 0
            if (r5 == 0) goto L_0x00d8
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            com.facebook.FacebookRequestError r5 = com.facebook.FacebookRequestError.a(r4, r11, r9)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            if (r5 == 0) goto L_0x00b0
            java.lang.String r4 = c     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            java.lang.String r8 = r5.toString()     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            android.util.Log.e(r4, r8)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            int r4 = r5.b     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            r8 = 190(0xbe, float:2.66E-43)
            if (r4 != r8) goto L_0x00a9
            aju r4 = r0.b     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            boolean r4 = defpackage.amw.a(r4)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            if (r4 == 0) goto L_0x00a9
            int r4 = r5.c     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            r8 = 493(0x1ed, float:6.91E-43)
            if (r4 == r8) goto L_0x009c
            defpackage.aju.a(r7)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            goto L_0x00a9
        L_0x009c:
            aju r4 = defpackage.aju.a()     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            boolean r4 = r4.d()     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            if (r4 != 0) goto L_0x00a9
            defpackage.aju.c()     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
        L_0x00a9:
            akg r4 = new akg     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            r4.<init>(r0, r9, r5)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            r5 = r4
            goto L_0x00e5
        L_0x00b0:
            java.lang.String r5 = "FACEBOOK_NON_JSON_RESULT"
            java.lang.Object r4 = defpackage.amw.a(r4, r2, r5)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            boolean r5 = r4 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            if (r5 == 0) goto L_0x00c6
            akg r5 = new akg     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            java.lang.String r7 = r4.toString()     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            r5.<init>(r0, r9, r7, r4)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            goto L_0x00e5
        L_0x00c6:
            boolean r5 = r4 instanceof org.json.JSONArray     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            if (r5 == 0) goto L_0x00d6
            akg r5 = new akg     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            java.lang.String r7 = r4.toString()     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            r5.<init>(r0, r9, r7, r4)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            goto L_0x00e5
        L_0x00d6:
            java.lang.Object r4 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
        L_0x00d8:
            java.lang.Object r5 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            if (r4 != r5) goto L_0x00e9
            akg r5 = new akg     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            r5.<init>(r0, r9, r4, r7)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
        L_0x00e5:
            r1.add(r5)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            goto L_0x0122
        L_0x00e9:
            com.facebook.FacebookException r5 = new com.facebook.FacebookException     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            java.lang.String r8 = "Got unexpected object type in response, class: "
            r7.<init>(r8)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            java.lang.Class r4 = r4.getClass()     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            java.lang.String r4 = r4.getSimpleName()     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            r7.append(r4)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            java.lang.String r4 = r7.toString()     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
            throw r5     // Catch:{ JSONException -> 0x0114, FacebookException -> 0x0105 }
        L_0x0105:
            r4 = move-exception
            akg r5 = new akg
            com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
            r7.<init>(r9, r4)
            r5.<init>(r0, r9, r7)
            r1.add(r5)
            goto L_0x0122
        L_0x0114:
            r4 = move-exception
            akg r5 = new akg
            com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
            r7.<init>(r9, r4)
            r5.<init>(r0, r9, r7)
            r1.add(r5)
        L_0x0122:
            int r3 = r3 + 1
            goto L_0x005e
        L_0x0126:
            return r1
        L_0x0127:
            com.facebook.FacebookException r9 = new com.facebook.FacebookException
            java.lang.String r10 = "Unexpected number of results"
            r9.<init>(r10)
            goto L_0x0130
        L_0x012f:
            throw r9
        L_0x0130:
            goto L_0x012f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akg.a(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    static List<akg> a(List<akd> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new akg((akd) list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) facebookException)));
        }
        return arrayList;
    }
}
