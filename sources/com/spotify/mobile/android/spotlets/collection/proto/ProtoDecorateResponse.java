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
        public List<ProtoDecorateAlbumItem> album = vte.a();
        public List<ProtoDecorateArtistItem> artist = vte.a();
        public List<ProtoDecorateTrackItem> track = vte.a();

        public final Builder album(List<ProtoDecorateAlbumItem> list) {
            vte.a(list);
            this.album = list;
            return this;
        }

        public final Builder artist(List<ProtoDecorateArtistItem> list) {
            vte.a(list);
            this.artist = list;
            return this;
        }

        public final Builder track(List<ProtoDecorateTrackItem> list) {
            vte.a(list);
            this.track = list;
            return this;
        }

        public final ProtoDecorateResponse build() {
            return new ProtoDecorateResponse(this.album, this.artist, this.track, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoDecorateResponse> {
        public final /* synthetic */ int a(Object obj) {
            ProtoDecorateResponse protoDecorateResponse = (ProtoDecorateResponse) obj;
            return ProtoDecorateAlbumItem.ADAPTER.a().a(3, protoDecorateResponse.album) + ProtoDecorateArtistItem.ADAPTER.a().a(4, protoDecorateResponse.artist) + ProtoDecorateTrackItem.ADAPTER.a().a(5, protoDecorateResponse.track) + protoDecorateResponse.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoDecorateResponse protoDecorateResponse = (ProtoDecorateResponse) obj;
            ProtoDecorateAlbumItem.ADAPTER.a().a(vtb, 3, protoDecorateResponse.album);
            ProtoDecorateArtistItem.ADAPTER.a().a(vtb, 4, protoDecorateResponse.artist);
            ProtoDecorateTrackItem.ADAPTER.a().a(vtb, 5, protoDecorateResponse.track);
            vtb.a(protoDecorateResponse.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoDecorateResponse.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b == -1) {
                    vta.a(a);
                    return builder.build();
                } else if (b == 3) {
                    builder.album.add(ProtoDecorateAlbumItem.ADAPTER.a(vta));
                } else if (b == 4) {
                    builder.artist.add(ProtoDecorateArtistItem.ADAPTER.a(vta));
                } else if (b != 5) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.track.add(ProtoDecorateTrackItem.ADAPTER.a(vta));
                }
            }
        }
    }

    public ProtoDecorateResponse(List<ProtoDecorateAlbumItem> list, List<ProtoDecorateArtistItem> list2, List<ProtoDecorateTrackItem> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.album = vte.a("album", list);
        this.artist = vte.a("artist", list2);
        this.track = vte.a(TrackData.TYPE_TRACK, list3);
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
        if (i != 0) {
            return i;
        }
        int hashCode = (((((a().hashCode() * 37) + this.album.hashCode()) * 37) + this.artist.hashCode()) * 37) + this.track.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.album.isEmpty()) {
            sb.append(", album=");
            sb.append(this.album);
        }
        if (!this.artist.isEmpty()) {
            sb.append(", artist=");
            sb.append(this.artist);
        }
        if (!this.track.isEmpty()) {
            sb.append(", track=");
            sb.append(this.track);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoDecorateResponse{");
        replace.append('}');
        return replace.toString();
    }
}
