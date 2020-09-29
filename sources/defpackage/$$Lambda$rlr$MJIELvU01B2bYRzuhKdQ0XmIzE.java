package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: -$$Lambda$rlr$MJIELvU01B2bYRz-uhKdQ0XmIzE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$rlr$MJIELvU01B2bYRzuhKdQ0XmIzE implements FileFilter {
    public static final /* synthetic */ $$Lambda$rlr$MJIELvU01B2bYRzuhKdQ0XmIzE INSTANCE = new $$Lambda$rlr$MJIELvU01B2bYRzuhKdQ0XmIzE();

    private /* synthetic */ $$Lambda$rlr$MJIELvU01B2bYRzuhKdQ0XmIzE() {
    }

    public final boolean accept(File file) {
        return file.getName().endsWith("keys.meta");
    }
}
