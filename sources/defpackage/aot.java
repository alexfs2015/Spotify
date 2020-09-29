package defpackage;

import android.os.Bundle;
import com.facebook.FacebookException;

/* renamed from: aot reason: default package */
public abstract class aot {
    private ako a;

    public aot(ako ako) {
        this.a = ako;
    }

    public void a(amh amh) {
        ako ako = this.a;
        if (ako != null) {
            ako.a();
        }
    }

    public abstract void a(amh amh, Bundle bundle);

    public void a(amh amh, FacebookException facebookException) {
        ako ako = this.a;
        if (ako != null) {
            ako.a(facebookException);
        }
    }
}
