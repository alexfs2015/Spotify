package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PodcastsStory extends GeneratedMessageLite<PodcastsStory, a> implements wfj {
    /* access modifiers changed from: private */
    public static final PodcastsStory h;
    private static volatile fll<PodcastsStory> i;
    public String d;
    public String e;
    private RankedEntityList f;
    private EntityInfo g;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PodcastsStory, a> implements wfj {
        private a() {
            super(PodcastsStory.h);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        PodcastsStory podcastsStory = new PodcastsStory();
        h = podcastsStory;
        podcastsStory.e();
    }

    private PodcastsStory() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    public static PodcastsStory m() {
        return h;
    }

    public static fll<PodcastsStory> parser() {
        return h.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new PodcastsStory();
            case IS_INITIALIZED:
                return h;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                PodcastsStory podcastsStory = (PodcastsStory) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !podcastsStory.d.isEmpty(), podcastsStory.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !podcastsStory.e.isEmpty(), podcastsStory.e);
                this.f = (RankedEntityList) fVar.a(this.f, podcastsStory.f);
                this.g = (EntityInfo) fVar.a(this.g, podcastsStory.g);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                fky fky = (fky) obj2;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.d = fkw.d();
                            } else if (a2 == 18) {
                                this.e = fkw.d();
                            } else if (a2 == 26) {
                                com.spotify.wrapped2019.v1.proto.RankedEntityList.a aVar = this.f != null ? (com.spotify.wrapped2019.v1.proto.RankedEntityList.a) this.f.h() : null;
                                this.f = (RankedEntityList) fkw.a(RankedEntityList.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.f);
                                    this.f = (RankedEntityList) aVar.e();
                                }
                            } else if (a2 == 34) {
                                com.spotify.wrapped2019.v1.proto.EntityInfo.a aVar2 = this.g != null ? (com.spotify.wrapped2019.v1.proto.EntityInfo.a) this.g.h() : null;
                                this.g = (EntityInfo) fkw.a(EntityInfo.parser(), fky);
                                if (aVar2 != null) {
                                    aVar2.a(this.g);
                                    this.g = (EntityInfo) aVar2.e();
                                }
                            } else if (!fkw.b(a2)) {
                            }
                        }
                        z = true;
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
                if (i == null) {
                    synchronized (PodcastsStory.class) {
                        if (i == null) {
                            i = new b(h);
                        }
                    }
                }
                return i;
            default:
                throw new UnsupportedOperationException();
        }
        return h;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.a(2, this.e);
        }
        if (this.f != null) {
            codedOutputStream.a(3, (fli) k());
        }
        if (this.g != null) {
            codedOutputStream.a(4, (fli) l());
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (!this.d.isEmpty()) {
            i3 = 0 + CodedOutputStream.b(1, this.d);
        }
        if (!this.e.isEmpty()) {
            i3 += CodedOutputStream.b(2, this.e);
        }
        if (this.f != null) {
            i3 += CodedOutputStream.b(3, (fli) k());
        }
        if (this.g != null) {
            i3 += CodedOutputStream.b(4, (fli) l());
        }
        this.c = i3;
        return i3;
    }

    public final RankedEntityList k() {
        RankedEntityList rankedEntityList = this.f;
        return rankedEntityList == null ? RankedEntityList.k() : rankedEntityList;
    }

    public final EntityInfo l() {
        EntityInfo entityInfo = this.g;
        return entityInfo == null ? EntityInfo.m() : entityInfo;
    }
}
