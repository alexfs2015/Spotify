package defpackage;

import android.net.Uri;

/* renamed from: mcq reason: default package */
public final class mcq implements mcn {
    private final mbv a;
    private final a b;

    /* renamed from: mcq$a */
    public interface a {
        void b(String str);
    }

    public mcq(mbv mbv, a aVar) {
        this.a = mbv;
        this.b = aVar;
    }

    public final void a(Uri uri) {
        mbv mbv = this.a;
        mbv.a(new o(mbv.a, uri.toString()));
        a aVar = this.b;
        String queryParameter = uri.getQueryParameter("reason");
        if (queryParameter == null) {
            queryParameter = "";
        }
        aVar.b(queryParameter);
    }
}
