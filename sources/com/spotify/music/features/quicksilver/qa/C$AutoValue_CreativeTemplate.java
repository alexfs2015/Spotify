package com.spotify.music.features.quicksilver.qa;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.quicksilver.qa.$AutoValue_CreativeTemplate reason: invalid class name */
abstract class C$AutoValue_CreativeTemplate extends CreativeTemplate {
    private final int id;
    private final String name;
    private final String template;
    private final String type;
    private final String version;

    C$AutoValue_CreativeTemplate(int i, String str, String str2, String str3, String str4) {
        this.id = i;
        if (str != null) {
            this.template = str;
            if (str2 != null) {
                this.type = str2;
                if (str3 != null) {
                    this.version = str3;
                    if (str4 != null) {
                        this.name = str4;
                        return;
                    }
                    throw new NullPointerException("Null name");
                }
                throw new NullPointerException("Null version");
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null template");
    }

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    @JsonProperty("template")
    public String getTemplate() {
        return this.template;
    }

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonProperty("version")
    public String getVersion() {
        return this.version;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreativeTemplate{id=");
        sb.append(this.id);
        sb.append(", template=");
        sb.append(this.template);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", name=");
        sb.append(this.name);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreativeTemplate) {
            CreativeTemplate creativeTemplate = (CreativeTemplate) obj;
            return this.id == creativeTemplate.getId() && this.template.equals(creativeTemplate.getTemplate()) && this.type.equals(creativeTemplate.getType()) && this.version.equals(creativeTemplate.getVersion()) && this.name.equals(creativeTemplate.getName());
        }
    }

    public int hashCode() {
        return ((((((((this.id ^ 1000003) * 1000003) ^ this.template.hashCode()) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.version.hashCode()) * 1000003) ^ this.name.hashCode();
    }
}
