package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoArtistOfflineState extends Message<ProtoArtistOfflineState, Builder> {
    public static final ProtoAdapter<ProtoArtistOfflineState> ADAPTER = new a();
    public static final String DEFAULT_INFERRED_OFFLINE = "";
    public static final String DEFAULT_OFFLINE = "";
    public static final Integer DEFAULT_SYNC_PROGRESS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String inferred_offline;
    public final String offline;
    public final Integer sync_progress;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoArtistOfflineState, Builder> {
        public String inferred_offline;
        public String offline;
        public Integer sync_progress;

        public final Builder offline(String str) {
            this.offline = str;
            return this;
        }

        public final Builder inferred_offline(String str) {
            this.inferred_offline = str;
            return this;
        }

        public final Builder sync_progress(Integer num) {
            this.sync_progress = num;
            return this;
        }

        public final ProtoArtistOfflineState build() {
            return new ProtoArtistOfflineState(this.offline, this.inferred_offline, this.sync_progress, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoArtistOfflineState> {
        public final /* synthetic */ int a(Object obj) {
            ProtoArtistOfflineState protoArtistOfflineState = (ProtoArtistOfflineState) obj;
            int i = 0;
            int a = (protoArtistOfflineState.offline != null ? ProtoAdapter.i.a(1, protoArtistOfflineState.offline) : 0) + (protoArtistOfflineState.inferred_offline != null ? ProtoAdapter.i.a(2, protoArtistOfflineState.inferred_offline) : 0);
            if (protoArtistOfflineState.sync_progress != null) {
                i = ProtoAdapter.c.a(3, protoArtistOfflineState.sync_progress);
            }
            return a + i + protoArtistOfflineState.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoArtistOfflineState protoArtistOfflineState = (ProtoArtistOfflineState) obj;
            if (protoArtistOfflineState.offline != null) {
                ProtoAdapter.i.a(vtb, 1, protoArtistOfflineState.offline);
            }
            if (protoArtistOfflineState.inferred_offline != null) {
                ProtoAdapter.i.a(vtb, 2, protoArtistOfflineState.inferred_offline);
            }
            if (protoArtistOfflineState.sync_progress != null) {
                ProtoAdapter.c.a(vtb, 3, protoArtistOfflineState.sync_progress);
            }
            vtb.a(protoArtistOfflineState.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoArtistOfflineState.class);
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
                    builder.offline((String) ProtoAdapter.i.a(vta));
                } else if (b == 2) {
                    builder.inferred_offline((String) ProtoAdapter.i.a(vta));
                } else if (b != 3) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.sync_progress((Integer) ProtoAdapter.c.a(vta));
                }
            }
        }
    }

    public ProtoArtistOfflineState(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.offline = str;
        this.inferred_offline = str2;
        this.sync_progress = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoArtistOfflineState)) {
            return false;
        }
        ProtoArtistOfflineState protoArtistOfflineState = (ProtoArtistOfflineState) obj;
        return a().equals(protoArtistOfflineState.a()) && vte.a((Object) this.offline, (Object) protoArtistOfflineState.offline) && vte.a((Object) this.inferred_offline, (Object) protoArtistOfflineState.inferred_offline) && vte.a((Object) this.sync_progress, (Object) protoArtistOfflineState.sync_progress);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.offline;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.inferred_offline;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.sync_progress;
        if (num != null) {
            i2 = num.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.offline != null) {
            sb.append(", offline=");
            sb.append(this.offline);
        }
        if (this.inferred_offline != null) {
            sb.append(", inferred_offline=");
            sb.append(this.inferred_offline);
        }
        if (this.sync_progress != null) {
            sb.append(", sync_progress=");
            sb.append(this.sync_progress);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoArtistOfflineState{");
        replace.append('}');
        return replace.toString();
    }
}
