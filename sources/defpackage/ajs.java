package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: ajs reason: default package */
final class ajs implements ajp {
    private static final FileFilter a = new FileFilter() {
        public final boolean accept(File file) {
            return file.isDirectory();
        }
    };
    private final vxf b;

    public ajs(vxf vxf) {
        this.b = vxf;
    }

    private File c() {
        return new File(this.b.a(), "native");
    }

    public final File a() {
        File c = c();
        if (!c.isDirectory() && !c.mkdir()) {
            return null;
        }
        new vwa();
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
