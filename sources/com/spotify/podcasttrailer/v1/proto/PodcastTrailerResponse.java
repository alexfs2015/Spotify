package com.spotify.podcasttrailer.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PodcastTrailerResponse extends GeneratedMessageLite<PodcastTrailerResponse, a> implements voq {
    /* access modifiers changed from: private */
    public static final PodcastTrailerResponse k;
    private static volatile fll<PodcastTrailerResponse> l;
    public String d;
    public String e;
    public String f;
    public int g;
    public boolean h;
    private String i;
    private String j;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PodcastTrailerResponse, a> implements voq {
        private a() {
            super(PodcastTrailerResponse.k);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        PodcastTrailerResponse podcastTrailerResponse = new PodcastTrailerResponse();
        k = podcastTrailerResponse;
        podcastTrailerResponse.e();
    }

    private PodcastTrailerResponse() {
        String str = "";
        this.d = str;
        this.e = str;
        this.i = str;
        this.f = str;
        this.j = str;
    }

    public static PodcastTrailerResponse a(byte[] bArr) {
        return (PodcastTrailerResponse) GeneratedMessageLite.a(k, bArr);
    }

    public static fll<PodcastTrailerResponse> parser() {
        return k.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new PodcastTrailerResponse();
            case IS_INITIALIZED:
                return k;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                PodcastTrailerResponse podcastTrailerResponse = (PodcastTrailerResponse) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !podcastTrailerResponse.d.isEmpty(), podcastTrailerResponse.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !podcastTrailerResponse.e.isEmpty(), podcastTrailerResponse.e);
                this.i = fVar.a(!this.i.isEmpty(), this.i, !podcastTrailerResponse.i.isEmpty(), podcastTrailerResponse.i);
                this.f = fVar.a(!this.f.isEmpty(), this.f, !podcastTrailerResponse.f.isEmpty(), podcastTrailerResponse.f);
                this.j = fVar.a(!this.j.isEmpty(), this.j, !podcastTrailerResponse.j.isEmpty(), podcastTrailerResponse.j);
                boolean z2 = this.g != 0;
                int i2 = this.g;
                if (podcastTrailerResponse.g != 0) {
                    z = true;
                }
                this.g = fVar.a(z2, i2, z, podcastTrailerResponse.g);
                boolean z3 = this.h;
                boolean z4 = podcastTrailerResponse.h;
                this.h = fVar.a(z3, z3, z4, z4);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.d = fkw.d();
                            } else if (a2 == 18) {
                                this.e = fkw.d();
                            } else if (a2 == 26) {
                                this.i = fkw.d();
                            } else if (a2 == 34) {
                                this.f = fkw.d();
                            } else if (a2 == 42) {
                                this.j = fkw.d();
                            } else if (a2 == 48) {
                                this.g = fkw.g();
                            } else if (a2 == 56) {
                                this.h = fkw.b();
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
                if (l == null) {
                    synchronized (PodcastTrailerResponse.class) {
                        if (l == null) {
                            l = new b(k);
                        }
                    }
                }
                return l;
            default:
                throw new UnsupportedOperationException();
        }
        return k;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.a(2, this.e);
        }
        if (!this.i.isEmpty()) {
            codedOutputStream.a(3, this.i);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.a(4, this.f);
        }
        if (!this.j.isEmpty()) {
            codedOutputStream.a(5, this.j);
        }
        int i2 = this.g;
        if (i2 != 0) {
            codedOutputStream.b(6, i2);
        }
        boolean z = this.h;
        if (z) {
            codedOutputStream.a(7, z);
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
        if (!this.i.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.i);
        }
        if (!this.f.isEmpty()) {
            i3 += CodedOutputStream.b(4, this.f);
        }
        if (!this.j.isEmpty()) {
            i3 += CodedOutputStream.b(5, this.j);
        }
        int i4 = this.g;
        if (i4 != 0) {
            i3 += CodedOutputStream.f(6, i4);
        }
        boolean z = this.h;
        if (z) {
            i3 += CodedOutputStream.b(7, z);
        }
        this.c = i3;
        return i3;
    }
}
