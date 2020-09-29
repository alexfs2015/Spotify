package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends bxf implements bse, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new bmx();
    public static final Scope a = new Scope("profile");
    public static final Scope b = new Scope("openid");
    public static final Scope c = new Scope("https://www.googleapis.com/auth/games_lite");
    public static final Scope d = new Scope("https://www.googleapis.com/auth/games");
    public static final GoogleSignInOptions e;
    private static Comparator<Scope> p = new bmw();
    private final int f;
    /* access modifiers changed from: private */
    public final ArrayList<Scope> g;
    /* access modifiers changed from: private */
    public Account h;
    /* access modifiers changed from: private */
    public boolean i;
    /* access modifiers changed from: private */
    public final boolean j;
    /* access modifiers changed from: private */
    public final boolean k;
    /* access modifiers changed from: private */
    public String l;
    /* access modifiers changed from: private */
    public String m;
    /* access modifiers changed from: private */
    public ArrayList<blz> n;
    private Map<Integer, blz> o;

    public static final class a {
        Set<Scope> a = new HashSet();
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private Account f;
        private String g;
        private Map<Integer, blz> h = new HashMap();

        public a() {
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            bwx.a(googleSignInOptions);
            this.a = new HashSet(googleSignInOptions.g);
            this.b = googleSignInOptions.j;
            this.c = googleSignInOptions.k;
            this.d = googleSignInOptions.i;
            this.e = googleSignInOptions.l;
            this.f = googleSignInOptions.h;
            this.g = googleSignInOptions.m;
            this.h = GoogleSignInOptions.b((List<blz>) googleSignInOptions.n);
        }

        public final a a() {
            this.a.add(GoogleSignInOptions.b);
            return this;
        }

        public final a a(Scope scope, Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public final GoogleSignInOptions b() {
            if (this.a.contains(GoogleSignInOptions.d) && this.a.contains(GoogleSignInOptions.c)) {
                this.a.remove(GoogleSignInOptions.c);
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                a();
            }
            GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h);
            return googleSignInOptions;
        }
    }

    public static GoogleSignInOptions a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString = jSONObject.optString("accountName", null);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList<>(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), (Map<Integer, blz>) new HashMap<Integer,blz>());
        return googleSignInOptions;
    }

    public GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<blz> arrayList2) {
        this(i2, arrayList, account, z, z2, z3, str, str2, b((List<blz>) arrayList2));
    }

    private GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, blz> map) {
        this.f = i2;
        this.g = arrayList;
        this.h = account;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = str;
        this.m = str2;
        this.n = new ArrayList<>(map.values());
        this.o = map;
    }

    public final ArrayList<Scope> a() {
        return new ArrayList<>(this.g);
    }

    /* access modifiers changed from: private */
    public static Map<Integer, blz> b(List<blz> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (blz blz : list) {
            hashMap.put(Integer.valueOf(blz.a), blz);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r3.h.equals(r4.h) != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r3.l.equals(r4.l) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0076 }
            java.util.ArrayList<blz> r1 = r3.n     // Catch:{ ClassCastException -> 0x0076 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 > 0) goto L_0x0076
            java.util.ArrayList<blz> r1 = r4.n     // Catch:{ ClassCastException -> 0x0076 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 <= 0) goto L_0x0017
            goto L_0x0076
        L_0x0017:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.g     // Catch:{ ClassCastException -> 0x0076 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0076 }
            java.util.ArrayList r2 = r4.a()     // Catch:{ ClassCastException -> 0x0076 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 != r2) goto L_0x0076
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.g     // Catch:{ ClassCastException -> 0x0076 }
            java.util.ArrayList r2 = r4.a()     // Catch:{ ClassCastException -> 0x0076 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 != 0) goto L_0x0034
            goto L_0x0076
        L_0x0034:
            android.accounts.Account r1 = r3.h     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 != 0) goto L_0x003d
            android.accounts.Account r1 = r4.h     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 != 0) goto L_0x0076
            goto L_0x0047
        L_0x003d:
            android.accounts.Account r1 = r3.h     // Catch:{ ClassCastException -> 0x0076 }
            android.accounts.Account r2 = r4.h     // Catch:{ ClassCastException -> 0x0076 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 == 0) goto L_0x0076
        L_0x0047:
            java.lang.String r1 = r3.l     // Catch:{ ClassCastException -> 0x0076 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = r4.l     // Catch:{ ClassCastException -> 0x0076 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 == 0) goto L_0x0076
            goto L_0x0062
        L_0x0058:
            java.lang.String r1 = r3.l     // Catch:{ ClassCastException -> 0x0076 }
            java.lang.String r2 = r4.l     // Catch:{ ClassCastException -> 0x0076 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 == 0) goto L_0x0076
        L_0x0062:
            boolean r1 = r3.k     // Catch:{ ClassCastException -> 0x0076 }
            boolean r2 = r4.k     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 != r2) goto L_0x0076
            boolean r1 = r3.i     // Catch:{ ClassCastException -> 0x0076 }
            boolean r2 = r4.i     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 != r2) goto L_0x0076
            boolean r1 = r3.j     // Catch:{ ClassCastException -> 0x0076 }
            boolean r4 = r4.j     // Catch:{ ClassCastException -> 0x0076 }
            if (r1 != r4) goto L_0x0076
            r4 = 1
            return r4
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.g;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((Scope) obj).a);
        }
        Collections.sort(arrayList);
        return new bma().a((Object) arrayList).a((Object) this.h).a((Object) this.l).a(this.k).a(this.i).a(this.j).a;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.g, p);
            ArrayList arrayList = this.g;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                jSONArray.put(((Scope) obj).a);
            }
            jSONObject.put("scopes", jSONArray);
            if (this.h != null) {
                jSONObject.put("accountName", this.h.name);
            }
            jSONObject.put("idTokenRequested", this.i);
            jSONObject.put("forceCodeForRefreshToken", this.k);
            jSONObject.put("serverAuthRequested", this.j);
            if (!TextUtils.isEmpty(this.l)) {
                jSONObject.put("serverClientId", this.l);
            }
            if (!TextUtils.isEmpty(this.m)) {
                jSONObject.put("hostedDomain", this.m);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* synthetic */ GoogleSignInOptions(ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map) {
        this(3, arrayList, account, z, z2, z3, str, str2, map);
    }

    static {
        new Scope("email");
        a a2 = new a().a();
        a2.a.add(a);
        e = a2.b();
        new a().a(c, new Scope[0]).b();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.f);
        bxg.b(parcel, 2, a(), false);
        bxg.a(parcel, 3, (Parcelable) this.h, i2, false);
        bxg.a(parcel, 4, this.i);
        bxg.a(parcel, 5, this.j);
        bxg.a(parcel, 6, this.k);
        bxg.a(parcel, 7, this.l, false);
        bxg.a(parcel, 8, this.m, false);
        bxg.b(parcel, 9, this.n, false);
        bxg.b(parcel, a2);
    }
}
