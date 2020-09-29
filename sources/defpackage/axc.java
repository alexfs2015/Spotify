package defpackage;

import android.net.Uri;
import defpackage.axb;
import java.io.InputStream;
import java.util.List;

/* renamed from: axc reason: default package */
public final class axc<T extends axb<T>> implements a<T> {
    private final a<T> a;
    private final List<axd> b;

    public axc(a<T> aVar, List<axd> list) {
        this.a = aVar;
        this.b = list;
    }

    public final /* synthetic */ Object a(Uri uri, InputStream inputStream) {
        axb axb = (axb) this.a.a(uri, inputStream);
        List<axd> list = this.b;
        return (list == null || list.isEmpty()) ? axb : (axb) axb.a(this.b);
    }
}
