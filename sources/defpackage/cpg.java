package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

@cfp
/* renamed from: cpg reason: default package */
public final class cpg {
    private static Object a = new Object();
    private static boolean b = false;
    private static boolean c = false;
    private static bzx d = caa.d();
    private static final Set<String> e = new HashSet(Arrays.asList(new String[0]));
    private final List<String> f;

    public cpg() {
        this(null);
    }

    public cpg(String str) {
        List<String> list;
        if (!c()) {
            list = new ArrayList<>();
        } else {
            String uuid = UUID.randomUUID().toString();
            String str2 = "network_request_";
            if (str == null) {
                String[] strArr = new String[1];
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                list = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String str3 = "ad_request_";
                String valueOf2 = String.valueOf(str);
                strArr2[0] = valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3);
                String valueOf3 = String.valueOf(uuid);
                strArr2[1] = valueOf3.length() != 0 ? str2.concat(valueOf3) : new String(str2);
                list = Arrays.asList(strArr2);
            }
        }
        this.f = list;
    }

    public static void a() {
        synchronized (a) {
            b = false;
            c = false;
            cpn.a(5);
        }
    }

    static final /* synthetic */ void a(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        a(jsonWriter, map);
        jsonWriter.endObject();
    }

    private static void a(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                if (!e.contains(str)) {
                    String str2 = "value";
                    String str3 = "name";
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            cpn.a("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name(str3).value(str);
                        jsonWriter.name(str2).value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String str4 : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name(str3).value(str);
                            jsonWriter.name(str2).value(str4);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    static final /* synthetic */ void a(String str, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    private final void a(String str, cpm cpm) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(d.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            cpm.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            cpn.a("unable to log", e2);
        }
        c(stringWriter.toString());
    }

    static final /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        a(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(bzv.a(bArr));
        }
        jsonWriter.endObject();
    }

    public static void a(boolean z) {
        synchronized (a) {
            b = true;
            c = z;
        }
    }

    static final /* synthetic */ void a(byte[] bArr, JsonWriter jsonWriter) {
        String str;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a2 = bzv.a(bArr);
        if (length < 10000) {
            str = "body";
        } else {
            a2 = cpc.a(a2);
            if (a2 != null) {
                str = "bodydigest";
            }
            jsonWriter.name("bodylength").value((long) length);
            jsonWriter.endObject();
        }
        jsonWriter.name(str).value(a2);
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    public static boolean a(Context context) {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) dqe.f().a(dtg.bf)).booleanValue()) {
            return false;
        }
        try {
            return Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception unused) {
            cpn.a(5);
            return false;
        }
    }

    private final void b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        a("onNetworkRequest", (cpm) new cph(str, str2, map, bArr));
    }

    public static boolean b() {
        boolean z;
        synchronized (a) {
            z = b;
        }
        return z;
    }

    private static synchronized void c(String str) {
        synchronized (cpg.class) {
            cpn.a(4);
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String str2 = "GMA Debug CONTENT ";
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    new String(str2);
                }
                cpn.a(4);
                i = i2;
            }
            cpn.a(4);
        }
    }

    public static boolean c() {
        boolean z;
        synchronized (a) {
            z = b && c;
        }
        return z;
    }

    public final void a(String str) {
        if (c() && str != null) {
            a(str.getBytes());
        }
    }

    public final void a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (c()) {
            b(str, str2, map, bArr);
        }
    }

    public final void a(HttpURLConnection httpURLConnection, int i) {
        if (c()) {
            String str = null;
            a(httpURLConnection.getHeaderFields() == null ? null : new HashMap<>(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    String str2 = "Can not get error message from error HttpURLConnection\n";
                    String valueOf = String.valueOf(e2.getMessage());
                    if (valueOf.length() != 0) {
                        str2.concat(valueOf);
                    } else {
                        new String(str2);
                    }
                    cpn.a(5);
                }
                b(str);
            }
        }
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (c()) {
            b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Map<String, ?> map, int i) {
        a("onNetworkResponse", (cpm) new cpj(i, map));
    }

    public final void a(byte[] bArr) {
        a("onNetworkResponseBody", (cpm) new cpk(bArr));
    }

    /* access modifiers changed from: 0000 */
    public final void b(String str) {
        a("onNetworkRequestError", (cpm) new cpl(str));
    }
}
