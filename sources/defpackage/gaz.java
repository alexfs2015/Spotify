package defpackage;

import com.spotify.android.storage.SyncError;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gaz reason: default package */
public final class gaz {
    final AtomicReference<Boolean> a;
    private final File b;
    private final File c;
    private final gbd d;

    public gaz(File file, File file2, gbd gbd) {
        if (!file.exists() || !file.isDirectory() || !file.canRead()) {
            StringBuilder sb = new StringBuilder("Unable to access source directory: ");
            sb.append(file);
            throw new SyncError(sb.toString());
        } else if (!file2.exists() || !file2.isDirectory() || !file2.canWrite()) {
            StringBuilder sb2 = new StringBuilder("Unable to access destination directory: ");
            sb2.append(file2);
            throw new SyncError(sb2.toString());
        } else {
            this.b = file;
            this.c = file2;
            this.d = gbd;
            this.a = new AtomicReference<>(Boolean.FALSE);
        }
    }

    private boolean a(File file, File file2) {
        boolean z;
        File[] listFiles = file.listFiles();
        boolean z2 = false;
        if (listFiles != null) {
            boolean z3 = false;
            for (File file3 : listFiles) {
                if (!file3.isDirectory()) {
                    z = b(file3, file2);
                } else if (!((Boolean) this.a.get()).booleanValue()) {
                    return false;
                } else {
                    File file4 = new File(file2, file3.getName());
                    if (file4.exists() || file4.mkdir()) {
                        if (file4.isFile()) {
                            if (!(file4.delete() && file4.mkdir())) {
                                StringBuilder sb = new StringBuilder("Unable to replace existed file with folder ");
                                sb.append(file4);
                                throw new SyncError(sb.toString());
                            }
                        }
                        if (!file4.isDirectory() || !file4.canWrite()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(file4);
                            sb2.append(" is not writable folder");
                            throw new SyncError(sb2.toString());
                        }
                        z = a(file3, file4);
                    } else {
                        StringBuilder sb3 = new StringBuilder("Unable to create nested folder ");
                        sb3.append(file4);
                        throw new SyncError(sb3.toString());
                    }
                }
                z3 |= z;
            }
            z2 = z3;
        }
        return z2;
    }

    private boolean b(File file, File file2) {
        File file3 = new File(file2, file.getName());
        if (!file.getName().equals(".tag") && (!file3.exists() || file.length() != file3.length() || file.lastModified() > file3.lastModified())) {
            try {
                xdj.a(file, file3, false);
                this.d.a(file3);
                return true;
            } catch (IOException unused) {
                StringBuilder sb = new StringBuilder("Unable to copy file ");
                sb.append(file);
                sb.append(" to ");
                sb.append(file3);
                throw new SyncError(sb.toString());
            }
        } else {
            this.d.a(file3);
            return false;
        }
    }

    public final boolean a() {
        this.a.set(Boolean.TRUE);
        return a(this.b, this.c);
    }
}
