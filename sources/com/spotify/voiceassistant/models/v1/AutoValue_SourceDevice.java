package com.spotify.voiceassistant.models.v1;

final class AutoValue_SourceDevice extends SourceDevice {
    private static final long serialVersionUID = -1145293024970725176L;
    private final String brand;
    private final String device_id;
    private final String device_type;
    private final String model;

    static final class Builder extends com.spotify.voiceassistant.models.v1.SourceDevice.Builder {
        private String brand;
        private String device_id;
        private String device_type;
        private String model;

        Builder() {
        }

        public final com.spotify.voiceassistant.models.v1.SourceDevice.Builder brand(String str) {
            if (str != null) {
                this.brand = str;
                return this;
            }
            throw new NullPointerException("Null brand");
        }

        public final com.spotify.voiceassistant.models.v1.SourceDevice.Builder model(String str) {
            if (str != null) {
                this.model = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        public final com.spotify.voiceassistant.models.v1.SourceDevice.Builder device_type(String str) {
            if (str != null) {
                this.device_type = str;
                return this;
            }
            throw new NullPointerException("Null device_type");
        }

        public final com.spotify.voiceassistant.models.v1.SourceDevice.Builder device_id(String str) {
            if (str != null) {
                this.device_id = str;
                return this;
            }
            throw new NullPointerException("Null device_id");
        }

        public final SourceDevice build() {
            String str = "";
            if (this.brand == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" brand");
                str = sb.toString();
            }
            if (this.model == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" model");
                str = sb2.toString();
            }
            if (this.device_type == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" device_type");
                str = sb3.toString();
            }
            if (this.device_id == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" device_id");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                AutoValue_SourceDevice autoValue_SourceDevice = new AutoValue_SourceDevice(this.brand, this.model, this.device_type, this.device_id);
                return autoValue_SourceDevice;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    private AutoValue_SourceDevice(String str, String str2, String str3, String str4) {
        this.brand = str;
        this.model = str2;
        this.device_type = str3;
        this.device_id = str4;
    }

    @fiq(a = "brand")
    public final String brand() {
        return this.brand;
    }

    @fiq(a = "model")
    public final String model() {
        return this.model;
    }

    @fiq(a = "device_type")
    public final String device_type() {
        return this.device_type;
    }

    @fiq(a = "device_id")
    public final String device_id() {
        return this.device_id;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceDevice{brand=");
        sb.append(this.brand);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", device_type=");
        sb.append(this.device_type);
        sb.append(", device_id=");
        sb.append(this.device_id);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SourceDevice) {
            SourceDevice sourceDevice = (SourceDevice) obj;
            return this.brand.equals(sourceDevice.brand()) && this.model.equals(sourceDevice.model()) && this.device_type.equals(sourceDevice.device_type()) && this.device_id.equals(sourceDevice.device_id());
        }
    }

    public final int hashCode() {
        return ((((((this.brand.hashCode() ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.device_type.hashCode()) * 1000003) ^ this.device_id.hashCode();
    }
}
