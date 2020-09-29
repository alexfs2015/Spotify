package com.spotify.music.libs.album.model;

import java.util.List;

/* renamed from: com.spotify.music.libs.album.model.$AutoValue_Album reason: invalid class name */
abstract class C$AutoValue_Album extends Album {
    private final List<AlbumArtist> artists;
    private final List<String> copyrights;
    private final AlbumImage cover;
    private final int day;
    private final List<AlbumDisc> discs;
    private final int month;
    private final String name;
    private final AlbumRelated related;
    private final int trackCount;
    private final List<AlbumTrack> tracks;
    private final AlbumType type;
    private final String uri;
    private final int year;

    C$AutoValue_Album(int i, int i2, int i3, int i4, AlbumType albumType, String str, String str2, AlbumImage albumImage, AlbumRelated albumRelated, List<String> list, List<AlbumDisc> list2, List<AlbumArtist> list3, List<AlbumTrack> list4) {
        this.day = i;
        this.month = i2;
        this.year = i3;
        this.trackCount = i4;
        if (albumType != null) {
            this.type = albumType;
            if (str != null) {
                this.name = str;
                if (str2 != null) {
                    this.uri = str2;
                    this.cover = albumImage;
                    this.related = albumRelated;
                    if (list != null) {
                        this.copyrights = list;
                        if (list2 != null) {
                            this.discs = list2;
                            if (list3 != null) {
                                this.artists = list3;
                                if (list4 != null) {
                                    this.tracks = list4;
                                    return;
                                }
                                throw new NullPointerException("Null tracks");
                            }
                            throw new NullPointerException("Null artists");
                        }
                        throw new NullPointerException("Null discs");
                    }
                    throw new NullPointerException("Null copyrights");
                }
                throw new NullPointerException("Null uri");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null type");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Album) {
            Album album = (Album) obj;
            if (this.day == album.getDay() && this.month == album.getMonth() && this.year == album.getYear() && this.trackCount == album.getTrackCount() && this.type.equals(album.getType()) && this.name.equals(album.getName()) && this.uri.equals(album.getUri())) {
                AlbumImage albumImage = this.cover;
                if (albumImage != null ? albumImage.equals(album.getCover()) : album.getCover() == null) {
                    AlbumRelated albumRelated = this.related;
                    if (albumRelated != null ? albumRelated.equals(album.getRelated()) : album.getRelated() == null) {
                        return this.copyrights.equals(album.getCopyrights()) && this.discs.equals(album.getDiscs()) && this.artists.equals(album.getArtists()) && this.tracks.equals(album.getTracks());
                    }
                }
            }
        }
    }

    public List<AlbumArtist> getArtists() {
        return this.artists;
    }

    public List<String> getCopyrights() {
        return this.copyrights;
    }

    /* access modifiers changed from: 0000 */
    public AlbumImage getCover() {
        return this.cover;
    }

    public int getDay() {
        return this.day;
    }

    /* access modifiers changed from: 0000 */
    public List<AlbumDisc> getDiscs() {
        return this.discs;
    }

    public int getMonth() {
        return this.month;
    }

    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: 0000 */
    public AlbumRelated getRelated() {
        return this.related;
    }

    public int getTrackCount() {
        return this.trackCount;
    }

    public List<AlbumTrack> getTracks() {
        return this.tracks;
    }

    public AlbumType getType() {
        return this.type;
    }

    public String getUri() {
        return this.uri;
    }

    public int getYear() {
        return this.year;
    }

    public int hashCode() {
        int hashCode = (((((((((((((this.day ^ 1000003) * 1000003) ^ this.month) * 1000003) ^ this.year) * 1000003) ^ this.trackCount) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.uri.hashCode()) * 1000003;
        AlbumImage albumImage = this.cover;
        int i = 0;
        int hashCode2 = (hashCode ^ (albumImage == null ? 0 : albumImage.hashCode())) * 1000003;
        AlbumRelated albumRelated = this.related;
        if (albumRelated != null) {
            i = albumRelated.hashCode();
        }
        return ((((((((hashCode2 ^ i) * 1000003) ^ this.copyrights.hashCode()) * 1000003) ^ this.discs.hashCode()) * 1000003) ^ this.artists.hashCode()) * 1000003) ^ this.tracks.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Album{day=");
        sb.append(this.day);
        sb.append(", month=");
        sb.append(this.month);
        sb.append(", year=");
        sb.append(this.year);
        sb.append(", trackCount=");
        sb.append(this.trackCount);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", related=");
        sb.append(this.related);
        sb.append(", copyrights=");
        sb.append(this.copyrights);
        sb.append(", discs=");
        sb.append(this.discs);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", tracks=");
        sb.append(this.tracks);
        sb.append("}");
        return sb.toString();
    }
}
