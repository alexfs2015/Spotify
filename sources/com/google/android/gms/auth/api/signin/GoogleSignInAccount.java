package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends bxf implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new bmv();
    private static bzg b = bzj.d();
    public String a;
    private final int c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Uri h;
    private String i;
    private long j;
    private List<Scope> k;
    private String l;
    private String m;
    private Set<Scope> n = new HashSet();

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.optString("tokenId", null);
        String optString4 = jSONObject.optString("email", null);
        String optString5 = jSONObject.optString("displayName", null);
        String optString6 = jSONObject.optString("givenName", null);
        String optString7 = jSONObject.optString("familyName", null);
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            valueOf = Long.valueOf(b.a() / 1000);
        }
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, valueOf.longValue(), bwx.a(string), new ArrayList((Collection) bwx.a(hashSet)), optString6, optString7);
        googleSignInAccount.i = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = uri;
        this.i = str5;
        this.j = j2;
        this.a = str6;
        this.k = list;
        this.l = str7;
        this.m = str8;
    }

    public final Account a() {
        String str = this.f;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public final Set<Scope> b() {
        HashSet hashSet = new HashSet(this.k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    public int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + b().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.a.equals(this.a) && googleSignInAccount.b().equals(b());
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.d != null) {
                jSONObject.put("id", this.d);
            }
            if (this.e != null) {
                jSONObject.put("tokenId", this.e);
            }
            if (this.f != null) {
                jSONObject.put("email", this.f);
            }
            if (this.g != null) {
                jSONObject.put("displayName", this.g);
            }
            if (this.l != null) {
                jSONObject.put("givenName", this.l);
            }
            if (this.m != null) {
                jSONObject.put("familyName", this.m);
            }
            if (this.h != null) {
                jSONObject.put("photoUrl", this.h.toString());
            }
            if (this.i != null) {
                jSONObject.put("serverAuthCode", this.i);
            }
            jSONObject.put("expirationTime", this.j);
            jSONObject.put("obfuscatedIdentifier", this.a);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.k.toArray(new Scope[this.k.size()]);
            Arrays.sort(scopeArr, bmu.a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.a);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.c);
        bxg.a(parcel, 2, this.d, false);
        bxg.a(parcel, 3, this.e, false);
        bxg.a(parcel, 4, this.f, false);
        bxg.a(parcel, 5, this.g, false);
        bxg.a(parcel, 6, (Parcelable) this.h, i2, false);
        bxg.a(parcel, 7, this.i, false);
        bxg.a(parcel, 8, this.j);
        bxg.a(parcel, 9, this.a, false);
        bxg.b(parcel, 10, this.k, false);
        bxg.a(parcel, 11, this.l, false);
        bxg.a(parcel, 12, this.m, false);
        bxg.b(parcel, a2);
    }
}
