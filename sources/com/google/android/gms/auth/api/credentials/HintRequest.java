package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class HintRequest extends bxw implements ReflectedParcelable {
    public static final Creator<HintRequest> CREATOR = new bmm();
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
        this.b = (CredentialPickerConfig) bxo.a(credentialPickerConfig);
        this.c = z;
        this.d = z2;
        this.e = (String[]) bxo.a(strArr);
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

    private HintRequest(a aVar) {
        this(2, aVar.c, aVar.a, false, aVar.b, false, null, null);
    }

    public /* synthetic */ HintRequest(a aVar, byte b2) {
        this(aVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 1, (Parcelable) this.b, i, false);
        bxx.a(parcel, 2, this.c);
        bxx.a(parcel, 3, this.d);
        bxx.a(parcel, 4, this.e, false);
        bxx.a(parcel, 5, this.f);
        bxx.a(parcel, 6, this.g, false);
        bxx.a(parcel, 7, this.h, false);
        bxx.b(parcel, 1000, this.a);
        bxx.b(parcel, a2);
    }
}
