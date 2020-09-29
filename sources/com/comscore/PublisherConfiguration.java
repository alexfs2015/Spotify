package com.comscore;

public class PublisherConfiguration extends ClientConfiguration {

    public static class Builder extends com.comscore.ClientConfiguration.Builder<Builder, PublisherConfiguration> {
        protected String publisherSecret;

        public Builder() {
        }

        private Builder(Builder builder) {
            super(builder);
            this.publisherSecret = builder.publisherSecret;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Builder a() {
            return new Builder(this);
        }

        public PublisherConfiguration build() {
            return new PublisherConfiguration(this);
        }

        public Builder publisherId(String str) {
            setClientId(str);
            return this;
        }

        public Builder publisherSecret(String str) {
            this.publisherSecret = str;
            return this;
        }
    }

    PublisherConfiguration(long j) {
        this.a = j;
    }

    private PublisherConfiguration(Builder builder) {
        super(builder);
        try {
            this.a = newCppInstanceNative(builder);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private static native void destroyCppInstanceNative(long j);

    private static native String getPublisherIdNative(long j);

    private static native String getPublisherSecretNative(long j);

    private static native String getPublisherUniqueDeviceIdNative(long j);

    private static native long newCppInstanceNative(Builder builder);

    public void destroyCppObject() {
        destroyCppInstanceNative(this.a);
    }

    public String getPublisherId() {
        try {
            return getPublisherIdNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getPublisherSecret() {
        try {
            return getPublisherSecretNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getPublisherUniqueDeviceId() {
        try {
            return getPublisherUniqueDeviceIdNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }
}
