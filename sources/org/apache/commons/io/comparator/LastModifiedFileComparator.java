package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

public class LastModifiedFileComparator extends xdn implements Serializable {
    public static final Comparator<File> a = new ReverseComparator(b);
    private static Comparator<File> b = new LastModifiedFileComparator();
    private static final long serialVersionUID = 7372168004395734046L;

    public /* synthetic */ int compare(Object obj, Object obj2) {
        long lastModified = ((File) obj).lastModified() - ((File) obj2).lastModified();
        if (lastModified < 0) {
            return -1;
        }
        return lastModified > 0 ? 1 : 0;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
