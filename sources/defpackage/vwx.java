package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: vwx reason: default package */
public class vwx implements vws {
    private final Context a;
    private final File b;
    private final String c;
    private final File d;
    private vvy e = new vvy(this.d);
    private File f = new File(this.b, this.c);

    public vwx(Context context, File file, String str, String str2) {
        this.a = context;
        this.b = file;
        this.c = str2;
        this.d = new File(this.b, str);
        if (!this.f.exists()) {
            this.f.mkdirs();
        }
    }

    public final void a(byte[] bArr) {
        this.e.a(bArr);
    }

    public final int a() {
        return this.e.a();
    }

    public final void a(String str) {
        FileInputStream fileInputStream;
        String str2 = "Failed to close output stream";
        String str3 = "Failed to close file input stream";
        this.e.close();
        File file = this.d;
        File file2 = new File(this.f, str);
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                outputStream = a(file2);
                CommonUtils.a((InputStream) fileInputStream, outputStream, new byte[1024]);
                CommonUtils.a((Closeable) fileInputStream, str3);
                CommonUtils.a((Closeable) outputStream, str2);
                file.delete();
                this.e = new vvy(this.d);
            } catch (Throwable th) {
                th = th;
                CommonUtils.a((Closeable) fileInputStream, str3);
                CommonUtils.a((Closeable) outputStream, str2);
                file.delete();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            CommonUtils.a((Closeable) fileInputStream, str3);
            CommonUtils.a((Closeable) outputStream, str2);
            file.delete();
            throw th;
        }
    }

    public OutputStream a(File file) {
        return new FileOutputStream(file);
    }

    public final List<File> a(int i) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() > 0) {
                break;
            }
        }
        return arrayList;
    }

    public final void a(List<File> list) {
        for (File file : list) {
            CommonUtils.a(this.a, String.format("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    public final List<File> c() {
        return Arrays.asList(this.f.listFiles());
    }

    public final void d() {
        try {
            this.e.close();
        } catch (IOException unused) {
        }
        this.d.delete();
    }

    public final boolean b() {
        return this.e.b();
    }

    public final boolean a(int i, int i2) {
        return (this.e.a() + 4) + i <= i2;
    }
}
