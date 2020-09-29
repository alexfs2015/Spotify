package defpackage;

import java.io.InputStream;
import java.util.List;

/* renamed from: csl reason: default package */
public final class csl {
    final int a;
    final List<drc> b;
    final int c;
    final InputStream d;

    public csl(int i, List<drc> list) {
        this(i, list, -1, null);
    }

    public csl(int i, List<drc> list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
    }
}
