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

        public final AuxiliarySections build() {
            return new AuxiliarySections(this.continue_listening, this.topics_section, super.buildUnknownFields());
        }

        public final Builder continue_listening(ContinueListeningSection continueListeningSection) {
            this.continue_listening = continueListeningSection;
            return this;
        }

        public final Builder topics_section(PodcastTopics podcastTopics) {
            this.topics_section = podcastTopics;
            return this;
        }
    }

    static final class a extends ProtoAdapter<AuxiliarySections> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, AuxiliarySections.class);
        }

        public final /* synthetic */ int a(Object obj) {
            AuxiliarySections auxiliarySections = (AuxiliarySections) obj;
            int i = 0;
            int a = auxiliarySections.continue_listening != null ? ContinueListeningSection.ADAPTER.a(1, auxiliarySections.continue_listening) : 0;
            if (auxiliarySections.topics_section != null) {
                i = PodcastTopics.ADAPTER.a(2, auxiliarySections.topics_section);
            }
            return a + i + auxiliarySections.a().h();
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
                    builder.continue_listening((ContinueListeningSection) ContinueListeningSection.ADAPTER.a(whg));
                } else if (b != 2) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.topics_section((PodcastTopics) PodcastTopics.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            AuxiliarySections auxiliarySections = (AuxiliarySections) obj;
            if (auxiliarySections.continue_listening != null) {
                ContinueListeningSection.ADAPTER.a(whh, 1, auxiliarySections.continue_listening);
            }
            if (auxiliarySections.topics_section != null) {
                PodcastTopics.ADAPTER.a(whh, 2, auxiliarySections.topics_section);
            }
            whh.a(auxiliarySections.a());
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
        return a().equals(auxiliarySections.a()) && whk.a((Object) this.continue_listening, (Object) auxiliarySections.continue_listening) && whk.a((Object) this.topics_section, (Object) auxiliarySections.topics_section);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            ContinueListeningSection continueListeningSection = this.continue_listening;
            int i2 = 0;
            int hashCode2 = (hashCode + (continueListeningSection != null ? continueListeningSection.hashCode() : 0)) * 37;
            PodcastTopics podcastTopics = this.topics_section;
            if (podcastTopics != null) {
                i2 = podcastTopics.hashCode();
            }
            i = hashCode2 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.continue_listening != null) {
            String str = "iustnnisnienoe gt_c=l";
            sb.append(", continue_listening=");
            sb.append(this.continue_listening);
        }
        if (this.topics_section != null) {
            sb.append(", topics_section=");
            sb.append(this.topics_section);
        }
        String str2 = "SnrmuiciAyxolte{ia";
        StringBuilder replace = sb.replace(0, 2, "AuxiliarySections{");
        replace.append('}');
        return replace.toString();
    }
}
