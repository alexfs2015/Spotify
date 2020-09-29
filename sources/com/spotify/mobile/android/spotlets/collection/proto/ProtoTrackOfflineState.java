package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoTrackOfflineState extends Message<ProtoTrackOfflineState, Builder> {
    public static final ProtoAdapter<ProtoTrackOfflineState> ADAPTER = new a();
    public static final String DEFAULT_OFFLINE = "";
    private static final long serialVersionUID = 0;
    public final String offline;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoTrackOfflineState, Builder> {
        public String offline;

        public final ProtoTrackOfflineState build() {
            return new ProtoTrackOfflineState(this.offline, super.buildUnknownFields());
        }

        public final Builder offline(String str) {
            this.offline = str;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoTrackOfflineState> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoTrackOfflineState.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoTrackOfflineState protoTrackOfflineState = (ProtoTrackOfflineState) obj;
            return (protoTrackOfflineState.offline != null ? ProtoAdapter.i.a(1, protoTrackOfflineState.offline) : 0) + protoTrackOfflineState.a().h();
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
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.offline((String) ProtoAdapter.i.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoTrackOfflineState protoTrackOfflineState = (ProtoTrackOfflineState) obj;
            if (protoTrackOfflineState.offline != null) {
                ProtoAdapter.i.a(whh, 1, protoTrackOfflineState.offline);
            }
            whh.a(protoTrackOfflineState.a());
        }
    }

    public ProtoTrackOfflineState(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.offline = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoTrackOfflineState)) {
            return false;
        }
        ProtoTrackOfflineState protoTrackOfflineState = (ProtoTrackOfflineState) obj;
        return a().equals(protoTrackOfflineState.a()) && whk.a((Object) this.offline, (Object) protoTrackOfflineState.offline);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            String str = this.offline;
            i = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.offline != null) {
            sb.append(", offline=");
            sb.append(this.offline);
        }
        String str = "P{sSraoferOfckttTtoelni";
        StringBuilder replace = sb.replace(0, 2, "ProtoTrackOfflineState{");
        replace.append('}');
        return replace.toString();
    }
}
