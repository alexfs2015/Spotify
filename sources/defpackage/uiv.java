package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* renamed from: uiv reason: default package */
public final class uiv {
    public final List<uiu> a;

    public uiv(uiu... uiuArr) {
        this.a = Arrays.asList(uiuArr);
    }

    public final void a(Uri uri, Uri uri2) {
        for (uiu a2 : this.a) {
            a2.a(uri, uri2);
        }
    }
}
