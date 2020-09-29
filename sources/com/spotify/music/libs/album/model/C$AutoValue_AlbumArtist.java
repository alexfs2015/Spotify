package com.spotify.music.libs.album.model;

/* renamed from: com.spotify.music.libs.album.model.$AutoValue_AlbumArtist reason: invalid class name */
abstract class C$AutoValue_AlbumArtist extends AlbumArtist {
    private final AlbumImage image;
    private final String name;
    private final String uri;

    C$AutoValue_AlbumArtist(AlbumImage albumImage, String str, String str2) {
        this.image = albumImage;
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.name = str2;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    public AlbumImage getImage() {
        return this.image;
    }

    public String getUri() {
        return this.uri;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlbumArtist{image=");
        sb.append(this.image);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", name=");
        sb.append(this.name);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlbumArtist) {
            AlbumArtist albumArtist = (AlbumArtist) obj;
            AlbumImage albumImage = this.image;
            if (albumImage != null ? albumImage.equals(albumArtist.getImage()) : albumArtist.getImage() == null) {
                return this.uri.equals(albumArtist.getUri()) && this.name.equals(albumArtist.getName());
            }
        }
    }

    public int hashCode() {
        AlbumImage albumImage = this.image;
        return (((((albumImage == null ? 0 : albumImage.hashCode()) ^ 1000003) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.name.hashCode();
    }
}
