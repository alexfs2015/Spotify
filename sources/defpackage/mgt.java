package defpackage;

import android.net.Uri;

/* renamed from: mgt reason: default package */
public final class mgt implements mgq {
    private final mfy a;
    private final a b;

    /* renamed from: mgt$a */
    public interface a {
        void b(String str);
    }

    public mgt(mfy mfy, a aVar) {
        this.a = mfy;
        this.b = aVar;
    }

    public final void a(Uri uri) {
        mfy mfy = this.a;
        mfy.a(new o(mfy.a, uri.toString()));
        a aVar = this.b;
        String queryParameter = uri.getQueryParameter("reason");
        if (queryParameter == null) {
            queryParameter = "";
        }
        aVar.b(queryParameter);
    }
}
