package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class HintRequest extends bxf implements ReflectedParcelable {
    public static final Creator<HintRequest> CREATOR = new blv();
    private final int a;
    private final CredentialPickerConfig b;
    private final boolean c;
    private final boolean d;
    private final String[] e;
    private final boolean f;
    private final String g;
    private final String h;

    public static final class a {
        public boolean a;
        public String[] b;
        public CredentialPickerConfig c = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.a().a();
        private boolean d = false;
    }

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.a = i;
        this.b = (CredentialPickerConfig) bwx.a(credentialPickerConfig);
        this.c = z;
        this.d = z2;
        this.e = (String[]) bwx.a(strArr);
        if (this.a < 2) {
            this.f = true;
            this.g = null;
            this.h = null;
            return;
        }
        this.f = z3;
        this.g = str;
        this.h = str2;
    }

    public /* synthetic */ HintRequest(a aVar, byte b2) {
        this(aVar);
    }

    private HintRequest(a aVar) {
        this(2, aVar.c, aVar.a, false, aVar.b, false, null, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, (Parcelable) this.b, i, false);
        bxg.a(parcel, 2, this.c);
        bxg.a(parcel, 3, this.d);
        bxg.a(parcel, 4, this.e, false);
        bxg.a(parcel, 5, this.f);
        bxg.a(parcel, 6, this.g, false);
        bxg.a(parcel, 7, this.h, false);
        bxg.b(parcel, 1000, this.a);
        bxg.b(parcel, a2);
    }
}
