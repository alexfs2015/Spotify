package defpackage;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: fhb reason: default package */
public final /* synthetic */ class fhb implements ffu {
    public static final ffu a = new fhb();

    private fhb() {
    }

    public final Object a(fft fft) {
        return new FirebaseInstanceId((FirebaseApp) fft.a(FirebaseApp.class), (fgl) fft.a(fgl.class));
    }
}
