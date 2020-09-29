package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoEpisodeCollectionState extends Message<ProtoEpisodeCollectionState, Builder> {
    public static final ProtoAdapter<ProtoEpisodeCollectionState> ADAPTER = new a();
    public static final Boolean DEFAULT_IS_IN_COLLECTION = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_IN_LISTEN_LATER = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_NEW = Boolean.FALSE;
    private static final long serialVersionUID = 0;
    public final Boolean is_in_collection;
    public final Boolean is_in_listen_later;
    public final Boolean is_new;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoEpisodeCollectionState, Builder> {
        public Boolean is_in_collection;
        public Boolean is_in_listen_later;
        public Boolean is_new;

        public final Builder is_in_collection(Boolean bool) {
            this.is_in_collection = bool;
            return this;
        }

        public final Builder is_new(Boolean bool) {
            this.is_new = bool;
            return this;
        }

        public final Builder is_in_listen_later(Boolean bool) {
            this.is_in_listen_later = bool;
            return this;
        }

        public final ProtoEpisodeCollectionState build() {
            return new ProtoEpisodeCollectionState(this.is_in_collection, this.is_new, this.is_in_listen_later, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoEpisodeCollectionState> {
        public final /* synthetic */ int a(Object obj) {
            ProtoEpisodeCollectionState protoEpisodeCollectionState = (ProtoEpisodeCollectionState) obj;
            int i = 0;
            int a = (protoEpisodeCollectionState.is_in_collection != null ? ProtoAdapter.a.a(1, protoEpisodeCollectionState.is_in_collection) : 0) + (protoEpisodeCollectionState.is_new != null ? ProtoAdapter.a.a(2, protoEpisodeCollectionState.is_new) : 0);
            if (protoEpisodeCollectionState.is_in_listen_later != null) {
                i = ProtoAdapter.a.a(3, protoEpisodeCollectionState.is_in_listen_later);
            }
            return a + i + protoEpisodeCollectionState.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoEpisodeCollectionState protoEpisodeCollectionState = (ProtoEpisodeCollectionState) obj;
            if (protoEpisodeCollectionState.is_in_collection != null) {
                ProtoAdapter.a.a(vtb, 1, protoEpisodeCollectionState.is_in_collection);
            }
            if (protoEpisodeCollectionState.is_new != null) {
                ProtoAdapter.a.a(vtb, 2, protoEpisodeCollectionState.is_new);
            }
            if (protoEpisodeCollectionState.is_in_listen_later != null) {
                ProtoAdapter.a.a(vtb, 3, protoEpisodeCollectionState.is_in_listen_later);
            }
            vtb.a(protoEpisodeCollectionState.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoEpisodeCollectionState.class);
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
                    builder.is_in_collection((Boolean) ProtoAdapter.a.a(vta));
                } else if (b == 2) {
                    builder.is_new((Boolean) ProtoAdapter.a.a(vta));
                } else if (b != 3) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.is_in_listen_later((Boolean) ProtoAdapter.a.a(vta));
                }
            }
        }
    }

    public ProtoEpisodeCollectionState(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_in_collection = bool;
        this.is_new = bool2;
        this.is_in_listen_later = bool3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoEpisodeCollectionState)) {
            return false;
        }
        ProtoEpisodeCollectionState protoEpisodeCollectionState = (ProtoEpisodeCollectionState) obj;
        return a().equals(protoEpisodeCollectionState.a()) && vte.a((Object) this.is_in_collection, (Object) protoEpisodeCollectionState.is_in_collection) && vte.a((Object) this.is_new, (Object) protoEpisodeCollectionState.is_new) && vte.a((Object) this.is_in_listen_later, (Object) protoEpisodeCollectionState.is_in_listen_later);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        Boolean bool = this.is_in_collection;
        int i2 = 0;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_new;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_in_listen_later;
        if (bool3 != null) {
            i2 = bool3.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.is_in_collection != null) {
            sb.append(", is_in_collection=");
            sb.append(this.is_in_collection);
        }
        if (this.is_new != null) {
            sb.append(", is_new=");
            sb.append(this.is_new);
        }
        if (this.is_in_listen_later != null) {
            sb.append(", is_in_listen_later=");
            sb.append(this.is_in_listen_later);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoEpisodeCollectionState{");
        replace.append('}');
        return replace.toString();
    }
}
