package defpackage;

import com.spotify.base.java.logging.Logger;
import java.io.File;

/* renamed from: ixt reason: default package */
public final class ixt implements a {
    private final izb a;
    private final iyx b;

    public final void a() {
    }

    public final String c() {
        return "StoryResources";
    }

    ixt(izb izb, iyx iyx) {
        this.a = izb;
        this.b = iyx;
    }

    public final void b() {
        try {
            File a2 = this.b.a();
            File[] listFiles = a2.listFiles();
            if (listFiles == null) {
                listFiles = new File[0];
            }
            for (File file : listFiles) {
                if (!file.delete()) {
                    Logger.d("Error deleting file: %s", file.getName());
                }
            }
            if (!a2.delete()) {
                Logger.e("Error deleting directory: %s", a2.getName());
            }
        } catch (Exception e) {
            Logger.e("Error deleting directory: %s: %s", e.getClass().getCanonicalName(), e.getMessage());
        }
        this.a.a.c();
    }
}
