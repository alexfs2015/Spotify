package com.spotify.podcastextensions.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class PodcastTopic extends Message<PodcastTopic, Builder> {
    public static final ProtoAdapter<PodcastTopic> ADAPTER = new a();
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URI = "";
    private static final long serialVersionUID = 0;
    public final String title;
    public final String uri;

    public static final class Builder extends com.squareup.wire.Message.a<PodcastTopic, Builder> {
        public String title;
        public String uri;

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final PodcastTopic build() {
            return new PodcastTopic(this.uri, this.title, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<PodcastTopic> {
        public final /* synthetic */ int a(Object obj) {
            PodcastTopic podcastTopic = (PodcastTopic) obj;
            int i = 0;
            int a = podcastTopic.uri != null ? ProtoAdapter.i.a(1, podcastTopic.uri) : 0;
            if (podcastTopic.title != null) {
                i = ProtoAdapter.i.a(2, podcastTopic.title);
            }
            return a + i + podcastTopic.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            PodcastTopic podcastTopic = (PodcastTopic) obj;
            if (podcastTopic.uri != null) {
                ProtoAdapter.i.a(vtb, 1, podcastTopic.uri);
            }
            if (podcastTopic.title != null) {
                ProtoAdapter.i.a(vtb, 2, podcastTopic.title);
            }
            vtb.a(podcastTopic.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, PodcastTopic.class);
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
                    builder.uri((String) ProtoAdapter.i.a(vta));
                } else if (b != 2) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.title((String) ProtoAdapter.i.a(vta));
                }
            }
        }
    }

    public PodcastTopic(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uri = str;
        this.title = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PodcastTopic)) {
            return false;
        }
        PodcastTopic podcastTopic = (PodcastTopic) obj;
        return a().equals(podcastTopic.a()) && vte.a((Object) this.uri, (Object) podcastTopic.uri) && vte.a((Object) this.title, (Object) podcastTopic.title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.uri;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        StringBuilder replace = sb.replace(0, 2, "PodcastTopic{");
        replace.append('}');
        return replace.toString();
    }
}
