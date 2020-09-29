package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: vww reason: default package */
public final class vww extends vwx {
    public vww(Context context, File file, String str, String str2) {
        super(context, file, str, str2);
    }

    public final OutputStream a(File file) {
        return new GZIPOutputStream(new FileOutputStream(file));
    }
}
