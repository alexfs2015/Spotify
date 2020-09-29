package defpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: fen reason: default package */
public final class fen {
    static {
        new fdy<File>() {
            public final String toString() {
                return "Files.fileTreeTraverser()";
            }
        };
        new Object() {
        };
    }

    public static BufferedReader a(File file, Charset charset) {
        fbp.a(file);
        fbp.a(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter b(File file, Charset charset) {
        fbp.a(file);
        fbp.a(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }
}
