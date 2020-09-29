package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;

/* renamed from: blm reason: default package */
public final class blm extends bxf {
    public static final Creator<blm> CREATOR = new blu();
    private final int a;
    private final boolean b;
    private final String[] c;
    private final CredentialPickerConfig d;
    private final CredentialPickerConfig e;
    private final boolean f;
    private final String g;
    private final String h;
    private final boolean i;

    /* renamed from: blm$a */
    public static final class a {
        public boolean a;
        public String[] b;
        private boolean c = false;
        private boolean d = false;
        private String e = null;
    }

    blm(int i2, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.a = i2;
        this.b = z;
        this.c = (String[]) bwx.a(strArr);
        if (credentialPickerConfig == null) {
            credentialPickerConfig = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.a().a();
        }
        this.d = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            credentialPickerConfig2 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.a().a();
        }
        this.e = credentialPickerConfig2;
        if (i2 < 3) {
            this.f = true;
            this.g = null;
            this.h = null;
        } else {
            this.f = z2;
            this.g = str;
            this.h = str2;
        }
        this.i = z3;
    }

    public /* synthetic */ blm(a aVar, byte b2) {
        this(aVar);
    }

    private blm(a aVar) {
        this(4, aVar.a, aVar.b, null, null, false, null, null, false);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, this.b);
        bxg.a(parcel, 2, this.c, false);
        bxg.a(parcel, 3, (Parcelable) this.d, i2, false);
        bxg.a(parcel, 4, (Parcelable) this.e, i2, false);
        bxg.a(parcel, 5, this.f);
        bxg.a(parcel, 6, this.g, false);
        bxg.a(parcel, 7, this.h, false);
        bxg.b(parcel, 1000, this.a);
        bxg.a(parcel, 8, this.i);
        bxg.b(parcel, a2);
    }
}
