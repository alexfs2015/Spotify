package defpackage;

import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;

/* renamed from: vxr reason: default package */
final class vxr implements vxp {
    private final vuz a;

    public vxr(vuz vuz) {
        this.a = vuz;
    }

    public final JSONObject a() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        String str = "Error while closing settings cache file.";
        String str2 = "Fabric";
        vuu.a().a(str2, "Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new vxg(this.a).a(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(CommonUtils.a((InputStream) fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        vuu.a().c(str2, "Failed to fetch cached settings", e);
                        CommonUtils.a((Closeable) fileInputStream, str);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        CommonUtils.a((Closeable) fileInputStream2, str);
                        throw th;
                    }
                }
            } else {
                vuu.a().a(str2, "No cached settings found.");
                jSONObject = null;
            }
            CommonUtils.a((Closeable) fileInputStream2, str);
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            vuu.a().c(str2, "Failed to fetch cached settings", e);
            CommonUtils.a((Closeable) fileInputStream, str);
            return null;
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.a((Closeable) fileInputStream2, str);
            throw th;
        }
    }

    public final void a(long j, JSONObject jSONObject) {
        String str = "Failed to close settings writer.";
        String str2 = "Fabric";
        vuu.a().a(str2, "Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(new File(new vxg(this.a).a(), "com.crashlytics.settings.json"));
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    CommonUtils.a((Closeable) fileWriter2, str);
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        vuu.a().c(str2, "Failed to cache settings", e);
                        CommonUtils.a((Closeable) fileWriter, str);
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.a((Closeable) fileWriter, str);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    CommonUtils.a((Closeable) fileWriter, str);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                vuu.a().c(str2, "Failed to cache settings", e);
                CommonUtils.a((Closeable) fileWriter, str);
            }
        }
    }
}
