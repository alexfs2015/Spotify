package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Entity extends GeneratedMessageLite<Entity, a> implements vwl {
    /* access modifiers changed from: private */
    public static final Entity i;
    private static volatile fll<Entity> j;
    public int d = 0;
    public String e;
    public String f;
    public String g;
    private Object h;

    public enum EntityCase implements b {
        ARTIST(4),
        TRACK(5),
        ALBUM(6),
        PLAYLIST(7),
        GENRE(8),
        AUDIO_SHOW(9),
        AUDIO_EPISODE(10),
        PROFILE(11),
        ENTITY_NOT_SET(0);
        
        private final int value;

        private EntityCase(int i) {
            this.value = i;
        }

        public static EntityCase a(int i) {
            if (i == 0) {
                return ENTITY_NOT_SET;
            }
            switch (i) {
                case 4:
                    return ARTIST;
                case 5:
                    return TRACK;
                case 6:
                    return ALBUM;
                case 7:
                    return PLAYLIST;
                case 8:
                    return GENRE;
                case 9:
                    return AUDIO_SHOW;
                case 10:
                    return AUDIO_EPISODE;
                case 11:
                    return PROFILE;
                default:
                    return null;
            }
        }

        public final int a() {
            return this.value;
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Entity, a> implements vwl {
        private a() {
            super(Entity.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Entity entity = new Entity();
        i = entity;
        entity.e();
    }

    private Entity() {
        String str = "";
        this.e = str;
        this.f = str;
        this.g = str;
    }

    public static fll<Entity> parser() {
        return i.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = true;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Entity();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Entity entity = (Entity) obj2;
                this.e = fVar.a(!this.e.isEmpty(), this.e, !entity.e.isEmpty(), entity.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, !entity.f.isEmpty(), entity.f);
                this.g = fVar.a(!this.g.isEmpty(), this.g, !entity.g.isEmpty(), entity.g);
                switch (EntityCase.a(entity.d)) {
                    case ARTIST:
                        if (this.d != 4) {
                            z = false;
                        }
                        this.h = fVar.e(z, this.h, entity.h);
                        break;
                    case TRACK:
                        if (this.d != 5) {
                            z = false;
                        }
                        this.h = fVar.e(z, this.h, entity.h);
                        break;
                    case ALBUM:
                        if (this.d != 6) {
                            z = false;
                        }
                        this.h = fVar.e(z, this.h, entity.h);
                        break;
                    case PLAYLIST:
                        if (this.d != 7) {
                            z = false;
                        }
                        this.h = fVar.e(z, this.h, entity.h);
                        break;
                    case GENRE:
                        if (this.d != 8) {
                            z = false;
                        }
                        this.h = fVar.e(z, this.h, entity.h);
                        break;
                    case AUDIO_SHOW:
                        if (this.d != 9) {
                            z = false;
                        }
                        this.h = fVar.e(z, this.h, entity.h);
                        break;
                    case AUDIO_EPISODE:
                        if (this.d != 10) {
                            z = false;
                        }
                        this.h = fVar.e(z, this.h, entity.h);
                        break;
                    case PROFILE:
                        if (this.d != 11) {
                            z = false;
                        }
                        this.h = fVar.e(z, this.h, entity.h);
                        break;
                    case ENTITY_NOT_SET:
                        if (this.d == 0) {
                            z = false;
                        }
                        fVar.a(z);
                        break;
                }
                if (fVar == e.a) {
                    int i2 = entity.d;
                    if (i2 != 0) {
                        this.d = i2;
                    }
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                fky fky = (fky) obj2;
                boolean z2 = false;
                while (!z2) {
                    try {
                        int a2 = fkw.a();
                        switch (a2) {
                            case 0:
                                z2 = true;
                                break;
                            case 10:
                                this.e = fkw.d();
                                break;
                            case 18:
                                this.f = fkw.d();
                                break;
                            case 26:
                                this.g = fkw.d();
                                break;
                            case 34:
                                com.spotify.searchview.proto.Artist.a aVar = this.d == 4 ? (com.spotify.searchview.proto.Artist.a) ((Artist) this.h).h() : null;
                                this.h = fkw.a(Artist.parser(), fky);
                                if (aVar != null) {
                                    aVar.a((Artist) this.h);
                                    this.h = aVar.e();
                                }
                                this.d = 4;
                                break;
                            case 42:
                                com.spotify.searchview.proto.Track.a aVar2 = this.d == 5 ? (com.spotify.searchview.proto.Track.a) ((Track) this.h).h() : null;
                                this.h = fkw.a(Track.parser(), fky);
                                if (aVar2 != null) {
                                    aVar2.a((Track) this.h);
                                    this.h = aVar2.e();
                                }
                                this.d = 5;
                                break;
                            case 50:
                                com.spotify.searchview.proto.Album.a aVar3 = this.d == 6 ? (com.spotify.searchview.proto.Album.a) ((Album) this.h).h() : null;
                                this.h = fkw.a(Album.parser(), fky);
                                if (aVar3 != null) {
                                    aVar3.a((Album) this.h);
                                    this.h = aVar3.e();
                                }
                                this.d = 6;
                                break;
                            case 58:
                                com.spotify.searchview.proto.Playlist.a aVar4 = this.d == 7 ? (com.spotify.searchview.proto.Playlist.a) ((Playlist) this.h).h() : null;
                                this.h = fkw.a(Playlist.parser(), fky);
                                if (aVar4 != null) {
                                    aVar4.a((Playlist) this.h);
                                    this.h = aVar4.e();
                                }
                                this.d = 7;
                                break;
                            case b.bu /*66*/:
                                com.spotify.searchview.proto.Genre.a aVar5 = this.d == 8 ? (com.spotify.searchview.proto.Genre.a) ((Genre) this.h).h() : null;
                                this.h = fkw.a(Genre.parser(), fky);
                                if (aVar5 != null) {
                                    aVar5.a((Genre) this.h);
                                    this.h = aVar5.e();
                                }
                                this.d = 8;
                                break;
                            case b.bC /*74*/:
                                com.spotify.searchview.proto.AudioShow.a aVar6 = this.d == 9 ? (com.spotify.searchview.proto.AudioShow.a) ((AudioShow) this.h).h() : null;
                                this.h = fkw.a(AudioShow.parser(), fky);
                                if (aVar6 != null) {
                                    aVar6.a((AudioShow) this.h);
                                    this.h = aVar6.e();
                                }
                                this.d = 9;
                                break;
                            case 82:
                                com.spotify.searchview.proto.AudioEpisode.a aVar7 = this.d == 10 ? (com.spotify.searchview.proto.AudioEpisode.a) ((AudioEpisode) this.h).h() : null;
                                this.h = fkw.a(AudioEpisode.parser(), fky);
                                if (aVar7 != null) {
                                    aVar7.a((AudioEpisode) this.h);
                                    this.h = aVar7.e();
                                }
                                this.d = 10;
                                break;
                            case 90:
                                com.spotify.searchview.proto.Profile.a aVar8 = this.d == 11 ? (com.spotify.searchview.proto.Profile.a) ((Profile) this.h).h() : null;
                                this.h = fkw.a(Profile.parser(), fky);
                                if (aVar8 != null) {
                                    aVar8.a((Profile) this.h);
                                    this.h = aVar8.e();
                                }
                                this.d = 11;
                                break;
                            default:
                                if (fkw.b(a2)) {
                                    break;
                                }
                                z2 = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        e2.unfinishedMessage = this;
                        throw new RuntimeException(e2);
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.unfinishedMessage = this;
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case GET_DEFAULT_INSTANCE:
                break;
            case GET_PARSER:
                if (j == null) {
                    synchronized (Entity.class) {
                        if (j == null) {
                            j = new b(i);
                        }
                    }
                }
                return j;
            default:
                throw new UnsupportedOperationException();
        }
        return i;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.e.isEmpty()) {
            codedOutputStream.a(1, this.e);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.a(2, this.f);
        }
        if (!this.g.isEmpty()) {
            codedOutputStream.a(3, this.g);
        }
        if (this.d == 4) {
            codedOutputStream.a(4, (fli) (Artist) this.h);
        }
        if (this.d == 5) {
            codedOutputStream.a(5, (fli) (Track) this.h);
        }
        if (this.d == 6) {
            codedOutputStream.a(6, (fli) (Album) this.h);
        }
        if (this.d == 7) {
            codedOutputStream.a(7, (fli) (Playlist) this.h);
        }
        if (this.d == 8) {
            codedOutputStream.a(8, (fli) (Genre) this.h);
        }
        if (this.d == 9) {
            codedOutputStream.a(9, (fli) (AudioShow) this.h);
        }
        if (this.d == 10) {
            codedOutputStream.a(10, (fli) (AudioEpisode) this.h);
        }
        if (this.d == 11) {
            codedOutputStream.a(11, (fli) (Profile) this.h);
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (!this.e.isEmpty()) {
            i3 = 0 + CodedOutputStream.b(1, this.e);
        }
        if (!this.f.isEmpty()) {
            i3 += CodedOutputStream.b(2, this.f);
        }
        if (!this.g.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.g);
        }
        if (this.d == 4) {
            i3 += CodedOutputStream.b(4, (fli) (Artist) this.h);
        }
        if (this.d == 5) {
            i3 += CodedOutputStream.b(5, (fli) (Track) this.h);
        }
        if (this.d == 6) {
            i3 += CodedOutputStream.b(6, (fli) (Album) this.h);
        }
        if (this.d == 7) {
            i3 += CodedOutputStream.b(7, (fli) (Playlist) this.h);
        }
        if (this.d == 8) {
            i3 += CodedOutputStream.b(8, (fli) (Genre) this.h);
        }
        if (this.d == 9) {
            i3 += CodedOutputStream.b(9, (fli) (AudioShow) this.h);
        }
        if (this.d == 10) {
            i3 += CodedOutputStream.b(10, (fli) (AudioEpisode) this.h);
        }
        if (this.d == 11) {
            i3 += CodedOutputStream.b(11, (fli) (Profile) this.h);
        }
        this.c = i3;
        return i3;
    }

    public final Track k() {
        return this.d == 5 ? (Track) this.h : Track.l();
    }

    public final Album l() {
        return this.d == 6 ? (Album) this.h : Album.l();
    }

    public final AudioShow m() {
        return this.d == 9 ? (AudioShow) this.h : AudioShow.k();
    }

    public final AudioEpisode n() {
        return this.d == 10 ? (AudioEpisode) this.h : AudioEpisode.l();
    }
}
