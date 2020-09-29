package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;

public class Credential extends bxf implements ReflectedParcelable {
    public static final Creator<Credential> CREATOR = new bls();
    public final String a;
    public final String b;
    public final String c;
    private final String d;
    private final Uri e;
    private final List<IdToken> f;
    private final String g;
    private final String h;

    public static class a {
        public final String a;
        public String b;
        public String c;

        public a(String str) {
            this.a = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if ("https".equalsIgnoreCase(r0.getScheme()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Credential(java.lang.String r5, java.lang.String r6, android.net.Uri r7, java.util.List<com.google.android.gms.auth.api.credentials.IdToken> r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "credential identifier cannot be null"
            java.lang.Object r5 = defpackage.bwx.a(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = "credential identifier cannot be empty"
            defpackage.bwx.a(r5, r0)
            if (r9 == 0) goto L_0x0025
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Password must not be empty if set"
            r5.<init>(r6)
            throw r5
        L_0x0025:
            if (r10 == 0) goto L_0x0077
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 0
            if (r0 != 0) goto L_0x006c
            android.net.Uri r0 = android.net.Uri.parse(r10)
            boolean r2 = r0.isAbsolute()
            if (r2 == 0) goto L_0x006c
            boolean r2 = r0.isHierarchical()
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = r0.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x006c
            java.lang.String r2 = r0.getAuthority()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0053
            goto L_0x006c
        L_0x0053:
            java.lang.String r2 = r0.getScheme()
            java.lang.String r3 = "http"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x006b
            java.lang.String r0 = r0.getScheme()
            java.lang.String r2 = "https"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x006c
        L_0x006b:
            r1 = 1
        L_0x006c:
            if (r1 == 0) goto L_0x006f
            goto L_0x0077
        L_0x006f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Account type must be a valid Http/Https URI"
            r5.<init>(r6)
            throw r5
        L_0x0077:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x008c
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0084
            goto L_0x008c
        L_0x0084:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Password and AccountType are mutually exclusive"
            r5.<init>(r6)
            throw r5
        L_0x008c:
            if (r6 == 0) goto L_0x0099
            java.lang.String r0 = r6.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0099
            r6 = 0
        L_0x0099:
            r4.d = r6
            r4.e = r7
            if (r8 != 0) goto L_0x00a4
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x00a8
        L_0x00a4:
            java.util.List r6 = java.util.Collections.unmodifiableList(r8)
        L_0x00a8:
            r4.f = r6
            r4.a = r5
            r4.b = r9
            r4.c = r10
            r4.g = r11
            r4.h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.Credential.<init>(java.lang.String, java.lang.String, android.net.Uri, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.a, credential.a) && TextUtils.equals(this.d, credential.d) && bwv.a(this.e, credential.e) && TextUtils.equals(this.b, credential.b) && TextUtils.equals(this.c, credential.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.d, this.e, this.b, this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, this.a, false);
        bxg.a(parcel, 2, this.d, false);
        bxg.a(parcel, 3, (Parcelable) this.e, i, false);
        bxg.b(parcel, 4, this.f, false);
        bxg.a(parcel, 5, this.b, false);
        bxg.a(parcel, 6, this.c, false);
        bxg.a(parcel, 9, this.g, false);
        bxg.a(parcel, 10, this.h, false);
        bxg.b(parcel, a2);
    }
}
