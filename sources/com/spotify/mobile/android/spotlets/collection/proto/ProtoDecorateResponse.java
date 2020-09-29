package com.spotify.mobile.android.spotlets.collection.proto;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoDecorateResponse extends Message<ProtoDecorateResponse, Builder> {
    public static final ProtoAdapter<ProtoDecorateResponse> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final List<ProtoDecorateAlbumItem> album;
    public final List<ProtoDecorateArtistItem> artist;
    public final List<ProtoDecorateTrackItem> track;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoDecorateResponse, Builder> {
        public List<ProtoDecorateAlbumItem> album = whk.a();
        public List<ProtoDecorateArtistItem> artist = whk.a();
        public List<ProtoDecorateTrackItem> track = whk.a();

        public final Builder album(List<ProtoDecorateAlbumItem> list) {
            whk.a(list);
            this.album = list;
            return this;
        }

        public final Builder artist(List<ProtoDecorateArtistItem> list) {
            whk.a(list);
            this.artist = list;
            return this;
        }

        public final ProtoDecorateResponse build() {
            return new ProtoDecorateResponse(this.album, this.artist, this.track, super.buildUnknownFields());
        }

        public final Builder track(List<ProtoDecorateTrackItem> list) {
            whk.a(list);
            this.track = list;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoDecorateResponse> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoDecorateResponse.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoDecorateResponse protoDecorateResponse = (ProtoDecorateResponse) obj;
            return ProtoDecorateAlbumItem.ADAPTER.a().a(3, protoDecorateResponse.album) + ProtoDecorateArtistItem.ADAPTER.a().a(4, protoDecorateResponse.artist) + ProtoDecorateTrackItem.ADAPTER.a().a(5, protoDecorateResponse.track) + protoDecorateResponse.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b == -1) {
                    whg.a(a);
                    return builder.build();
                } else if (b == 3) {
                    builder.album.add(ProtoDecorateAlbumItem.ADAPTER.a(whg));
                } else if (b == 4) {
                    builder.artist.add(ProtoDecorateArtistItem.ADAPTER.a(whg));
                } else if (b != 5) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.track.add(ProtoDecorateTrackItem.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoDecorateResponse protoDecorateResponse = (ProtoDecorateResponse) obj;
            ProtoDecorateAlbumItem.ADAPTER.a().a(whh, 3, protoDecorateResponse.album);
            int i = 1 << 4;
            ProtoDecorateArtistItem.ADAPTER.a().a(whh, 4, protoDecorateResponse.artist);
            ProtoDecorateTrackItem.ADAPTER.a().a(whh, 5, protoDecorateResponse.track);
            whh.a(protoDecorateResponse.a());
        }
    }

    public ProtoDecorateResponse(List<ProtoDecorateAlbumItem> list, List<ProtoDecorateArtistItem> list2, List<ProtoDecorateTrackItem> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.album = whk.a("album", list);
        this.artist = whk.a("artist", list2);
        this.track = whk.a(TrackData.TYPE_TRACK, list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoDecorateResponse)) {
            return false;
        }
        ProtoDecorateResponse protoDecorateResponse = (ProtoDecorateResponse) obj;
        return a().equals(protoDecorateResponse.a()) && this.album.equals(protoDecorateResponse.album) && this.artist.equals(protoDecorateResponse.artist) && this.track.equals(protoDecorateResponse.track);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            i = (((((a().hashCode() * 37) + this.album.hashCode()) * 37) + this.artist.hashCode()) * 37) + this.track.hashCode();
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.album.isEmpty()) {
            String str = "l sbu=,a";
            sb.append(", album=");
            sb.append(this.album);
        }
        if (!this.artist.isEmpty()) {
            String str2 = "tsrm a=t,";
            sb.append(", artist=");
            sb.append(this.artist);
        }
        if (!this.track.isEmpty()) {
            String str3 = "=rcaok ,";
            sb.append(", track=");
            sb.append(this.track);
        }
        String str4 = "ePerpbsonoDatroR{sctee";
        StringBuilder replace = sb.replace(0, 2, "ProtoDecorateResponse{");
        replace.append('}');
        return replace.toString();
    }
}
