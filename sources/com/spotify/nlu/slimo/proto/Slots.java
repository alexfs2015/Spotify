package com.spotify.nlu.slimo.proto;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.player.model.ContextTrack.Metadata;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class Slots extends Message<Slots, Builder> {
    public static final ProtoAdapter<Slots> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final List<String> album;
    public final List<String> application_view;
    public final List<String> artist;
    public final List<String> chart;
    public final List<String> chronology;
    public final List<String> classical_composer;
    public final List<String> classical_composition;
    public final List<String> classical_performer;
    public final List<String> classical_section;
    public final List<String> cultural_reference;
    public final List<String> date;
    public final List<String> descriptor;
    public final List<String> genre;
    public final List<String> help_topic;
    public final List<String> location;
    public final List<String> lyrics;
    public final List<String> mood;
    public final List<String> movie_tv;
    public final List<String> my_library;
    public final List<String> my_likes;
    public final List<String> name;
    public final List<String> play_context_reference;
    public final List<String> playback_device;
    public final List<String> playlist;
    public final List<String> podcast;
    public final List<String> popularity;
    public final List<String> quality;
    public final List<String> recency;
    public final List<String> record_label;
    public final List<String> requested_entity_type;
    public final List<String> social_nicety;
    public final List<String> time;
    public final List<String> track;
    public final List<String> track_number;
    public final List<String> user_activity_context;
    public final List<String> video;
    public final List<String> volume_level;

    public static final class Builder extends com.squareup.wire.Message.a<Slots, Builder> {
        public List<String> album = whk.a();
        public List<String> application_view = whk.a();
        public List<String> artist = whk.a();
        public List<String> chart = whk.a();
        public List<String> chronology = whk.a();
        public List<String> classical_composer = whk.a();
        public List<String> classical_composition = whk.a();
        public List<String> classical_performer = whk.a();
        public List<String> classical_section = whk.a();
        public List<String> cultural_reference = whk.a();
        public List<String> date = whk.a();
        public List<String> descriptor = whk.a();
        public List<String> genre = whk.a();
        public List<String> help_topic = whk.a();
        public List<String> location = whk.a();
        public List<String> lyrics = whk.a();
        public List<String> mood = whk.a();
        public List<String> movie_tv = whk.a();
        public List<String> my_library = whk.a();
        public List<String> my_likes = whk.a();
        public List<String> name = whk.a();
        public List<String> play_context_reference = whk.a();
        public List<String> playback_device = whk.a();
        public List<String> playlist = whk.a();
        public List<String> podcast = whk.a();
        public List<String> popularity = whk.a();
        public List<String> quality = whk.a();
        public List<String> recency = whk.a();
        public List<String> record_label = whk.a();
        public List<String> requested_entity_type = whk.a();
        public List<String> social_nicety = whk.a();
        public List<String> time = whk.a();
        public List<String> track = whk.a();
        public List<String> track_number = whk.a();
        public List<String> user_activity_context = whk.a();
        public List<String> video = whk.a();
        public List<String> volume_level = whk.a();

        public final Builder album(List<String> list) {
            whk.a(list);
            this.album = list;
            return this;
        }

        public final Builder application_view(List<String> list) {
            whk.a(list);
            this.application_view = list;
            return this;
        }

        public final Builder artist(List<String> list) {
            whk.a(list);
            this.artist = list;
            return this;
        }

        public final Slots build() {
            Slots slots = new Slots(this.requested_entity_type, this.name, this.artist, this.track, this.album, this.playlist, this.record_label, this.chart, this.genre, this.descriptor, this.my_library, this.user_activity_context, this.cultural_reference, this.movie_tv, this.date, this.chronology, this.classical_composer, this.classical_composition, this.classical_section, this.classical_performer, this.volume_level, this.time, this.help_topic, this.social_nicety, this.play_context_reference, this.location, this.my_likes, this.popularity, this.quality, this.recency, this.track_number, this.video, this.mood, this.playback_device, this.application_view, this.podcast, this.lyrics, super.buildUnknownFields());
            return slots;
        }

        public final Builder chart(List<String> list) {
            whk.a(list);
            this.chart = list;
            return this;
        }

        public final Builder chronology(List<String> list) {
            whk.a(list);
            this.chronology = list;
            return this;
        }

        public final Builder classical_composer(List<String> list) {
            whk.a(list);
            this.classical_composer = list;
            return this;
        }

        public final Builder classical_composition(List<String> list) {
            whk.a(list);
            this.classical_composition = list;
            return this;
        }

        public final Builder classical_performer(List<String> list) {
            whk.a(list);
            this.classical_performer = list;
            return this;
        }

        public final Builder classical_section(List<String> list) {
            whk.a(list);
            this.classical_section = list;
            return this;
        }

        public final Builder cultural_reference(List<String> list) {
            whk.a(list);
            this.cultural_reference = list;
            return this;
        }

        public final Builder date(List<String> list) {
            whk.a(list);
            this.date = list;
            return this;
        }

        public final Builder descriptor(List<String> list) {
            whk.a(list);
            this.descriptor = list;
            return this;
        }

        public final Builder genre(List<String> list) {
            whk.a(list);
            this.genre = list;
            return this;
        }

        public final Builder help_topic(List<String> list) {
            whk.a(list);
            this.help_topic = list;
            return this;
        }

        public final Builder location(List<String> list) {
            whk.a(list);
            this.location = list;
            return this;
        }

        public final Builder lyrics(List<String> list) {
            whk.a(list);
            this.lyrics = list;
            return this;
        }

        public final Builder mood(List<String> list) {
            whk.a(list);
            this.mood = list;
            return this;
        }

        public final Builder movie_tv(List<String> list) {
            whk.a(list);
            this.movie_tv = list;
            return this;
        }

        public final Builder my_library(List<String> list) {
            whk.a(list);
            this.my_library = list;
            return this;
        }

        public final Builder my_likes(List<String> list) {
            whk.a(list);
            this.my_likes = list;
            return this;
        }

        public final Builder name(List<String> list) {
            whk.a(list);
            this.name = list;
            return this;
        }

        public final Builder play_context_reference(List<String> list) {
            whk.a(list);
            this.play_context_reference = list;
            return this;
        }

        public final Builder playback_device(List<String> list) {
            whk.a(list);
            this.playback_device = list;
            return this;
        }

        public final Builder playlist(List<String> list) {
            whk.a(list);
            this.playlist = list;
            return this;
        }

        public final Builder podcast(List<String> list) {
            whk.a(list);
            this.podcast = list;
            return this;
        }

        public final Builder popularity(List<String> list) {
            whk.a(list);
            this.popularity = list;
            return this;
        }

        public final Builder quality(List<String> list) {
            whk.a(list);
            this.quality = list;
            return this;
        }

        public final Builder recency(List<String> list) {
            whk.a(list);
            this.recency = list;
            return this;
        }

        public final Builder record_label(List<String> list) {
            whk.a(list);
            this.record_label = list;
            return this;
        }

        public final Builder requested_entity_type(List<String> list) {
            whk.a(list);
            this.requested_entity_type = list;
            return this;
        }

        public final Builder social_nicety(List<String> list) {
            whk.a(list);
            this.social_nicety = list;
            return this;
        }

        public final Builder time(List<String> list) {
            whk.a(list);
            this.time = list;
            return this;
        }

        public final Builder track(List<String> list) {
            whk.a(list);
            this.track = list;
            return this;
        }

        public final Builder track_number(List<String> list) {
            whk.a(list);
            this.track_number = list;
            return this;
        }

        public final Builder user_activity_context(List<String> list) {
            whk.a(list);
            this.user_activity_context = list;
            return this;
        }

        public final Builder video(List<String> list) {
            whk.a(list);
            this.video = list;
            return this;
        }

        public final Builder volume_level(List<String> list) {
            whk.a(list);
            this.volume_level = list;
            return this;
        }
    }

    static final class a extends ProtoAdapter<Slots> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, Slots.class);
        }

        public final /* synthetic */ int a(Object obj) {
            Slots slots = (Slots) obj;
            return ProtoAdapter.i.a().a(1, slots.requested_entity_type) + ProtoAdapter.i.a().a(2, slots.name) + ProtoAdapter.i.a().a(3, slots.artist) + ProtoAdapter.i.a().a(4, slots.track) + ProtoAdapter.i.a().a(5, slots.album) + ProtoAdapter.i.a().a(6, slots.playlist) + ProtoAdapter.i.a().a(7, slots.record_label) + ProtoAdapter.i.a().a(8, slots.chart) + ProtoAdapter.i.a().a(9, slots.genre) + ProtoAdapter.i.a().a(10, slots.descriptor) + ProtoAdapter.i.a().a(11, slots.my_library) + ProtoAdapter.i.a().a(12, slots.user_activity_context) + ProtoAdapter.i.a().a(13, slots.cultural_reference) + ProtoAdapter.i.a().a(14, slots.movie_tv) + ProtoAdapter.i.a().a(15, slots.date) + ProtoAdapter.i.a().a(16, slots.chronology) + ProtoAdapter.i.a().a(17, slots.classical_composer) + ProtoAdapter.i.a().a(18, slots.classical_composition) + ProtoAdapter.i.a().a(19, slots.classical_section) + ProtoAdapter.i.a().a(20, slots.classical_performer) + ProtoAdapter.i.a().a(21, slots.volume_level) + ProtoAdapter.i.a().a(22, slots.time) + ProtoAdapter.i.a().a(23, slots.help_topic) + ProtoAdapter.i.a().a(24, slots.social_nicety) + ProtoAdapter.i.a().a(25, slots.play_context_reference) + ProtoAdapter.i.a().a(26, slots.location) + ProtoAdapter.i.a().a(27, slots.my_likes) + ProtoAdapter.i.a().a(28, slots.popularity) + ProtoAdapter.i.a().a(29, slots.quality) + ProtoAdapter.i.a().a(30, slots.recency) + ProtoAdapter.i.a().a(31, slots.track_number) + ProtoAdapter.i.a().a(32, slots.video) + ProtoAdapter.i.a().a(33, slots.mood) + ProtoAdapter.i.a().a(34, slots.playback_device) + ProtoAdapter.i.a().a(35, slots.application_view) + ProtoAdapter.i.a().a(36, slots.podcast) + ProtoAdapter.i.a().a(37, slots.lyrics) + slots.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.requested_entity_type.add(ProtoAdapter.i.a(whg));
                            break;
                        case 2:
                            builder.name.add(ProtoAdapter.i.a(whg));
                            break;
                        case 3:
                            builder.artist.add(ProtoAdapter.i.a(whg));
                            break;
                        case 4:
                            builder.track.add(ProtoAdapter.i.a(whg));
                            break;
                        case 5:
                            builder.album.add(ProtoAdapter.i.a(whg));
                            break;
                        case 6:
                            builder.playlist.add(ProtoAdapter.i.a(whg));
                            break;
                        case 7:
                            builder.record_label.add(ProtoAdapter.i.a(whg));
                            break;
                        case 8:
                            builder.chart.add(ProtoAdapter.i.a(whg));
                            break;
                        case 9:
                            builder.genre.add(ProtoAdapter.i.a(whg));
                            break;
                        case 10:
                            builder.descriptor.add(ProtoAdapter.i.a(whg));
                            break;
                        case 11:
                            builder.my_library.add(ProtoAdapter.i.a(whg));
                            break;
                        case 12:
                            builder.user_activity_context.add(ProtoAdapter.i.a(whg));
                            break;
                        case 13:
                            builder.cultural_reference.add(ProtoAdapter.i.a(whg));
                            break;
                        case 14:
                            builder.movie_tv.add(ProtoAdapter.i.a(whg));
                            break;
                        case 15:
                            builder.date.add(ProtoAdapter.i.a(whg));
                            break;
                        case 16:
                            builder.chronology.add(ProtoAdapter.i.a(whg));
                            break;
                        case 17:
                            builder.classical_composer.add(ProtoAdapter.i.a(whg));
                            break;
                        case 18:
                            builder.classical_composition.add(ProtoAdapter.i.a(whg));
                            break;
                        case 19:
                            builder.classical_section.add(ProtoAdapter.i.a(whg));
                            break;
                        case 20:
                            builder.classical_performer.add(ProtoAdapter.i.a(whg));
                            break;
                        case 21:
                            builder.volume_level.add(ProtoAdapter.i.a(whg));
                            break;
                        case 22:
                            builder.time.add(ProtoAdapter.i.a(whg));
                            break;
                        case 23:
                            builder.help_topic.add(ProtoAdapter.i.a(whg));
                            break;
                        case 24:
                            builder.social_nicety.add(ProtoAdapter.i.a(whg));
                            break;
                        case 25:
                            builder.play_context_reference.add(ProtoAdapter.i.a(whg));
                            break;
                        case 26:
                            builder.location.add(ProtoAdapter.i.a(whg));
                            break;
                        case 27:
                            builder.my_likes.add(ProtoAdapter.i.a(whg));
                            break;
                        case 28:
                            builder.popularity.add(ProtoAdapter.i.a(whg));
                            break;
                        case 29:
                            builder.quality.add(ProtoAdapter.i.a(whg));
                            break;
                        case 30:
                            builder.recency.add(ProtoAdapter.i.a(whg));
                            break;
                        case 31:
                            builder.track_number.add(ProtoAdapter.i.a(whg));
                            break;
                        case 32:
                            builder.video.add(ProtoAdapter.i.a(whg));
                            break;
                        case 33:
                            builder.mood.add(ProtoAdapter.i.a(whg));
                            break;
                        case 34:
                            builder.playback_device.add(ProtoAdapter.i.a(whg));
                            break;
                        case 35:
                            builder.application_view.add(ProtoAdapter.i.a(whg));
                            break;
                        case 36:
                            builder.podcast.add(ProtoAdapter.i.a(whg));
                            break;
                        case 37:
                            builder.lyrics.add(ProtoAdapter.i.a(whg));
                            break;
                        default:
                            FieldEncoding fieldEncoding = whg.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                            break;
                    }
                } else {
                    whg.a(a);
                    return builder.build();
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            Slots slots = (Slots) obj;
            ProtoAdapter.i.a().a(whh, 1, slots.requested_entity_type);
            ProtoAdapter.i.a().a(whh, 2, slots.name);
            ProtoAdapter.i.a().a(whh, 3, slots.artist);
            ProtoAdapter.i.a().a(whh, 4, slots.track);
            ProtoAdapter.i.a().a(whh, 5, slots.album);
            ProtoAdapter.i.a().a(whh, 6, slots.playlist);
            ProtoAdapter.i.a().a(whh, 7, slots.record_label);
            ProtoAdapter.i.a().a(whh, 8, slots.chart);
            ProtoAdapter.i.a().a(whh, 9, slots.genre);
            ProtoAdapter.i.a().a(whh, 10, slots.descriptor);
            ProtoAdapter.i.a().a(whh, 11, slots.my_library);
            ProtoAdapter.i.a().a(whh, 12, slots.user_activity_context);
            ProtoAdapter.i.a().a(whh, 13, slots.cultural_reference);
            ProtoAdapter.i.a().a(whh, 14, slots.movie_tv);
            ProtoAdapter.i.a().a(whh, 15, slots.date);
            ProtoAdapter.i.a().a(whh, 16, slots.chronology);
            ProtoAdapter.i.a().a(whh, 17, slots.classical_composer);
            ProtoAdapter.i.a().a(whh, 18, slots.classical_composition);
            ProtoAdapter.i.a().a(whh, 19, slots.classical_section);
            ProtoAdapter.i.a().a(whh, 20, slots.classical_performer);
            ProtoAdapter.i.a().a(whh, 21, slots.volume_level);
            ProtoAdapter.i.a().a(whh, 22, slots.time);
            ProtoAdapter.i.a().a(whh, 23, slots.help_topic);
            ProtoAdapter.i.a().a(whh, 24, slots.social_nicety);
            ProtoAdapter.i.a().a(whh, 25, slots.play_context_reference);
            ProtoAdapter.i.a().a(whh, 26, slots.location);
            ProtoAdapter.i.a().a(whh, 27, slots.my_likes);
            ProtoAdapter.i.a().a(whh, 28, slots.popularity);
            ProtoAdapter.i.a().a(whh, 29, slots.quality);
            ProtoAdapter.i.a().a(whh, 30, slots.recency);
            ProtoAdapter.i.a().a(whh, 31, slots.track_number);
            ProtoAdapter.i.a().a(whh, 32, slots.video);
            ProtoAdapter.i.a().a(whh, 33, slots.mood);
            ProtoAdapter.i.a().a(whh, 34, slots.playback_device);
            ProtoAdapter.i.a().a(whh, 35, slots.application_view);
            ProtoAdapter.i.a().a(whh, 36, slots.podcast);
            ProtoAdapter.i.a().a(whh, 37, slots.lyrics);
            whh.a(slots.a());
        }
    }

    public Slots(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, List<String> list8, List<String> list9, List<String> list10, List<String> list11, List<String> list12, List<String> list13, List<String> list14, List<String> list15, List<String> list16, List<String> list17, List<String> list18, List<String> list19, List<String> list20, List<String> list21, List<String> list22, List<String> list23, List<String> list24, List<String> list25, List<String> list26, List<String> list27, List<String> list28, List<String> list29, List<String> list30, List<String> list31, List<String> list32, List<String> list33, List<String> list34, List<String> list35, List<String> list36, List<String> list37, ByteString byteString) {
        super(ADAPTER, byteString);
        List<String> list38 = list;
        this.requested_entity_type = whk.a("requested_entity_type", list);
        List<String> list39 = list2;
        this.name = whk.a("name", list2);
        List<String> list40 = list3;
        this.artist = whk.a("artist", list3);
        List<String> list41 = list4;
        this.track = whk.a(TrackData.TYPE_TRACK, list4);
        List<String> list42 = list5;
        this.album = whk.a("album", list5);
        List<String> list43 = list6;
        this.playlist = whk.a("playlist", list6);
        List<String> list44 = list7;
        this.record_label = whk.a("record_label", list7);
        List<String> list45 = list8;
        this.chart = whk.a("chart", list8);
        List<String> list46 = list9;
        this.genre = whk.a("genre", list9);
        List<String> list47 = list10;
        this.descriptor = whk.a("descriptor", list10);
        List<String> list48 = list11;
        this.my_library = whk.a("my_library", list11);
        List<String> list49 = list12;
        this.user_activity_context = whk.a("user_activity_context", list12);
        this.cultural_reference = whk.a("cultural_reference", list13);
        this.movie_tv = whk.a("movie_tv", list14);
        this.date = whk.a("date", list15);
        this.chronology = whk.a("chronology", list16);
        this.classical_composer = whk.a("classical_composer", list17);
        this.classical_composition = whk.a("classical_composition", list18);
        this.classical_section = whk.a("classical_section", list19);
        this.classical_performer = whk.a("classical_performer", list20);
        this.volume_level = whk.a("volume_level", list21);
        this.time = whk.a("time", list22);
        this.help_topic = whk.a("help_topic", list23);
        this.social_nicety = whk.a("social_nicety", list24);
        this.play_context_reference = whk.a("play_context_reference", list25);
        this.location = whk.a("location", list26);
        this.my_likes = whk.a("my_likes", list27);
        this.popularity = whk.a(Metadata.KEY_POPULARITY, list28);
        this.quality = whk.a("quality", list29);
        this.recency = whk.a("recency", list30);
        this.track_number = whk.a("track_number", list31);
        this.video = whk.a("video", list32);
        this.mood = whk.a("mood", list33);
        this.playback_device = whk.a("playback_device", list34);
        this.application_view = whk.a("application_view", list35);
        this.podcast = whk.a("podcast", list36);
        this.lyrics = whk.a("lyrics", list37);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Slots)) {
            return false;
        }
        Slots slots = (Slots) obj;
        return a().equals(slots.a()) && this.requested_entity_type.equals(slots.requested_entity_type) && this.name.equals(slots.name) && this.artist.equals(slots.artist) && this.track.equals(slots.track) && this.album.equals(slots.album) && this.playlist.equals(slots.playlist) && this.record_label.equals(slots.record_label) && this.chart.equals(slots.chart) && this.genre.equals(slots.genre) && this.descriptor.equals(slots.descriptor) && this.my_library.equals(slots.my_library) && this.user_activity_context.equals(slots.user_activity_context) && this.cultural_reference.equals(slots.cultural_reference) && this.movie_tv.equals(slots.movie_tv) && this.date.equals(slots.date) && this.chronology.equals(slots.chronology) && this.classical_composer.equals(slots.classical_composer) && this.classical_composition.equals(slots.classical_composition) && this.classical_section.equals(slots.classical_section) && this.classical_performer.equals(slots.classical_performer) && this.volume_level.equals(slots.volume_level) && this.time.equals(slots.time) && this.help_topic.equals(slots.help_topic) && this.social_nicety.equals(slots.social_nicety) && this.play_context_reference.equals(slots.play_context_reference) && this.location.equals(slots.location) && this.my_likes.equals(slots.my_likes) && this.popularity.equals(slots.popularity) && this.quality.equals(slots.quality) && this.recency.equals(slots.recency) && this.track_number.equals(slots.track_number) && this.video.equals(slots.video) && this.mood.equals(slots.mood) && this.playback_device.equals(slots.playback_device) && this.application_view.equals(slots.application_view) && this.podcast.equals(slots.podcast) && this.lyrics.equals(slots.lyrics);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((a().hashCode() * 37) + this.requested_entity_type.hashCode()) * 37) + this.name.hashCode()) * 37) + this.artist.hashCode()) * 37) + this.track.hashCode()) * 37) + this.album.hashCode()) * 37) + this.playlist.hashCode()) * 37) + this.record_label.hashCode()) * 37) + this.chart.hashCode()) * 37) + this.genre.hashCode()) * 37) + this.descriptor.hashCode()) * 37) + this.my_library.hashCode()) * 37) + this.user_activity_context.hashCode()) * 37) + this.cultural_reference.hashCode()) * 37) + this.movie_tv.hashCode()) * 37) + this.date.hashCode()) * 37) + this.chronology.hashCode()) * 37) + this.classical_composer.hashCode()) * 37) + this.classical_composition.hashCode()) * 37) + this.classical_section.hashCode()) * 37) + this.classical_performer.hashCode()) * 37) + this.volume_level.hashCode()) * 37) + this.time.hashCode()) * 37) + this.help_topic.hashCode()) * 37) + this.social_nicety.hashCode()) * 37) + this.play_context_reference.hashCode()) * 37) + this.location.hashCode()) * 37) + this.my_likes.hashCode()) * 37) + this.popularity.hashCode()) * 37) + this.quality.hashCode()) * 37) + this.recency.hashCode()) * 37) + this.track_number.hashCode()) * 37) + this.video.hashCode()) * 37) + this.mood.hashCode()) * 37) + this.playback_device.hashCode()) * 37) + this.application_view.hashCode()) * 37) + this.podcast.hashCode()) * 37) + this.lyrics.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.requested_entity_type.isEmpty()) {
            sb.append(", requested_entity_type=");
            sb.append(this.requested_entity_type);
        }
        if (!this.name.isEmpty()) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (!this.artist.isEmpty()) {
            sb.append(", artist=");
            sb.append(this.artist);
        }
        if (!this.track.isEmpty()) {
            sb.append(", track=");
            sb.append(this.track);
        }
        if (!this.album.isEmpty()) {
            sb.append(", album=");
            sb.append(this.album);
        }
        if (!this.playlist.isEmpty()) {
            sb.append(", playlist=");
            sb.append(this.playlist);
        }
        if (!this.record_label.isEmpty()) {
            sb.append(", record_label=");
            sb.append(this.record_label);
        }
        if (!this.chart.isEmpty()) {
            sb.append(", chart=");
            sb.append(this.chart);
        }
        if (!this.genre.isEmpty()) {
            sb.append(", genre=");
            sb.append(this.genre);
        }
        if (!this.descriptor.isEmpty()) {
            sb.append(", descriptor=");
            sb.append(this.descriptor);
        }
        if (!this.my_library.isEmpty()) {
            sb.append(", my_library=");
            sb.append(this.my_library);
        }
        if (!this.user_activity_context.isEmpty()) {
            sb.append(", user_activity_context=");
            sb.append(this.user_activity_context);
        }
        if (!this.cultural_reference.isEmpty()) {
            sb.append(", cultural_reference=");
            sb.append(this.cultural_reference);
        }
        if (!this.movie_tv.isEmpty()) {
            sb.append(", movie_tv=");
            sb.append(this.movie_tv);
        }
        if (!this.date.isEmpty()) {
            sb.append(", date=");
            sb.append(this.date);
        }
        if (!this.chronology.isEmpty()) {
            sb.append(", chronology=");
            sb.append(this.chronology);
        }
        if (!this.classical_composer.isEmpty()) {
            sb.append(", classical_composer=");
            sb.append(this.classical_composer);
        }
        if (!this.classical_composition.isEmpty()) {
            sb.append(", classical_composition=");
            sb.append(this.classical_composition);
        }
        if (!this.classical_section.isEmpty()) {
            sb.append(", classical_section=");
            sb.append(this.classical_section);
        }
        if (!this.classical_performer.isEmpty()) {
            sb.append(", classical_performer=");
            sb.append(this.classical_performer);
        }
        if (!this.volume_level.isEmpty()) {
            sb.append(", volume_level=");
            sb.append(this.volume_level);
        }
        if (!this.time.isEmpty()) {
            sb.append(", time=");
            sb.append(this.time);
        }
        if (!this.help_topic.isEmpty()) {
            sb.append(", help_topic=");
            sb.append(this.help_topic);
        }
        if (!this.social_nicety.isEmpty()) {
            sb.append(", social_nicety=");
            sb.append(this.social_nicety);
        }
        if (!this.play_context_reference.isEmpty()) {
            sb.append(", play_context_reference=");
            sb.append(this.play_context_reference);
        }
        if (!this.location.isEmpty()) {
            sb.append(", location=");
            sb.append(this.location);
        }
        if (!this.my_likes.isEmpty()) {
            sb.append(", my_likes=");
            sb.append(this.my_likes);
        }
        if (!this.popularity.isEmpty()) {
            sb.append(", popularity=");
            sb.append(this.popularity);
        }
        if (!this.quality.isEmpty()) {
            sb.append(", quality=");
            sb.append(this.quality);
        }
        if (!this.recency.isEmpty()) {
            sb.append(", recency=");
            sb.append(this.recency);
        }
        if (!this.track_number.isEmpty()) {
            sb.append(", track_number=");
            sb.append(this.track_number);
        }
        if (!this.video.isEmpty()) {
            sb.append(", video=");
            sb.append(this.video);
        }
        if (!this.mood.isEmpty()) {
            sb.append(", mood=");
            sb.append(this.mood);
        }
        if (!this.playback_device.isEmpty()) {
            sb.append(", playback_device=");
            sb.append(this.playback_device);
        }
        if (!this.application_view.isEmpty()) {
            sb.append(", application_view=");
            sb.append(this.application_view);
        }
        if (!this.podcast.isEmpty()) {
            sb.append(", podcast=");
            sb.append(this.podcast);
        }
        if (!this.lyrics.isEmpty()) {
            sb.append(", lyrics=");
            sb.append(this.lyrics);
        }
        StringBuilder replace = sb.replace(0, 2, "Slots{");
        replace.append('}');
        return replace.toString();
    }
}
