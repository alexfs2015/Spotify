package defpackage;

import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: ais reason: default package */
final class ais {
    static final Charset a = Charset.forName("UTF-8");
    private final File b;

    public ais(File file) {
        this.b = file;
    }

    public final ajm a(String str) {
        String str2 = "Failed to close user metadata file.";
        File b2 = b(str);
        if (!b2.exists()) {
            return ajm.a;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(b2);
            try {
                JSONObject jSONObject = new JSONObject(CommonUtils.a((InputStream) fileInputStream2));
                ajm ajm = new ajm(a(jSONObject, "userId"), a(jSONObject, "userName"), a(jSONObject, "userEmail"));
                CommonUtils.a((Closeable) fileInputStream2, str2);
                return ajm;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    vuu.a().c("CrashlyticsCore", "Error deserializing user metadata.", e);
                    CommonUtils.a((Closeable) fileInputStream, str2);
                    return ajm.a;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.a((Closeable) fileInputStream2, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.a((Closeable) fileInputStream2, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            vuu.a().c("CrashlyticsCore", "Error deserializing user metadata.", e);
            CommonUtils.a((Closeable) fileInputStream, str2);
            return ajm.a;
        }
    }

    public final File b(String str) {
        File file = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("user.meta");
        return new File(file, sb.toString());
    }

    public final File c(String str) {
        File file = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("keys.meta");
        return new File(file, sb.toString());
    }

    static String a(final ajm ajm) {
        return new JSONObject() {
            {
                put("userId", ajm.b);
                put("userName", ajm.c);
                put("userEmail", ajm.d);
            }
        }.toString();
    }

    static String a(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String a(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, null);
        }
        return null;
    }
}
