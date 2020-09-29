package defpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: fdv reason: default package */
public final class fdv {
    public static BufferedReader a(File file, Charset charset) {
        fay.a(file);
        fay.a(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter b(File file, Charset charset) {
        fay.a(file);
        fay.a(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    static {
        new fdg<File>() {
            public final String toString() {
                return "Files.fileTreeTraverser()";
            }
        };
        new Object() {
        };
    }
}
