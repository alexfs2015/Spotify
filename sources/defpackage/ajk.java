package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ajk reason: default package */
final class ajk {
    static File a(File file, String str) {
        File[] listFiles;
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    static byte[] a(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] a = a((InputStream) fileInputStream);
                CommonUtils.a((Closeable) fileInputStream);
                return a;
            } catch (FileNotFoundException unused) {
                CommonUtils.a((Closeable) fileInputStream);
                return null;
            } catch (IOException unused2) {
                CommonUtils.a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                CommonUtils.a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
            CommonUtils.a((Closeable) fileInputStream);
            return null;
        } catch (IOException unused4) {
            fileInputStream = null;
            CommonUtils.a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.a((Closeable) fileInputStream2);
            throw th;
        }
    }

    static byte[] a(File file, Context context) {
        BufferedReader bufferedReader;
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                byte[] a = new aig(context, new ajw()).a(bufferedReader);
                CommonUtils.a((Closeable) bufferedReader);
                return a;
            } catch (Throwable th) {
                th = th;
                CommonUtils.a((Closeable) bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            CommonUtils.a((Closeable) bufferedReader);
            throw th;
        }
    }

    private static byte[] a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
