package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoEpisodeOfflineState extends Message<ProtoEpisodeOfflineState, Builder> {
    public static final ProtoAdapter<ProtoEpisodeOfflineState> ADAPTER = new a();
    public static final String DEFAULT_OFFLINE_STATE = "";
    public static final Integer DEFAULT_SYNC_PROGRESS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String offline_state;
    public final Integer sync_progress;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoEpisodeOfflineState, Builder> {
        public String offline_state;
        public Integer sync_progress;

        public final ProtoEpisodeOfflineState build() {
            return new ProtoEpisodeOfflineState(this.offline_state, this.sync_progress, super.buildUnknownFields());
        }

        public final Builder offline_state(String str) {
            this.offline_state = str;
            return this;
        }

        public final Builder sync_progress(Integer num) {
            this.sync_progress = num;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoEpisodeOfflineState> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoEpisodeOfflineState.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoEpisodeOfflineState protoEpisodeOfflineState = (ProtoEpisodeOfflineState) obj;
            int i = 0;
            int a = protoEpisodeOfflineState.offline_state != null ? ProtoAdapter.i.a(1, protoEpisodeOfflineState.offline_state) : 0;
            if (protoEpisodeOfflineState.sync_progress != null) {
                i = ProtoAdapter.c.a(2, protoEpisodeOfflineState.sync_progress);
            }
            return a + i + protoEpisodeOfflineState.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b == -1) {
                    whg.a(a);
                    return builder.build();
                } else if (b != 1) {
                    int i = 2 << 2;
                    if (b != 2) {
                        FieldEncoding fieldEncoding = whg.b;
                        builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                    } else {
                        builder.sync_progress((Integer) ProtoAdapter.c.a(whg));
                    }
                } else {
                    builder.offline_state((String) ProtoAdapter.i.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoEpisodeOfflineState protoEpisodeOfflineState = (ProtoEpisodeOfflineState) obj;
            if (protoEpisodeOfflineState.offline_state != null) {
                ProtoAdapter.i.a(whh, 1, protoEpisodeOfflineState.offline_state);
            }
            if (protoEpisodeOfflineState.sync_progress != null) {
                ProtoAdapter.c.a(whh, 2, protoEpisodeOfflineState.sync_progress);
            }
            whh.a(protoEpisodeOfflineState.a());
        }
    }

    public ProtoEpisodeOfflineState(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.offline_state = str;
        this.sync_progress = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoEpisodeOfflineState)) {
            return false;
        }
        ProtoEpisodeOfflineState protoEpisodeOfflineState = (ProtoEpisodeOfflineState) obj;
        return a().equals(protoEpisodeOfflineState.a()) && whk.a((Object) this.offline_state, (Object) protoEpisodeOfflineState.offline_state) && whk.a((Object) this.sync_progress, (Object) protoEpisodeOfflineState.sync_progress);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.offline_state;
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
        if (this.offline_state != null) {
            sb.append(", offline_state=");
            sb.append(this.offline_state);
        }
        if (this.sync_progress != null) {
            sb.append(", sync_progress=");
            sb.append(this.sync_progress);
        }
        String str = "e{sslSitEiraPooOedtpefoft";
        StringBuilder replace = sb.replace(0, 2, "ProtoEpisodeOfflineState{");
        replace.append('}');
        return replace.toString();
    }
}
