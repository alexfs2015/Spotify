package com.spotify.podcastextensions.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class PodcastTopics extends Message<PodcastTopics, Builder> {
    public static final ProtoAdapter<PodcastTopics> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final List<PodcastTopic> topics;

    public static final class Builder extends com.squareup.wire.Message.a<PodcastTopics, Builder> {
        public List<PodcastTopic> topics = whk.a();

        public final PodcastTopics build() {
            return new PodcastTopics(this.topics, super.buildUnknownFields());
        }

        public final Builder topics(List<PodcastTopic> list) {
            whk.a(list);
            this.topics = list;
            return this;
        }
    }

    static final class a extends ProtoAdapter<PodcastTopics> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, PodcastTopics.class);
        }

        public final /* synthetic */ int a(Object obj) {
            PodcastTopics podcastTopics = (PodcastTopics) obj;
            return PodcastTopic.ADAPTER.a().a(1, podcastTopics.topics) + podcastTopics.a().h();
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
                    builder.topics.add(PodcastTopic.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            PodcastTopics podcastTopics = (PodcastTopics) obj;
            PodcastTopic.ADAPTER.a().a(whh, 1, podcastTopics.topics);
            whh.a(podcastTopics.a());
        }
    }

    public PodcastTopics(List<PodcastTopic> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.topics = whk.a("topics", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PodcastTopics)) {
            return false;
        }
        PodcastTopics podcastTopics = (PodcastTopics) obj;
        return a().equals(podcastTopics.a()) && this.topics.equals(podcastTopics.topics);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (a().hashCode() * 37) + this.topics.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.topics.isEmpty()) {
            sb.append(", topics=");
            sb.append(this.topics);
        }
        StringBuilder replace = sb.replace(0, 2, "PodcastTopics{");
        replace.append('}');
        return replace.toString();
    }
}
