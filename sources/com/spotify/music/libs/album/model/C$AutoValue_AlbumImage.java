package com.spotify.music.libs.album.model;

/* renamed from: com.spotify.music.libs.album.model.$AutoValue_AlbumImage reason: invalid class name */
abstract class C$AutoValue_AlbumImage extends AlbumImage {
    private final String uri;

    C$AutoValue_AlbumImage(String str) {
        if (str != null) {
            this.uri = str;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlbumImage)) {
            return false;
        }
        return this.uri.equals(((AlbumImage) obj).getUri());
    }

    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlbumImage{uri=");
        sb.append(this.uri);
        sb.append("}");
        return sb.toString();
    }
}
