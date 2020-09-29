package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import org.apache.commons.io.output.StringBuilderWriter;

/* renamed from: wpf reason: default package */
public final class wpf {
    static {
        char c = File.separatorChar;
        PrintWriter printWriter = new PrintWriter(new StringBuilderWriter(4));
        printWriter.println();
        printWriter.close();
    }

    public static void a(Reader reader) {
        a((Closeable) reader);
    }

    public static void a(Writer writer) {
        a((Closeable) writer);
    }

    public static void a(InputStream inputStream) {
        a((Closeable) inputStream);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(Closeable... closeableArr) {
        for (int i = 0; i < 4; i++) {
            a(closeableArr[i]);
        }
    }
}
