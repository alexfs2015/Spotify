package com.spotify.music.libs.search.offline.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.Serializable;

public abstract class OfflineSearchEntity implements JacksonModel, Serializable {
    private static final long serialVersionUID = 633744792828390787L;
    public final String image;
    public final String name;
    public final String uri;

    public OfflineSearchEntity(String str, String str2, String str3) {
        this.name = str;
        this.uri = str2;
        this.image = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineSearchEntity)) {
            return false;
        }
        OfflineSearchEntity offlineSearchEntity = (OfflineSearchEntity) obj;
        if (!this.name.equals(offlineSearchEntity.name) || !this.uri.equals(offlineSearchEntity.uri)) {
            return false;
        }
        String str = this.image;
        String str2 = offlineSearchEntity.image;
        return str == null ? str2 == null : str.equals(str2);
    }

    public String getImageUri() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.uri.hashCode()) * 31;
        String str = this.image;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
