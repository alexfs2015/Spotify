package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class ConsumerResponse extends GeneratedMessageLite<ConsumerResponse, a> implements wez {
    /* access modifiers changed from: private */
    public static final ConsumerResponse v;
    private static volatile fll<ConsumerResponse> w;
    public e<String> d = flm.d();
    private int e;
    private TopArtistStory f;
    private SecondaryArtistsStory g;
    private SeasonStory h;
    private SeasonStory i;
    private SeasonStory j;
    private SeasonStory k;
    private PremiumStory l;
    private PodcastsStory m;
    private DecadeTopTracksArtistsStory n;
    private GlobalCitizenStory o;
    private TopSongsStory p;
    private TopGenreStory q;
    private MinutesListenedStory r;
    private DecadesStory s;
    private ArtistOfTheDecadeStory t;
    private Top100PlaylistStory u;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ConsumerResponse, a> implements wez {
        private a() {
            super(ConsumerResponse.v);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        ConsumerResponse consumerResponse = new ConsumerResponse();
        v = consumerResponse;
        consumerResponse.e();
    }

    private ConsumerResponse() {
    }

    private Top100PlaylistStory A() {
        Top100PlaylistStory top100PlaylistStory = this.u;
        return top100PlaylistStory == null ? Top100PlaylistStory.k() : top100PlaylistStory;
    }

    public static fll<ConsumerResponse> parser() {
        return v.c();
    }

    private PremiumStory y() {
        PremiumStory premiumStory = this.l;
        return premiumStory == null ? PremiumStory.k() : premiumStory;
    }

    private ArtistOfTheDecadeStory z() {
        ArtistOfTheDecadeStory artistOfTheDecadeStory = this.t;
        return artistOfTheDecadeStory == null ? ArtistOfTheDecadeStory.k() : artistOfTheDecadeStory;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new ConsumerResponse();
            case IS_INITIALIZED:
                return v;
            case MAKE_IMMUTABLE:
                this.d.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                ConsumerResponse consumerResponse = (ConsumerResponse) obj2;
                this.d = fVar.a(this.d, consumerResponse.d);
                this.f = (TopArtistStory) fVar.a(this.f, consumerResponse.f);
                this.g = (SecondaryArtistsStory) fVar.a(this.g, consumerResponse.g);
                this.h = (SeasonStory) fVar.a(this.h, consumerResponse.h);
                this.i = (SeasonStory) fVar.a(this.i, consumerResponse.i);
                this.j = (SeasonStory) fVar.a(this.j, consumerResponse.j);
                this.k = (SeasonStory) fVar.a(this.k, consumerResponse.k);
                this.l = (PremiumStory) fVar.a(this.l, consumerResponse.l);
                this.m = (PodcastsStory) fVar.a(this.m, consumerResponse.m);
                this.n = (DecadeTopTracksArtistsStory) fVar.a(this.n, consumerResponse.n);
                this.o = (GlobalCitizenStory) fVar.a(this.o, consumerResponse.o);
                this.p = (TopSongsStory) fVar.a(this.p, consumerResponse.p);
                this.q = (TopGenreStory) fVar.a(this.q, consumerResponse.q);
                this.r = (MinutesListenedStory) fVar.a(this.r, consumerResponse.r);
                this.s = (DecadesStory) fVar.a(this.s, consumerResponse.s);
                this.t = (ArtistOfTheDecadeStory) fVar.a(this.t, consumerResponse.t);
                this.u = (Top100PlaylistStory) fVar.a(this.u, consumerResponse.u);
                if (fVar == e.a) {
                    this.e |= consumerResponse.e;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                fky fky = (fky) obj2;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        switch (a2) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                String d2 = fkw.d();
                                if (!this.d.a()) {
                                    this.d = GeneratedMessageLite.a(this.d);
                                }
                                this.d.add(d2);
                                break;
                            case 18:
                                com.spotify.wrapped2019.v1.proto.TopArtistStory.a aVar = this.f != null ? (com.spotify.wrapped2019.v1.proto.TopArtistStory.a) this.f.h() : null;
                                this.f = (TopArtistStory) fkw.a(TopArtistStory.parser(), fky);
                                if (aVar == null) {
                                    break;
                                } else {
                                    aVar.a(this.f);
                                    this.f = (TopArtistStory) aVar.e();
                                    break;
                                }
                            case 26:
                                com.spotify.wrapped2019.v1.proto.SecondaryArtistsStory.a aVar2 = this.g != null ? (com.spotify.wrapped2019.v1.proto.SecondaryArtistsStory.a) this.g.h() : null;
                                this.g = (SecondaryArtistsStory) fkw.a(SecondaryArtistsStory.parser(), fky);
                                if (aVar2 == null) {
                                    break;
                                } else {
                                    aVar2.a(this.g);
                                    this.g = (SecondaryArtistsStory) aVar2.e();
                                    break;
                                }
                            case 34:
                                com.spotify.wrapped2019.v1.proto.SeasonStory.a aVar3 = this.h != null ? (com.spotify.wrapped2019.v1.proto.SeasonStory.a) this.h.h() : null;
                                this.h = (SeasonStory) fkw.a(SeasonStory.parser(), fky);
                                if (aVar3 == null) {
                                    break;
                                } else {
                                    aVar3.a(this.h);
                                    this.h = (SeasonStory) aVar3.e();
                                    break;
                                }
                            case 42:
                                com.spotify.wrapped2019.v1.proto.SeasonStory.a aVar4 = this.i != null ? (com.spotify.wrapped2019.v1.proto.SeasonStory.a) this.i.h() : null;
                                this.i = (SeasonStory) fkw.a(SeasonStory.parser(), fky);
                                if (aVar4 == null) {
                                    break;
                                } else {
                                    aVar4.a(this.i);
                                    this.i = (SeasonStory) aVar4.e();
                                    break;
                                }
                            case 50:
                                com.spotify.wrapped2019.v1.proto.SeasonStory.a aVar5 = this.j != null ? (com.spotify.wrapped2019.v1.proto.SeasonStory.a) this.j.h() : null;
                                this.j = (SeasonStory) fkw.a(SeasonStory.parser(), fky);
                                if (aVar5 == null) {
                                    break;
                                } else {
                                    aVar5.a(this.j);
                                    this.j = (SeasonStory) aVar5.e();
                                    break;
                                }
                            case 58:
                                com.spotify.wrapped2019.v1.proto.SeasonStory.a aVar6 = this.k != null ? (com.spotify.wrapped2019.v1.proto.SeasonStory.a) this.k.h() : null;
                                this.k = (SeasonStory) fkw.a(SeasonStory.parser(), fky);
                                if (aVar6 == null) {
                                    break;
                                } else {
                                    aVar6.a(this.k);
                                    this.k = (SeasonStory) aVar6.e();
                                    break;
                                }
                            case b.bu /*66*/:
                                com.spotify.wrapped2019.v1.proto.PremiumStory.a aVar7 = this.l != null ? (com.spotify.wrapped2019.v1.proto.PremiumStory.a) this.l.h() : null;
                                this.l = (PremiumStory) fkw.a(PremiumStory.parser(), fky);
                                if (aVar7 == null) {
                                    break;
                                } else {
                                    aVar7.a(this.l);
                                    this.l = (PremiumStory) aVar7.e();
                                    break;
                                }
                            case b.bC /*74*/:
                                com.spotify.wrapped2019.v1.proto.PodcastsStory.a aVar8 = this.m != null ? (com.spotify.wrapped2019.v1.proto.PodcastsStory.a) this.m.h() : null;
                                this.m = (PodcastsStory) fkw.a(PodcastsStory.parser(), fky);
                                if (aVar8 == null) {
                                    break;
                                } else {
                                    aVar8.a(this.m);
                                    this.m = (PodcastsStory) aVar8.e();
                                    break;
                                }
                            case 82:
                                com.spotify.wrapped2019.v1.proto.DecadeTopTracksArtistsStory.a aVar9 = this.n != null ? (com.spotify.wrapped2019.v1.proto.DecadeTopTracksArtistsStory.a) this.n.h() : null;
                                this.n = (DecadeTopTracksArtistsStory) fkw.a(DecadeTopTracksArtistsStory.parser(), fky);
                                if (aVar9 == null) {
                                    break;
                                } else {
                                    aVar9.a(this.n);
                                    this.n = (DecadeTopTracksArtistsStory) aVar9.e();
                                    break;
                                }
                            case 90:
                                com.spotify.wrapped2019.v1.proto.GlobalCitizenStory.a aVar10 = this.o != null ? (com.spotify.wrapped2019.v1.proto.GlobalCitizenStory.a) this.o.h() : null;
                                this.o = (GlobalCitizenStory) fkw.a(GlobalCitizenStory.parser(), fky);
                                if (aVar10 == null) {
                                    break;
                                } else {
                                    aVar10.a(this.o);
                                    this.o = (GlobalCitizenStory) aVar10.e();
                                    break;
                                }
                            case 98:
                                com.spotify.wrapped2019.v1.proto.TopSongsStory.a aVar11 = this.p != null ? (com.spotify.wrapped2019.v1.proto.TopSongsStory.a) this.p.h() : null;
                                this.p = (TopSongsStory) fkw.a(TopSongsStory.parser(), fky);
                                if (aVar11 == null) {
                                    break;
                                } else {
                                    aVar11.a(this.p);
                                    this.p = (TopSongsStory) aVar11.e();
                                    break;
                                }
                            case 106:
                                com.spotify.wrapped2019.v1.proto.TopGenreStory.a aVar12 = this.q != null ? (com.spotify.wrapped2019.v1.proto.TopGenreStory.a) this.q.h() : null;
                                this.q = (TopGenreStory) fkw.a(TopGenreStory.parser(), fky);
                                if (aVar12 == null) {
                                    break;
                                } else {
                                    aVar12.a(this.q);
                                    this.q = (TopGenreStory) aVar12.e();
                                    break;
                                }
                            case defpackage.o.a.aB /*114*/:
                                com.spotify.wrapped2019.v1.proto.MinutesListenedStory.a aVar13 = this.r != null ? (com.spotify.wrapped2019.v1.proto.MinutesListenedStory.a) this.r.h() : null;
                                this.r = (MinutesListenedStory) fkw.a(MinutesListenedStory.parser(), fky);
                                if (aVar13 == null) {
                                    break;
                                } else {
                                    aVar13.a(this.r);
                                    this.r = (MinutesListenedStory) aVar13.e();
                                    break;
                                }
                            case 122:
                                com.spotify.wrapped2019.v1.proto.DecadesStory.a aVar14 = this.s != null ? (com.spotify.wrapped2019.v1.proto.DecadesStory.a) this.s.h() : null;
                                this.s = (DecadesStory) fkw.a(DecadesStory.parser(), fky);
                                if (aVar14 == null) {
                                    break;
                                } else {
                                    aVar14.a(this.s);
                                    this.s = (DecadesStory) aVar14.e();
                                    break;
                                }
                            case 130:
                                com.spotify.wrapped2019.v1.proto.ArtistOfTheDecadeStory.a aVar15 = this.t != null ? (com.spotify.wrapped2019.v1.proto.ArtistOfTheDecadeStory.a) this.t.h() : null;
                                this.t = (ArtistOfTheDecadeStory) fkw.a(ArtistOfTheDecadeStory.parser(), fky);
                                if (aVar15 == null) {
                                    break;
                                } else {
                                    aVar15.a(this.t);
                                    this.t = (ArtistOfTheDecadeStory) aVar15.e();
                                    break;
                                }
                            case 138:
                                com.spotify.wrapped2019.v1.proto.Top100PlaylistStory.a aVar16 = this.u != null ? (com.spotify.wrapped2019.v1.proto.Top100PlaylistStory.a) this.u.h() : null;
                                this.u = (Top100PlaylistStory) fkw.a(Top100PlaylistStory.parser(), fky);
                                if (aVar16 == null) {
                                    break;
                                } else {
                                    aVar16.a(this.u);
                                    this.u = (Top100PlaylistStory) aVar16.e();
                                    break;
                                }
                            default:
                                if (fkw.b(a2)) {
                                    break;
                                }
                                z = true;
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
                if (w == null) {
                    synchronized (ConsumerResponse.class) {
                        if (w == null) {
                            w = new b(v);
                        }
                    }
                }
                return w;
            default:
                throw new UnsupportedOperationException();
        }
        return v;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            codedOutputStream.a(1, (String) this.d.get(i2));
        }
        if (this.f != null) {
            codedOutputStream.a(2, (fli) k());
        }
        if (this.g != null) {
            codedOutputStream.a(3, (fli) l());
        }
        if (this.h != null) {
            codedOutputStream.a(4, (fli) m());
        }
        if (this.i != null) {
            codedOutputStream.a(5, (fli) n());
        }
        if (this.j != null) {
            codedOutputStream.a(6, (fli) o());
        }
        if (this.k != null) {
            codedOutputStream.a(7, (fli) p());
        }
        if (this.l != null) {
            codedOutputStream.a(8, (fli) y());
        }
        if (this.m != null) {
            codedOutputStream.a(9, (fli) q());
        }
        if (this.n != null) {
            codedOutputStream.a(10, (fli) r());
        }
        if (this.o != null) {
            codedOutputStream.a(11, (fli) s());
        }
        if (this.p != null) {
            codedOutputStream.a(12, (fli) t());
        }
        if (this.q != null) {
            codedOutputStream.a(13, (fli) u());
        }
        if (this.r != null) {
            codedOutputStream.a(14, (fli) v());
        }
        if (this.s != null) {
            codedOutputStream.a(15, (fli) w());
        }
        if (this.t != null) {
            codedOutputStream.a(16, (fli) z());
        }
        if (this.u != null) {
            codedOutputStream.a(17, (fli) A());
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.d.size(); i4++) {
            i3 += CodedOutputStream.b((String) this.d.get(i4));
        }
        int size = i3 + 0 + (this.d.size() * 1);
        if (this.f != null) {
            size += CodedOutputStream.b(2, (fli) k());
        }
        if (this.g != null) {
            size += CodedOutputStream.b(3, (fli) l());
        }
        if (this.h != null) {
            size += CodedOutputStream.b(4, (fli) m());
        }
        if (this.i != null) {
            size += CodedOutputStream.b(5, (fli) n());
        }
        if (this.j != null) {
            size += CodedOutputStream.b(6, (fli) o());
        }
        if (this.k != null) {
            size += CodedOutputStream.b(7, (fli) p());
        }
        if (this.l != null) {
            size += CodedOutputStream.b(8, (fli) y());
        }
        if (this.m != null) {
            size += CodedOutputStream.b(9, (fli) q());
        }
        if (this.n != null) {
            size += CodedOutputStream.b(10, (fli) r());
        }
        if (this.o != null) {
            size += CodedOutputStream.b(11, (fli) s());
        }
        if (this.p != null) {
            size += CodedOutputStream.b(12, (fli) t());
        }
        if (this.q != null) {
            size += CodedOutputStream.b(13, (fli) u());
        }
        if (this.r != null) {
            size += CodedOutputStream.b(14, (fli) v());
        }
        if (this.s != null) {
            size += CodedOutputStream.b(15, (fli) w());
        }
        if (this.t != null) {
            size += CodedOutputStream.b(16, (fli) z());
        }
        if (this.u != null) {
            size += CodedOutputStream.b(17, (fli) A());
        }
        this.c = size;
        return size;
    }

    public final TopArtistStory k() {
        TopArtistStory topArtistStory = this.f;
        return topArtistStory == null ? TopArtistStory.n() : topArtistStory;
    }

    public final SecondaryArtistsStory l() {
        SecondaryArtistsStory secondaryArtistsStory = this.g;
        return secondaryArtistsStory == null ? SecondaryArtistsStory.k() : secondaryArtistsStory;
    }

    public final SeasonStory m() {
        SeasonStory seasonStory = this.h;
        return seasonStory == null ? SeasonStory.k() : seasonStory;
    }

    public final SeasonStory n() {
        SeasonStory seasonStory = this.i;
        return seasonStory == null ? SeasonStory.k() : seasonStory;
    }

    public final SeasonStory o() {
        SeasonStory seasonStory = this.j;
        return seasonStory == null ? SeasonStory.k() : seasonStory;
    }

    public final SeasonStory p() {
        SeasonStory seasonStory = this.k;
        return seasonStory == null ? SeasonStory.k() : seasonStory;
    }

    public final PodcastsStory q() {
        PodcastsStory podcastsStory = this.m;
        return podcastsStory == null ? PodcastsStory.m() : podcastsStory;
    }

    public final DecadeTopTracksArtistsStory r() {
        DecadeTopTracksArtistsStory decadeTopTracksArtistsStory = this.n;
        return decadeTopTracksArtistsStory == null ? DecadeTopTracksArtistsStory.l() : decadeTopTracksArtistsStory;
    }

    public final GlobalCitizenStory s() {
        GlobalCitizenStory globalCitizenStory = this.o;
        return globalCitizenStory == null ? GlobalCitizenStory.l() : globalCitizenStory;
    }

    public final TopSongsStory t() {
        TopSongsStory topSongsStory = this.p;
        return topSongsStory == null ? TopSongsStory.k() : topSongsStory;
    }

    public final TopGenreStory u() {
        TopGenreStory topGenreStory = this.q;
        return topGenreStory == null ? TopGenreStory.k() : topGenreStory;
    }

    public final MinutesListenedStory v() {
        MinutesListenedStory minutesListenedStory = this.r;
        return minutesListenedStory == null ? MinutesListenedStory.k() : minutesListenedStory;
    }

    public final DecadesStory w() {
        DecadesStory decadesStory = this.s;
        return decadesStory == null ? DecadesStory.m() : decadesStory;
    }
}
