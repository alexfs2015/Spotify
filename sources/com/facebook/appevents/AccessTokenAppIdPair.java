package com.facebook.appevents;

import java.io.Serializable;

public class AccessTokenAppIdPair implements Serializable {
    private static final long serialVersionUID = 1;
    public final String accessTokenString;
    public final String applicationId;

    public static class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        private final String accessTokenString;
        private final String appId;

        /* synthetic */ SerializationProxyV1(String str, String str2, byte b) {
            this(str, str2);
        }

        private SerializationProxyV1(String str, String str2) {
            this.accessTokenString = str;
            this.appId = str2;
        }

        private Object readResolve() {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    public AccessTokenAppIdPair(String str, String str2) {
        if (amw.a(str)) {
            str = null;
        }
        this.accessTokenString = str;
        this.applicationId = str2;
    }

    public int hashCode() {
        String str = this.accessTokenString;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.applicationId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        if (!amw.a(accessTokenAppIdPair.accessTokenString, this.accessTokenString) || !amw.a(accessTokenAppIdPair.applicationId, this.applicationId)) {
            return false;
        }
        return true;
    }

    private Object writeReplace() {
        return new SerializationProxyV1(this.accessTokenString, this.applicationId, 0);
    }

    public AccessTokenAppIdPair(aju aju) {
        this(aju.e, akc.k());
    }
}
