package com.spotify.mobile.android.spotlets.creatorartist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.creatorartist.model.$AutoValue_LinksModel reason: invalid class name */
abstract class C$AutoValue_LinksModel extends LinksModel {
    private final String facebookLink;
    private final String instagramLink;
    private final String twitterLink;
    private final String wikipediaLink;

    C$AutoValue_LinksModel(String str, String str2, String str3, String str4) {
        this.twitterLink = str;
        this.instagramLink = str2;
        this.wikipediaLink = str3;
        this.facebookLink = str4;
    }

    @JsonProperty("twitter")
    public String getTwitterLink() {
        return this.twitterLink;
    }

    @JsonProperty("instagram")
    public String getInstagramLink() {
        return this.instagramLink;
    }

    @JsonProperty("wikipedia")
    public String getWikipediaLink() {
        return this.wikipediaLink;
    }

    @JsonProperty("facebook")
    public String getFacebookLink() {
        return this.facebookLink;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LinksModel{twitterLink=");
        sb.append(this.twitterLink);
        sb.append(", instagramLink=");
        sb.append(this.instagramLink);
        sb.append(", wikipediaLink=");
        sb.append(this.wikipediaLink);
        sb.append(", facebookLink=");
        sb.append(this.facebookLink);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LinksModel) {
            LinksModel linksModel = (LinksModel) obj;
            String str = this.twitterLink;
            if (str != null ? str.equals(linksModel.getTwitterLink()) : linksModel.getTwitterLink() == null) {
                String str2 = this.instagramLink;
                if (str2 != null ? str2.equals(linksModel.getInstagramLink()) : linksModel.getInstagramLink() == null) {
                    String str3 = this.wikipediaLink;
                    if (str3 != null ? str3.equals(linksModel.getWikipediaLink()) : linksModel.getWikipediaLink() == null) {
                        String str4 = this.facebookLink;
                        return str4 != null ? str4.equals(linksModel.getFacebookLink()) : linksModel.getFacebookLink() == null;
                    }
                }
            }
        }
    }

    public int hashCode() {
        String str = this.twitterLink;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.instagramLink;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.wikipediaLink;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.facebookLink;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 ^ i;
    }
}
