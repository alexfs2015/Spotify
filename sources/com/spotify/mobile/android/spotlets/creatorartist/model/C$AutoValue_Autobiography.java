package com.spotify.mobile.android.spotlets.creatorartist.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.creatorartist.model.$AutoValue_Autobiography reason: invalid class name */
abstract class C$AutoValue_Autobiography extends Autobiography {
    private final String body;
    private final LinksModel links;
    private final List<String> urls;

    C$AutoValue_Autobiography(String str, List<String> list, LinksModel linksModel) {
        this.body = str;
        if (list != null) {
            this.urls = list;
            this.links = linksModel;
            return;
        }
        throw new NullPointerException("Null urls");
    }

    @JsonProperty("body")
    public String body() {
        return this.body;
    }

    @JsonProperty("urls")
    public List<String> urls() {
        return this.urls;
    }

    @JsonProperty("links")
    public LinksModel links() {
        return this.links;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Autobiography{body=");
        sb.append(this.body);
        sb.append(", urls=");
        sb.append(this.urls);
        sb.append(", links=");
        sb.append(this.links);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Autobiography) {
            Autobiography autobiography = (Autobiography) obj;
            String str = this.body;
            if (str != null ? str.equals(autobiography.body()) : autobiography.body() == null) {
                if (this.urls.equals(autobiography.urls())) {
                    LinksModel linksModel = this.links;
                    return linksModel != null ? linksModel.equals(autobiography.links()) : autobiography.links() == null;
                }
            }
        }
    }

    public int hashCode() {
        String str = this.body;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.urls.hashCode()) * 1000003;
        LinksModel linksModel = this.links;
        if (linksModel != null) {
            i = linksModel.hashCode();
        }
        return hashCode ^ i;
    }
}
