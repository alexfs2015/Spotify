package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.c;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;

/* renamed from: aob reason: default package */
abstract class aob extends anz {
    aob(Parcel parcel) {
        super(parcel);
    }

    aob(LoginClient loginClient) {
        super(loginClient);
    }

    private Result a(c cVar, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = a(extras);
        String str = "error_code";
        String obj = extras.get(str) != null ? extras.get(str).toString() : null;
        String b = b(extras);
        String string = extras.getString("e2e");
        if (!ank.a(string)) {
            b(string);
        }
        if (a == null && obj == null && b == null) {
            try {
                return Result.a(cVar, a(cVar.b, extras, AccessTokenSource.FACEBOOK_APPLICATION_WEB, cVar.d));
            } catch (FacebookException e) {
                return Result.a(cVar, null, e.getMessage());
            }
        } else if (ani.a.contains(a)) {
            return null;
        } else {
            return ani.b.contains(a) ? Result.a(cVar, (String) null) : Result.a(cVar, a, b, obj);
        }
    }

    private static String a(Bundle bundle) {
        String string = bundle.getString(LogMessage.SEVERITY_ERROR);
        return string == null ? bundle.getString("error_type") : string;
    }

    private static String b(Bundle bundle) {
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(int i, int i2, Intent intent) {
        Result result;
        c cVar = this.b.e;
        if (intent == null) {
            result = Result.a(cVar, "Operation canceled");
        } else {
            String str = null;
            if (i2 == 0) {
                Bundle extras = intent.getExtras();
                String a = a(extras);
                String str2 = "error_code";
                if (extras.get(str2) != null) {
                    str = extras.get(str2).toString();
                }
                result = "CONNECTION_FAILURE".equals(str) ? Result.a(cVar, a, b(extras), str) : Result.a(cVar, a);
            } else {
                result = i2 != -1 ? Result.a(cVar, "Unexpected resultCode from authorization.", null) : a(cVar, intent);
            }
        }
        if (result != null) {
            this.b.a(result);
        } else {
            this.b.c();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.b.b.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean a(c cVar);
}
