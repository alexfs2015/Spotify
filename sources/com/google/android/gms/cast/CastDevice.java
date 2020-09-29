package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CastDevice extends bxw implements ReflectedParcelable {
    public static final Creator<CastDevice> CREATOR = new bsk();
    public String a;
    public InetAddress b;
    public String c;
    public String d;
    private String e;
    private String f;
    private int g;
    private List<bwu> h;
    private int i;
    private int j;
    private String k;
    private String l;
    private int m;
    private String n;
    private byte[] o;
    private String p;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i2, List<bwu> list, int i3, int i4, String str6, String str7, int i5, String str8, byte[] bArr, String str9) {
        this.a = a(str);
        this.e = a(str2);
        if (!TextUtils.isEmpty(this.e)) {
            try {
                this.b = InetAddress.getByName(this.e);
            } catch (UnknownHostException e2) {
                String str10 = this.e;
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(str10).length() + 48 + String.valueOf(message).length());
                sb.append("Unable to convert host address (");
                sb.append(str10);
                sb.append(") to ipaddress: ");
                sb.append(message);
            }
        }
        this.c = a(str3);
        this.d = a(str4);
        this.f = a(str5);
        this.g = i2;
        this.h = list != null ? list : new ArrayList<>();
        this.i = i3;
        this.j = i4;
        this.k = a(str6);
        this.l = str7;
        this.m = i5;
        this.n = str8;
        this.o = bArr;
        this.p = str9;
    }

    public static CastDevice a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    public final String a() {
        return this.a.startsWith("__cast_nearby__") ? this.a.substring(16) : this.a;
    }

    public final boolean a(int i2) {
        return (this.i & i2) == i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.a;
        return str == null ? castDevice.a == null : eic.a(str, castDevice.a) && eic.a(this.b, castDevice.b) && eic.a(this.d, castDevice.d) && eic.a(this.c, castDevice.c) && eic.a(this.f, castDevice.f) && this.g == castDevice.g && eic.a(this.h, castDevice.h) && this.i == castDevice.i && this.j == castDevice.j && eic.a(this.k, castDevice.k) && eic.a(Integer.valueOf(this.m), Integer.valueOf(castDevice.m)) && eic.a(this.n, castDevice.n) && eic.a(this.l, castDevice.l) && eic.a(this.f, castDevice.f) && this.g == castDevice.g && ((this.o == null && castDevice.o == null) || Arrays.equals(this.o, castDevice.o)) && eic.a(this.p, castDevice.p);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.c, this.a});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, this.e, false);
        bxx.a(parcel, 4, this.c, false);
        bxx.a(parcel, 5, this.d, false);
        bxx.a(parcel, 6, this.f, false);
        bxx.b(parcel, 7, this.g);
        bxx.b(parcel, 8, Collections.unmodifiableList(this.h), false);
        bxx.b(parcel, 9, this.i);
        bxx.b(parcel, 10, this.j);
        bxx.a(parcel, 11, this.k, false);
        bxx.a(parcel, 12, this.l, false);
        bxx.b(parcel, 13, this.m);
        bxx.a(parcel, 14, this.n, false);
        bxx.a(parcel, 15, this.o, false);
        bxx.a(parcel, 16, this.p, false);
        bxx.b(parcel, a2);
    }
}
