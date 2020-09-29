package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoTrackCollectionState extends Message<ProtoTrackCollectionState, Builder> {
    public static final ProtoAdapter<ProtoTrackCollectionState> ADAPTER = new a();
    public static final Boolean DEFAULT_CAN_ADD_TO_COLLECTION = Boolean.FALSE;
    public static final Boolean DEFAULT_CAN_BAN = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_BANNED = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_IN_COLLECTION = Boolean.FALSE;
    private static final long serialVersionUID = 0;
    public final Boolean can_add_to_collection;
    public final Boolean can_ban;
    public final Boolean is_banned;
    public final Boolean is_in_collection;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoTrackCollectionState, Builder> {
        public Boolean can_add_to_collection;
        public Boolean can_ban;
        public Boolean is_banned;
        public Boolean is_in_collection;

        public final ProtoTrackCollectionState build() {
            ProtoTrackCollectionState protoTrackCollectionState = r0;
            ProtoTrackCollectionState protoTrackCollectionState2 = new ProtoTrackCollectionState(this.is_in_collection, this.can_add_to_collection, this.is_banned, this.can_ban, super.buildUnknownFields());
            return protoTrackCollectionState2;
        }

        public final Builder can_add_to_collection(Boolean bool) {
            this.can_add_to_collection = bool;
            return this;
        }

        public final Builder can_ban(Boolean bool) {
            this.can_ban = bool;
            return this;
        }

        public final Builder is_banned(Boolean bool) {
            this.is_banned = bool;
            return this;
        }

        public final Builder is_in_collection(Boolean bool) {
            this.is_in_collection = bool;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoTrackCollectionState> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoTrackCollectionState.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoTrackCollectionState protoTrackCollectionState = (ProtoTrackCollectionState) obj;
            int i = 0;
            int a = (protoTrackCollectionState.is_in_collection != null ? ProtoAdapter.a.a(1, protoTrackCollectionState.is_in_collection) : 0) + (protoTrackCollectionState.can_add_to_collection != null ? ProtoAdapter.a.a(2, protoTrackCollectionState.can_add_to_collection) : 0) + (protoTrackCollectionState.is_banned != null ? ProtoAdapter.a.a(3, protoTrackCollectionState.is_banned) : 0);
            if (protoTrackCollectionState.can_ban != null) {
                i = ProtoAdapter.a.a(4, protoTrackCollectionState.can_ban);
            }
            return a + i + protoTrackCollectionState.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b == -1) {
                    whg.a(a);
                    return builder.build();
                } else if (b == 1) {
                    builder.is_in_collection((Boolean) ProtoAdapter.a.a(whg));
                } else if (b == 2) {
                    builder.can_add_to_collection((Boolean) ProtoAdapter.a.a(whg));
                } else if (b == 3) {
                    builder.is_banned((Boolean) ProtoAdapter.a.a(whg));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.can_ban((Boolean) ProtoAdapter.a.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoTrackCollectionState protoTrackCollectionState = (ProtoTrackCollectionState) obj;
            if (protoTrackCollectionState.is_in_collection != null) {
                boolean z = true & true;
                ProtoAdapter.a.a(whh, 1, protoTrackCollectionState.is_in_collection);
            }
            if (protoTrackCollectionState.can_add_to_collection != null) {
                ProtoAdapter.a.a(whh, 2, protoTrackCollectionState.can_add_to_collection);
            }
            if (protoTrackCollectionState.is_banned != null) {
                ProtoAdapter.a.a(whh, 3, protoTrackCollectionState.is_banned);
            }
            if (protoTrackCollectionState.can_ban != null) {
                boolean z2 = true | true;
                ProtoAdapter.a.a(whh, 4, protoTrackCollectionState.can_ban);
            }
            whh.a(protoTrackCollectionState.a());
        }
    }

    public ProtoTrackCollectionState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_in_collection = bool;
        this.can_add_to_collection = bool2;
        this.is_banned = bool3;
        this.can_ban = bool4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoTrackCollectionState)) {
            return false;
        }
        ProtoTrackCollectionState protoTrackCollectionState = (ProtoTrackCollectionState) obj;
        return a().equals(protoTrackCollectionState.a()) && whk.a((Object) this.is_in_collection, (Object) protoTrackCollectionState.is_in_collection) && whk.a((Object) this.can_add_to_collection, (Object) protoTrackCollectionState.can_add_to_collection) && whk.a((Object) this.is_banned, (Object) protoTrackCollectionState.is_banned) && whk.a((Object) this.can_ban, (Object) protoTrackCollectionState.can_ban);
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
        Boolean bool2 = this.can_add_to_collection;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_banned;
        int hashCode4 = (hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.can_ban;
        if (bool4 != null) {
            i2 = bool4.hashCode();
        }
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.is_in_collection != null) {
            String str = "niss _i,l_conolei=t";
            sb.append(", is_in_collection=");
            sb.append(this.is_in_collection);
        }
        if (this.can_add_to_collection != null) {
            sb.append(", can_add_to_collection=");
            sb.append(this.can_add_to_collection);
        }
        if (this.is_banned != null) {
            sb.append(", is_banned=");
            sb.append(this.is_banned);
        }
        if (this.can_ban != null) {
            String str2 = "ba=mnnca,_";
            sb.append(", can_ban=");
            sb.append(this.can_ban);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoTrackCollectionState{");
        replace.append('}');
        return replace.toString();
    }
}
