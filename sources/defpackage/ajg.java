package defpackage;

import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: ajg reason: default package */
final class ajg {
    static final Charset a = Charset.forName("UTF-8");
    private final File b;

    public ajg(File file) {
        this.b = file;
    }

    static String a(final aka aka) {
        return new JSONObject() {
            {
                put("userId", aka.b);
                put("userName", aka.c);
                put("userEmail", aka.d);
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

    public final aka a(String str) {
        String str2 = "Failed to close user metadata file.";
        File b2 = b(str);
        if (!b2.exists()) {
            return aka.a;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(b2);
            try {
                JSONObject jSONObject = new JSONObject(CommonUtils.a((InputStream) fileInputStream2));
                aka aka = new aka(a(jSONObject, "userId"), a(jSONObject, "userName"), a(jSONObject, "userEmail"));
                CommonUtils.a((Closeable) fileInputStream2, str2);
                return aka;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    wja.a().c("CrashlyticsCore", "Error deserializing user metadata.", e);
                    CommonUtils.a((Closeable) fileInputStream, str2);
                    return aka.a;
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
            wja.a().c("CrashlyticsCore", "Error deserializing user metadata.", e);
            CommonUtils.a((Closeable) fileInputStream, str2);
            return aka.a;
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
}
