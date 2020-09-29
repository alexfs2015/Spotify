package defpackage;

import java.io.InputStream;
import java.util.List;

/* renamed from: cru reason: default package */
public final class cru {
    final int a;
    final List<dql> b;
    final int c;
    final InputStream d;

    public cru(int i, List<dql> list) {
        this(i, list, -1, null);
    }

    public cru(int i, List<dql> list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
    }
}
