package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: gbi reason: default package */
public final class gbi {
    public static boolean a(File file) {
        boolean z = false;
        if (!(file.mkdirs() || file.isDirectory())) {
            return false;
        }
        File file2 = new File(file, UUID.randomUUID().toString());
        try {
            boolean createNewFile = file2.createNewFile();
            if (file2.exists()) {
                z = file2.delete();
            }
            return createNewFile | z;
        } catch (IOException unused) {
            return false;
        }
    }
}
