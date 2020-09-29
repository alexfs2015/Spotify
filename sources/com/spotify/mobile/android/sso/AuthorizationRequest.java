package com.spotify.mobile.android.sso;

import java.util.Arrays;
import java.util.List;

public abstract class AuthorizationRequest {

    public enum ResponseType {
        TOKEN,
        CODE,
        NONE
    }

    public abstract String b();

    public abstract String c();

    public abstract List<String> d();

    public abstract ResponseType e();

    public abstract ClientIdentity f();

    public abstract String g();

    public abstract boolean h();

    public static AuthorizationRequest a(String str, ResponseType responseType, String str2, ClientIdentity clientIdentity, String str3, String[] strArr, boolean z) {
        if (strArr == null) {
            strArr = new String[0];
        }
        jec jec = new jec(str2, str, Arrays.asList(strArr), responseType, clientIdentity, str3, z);
        return jec;
    }

    public final String[] a() {
        return (String[]) d().toArray(new String[0]);
    }
}
