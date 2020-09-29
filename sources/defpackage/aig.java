package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aig reason: default package */
final class aig {
    private final Context a;
    private final a b;

    /* renamed from: aig$a */
    interface a {
        String a(File file);
    }

    aig(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    private File a(File file) {
        if (VERSION.SDK_INT < 9) {
            return file;
        }
        if (file.getAbsolutePath().startsWith("/data")) {
            try {
                file = new File(this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 0).nativeLibraryDir, file.getName());
            } catch (NameNotFoundException e) {
                wja.a().c("CrashlyticsCore", "Error getting ApplicationInfo", e);
            }
        }
        return file;
    }

    static byte[] a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONException e) {
            wja.a().b("CrashlyticsCore", "Binary images string is null", e);
            return new byte[0];
        }
    }

    private static String b(JSONArray jSONArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            sb.append(jSONArray.getString(i));
        }
        return sb.toString();
    }

    private JSONObject b(String str) {
        String str2 = "CrashlyticsCore";
        ajo a2 = ajp.a(str);
        if (a2 != null) {
            if ((a2.c.indexOf(120) == -1 || a2.d.indexOf(47) == -1) ? false : true) {
                File file = new File(a2.d);
                if (!file.exists()) {
                    file = a(file);
                }
                try {
                    String a3 = this.b.a(file);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("base_address", a2.a);
                        jSONObject.put("size", a2.b);
                        jSONObject.put("name", a2.d);
                        jSONObject.put("uuid", a3);
                        return jSONObject;
                    } catch (JSONException e) {
                        wja.a().a(str2, "Could not create a binary image json string", (Throwable) e);
                        return null;
                    }
                } catch (IOException e2) {
                    wji a4 = wja.a();
                    StringBuilder sb = new StringBuilder("Could not generate ID for file ");
                    sb.append(a2.d);
                    a4.a(str2, sb.toString(), (Throwable) e2);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public JSONArray a(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            String[] split = b(new JSONObject(str).getJSONArray("maps")).split("\\|");
            for (String b2 : split) {
                JSONObject b3 = b(b2);
                if (b3 != null) {
                    jSONArray.put(b3);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            wja.a().b("CrashlyticsCore", "Unable to parse proc maps string", e);
            return jSONArray;
        }
    }

    /* access modifiers changed from: 0000 */
    public final byte[] a(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return a(jSONArray);
            }
            JSONObject b2 = b(readLine);
            if (b2 != null) {
                jSONArray.put(b2);
            }
        }
    }
}
