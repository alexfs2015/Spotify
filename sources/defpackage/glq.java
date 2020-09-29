package defpackage;

import android.os.Process;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* renamed from: glq reason: default package */
final class glq {
    private final String a;

    static glq a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(String.format(Locale.US, "/proc/%d/stat", new Object[]{Integer.valueOf(Process.myPid())})), "r");
            String readLine = randomAccessFile.readLine();
            randomAccessFile.close();
            return new glq(readLine);
        } catch (IOException unused) {
            return new glq("");
        }
    }

    private glq(String str) {
        this.a = str;
    }

    public final long a(int i) {
        try {
            Scanner scanner = new Scanner(this.a);
            for (int i2 = 0; i2 < 21; i2++) {
                scanner.next();
            }
            return scanner.nextLong();
        } catch (NoSuchElementException unused) {
            return -1;
        }
    }
}
