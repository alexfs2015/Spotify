package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.security.cert.CertificateException;

/* renamed from: lnm reason: default package */
public interface lnm {

    /* renamed from: lnm$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static gbv a(Context context, hit hit) {
            try {
                return new gbw(context, hit);
            } catch (CertificateException e) {
                String str = "Cannot init a WebsiteAutologinUtility, falling back to default utility that does nothing";
                Logger.e(e, str, new Object[0]);
                Assertion.a(str, (Throwable) e);
                return new gbv() {
                    public final void a(Optional<Long> optional, Uri uri) {
                    }
                };
            }
        }
    }
}
