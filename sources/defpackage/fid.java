package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceId.a;

/* renamed from: fid reason: default package */
public final /* synthetic */ class fid implements fgj {
    private final a a;

    public fid(a aVar) {
        this.a = aVar;
    }

    public final void a(fgi fgi) {
        a aVar = this.a;
        synchronized (aVar) {
            if (aVar.a()) {
                FirebaseInstanceId.this.b();
            }
        }
    }
}
