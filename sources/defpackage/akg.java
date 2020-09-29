package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: akg reason: default package */
final class akg implements akd {
    private static final FileFilter a = new FileFilter() {
        public final boolean accept(File file) {
            return file.isDirectory();
        }
    };
    private final wll b;

    public akg(wll wll) {
        this.b = wll;
    }

    private File c() {
        return new File(this.b.a(), "native");
    }

    public final File a() {
        File c = c();
        if (!c.isDirectory() && !c.mkdir()) {
            return null;
        }
        new wkg();
        File file = new File(c, Long.toString(System.currentTimeMillis()));
        if (file.mkdir()) {
            return file;
        }
        return null;
    }

    public final TreeSet<File> b() {
        File c = c();
        if (c == null || !c.isDirectory()) {
            return new TreeSet<>();
        }
        File[] listFiles = c.listFiles(a);
        TreeSet<File> treeSet = new TreeSet<>(new Comparator<File>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            }
        });
        treeSet.addAll(Arrays.asList(listFiles));
        return treeSet;
    }
}
