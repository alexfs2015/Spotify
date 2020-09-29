package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceId.a;

/* renamed from: fhj reason: default package */
public final /* synthetic */ class fhj implements ffp {
    private final a a;

    public fhj(a aVar) {
        this.a = aVar;
    }

    public final void a(ffo ffo) {
        a aVar = this.a;
        synchronized (aVar) {
            if (aVar.a()) {
                FirebaseInstanceId.this.b();
            }
        }
    }
}
