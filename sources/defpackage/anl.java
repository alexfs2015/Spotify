package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: anl reason: default package */
public abstract class anl implements Parcelable {
    public Map<String, String> a;
    protected LoginClient b;

    public abstract String a();

    /* access modifiers changed from: 0000 */
    public void a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i, int i2, Intent intent) {
        return false;
    }

    public abstract boolean a(c cVar);

    /* access modifiers changed from: 0000 */
    public void b() {
    }

    public boolean d() {
        return false;
    }

    anl(LoginClient loginClient) {
        this.b = loginClient;
    }

    anl(Parcel parcel) {
        this.a = amw.a(parcel);
    }

    public final void a(LoginClient loginClient) {
        if (this.b == null) {
            this.b = loginClient;
            return;
        }
        throw new FacebookException("Can't set LoginClient if it is already set.");
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", a());
            a(jSONObject);
        } catch (JSONException e) {
            new StringBuilder("Error creating client state json: ").append(e.getMessage());
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: protected */
    public final void a(String str, Object obj) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, obj == null ? null : obj.toString());
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        String str2 = this.b.e.d;
        akw akw = new akw(this.b.b.p(), str2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", str2);
        akw.a("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    static aju a(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        Bundle bundle2 = bundle;
        Date a2 = amw.a(bundle2, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList stringArrayList = bundle2.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle2.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date a3 = amw.a(bundle2, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (amw.a(string)) {
            return null;
        }
        aju aju = new aju(string, str, bundle2.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, accessTokenSource, a2, new Date(), a3);
        return aju;
    }

    public static aju a(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        Bundle bundle2 = bundle;
        Date a2 = amw.a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date a3 = amw.a(bundle, "data_access_expiration_time", new Date(0));
        String string2 = bundle.getString("granted_scopes");
        String str2 = ",";
        Collection<String> arrayList = !amw.a(string2) ? new ArrayList<>(Arrays.asList(string2.split(str2))) : collection;
        String string3 = bundle.getString("denied_scopes");
        Collection arrayList2 = !amw.a(string3) ? new ArrayList(Arrays.asList(string3.split(str2))) : null;
        String string4 = bundle.getString("expired_scopes");
        Collection arrayList3 = !amw.a(string4) ? new ArrayList(Arrays.asList(string4.split(str2))) : null;
        if (amw.a(string)) {
            return null;
        }
        aju aju = new aju(string, str, c(bundle.getString("signed_request")), arrayList, arrayList2, arrayList3, accessTokenSource, a2, new Date(), a3);
        return aju;
    }

    private static String c(String str) {
        if (str == null || str.isEmpty()) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    public void writeToParcel(Parcel parcel, int i) {
        amw.a(parcel, this.a);
    }
}
