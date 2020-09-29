package com.comscore;

public class PartnerConfiguration extends ClientConfiguration {

    public static class Builder extends com.comscore.ClientConfiguration.Builder<Builder, PartnerConfiguration> {
        protected String externalClientId;

        public Builder() {
        }

        private Builder(Builder builder) {
            super(builder);
            this.externalClientId = builder.externalClientId;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Builder a() {
            return new Builder(this);
        }

        public PartnerConfiguration build() {
            return new PartnerConfiguration(this);
        }

        public Builder externalClientId(String str) {
            this.externalClientId = str;
            return this;
        }

        public Builder partnerId(String str) {
            setClientId(str);
            return this;
        }
    }

    PartnerConfiguration(long j) {
        this.a = j;
    }

    private PartnerConfiguration(Builder builder) {
        super(builder);
        try {
            this.a = newCppInstanceNative(builder);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private static native void destroyCppInstanceNative(long j);

    private static native String getExternalClientIdNative(long j);

    private static native String getPartnerIdNative(long j);

    private static native long newCppInstanceNative(Builder builder);

    public void destroyCppObject() {
        destroyCppInstanceNative(this.a);
    }

    public String getExternalClientId() {
        try {
            return getExternalClientIdNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getPartnerId() {
        try {
            return getPartnerIdNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }
}
