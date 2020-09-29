package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoArtistCollectionState extends Message<ProtoArtistCollectionState, Builder> {
    public static final ProtoAdapter<ProtoArtistCollectionState> ADAPTER = new a();
    public static final String DEFAULT_COLLECTION_LINK = "";
    public static final Boolean DEFAULT_FOLLOWED = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_BANNED = Boolean.FALSE;
    public static final Integer DEFAULT_NUM_ALBUMS_IN_COLLECTION;
    public static final Integer DEFAULT_NUM_TRACKS_IN_COLLECTION;
    private static final long serialVersionUID = 0;
    public final String collection_link;
    public final Boolean followed;
    public final Boolean is_banned;
    public final Integer num_albums_in_collection;
    public final Integer num_tracks_in_collection;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoArtistCollectionState, Builder> {
        public String collection_link;
        public Boolean followed;
        public Boolean is_banned;
        public Integer num_albums_in_collection;
        public Integer num_tracks_in_collection;

        public final Builder collection_link(String str) {
            this.collection_link = str;
            return this;
        }

        public final Builder followed(Boolean bool) {
            this.followed = bool;
            return this;
        }

        public final Builder num_tracks_in_collection(Integer num) {
            this.num_tracks_in_collection = num;
            return this;
        }

        public final Builder num_albums_in_collection(Integer num) {
            this.num_albums_in_collection = num;
            return this;
        }

        public final Builder is_banned(Boolean bool) {
            this.is_banned = bool;
            return this;
        }

        public final ProtoArtistCollectionState build() {
            ProtoArtistCollectionState protoArtistCollectionState = new ProtoArtistCollectionState(this.collection_link, this.followed, this.num_tracks_in_collection, this.num_albums_in_collection, this.is_banned, super.buildUnknownFields());
            return protoArtistCollectionState;
        }
    }

    static final class a extends ProtoAdapter<ProtoArtistCollectionState> {
        public final /* synthetic */ int a(Object obj) {
            ProtoArtistCollectionState protoArtistCollectionState = (ProtoArtistCollectionState) obj;
            int i = 0;
            int a = (protoArtistCollectionState.collection_link != null ? ProtoAdapter.i.a(1, protoArtistCollectionState.collection_link) : 0) + (protoArtistCollectionState.followed != null ? ProtoAdapter.a.a(2, protoArtistCollectionState.followed) : 0) + (protoArtistCollectionState.num_tracks_in_collection != null ? ProtoAdapter.c.a(3, protoArtistCollectionState.num_tracks_in_collection) : 0) + (protoArtistCollectionState.num_albums_in_collection != null ? ProtoAdapter.c.a(4, protoArtistCollectionState.num_albums_in_collection) : 0);
            if (protoArtistCollectionState.is_banned != null) {
                i = ProtoAdapter.a.a(5, protoArtistCollectionState.is_banned);
            }
            return a + i + protoArtistCollectionState.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoArtistCollectionState protoArtistCollectionState = (ProtoArtistCollectionState) obj;
            if (protoArtistCollectionState.collection_link != null) {
                ProtoAdapter.i.a(vtb, 1, protoArtistCollectionState.collection_link);
            }
            if (protoArtistCollectionState.followed != null) {
                ProtoAdapter.a.a(vtb, 2, protoArtistCollectionState.followed);
            }
            if (protoArtistCollectionState.num_tracks_in_collection != null) {
                ProtoAdapter.c.a(vtb, 3, protoArtistCollectionState.num_tracks_in_collection);
            }
            if (protoArtistCollectionState.num_albums_in_collection != null) {
                ProtoAdapter.c.a(vtb, 4, protoArtistCollectionState.num_albums_in_collection);
            }
            if (protoArtistCollectionState.is_banned != null) {
                ProtoAdapter.a.a(vtb, 5, protoArtistCollectionState.is_banned);
            }
            vtb.a(protoArtistCollectionState.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoArtistCollectionState.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b == -1) {
                    vta.a(a);
                    return builder.build();
                } else if (b == 1) {
                    builder.collection_link((String) ProtoAdapter.i.a(vta));
                } else if (b == 2) {
                    builder.followed((Boolean) ProtoAdapter.a.a(vta));
                } else if (b == 3) {
                    builder.num_tracks_in_collection((Integer) ProtoAdapter.c.a(vta));
                } else if (b == 4) {
                    builder.num_albums_in_collection((Integer) ProtoAdapter.c.a(vta));
                } else if (b != 5) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.is_banned((Boolean) ProtoAdapter.a.a(vta));
                }
            }
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_NUM_TRACKS_IN_COLLECTION = valueOf;
        DEFAULT_NUM_ALBUMS_IN_COLLECTION = valueOf;
    }

    public ProtoArtistCollectionState(String str, Boolean bool, Integer num, Integer num2, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.collection_link = str;
        this.followed = bool;
        this.num_tracks_in_collection = num;
        this.num_albums_in_collection = num2;
        this.is_banned = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoArtistCollectionState)) {
            return false;
        }
        ProtoArtistCollectionState protoArtistCollectionState = (ProtoArtistCollectionState) obj;
        return a().equals(protoArtistCollectionState.a()) && vte.a((Object) this.collection_link, (Object) protoArtistCollectionState.collection_link) && vte.a((Object) this.followed, (Object) protoArtistCollectionState.followed) && vte.a((Object) this.num_tracks_in_collection, (Object) protoArtistCollectionState.num_tracks_in_collection) && vte.a((Object) this.num_albums_in_collection, (Object) protoArtistCollectionState.num_albums_in_collection) && vte.a((Object) this.is_banned, (Object) protoArtistCollectionState.is_banned);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.collection_link;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.followed;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Integer num = this.num_tracks_in_collection;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.num_albums_in_collection;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_banned;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.collection_link != null) {
            sb.append(", collection_link=");
            sb.append(this.collection_link);
        }
        if (this.followed != null) {
            sb.append(", followed=");
            sb.append(this.followed);
        }
        if (this.num_tracks_in_collection != null) {
            sb.append(", num_tracks_in_collection=");
            sb.append(this.num_tracks_in_collection);
        }
        if (this.num_albums_in_collection != null) {
            sb.append(", num_albums_in_collection=");
            sb.append(this.num_albums_in_collection);
        }
        if (this.is_banned != null) {
            sb.append(", is_banned=");
            sb.append(this.is_banned);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoArtistCollectionState{");
        replace.append('}');
        return replace.toString();
    }
}
