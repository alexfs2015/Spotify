package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: xdn reason: default package */
public abstract class xdn implements Comparator<File> {
    protected xdn() {
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
