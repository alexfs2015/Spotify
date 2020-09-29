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

        private SerializationProxyV1(String str, String str2) {
            this.accessTokenString = str;
            this.appId = str2;
        }

        /* synthetic */ SerializationProxyV1(String str, String str2, byte b) {
            this(str, str2);
        }

        private Object readResolve() {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    public AccessTokenAppIdPair(aki aki) {
        this(aki.e, akq.k());
    }

    public AccessTokenAppIdPair(String str, String str2) {
        if (ank.a(str)) {
            str = null;
        }
        this.accessTokenString = str;
        this.applicationId = str2;
    }

    private Object writeReplace() {
        return new SerializationProxyV1(this.accessTokenString, this.applicationId, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        return ank.a(accessTokenAppIdPair.accessTokenString, this.accessTokenString) && ank.a(accessTokenAppIdPair.applicationId, this.applicationId);
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
}
