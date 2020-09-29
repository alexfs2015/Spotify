package com.spotify.mobile.android.spotlets.show.proto;

import com.spotify.podcastextensions.proto.PodcastTopics;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class AuxiliarySections extends Message<AuxiliarySections, Builder> {
    public static final ProtoAdapter<AuxiliarySections> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final ContinueListeningSection continue_listening;
    public final PodcastTopics topics_section;

    public static final class Builder extends com.squareup.wire.Message.a<AuxiliarySections, Builder> {
        public ContinueListeningSection continue_listening;
        public PodcastTopics topics_section;

        public final Builder continue_listening(ContinueListeningSection continueListeningSection) {
            this.continue_listening = continueListeningSection;
            return this;
        }

        public final Builder topics_section(PodcastTopics podcastTopics) {
            this.topics_section = podcastTopics;
            return this;
        }

        public final AuxiliarySections build() {
            return new AuxiliarySections(this.continue_listening, this.topics_section, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<AuxiliarySections> {
        public final /* synthetic */ int a(Object obj) {
            AuxiliarySections auxiliarySections = (AuxiliarySections) obj;
            int i = 0;
            int a = auxiliarySections.continue_listening != null ? ContinueListeningSection.ADAPTER.a(1, auxiliarySections.continue_listening) : 0;
            if (auxiliarySections.topics_section != null) {
                i = PodcastTopics.ADAPTER.a(2, auxiliarySections.topics_section);
            }
            return a + i + auxiliarySections.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            AuxiliarySections auxiliarySections = (AuxiliarySections) obj;
            if (auxiliarySections.continue_listening != null) {
                ContinueListeningSection.ADAPTER.a(vtb, 1, auxiliarySections.continue_listening);
            }
            if (auxiliarySections.topics_section != null) {
                PodcastTopics.ADAPTER.a(vtb, 2, auxiliarySections.topics_section);
            }
            vtb.a(auxiliarySections.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, AuxiliarySections.class);
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
                    builder.continue_listening((ContinueListeningSection) ContinueListeningSection.ADAPTER.a(vta));
                } else if (b != 2) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.topics_section((PodcastTopics) PodcastTopics.ADAPTER.a(vta));
                }
            }
        }
    }

    public AuxiliarySections(ContinueListeningSection continueListeningSection, PodcastTopics podcastTopics, ByteString byteString) {
        super(ADAPTER, byteString);
        this.continue_listening = continueListeningSection;
        this.topics_section = podcastTopics;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuxiliarySections)) {
            return false;
        }
        AuxiliarySections auxiliarySections = (AuxiliarySections) obj;
        return a().equals(auxiliarySections.a()) && vte.a((Object) this.continue_listening, (Object) auxiliarySections.continue_listening) && vte.a((Object) this.topics_section, (Object) auxiliarySections.topics_section);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        ContinueListeningSection continueListeningSection = this.continue_listening;
        int i2 = 0;
        int hashCode2 = (hashCode + (continueListeningSection != null ? continueListeningSection.hashCode() : 0)) * 37;
        PodcastTopics podcastTopics = this.topics_section;
        if (podcastTopics != null) {
            i2 = podcastTopics.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.continue_listening != null) {
            sb.append(", continue_listening=");
            sb.append(this.continue_listening);
        }
        if (this.topics_section != null) {
            sb.append(", topics_section=");
            sb.append(this.topics_section);
        }
        StringBuilder replace = sb.replace(0, 2, "AuxiliarySections{");
        replace.append('}');
        return replace.toString();
    }
}
