package com.spotify.nlu.slimo.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import okio.ByteString;

public final class ParsedQuery extends Message<ParsedQuery, Builder> {
    public static final ProtoAdapter<ParsedQuery> ADAPTER = new a();
    public static final Intent DEFAULT_INTENT = Intent.WTF;
    public static final Float DEFAULT_SCORE = Float.valueOf(0.0f);
    public static final String DEFAULT_USER_ID = "";
    public static final String DEFAULT_UTTERANCE = "";
    private static final long serialVersionUID = 0;
    public final Intent intent;
    public final Float score;
    public final Slots slots;
    public final String user_id;
    public final String utterance;

    public static final class Builder extends com.squareup.wire.Message.a<ParsedQuery, Builder> {
        public Intent intent;
        public Float score;
        public Slots slots;
        public String user_id;
        public String utterance;

        public final ParsedQuery build() {
            ParsedQuery parsedQuery = new ParsedQuery(this.intent, this.slots, this.utterance, this.user_id, this.score, super.buildUnknownFields());
            return parsedQuery;
        }

        public final Builder intent(Intent intent2) {
            this.intent = intent2;
            return this;
        }

        public final Builder score(Float f) {
            this.score = f;
            return this;
        }

        public final Builder slots(Slots slots2) {
            this.slots = slots2;
            return this;
        }

        public final Builder user_id(String str) {
            this.user_id = str;
            return this;
        }

        public final Builder utterance(String str) {
            this.utterance = str;
            return this;
        }
    }

    public enum Intent implements whj {
        WTF(0),
        PLAY(1),
        UNSUPPORTED(31),
        NO_INTENT(32),
        SEARCH(2),
        SHOW(3),
        RESUME(4),
        STOP(5),
        NEXT(6),
        PREVIOUS(7),
        MORE_LIKE_THIS(8),
        RECOMMEND_SOMETHING(9),
        SHUFFLE_ON(10),
        SHUFFLE_OFF(11),
        REPEAT_ON(12),
        REPEAT_OFF(13),
        REPEAT_ONE(14),
        VOLUME_UP(15),
        VOLUME_DOWN(16),
        VOLUME_ABSOLUTE(17),
        THUMBS_UP(18),
        THUMBS_DOWN(19),
        SLEEP_TIMER_SET(20),
        SLEEP_TIMER_CANCEL(21),
        SET_ALARM(22),
        ADD_TO_PLAYLIST(23),
        ADD_TO_COLLECTION(24),
        ADD_TO_QUEUE(25),
        HELP(26),
        WHATS_PLAYING(27),
        GENERAL_MUSIC_INFO(28),
        FOLLOW(29),
        SHARE(30),
        CHAT(33),
        NAVIGATE(34),
        PLAY_AGAIN(35),
        BAN(36),
        MORE_OF(37),
        PULL_CONTEXT(38);
        
        public static final ProtoAdapter<Intent> b = null;
        private final int value;

        static {
            b = ProtoAdapter.a(Intent.class);
        }

        private Intent(int i) {
            this.value = i;
        }

        public static Intent fromValue(int i) {
            switch (i) {
                case 0:
                    return WTF;
                case 1:
                    return PLAY;
                case 2:
                    return SEARCH;
                case 3:
                    return SHOW;
                case 4:
                    return RESUME;
                case 5:
                    return STOP;
                case 6:
                    return NEXT;
                case 7:
                    return PREVIOUS;
                case 8:
                    return MORE_LIKE_THIS;
                case 9:
                    return RECOMMEND_SOMETHING;
                case 10:
                    return SHUFFLE_ON;
                case 11:
                    return SHUFFLE_OFF;
                case 12:
                    return REPEAT_ON;
                case 13:
                    return REPEAT_OFF;
                case 14:
                    return REPEAT_ONE;
                case 15:
                    return VOLUME_UP;
                case 16:
                    return VOLUME_DOWN;
                case 17:
                    return VOLUME_ABSOLUTE;
                case 18:
                    return THUMBS_UP;
                case 19:
                    return THUMBS_DOWN;
                case 20:
                    return SLEEP_TIMER_SET;
                case 21:
                    return SLEEP_TIMER_CANCEL;
                case 22:
                    return SET_ALARM;
                case 23:
                    return ADD_TO_PLAYLIST;
                case 24:
                    return ADD_TO_COLLECTION;
                case 25:
                    return ADD_TO_QUEUE;
                case 26:
                    return HELP;
                case 27:
                    return WHATS_PLAYING;
                case 28:
                    return GENERAL_MUSIC_INFO;
                case 29:
                    return FOLLOW;
                case 30:
                    return SHARE;
                case 31:
                    return UNSUPPORTED;
                case 32:
                    return NO_INTENT;
                case 33:
                    return CHAT;
                case 34:
                    return NAVIGATE;
                case 35:
                    return PLAY_AGAIN;
                case 36:
                    return BAN;
                case 37:
                    return MORE_OF;
                case 38:
                    return PULL_CONTEXT;
                default:
                    return null;
            }
        }

