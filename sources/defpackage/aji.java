package defpackage;

import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: aji reason: default package */
final class aji implements a {
    aji() {
    }

    public final String a(File file) {
        return a(file.getPath());
    }

    private static String a(String str) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String b = CommonUtils.b((InputStream) bufferedInputStream2);
                CommonUtils.a((Closeable) bufferedInputStream2);
                return b;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                CommonUtils.a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.a((Closeable) bufferedInputStream);
            throw th;
        }
    }
}
