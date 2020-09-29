package defpackage;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import java.io.File;

/* renamed from: bzr reason: default package */
public final class bzr {
    @Deprecated
    public static void a(Context context, Editor editor, String str) {
        File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.setExecutable(true, false);
        }
        file.setExecutable(true, false);
        editor.commit();
        new File(file, String.valueOf(str).concat(".xml")).setReadable(true, false);
    }
}
