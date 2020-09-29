package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ana reason: default package */
public final class ana extends anq {
    public static final Creator<ana> CREATOR = new Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ana[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ana(parcel);
        }
    };
    private static final String[] c = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    private String d;
    private String e;

    /* access modifiers changed from: 0000 */
    public final String a() {
        return "custom_tab";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "chrome_custom_tab";
    }

    public final int describeContents() {
        return 0;
    }

    public ana(LoginClient loginClient) {
        super(loginClient);
        this.e = amw.a(20);
    }

    /* access modifiers changed from: 0000 */
    public final AccessTokenSource h_() {
        return AccessTokenSource.CHROME_CUSTOM_TAB;
    }

    private String e() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        ka p = this.b.b.p();
        List<ResolveInfo> queryIntentServices = p.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null) {
            HashSet hashSet = new HashSet(Arrays.asList(c));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    this.d = serviceInfo.packageName;
                    return this.d;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 1
            if (r7 == r0) goto L_0x0008
            boolean r7 = super.a(r7, r8, r9)
            return r7
        L_0x0008:
            com.facebook.login.LoginClient r7 = r6.b
            com.facebook.login.LoginClient$c r7 = r7.e
            r1 = -1
            r2 = 0
            if (r8 != r1) goto L_0x00c9
            java.lang.String r8 = com.facebook.CustomTabMainActivity.c
            java.lang.String r8 = r9.getStringExtra(r8)
            if (r8 == 0) goto L_0x00c8
            java.lang.String r9 = com.facebook.CustomTabMainActivity.a()
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x00c8
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r9 = r8.getQuery()
            android.os.Bundle r9 = defpackage.amw.d(r9)
            java.lang.String r8 = r8.getFragment()
            android.os.Bundle r8 = defpackage.amw.d(r8)
            r9.putAll(r8)
            boolean r8 = r6.a(r9)
            if (r8 != 0) goto L_0x004b
            com.facebook.FacebookException r8 = new com.facebook.FacebookException
            java.lang.String r9 = "Invalid state parameter"
            r8.<init>(r9)
            super.a(r7, r2, r8)
            goto L_0x00c8
        L_0x004b:
            java.lang.String r8 = "error"
            java.lang.String r8 = r9.getString(r8)
            if (r8 != 0) goto L_0x0059
            java.lang.String r8 = "error_type"
            java.lang.String r8 = r9.getString(r8)
        L_0x0059:
            java.lang.String r3 = "error_msg"
            java.lang.String r3 = r9.getString(r3)
            if (r3 != 0) goto L_0x0067
            java.lang.String r3 = "error_message"
            java.lang.String r3 = r9.getString(r3)
        L_0x0067:
            if (r3 != 0) goto L_0x006f
            java.lang.String r3 = "error_description"
            java.lang.String r3 = r9.getString(r3)
        L_0x006f:
            java.lang.String r4 = "error_code"
            java.lang.String r4 = r9.getString(r4)
            boolean r5 = defpackage.amw.a(r4)
            if (r5 != 0) goto L_0x0080
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0080 }
            goto L_0x0081
        L_0x0080:
            r4 = -1
        L_0x0081:
            boolean r5 = defpackage.amw.a(r8)
            if (r5 == 0) goto L_0x0093
            boolean r5 = defpackage.amw.a(r3)
            if (r5 == 0) goto L_0x0093
            if (r4 != r1) goto L_0x0093
            super.a(r7, r9, r2)
            goto L_0x00c8
        L_0x0093:
            if (r8 == 0) goto L_0x00ae
            java.lang.String r9 = "access_denied"
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x00a5
            java.lang.String r9 = "OAuthAccessDeniedException"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00ae
        L_0x00a5:
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            super.a(r7, r2, r8)
            goto L_0x00c8
        L_0x00ae:
            r9 = 4201(0x1069, float:5.887E-42)
            if (r4 != r9) goto L_0x00bb
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            super.a(r7, r2, r8)
            goto L_0x00c8
        L_0x00bb:
            com.facebook.FacebookRequestError r9 = new com.facebook.FacebookRequestError
            r9.<init>(r4, r8, r3)
            com.facebook.FacebookServiceException r8 = new com.facebook.FacebookServiceException
            r8.<init>(r9, r3)
            super.a(r7, r2, r8)
        L_0x00c8:
            return r0
        L_0x00c9:
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            super.a(r7, r2, r8)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ana.a(int, int, android.content.Intent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void a(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.e);
    }

    private boolean a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.e);
        } catch (JSONException unused) {
            return false;
        }
    }

    ana(Parcel parcel) {
        super(parcel);
        this.e = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(c cVar) {
        amg a = FetchedAppSettingsManager.a(amw.a((Context) this.b.b.p()));
        if (!((a != null && a.d) && e() != null && (amw.e((Context) this.b.b.p()) ^ true) && amx.c(akc.g()))) {
            return false;
        }
        Bundle a2 = a(b(cVar), cVar);
        Intent intent = new Intent(this.b.b.p(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.a, a2);
        intent.putExtra(CustomTabMainActivity.b, e());
        this.b.b.startActivityForResult(intent, 1);
        return true;
    }
}
