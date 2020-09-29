package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoEpisodePlayState extends Message<ProtoEpisodePlayState, Builder> {
    public static final ProtoAdapter<ProtoEpisodePlayState> ADAPTER = new a();
    public static final Boolean DEFAULT_IS_PLAYABLE = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_PLAYED = Boolean.FALSE;
    public static final Long DEFAULT_LAST_PLAYED_AT = Long.valueOf(0);
    public static final Integer DEFAULT_TIME_LEFT = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Boolean is_playable;
    public final Boolean is_played;
    public final Long last_played_at;
    public final Integer time_left;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoEpisodePlayState, Builder> {
        public Boolean is_playable;
        public Boolean is_played;
        public Long last_played_at;
        public Integer time_left;

        public final ProtoEpisodePlayState build() {
            ProtoEpisodePlayState protoEpisodePlayState = new ProtoEpisodePlayState(this.time_left, this.is_playable, this.is_played, this.last_played_at, super.buildUnknownFields());
            return protoEpisodePlayState;
        }

        public final Builder is_playable(Boolean bool) {
            this.is_playable = bool;
            return this;
        }

        public final Builder is_played(Boolean bool) {
            this.is_played = bool;
            return this;
        }

        public final Builder last_played_at(Long l) {
            this.last_played_at = l;
            return this;
        }

        public final Builder time_left(Integer num) {
            this.time_left = num;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoEpisodePlayState> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoEpisodePlayState.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoEpisodePlayState protoEpisodePlayState = (ProtoEpisodePlayState) obj;
            int i = 0;
            int a = (protoEpisodePlayState.time_left != null ? ProtoAdapter.c.a(1, protoEpisodePlayState.time_left) : 0) + (protoEpisodePlayState.is_playable != null ? ProtoAdapter.a.a(2, protoEpisodePlayState.is_playable) : 0) + (protoEpisodePlayState.is_played != null ? ProtoAdapter.a.a(3, protoEpisodePlayState.is_played) : 0);
            if (protoEpisodePlayState.last_played_at != null) {
                i = ProtoAdapter.f.a(4, protoEpisodePlayState.last_played_at);
            }
            return a + i + protoEpisodePlayState.a().h();
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
                    builder.time_left((Integer) ProtoAdapter.c.a(whg));
                } else if (b == 2) {
                    builder.is_playable((Boolean) ProtoAdapter.a.a(whg));
                } else if (b == 3) {
                    builder.is_played((Boolean) ProtoAdapter.a.a(whg));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.last_played_at((Long) ProtoAdapter.f.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoEpisodePlayState protoEpisodePlayState = (ProtoEpisodePlayState) obj;
            if (protoEpisodePlayState.time_left != null) {
                ProtoAdapter.c.a(whh, 1, protoEpisodePlayState.time_left);
            }
            if (protoEpisodePlayState.is_playable != null) {
                ProtoAdapter.a.a(whh, 2, protoEpisodePlayState.is_playable);
            }
            if (protoEpisodePlayState.is_played != null) {
                ProtoAdapter.a.a(whh, 3, protoEpisodePlayState.is_played);
            }
            if (protoEpisodePlayState.last_played_at != null) {
                ProtoAdapter.f.a(whh, 4, protoEpisodePlayState.last_played_at);
            }
            whh.a(protoEpisodePlayState.a());
        }
    }

    public ProtoEpisodePlayState(Integer num, Boolean bool, Boolean bool2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.time_left = num;
        this.is_playable = bool;
        this.is_played = bool2;
        this.last_played_at = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoEpisodePlayState)) {
            return false;
        }
        ProtoEpisodePlayState protoEpisodePlayState = (ProtoEpisodePlayState) obj;
        return a().equals(protoEpisodePlayState.a()) && whk.a((Object) this.time_left, (Object) protoEpisodePlayState.time_left) && whk.a((Object) this.is_playable, (Object) protoEpisodePlayState.is_playable) && whk.a((Object) this.is_played, (Object) protoEpisodePlayState.is_played) && whk.a((Object) this.last_played_at, (Object) protoEpisodePlayState.last_played_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            Integer num = this.time_left;
            int i2 = 0;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
            Boolean bool = this.is_playable;
            int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
            Boolean bool2 = this.is_played;
            int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
            Long l = this.last_played_at;
            if (l != null) {
                i2 = l.hashCode();
            }
            i = hashCode4 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.time_left != null) {
            String str = "emstil=e,t_ ";
            sb.append(", time_left=");
            sb.append(this.time_left);
        }
        if (this.is_playable != null) {
            sb.append(", is_playable=");
            sb.append(this.is_playable);
        }
        if (this.is_played != null) {
            String str2 = "_sim, pela=y";
            sb.append(", is_played=");
            sb.append(this.is_played);
        }
        if (this.last_played_at != null) {
            sb.append(", last_played_at=");
            sb.append(this.last_played_at);
        }
        String str3 = "ePpPosaolotet{EoridySt";
        StringBuilder replace = sb.replace(0, 2, "ProtoEpisodePlayState{");
        replace.append('}');
        return replace.toString();
    }
}
