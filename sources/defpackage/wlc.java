package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: wlc reason: default package */
public final class wlc extends wld {
    public wlc(Context context, File file, String str, String str2) {
        super(context, file, str, str2);
    }

    public final OutputStream a(File file) {
        return new GZIPOutputStream(new FileOutputStream(file));
    }
}
