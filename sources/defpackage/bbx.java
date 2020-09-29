package defpackage;

import com.google.android.exoplayer2.upstream.FileDataSource;

/* renamed from: bbx reason: default package */
public final class bbx implements a {
    private final bcd a;

    public bbx() {
        this(null);
    }

    private bbx(bcd bcd) {
        this.a = null;
    }

    public final bbn a() {
        FileDataSource fileDataSource = new FileDataSource();
        bcd bcd = this.a;
        if (bcd != null) {
            fileDataSource.a(bcd);
        }
        return fileDataSource;
    }
}
