package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: vxg reason: default package */
public final class vxg implements vxf {
    private final Context a;
    private final String b;
    private final String c;

    public vxg(vuz vuz) {
        if (vuz.h != null) {
            this.a = vuz.h;
            this.b = vuz.j();
            StringBuilder sb = new StringBuilder("Android/");
            sb.append(this.a.getPackageName());
            this.c = sb.toString();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    public final File a() {
        File filesDir = this.a.getFilesDir();
        String str = "Fabric";
        if (filesDir == null) {
            vuu.a().a(str, "Null File");
        } else if (filesDir.exists() || filesDir.mkdirs()) {
            return filesDir;
        } else {
            vuu.a().d(str, "Couldn't create file");
        }
        return null;
    }
}
