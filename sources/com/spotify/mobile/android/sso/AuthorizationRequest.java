package com.spotify.mobile.android.sso;

import java.util.Arrays;
import java.util.List;

public abstract class AuthorizationRequest {

    public enum ResponseType {
        TOKEN,
        CODE,
        NONE
    }

    public static AuthorizationRequest a(String str, ResponseType responseType, String str2, ClientIdentity clientIdentity, String str3, String[] strArr, boolean z) {
        if (strArr == null) {
            strArr = new String[0];
        }
        String str4 = str2;
        ResponseType responseType2 = responseType;
        ClientIdentity clientIdentity2 = clientIdentity;
        String str5 = str3;
        boolean z2 = z;
        jgr jgr = new jgr(str2, str, Arrays.asList(strArr), responseType, clientIdentity, str3, z);
        return jgr;
    }

    public final String[] a() {
        return (String[]) d().toArray(new String[0]);
    }

    public abstract String b();

    public abstract String c();

    public abstract List<String> d();

    public abstract ResponseType e();

    public abstract ClientIdentity f();

    public abstract String g();

    public abstract boolean h();
}
