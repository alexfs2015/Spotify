package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: wph reason: default package */
public abstract class wph implements Comparator<File> {
    protected wph() {
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
