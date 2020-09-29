package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: wlm reason: default package */
public final class wlm implements wll {
    private final Context a;
    private final String b;
    private final String c;

    public wlm(wjf wjf) {
        if (wjf.h != null) {
            this.a = wjf.h;
            this.b = wjf.j();
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
            wja.a().a(str, "Null File");
        } else if (filesDir.exists() || filesDir.mkdirs()) {
            return filesDir;
        } else {
            wja.a().d(str, "Couldn't create file");
        }
        return null;
    }
}
