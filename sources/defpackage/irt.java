package defpackage;

import android.os.Environment;
import android.os.FileObserver;
import java.io.File;

/* renamed from: irt reason: default package */
public final class irt extends FileObserver {
    private static final String a = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Screenshots").getAbsolutePath();
    private final a b;
    private String c;

    /* renamed from: irt$a */
    public interface a {
        void aj();
    }

    public irt(a aVar) {
        super(a, 8);
        fay.a(aVar);
        this.b = aVar;
    }

    public final void onEvent(int i, String str) {
        if (str != null && i == 8 && !str.equals(this.c)) {
            this.c = str;
            this.b.aj();
        }
    }
}
