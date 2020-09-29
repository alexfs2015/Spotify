package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException.AuthError;
import io.reactivex.Observable;
import java.util.Locale;

public class IapException extends RuntimeException {
    private static final long serialVersionUID = 0;
    public final String errorUri;
    public final Object reason;

    /* renamed from: com.spotify.mobile.android.spotlets.appprotocol.IapException$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[AuthError.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.music.builtinauth.authenticator.BuiltInAuthException$AuthError[] r0 = com.spotify.music.builtinauth.authenticator.BuiltInAuthException.AuthError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.builtinauth.authenticator.BuiltInAuthException$AuthError r1 = com.spotify.music.builtinauth.authenticator.BuiltInAuthException.AuthError.ERROR_USER_NOT_AUTHORIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.builtinauth.authenticator.BuiltInAuthException$AuthError r1 = com.spotify.music.builtinauth.authenticator.BuiltInAuthException.AuthError.ERROR_NOT_LOGGED_IN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.builtinauth.authenticator.BuiltInAuthException$AuthError r1 = com.spotify.music.builtinauth.authenticator.BuiltInAuthException.AuthError.ERROR_OFFLINE_MODE_ACTIVE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.builtinauth.authenticator.BuiltInAuthException$AuthError r1 = com.spotify.music.builtinauth.authenticator.BuiltInAuthException.AuthError.ERROR_AUTHENTICATION_FAILED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.appprotocol.IapException.AnonymousClass1.<clinit>():void");
        }
    }

    public static IapException a(String str, String str2) {
        return new IapException(new Message(str), str2);
    }

    public IapException(Throwable th, Object obj, String str) {
        super(th);
        this.reason = obj;
        this.errorUri = str;
    }

    public IapException(Object obj, String str) {
        this.reason = obj;
        this.errorUri = str;
    }

    public String getMessage() {
        return this.errorUri;
    }

    public String toString() {
        return String.format("IapException{%s %s}", new Object[]{this.errorUri, this.reason});
    }

    public static <T> Observable<T> a(String str) {
        return Observable.a((Throwable) a(str, "wamp.error"));
    }

    public static IapException a(BuiltInAuthException builtInAuthException) {
        String str;
        String str2;
        AuthError authError = builtInAuthException.mError;
        int i = AnonymousClass1.a[authError.ordinal()];
        String str3 = "Unknown AuthError: ";
        if (i == 1) {
            str = ErrorMessage.NEEDS_AUTHORIZATION_ERROR.mMessage;
        } else if (i == 2) {
            str = "User is not logged in";
        } else if (i == 3) {
            str = ErrorMessage.d.mMessage;
        } else if (i == 4) {
            str = String.format(Locale.ENGLISH, "Could not authenticate within %d s.", new Object[]{Integer.valueOf(60)});
        } else {
            StringBuilder sb = new StringBuilder(str3);
            sb.append(authError);
            throw new IllegalStateException(sb.toString());
        }
        AuthError authError2 = builtInAuthException.mError;
        int i2 = AnonymousClass1.a[authError2.ordinal()];
        if (i2 == 1) {
            str2 = "com.spotify.error.user_not_authorized";
        } else if (i2 == 2) {
            str2 = "com.spotify.error.not_logged_in";
        } else if (i2 == 3) {
            str2 = "com.spotify.error.offline_mode_active";
        } else if (i2 == 4) {
            str2 = "com.spotify.error.client_authentication_failed";
        } else {
            StringBuilder sb2 = new StringBuilder(str3);
            sb2.append(authError2);
            throw new IllegalStateException(sb2.toString());
        }
        return a(str, str2);
    }
}
