package defpackage;

import android.net.Uri;
import defpackage.axs;
import java.io.InputStream;
import java.util.List;

/* renamed from: axt reason: default package */
public final class axt<T extends axs<T>> implements a<T> {
    private final a<T> a;
    private final List<axu> b;

    public axt(a<T> aVar, List<axu> list) {
        this.a = aVar;
        this.b = list;
    }

    public final /* synthetic */ Object a(Uri uri, InputStream inputStream) {
        axs axs = (axs) this.a.a(uri, inputStream);
        List<axu> list = this.b;
        return (list == null || list.isEmpty()) ? axs : (axs) axs.a(this.b);
    }
}
