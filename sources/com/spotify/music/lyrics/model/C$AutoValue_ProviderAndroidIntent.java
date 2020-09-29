package com.spotify.music.lyrics.model;

/* renamed from: com.spotify.music.lyrics.model.$AutoValue_ProviderAndroidIntent reason: invalid class name */
abstract class C$AutoValue_ProviderAndroidIntent extends ProviderAndroidIntent {
    private final String action;
    private final String contentType;
    private final String data;
    private final String providerAndroidPackage;

    C$AutoValue_ProviderAndroidIntent(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.providerAndroidPackage = str;
            this.action = str2;
            this.data = str3;
            this.contentType = str4;
            return;
        }
        throw new NullPointerException("Null providerAndroidPackage");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProviderAndroidIntent) {
            ProviderAndroidIntent providerAndroidIntent = (ProviderAndroidIntent) obj;
            if (this.providerAndroidPackage.equals(providerAndroidIntent.getProviderAndroidPackage())) {
                String str = this.action;
                if (str != null ? str.equals(providerAndroidIntent.getAction()) : providerAndroidIntent.getAction() == null) {
                    String str2 = this.data;
                    if (str2 != null ? str2.equals(providerAndroidIntent.getData()) : providerAndroidIntent.getData() == null) {
                        String str3 = this.contentType;
                        return str3 != null ? str3.equals(providerAndroidIntent.getContentType()) : providerAndroidIntent.getContentType() == null;
                    }
                }
            }
        }
    }

    public String getAction() {
        return this.action;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getData() {
        return this.data;
    }

    public String getProviderAndroidPackage() {
        return this.providerAndroidPackage;
    }

    public int hashCode() {
        int hashCode = (this.providerAndroidPackage.hashCode() ^ 1000003) * 1000003;
        String str = this.action;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.data;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.contentType;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProviderAndroidIntent{providerAndroidPackage=");
        sb.append(this.providerAndroidPackage);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append("}");
        return sb.toString();
    }
}