        public final int getValue() {
            return this.value;
        }
    }

    static final class a extends ProtoAdapter<ParsedQuery> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ParsedQuery.class);
        }

        private static ParsedQuery b(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b == -1) {
                    whg.a(a);
                    return builder.build();
                } else if (b == 1) {
                    try {
                        builder.intent((Intent) Intent.b.a(whg));
                    } catch (EnumConstantNotFoundException e) {
                        builder.addUnknownField(b, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (b == 2) {
                    builder.slots((Slots) Slots.ADAPTER.a(whg));
                } else if (b == 3) {
                    builder.utterance((String) ProtoAdapter.i.a(whg));
                } else if (b == 4) {
                    builder.user_id((String) ProtoAdapter.i.a(whg));
                } else if (b != 5) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.score((Float) ProtoAdapter.h.a(whg));
                }
            }
        }

        public final /* synthetic */ int a(Object obj) {
            ParsedQuery parsedQuery = (ParsedQuery) obj;
            int i = 0;
            int a = (parsedQuery.intent != null ? Intent.b.a(1, parsedQuery.intent) : 0) + (parsedQuery.slots != null ? Slots.ADAPTER.a(2, parsedQuery.slots) : 0) + (parsedQuery.utterance != null ? ProtoAdapter.i.a(3, parsedQuery.utterance) : 0) + (parsedQuery.user_id != null ? ProtoAdapter.i.a(4, parsedQuery.user_id) : 0);
            if (parsedQuery.score != null) {
                i = ProtoAdapter.h.a(5, parsedQuery.score);
            }
            return a + i + parsedQuery.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            return b(whg);
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ParsedQuery parsedQuery = (ParsedQuery) obj;
            if (parsedQuery.intent != null) {
                Intent.b.a(whh, 1, parsedQuery.intent);
            }
            if (parsedQuery.slots != null) {
                Slots.ADAPTER.a(whh, 2, parsedQuery.slots);
            }
            if (parsedQuery.utterance != null) {
                ProtoAdapter.i.a(whh, 3, parsedQuery.utterance);
            }
            if (parsedQuery.user_id != null) {
                ProtoAdapter.i.a(whh, 4, parsedQuery.user_id);
            }
            if (parsedQuery.score != null) {
                ProtoAdapter.h.a(whh, 5, parsedQuery.score);
            }
            whh.a(parsedQuery.a());
        }
    }

    public ParsedQuery(Intent intent2, Slots slots2, String str, String str2, Float f, ByteString byteString) {
        super(ADAPTER, byteString);
        this.intent = intent2;
        this.slots = slots2;
        this.utterance = str;
        this.user_id = str2;
        this.score = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ParsedQuery)) {
            return false;
        }
        ParsedQuery parsedQuery = (ParsedQuery) obj;
        return a().equals(parsedQuery.a()) && whk.a((Object) this.intent, (Object) parsedQuery.intent) && whk.a((Object) this.slots, (Object) parsedQuery.slots) && whk.a((Object) this.utterance, (Object) parsedQuery.utterance) && whk.a((Object) this.user_id, (Object) parsedQuery.user_id) && whk.a((Object) this.score, (Object) parsedQuery.score);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        Intent intent2 = this.intent;
        int i2 = 0;
        int hashCode2 = (hashCode + (intent2 != null ? intent2.hashCode() : 0)) * 37;
        Slots slots2 = this.slots;
        int hashCode3 = (hashCode2 + (slots2 != null ? slots2.hashCode() : 0)) * 37;
        String str = this.utterance;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.user_id;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Float f = this.score;
        if (f != null) {
            i2 = f.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.intent != null) {
            sb.append(", intent=");
            sb.append(this.intent);
        }
        if (this.slots != null) {
            sb.append(", slots=");
            sb.append(this.slots);
        }
        if (this.utterance != null) {
            sb.append(", utterance=");
            sb.append(this.utterance);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.score != null) {
            sb.append(", score=");
            sb.append(this.score);
        }
        StringBuilder replace = sb.replace(0, 2, "ParsedQuery{");
        replace.append('}');
        return replace.toString();
    }
}
