package defpackage;

import com.google.android.exoplayer2.upstream.FileDataSource;

/* renamed from: bco reason: default package */
public final class bco implements a {
    private final bcu a;

    public bco() {
        this(null);
    }

    private bco(bcu bcu) {
        this.a = null;
    }

    public final bce a() {
        FileDataSource fileDataSource = new FileDataSource();
        bcu bcu = this.a;
        if (bcu != null) {
            fileDataSource.a(bcu);
        }
        return fileDataSource;
    }
}
