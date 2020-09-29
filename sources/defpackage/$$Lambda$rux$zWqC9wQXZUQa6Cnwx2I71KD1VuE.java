package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: -$$Lambda$rux$zWqC9wQXZUQa6Cnwx2I71KD1VuE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rux$zWqC9wQXZUQa6Cnwx2I71KD1VuE implements FileFilter {
    public static final /* synthetic */ $$Lambda$rux$zWqC9wQXZUQa6Cnwx2I71KD1VuE INSTANCE = new $$Lambda$rux$zWqC9wQXZUQa6Cnwx2I71KD1VuE();

    private /* synthetic */ $$Lambda$rux$zWqC9wQXZUQa6Cnwx2I71KD1VuE() {
    }

    public final boolean accept(File file) {
        return file.getName().endsWith("keys.meta");
    }
}
