package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* renamed from: uug reason: default package */
public final class uug {
    public final List<uuf> a;

    public uug(uuf... uufArr) {
        this.a = Arrays.asList(uufArr);
    }

    public final void a(Uri uri, Uri uri2) {
        for (uuf a2 : this.a) {
            a2.a(uri, uri2);
        }
    }
}
