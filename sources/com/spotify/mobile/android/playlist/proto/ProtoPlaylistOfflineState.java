package com.spotify.mobile.android.playlist.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoPlaylistOfflineState extends Message<ProtoPlaylistOfflineState, Builder> {
    public static final ProtoAdapter<ProtoPlaylistOfflineState> ADAPTER = new a();
    public static final String DEFAULT_OFFLINE = "";
    public static final Integer DEFAULT_SYNC_PROGRESS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String offline;
    public final Integer sync_progress;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoPlaylistOfflineState, Builder> {
        public String offline;
        public Integer sync_progress;

        public final Builder offline(String str) {
            this.offline = str;
            return this;
        }

        public final Builder sync_progress(Integer num) {
            this.sync_progress = num;
            return this;
        }

        public final ProtoPlaylistOfflineState build() {
            return new ProtoPlaylistOfflineState(this.offline, this.sync_progress, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoPlaylistOfflineState> {
        public final /* synthetic */ int a(Object obj) {
            ProtoPlaylistOfflineState protoPlaylistOfflineState = (ProtoPlaylistOfflineState) obj;
            int i = 0;
            int a = protoPlaylistOfflineState.offline != null ? ProtoAdapter.i.a(1, protoPlaylistOfflineState.offline) : 0;
            if (protoPlaylistOfflineState.sync_progress != null) {
                i = ProtoAdapter.c.a(2, protoPlaylistOfflineState.sync_progress);
            }
            return a + i + protoPlaylistOfflineState.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoPlaylistOfflineState protoPlaylistOfflineState = (ProtoPlaylistOfflineState) obj;
            if (protoPlaylistOfflineState.offline != null) {
                ProtoAdapter.i.a(vtb, 1, protoPlaylistOfflineState.offline);
            }
            if (protoPlaylistOfflineState.sync_progress != null) {
                ProtoAdapter.c.a(vtb, 2, protoPlaylistOfflineState.sync_progress);
            }
            vtb.a(protoPlaylistOfflineState.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistOfflineState.class);
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
                } else if (b != 2) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.sync_progress((Integer) ProtoAdapter.c.a(vta));
                }
            }
        }
    }

    public ProtoPlaylistOfflineState(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.offline = str;
        this.sync_progress = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoPlaylistOfflineState)) {
            return false;
        }
        ProtoPlaylistOfflineState protoPlaylistOfflineState = (ProtoPlaylistOfflineState) obj;
        return a().equals(protoPlaylistOfflineState.a()) && vte.a((Object) this.offline, (Object) protoPlaylistOfflineState.offline) && vte.a((Object) this.sync_progress, (Object) protoPlaylistOfflineState.sync_progress);
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
        Integer num = this.sync_progress;
        if (num != null) {
            i2 = num.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.offline != null) {
            sb.append(", offline=");
            sb.append(this.offline);
        }
        if (this.sync_progress != null) {
            sb.append(", sync_progress=");
            sb.append(this.sync_progress);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistOfflineState{");
        replace.append('}');
        return replace.toString();
    }
}
