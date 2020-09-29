package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoAlbumOfflineState extends Message<ProtoAlbumOfflineState, Builder> {
    public static final ProtoAdapter<ProtoAlbumOfflineState> ADAPTER = new a();
    public static final String DEFAULT_INFERRED_OFFLINE = "";
    public static final String DEFAULT_OFFLINE = "";
    public static final Integer DEFAULT_SYNC_PROGRESS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String inferred_offline;
    public final String offline;
    public final Integer sync_progress;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoAlbumOfflineState, Builder> {
        public String inferred_offline;
        public String offline;
        public Integer sync_progress;

        public final ProtoAlbumOfflineState build() {
            return new ProtoAlbumOfflineState(this.offline, this.inferred_offline, this.sync_progress, super.buildUnknownFields());
        }

        public final Builder inferred_offline(String str) {
            this.inferred_offline = str;
            return this;
        }

        public final Builder offline(String str) {
            this.offline = str;
            return this;
        }

        public final Builder sync_progress(Integer num) {
            this.sync_progress = num;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoAlbumOfflineState> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoAlbumOfflineState.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoAlbumOfflineState protoAlbumOfflineState = (ProtoAlbumOfflineState) obj;
            int i = 0;
            int a = (protoAlbumOfflineState.offline != null ? ProtoAdapter.i.a(1, protoAlbumOfflineState.offline) : 0) + (protoAlbumOfflineState.inferred_offline != null ? ProtoAdapter.i.a(2, protoAlbumOfflineState.inferred_offline) : 0);
            if (protoAlbumOfflineState.sync_progress != null) {
                i = ProtoAdapter.c.a(3, protoAlbumOfflineState.sync_progress);
            }
            return a + i + protoAlbumOfflineState.a().h();
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
                    builder.offline((String) ProtoAdapter.i.a(whg));
                } else if (b == 2) {
                    builder.inferred_offline((String) ProtoAdapter.i.a(whg));
                } else if (b != 3) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.sync_progress((Integer) ProtoAdapter.c.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoAlbumOfflineState protoAlbumOfflineState = (ProtoAlbumOfflineState) obj;
            if (protoAlbumOfflineState.offline != null) {
                boolean z = true | true;
                ProtoAdapter.i.a(whh, 1, protoAlbumOfflineState.offline);
            }
            if (protoAlbumOfflineState.inferred_offline != null) {
                ProtoAdapter.i.a(whh, 2, protoAlbumOfflineState.inferred_offline);
            }
            if (protoAlbumOfflineState.sync_progress != null) {
                ProtoAdapter.c.a(whh, 3, protoAlbumOfflineState.sync_progress);
            }
            whh.a(protoAlbumOfflineState.a());
        }
    }

    public ProtoAlbumOfflineState(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.offline = str;
        this.inferred_offline = str2;
        this.sync_progress = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoAlbumOfflineState)) {
            return false;
        }
        ProtoAlbumOfflineState protoAlbumOfflineState = (ProtoAlbumOfflineState) obj;
        return a().equals(protoAlbumOfflineState.a()) && whk.a((Object) this.offline, (Object) protoAlbumOfflineState.offline) && whk.a((Object) this.inferred_offline, (Object) protoAlbumOfflineState.inferred_offline) && whk.a((Object) this.sync_progress, (Object) protoAlbumOfflineState.sync_progress);
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
            String str = "elsif fe=frn_er,nod";
            sb.append(", inferred_offline=");
            sb.append(this.inferred_offline);
        }
        if (this.sync_progress != null) {
            String str2 = "e_gms=,osc rnpsr";
            sb.append(", sync_progress=");
            sb.append(this.sync_progress);
        }
        String str3 = "b{atollfAonoOtfuPmeerSi";
        StringBuilder replace = sb.replace(0, 2, "ProtoAlbumOfflineState{");
        replace.append('}');
        return replace.toString();
    }
}
