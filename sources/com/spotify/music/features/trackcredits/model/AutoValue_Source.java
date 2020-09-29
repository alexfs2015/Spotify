package com.spotify.music.features.trackcredits.model;

final class AutoValue_Source extends Source {
    private final String label;
    private final String value;

    AutoValue_Source(String str, String str2) {
        if (str != null) {
            this.label = str;
            if (str2 != null) {
                this.value = str2;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null label");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Source) {
            Source source = (Source) obj;
            return this.label.equals(source.label()) && this.value.equals(source.value());
        }
    }

    public final int hashCode() {
        return ((this.label.hashCode() ^ 1000003) * 1000003) ^ this.value.hashCode();
    }

    public final String label() {
        return this.label;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Source{label=");
        sb.append(this.label);
        sb.append(", value=");
        sb.append(this.value);
        sb.append("}");
        return sb.toString();
    }

    public final String value() {
        return this.value;
    }
}
