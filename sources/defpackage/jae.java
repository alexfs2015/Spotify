package defpackage;

import com.spotify.base.java.logging.Logger;
import java.io.File;

/* renamed from: jae reason: default package */
public final class jae implements a {
    private final jbm a;
    private final jbi b;

    jae(jbm jbm, jbi jbi) {
        this.a = jbm;
        this.b = jbi;
    }

    public final void a() {
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

    public final String c() {
        return "StoryResources";
    }
}
