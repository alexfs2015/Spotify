package com.spotify.music.libs.album.model;

/* renamed from: com.spotify.music.libs.album.model.$AutoValue_AlbumRelease reason: invalid class name */
abstract class C$AutoValue_AlbumRelease extends AlbumRelease {
    private final AlbumImage cover;
    private final String name;
    private final String uri;
    private final int year;

    C$AutoValue_AlbumRelease(int i, AlbumImage albumImage, String str, String str2) {
        this.year = i;
        this.cover = albumImage;
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

    public int getYear() {
        return this.year;
    }

    /* access modifiers changed from: 0000 */
    public AlbumImage getCover() {
        return this.cover;
    }

    public String getUri() {
        return this.uri;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlbumRelease{year=");
        sb.append(this.year);
        sb.append(", cover=");
        sb.append(this.cover);
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
        if (obj instanceof AlbumRelease) {
            AlbumRelease albumRelease = (AlbumRelease) obj;
            if (this.year == albumRelease.getYear()) {
                AlbumImage albumImage = this.cover;
                if (albumImage != null ? albumImage.equals(albumRelease.getCover()) : albumRelease.getCover() == null) {
                    return this.uri.equals(albumRelease.getUri()) && this.name.equals(albumRelease.getName());
                }
            }
        }
    }

    public int hashCode() {
        int i = (this.year ^ 1000003) * 1000003;
        AlbumImage albumImage = this.cover;
        return ((((i ^ (albumImage == null ? 0 : albumImage.hashCode())) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.name.hashCode();
    }
}
