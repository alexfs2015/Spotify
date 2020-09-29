package com.spotify.collection.endpoints.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class TrackListMetadata {

    public static final class ProtoTrackListMetadataResponse extends GeneratedMessageLite<ProtoTrackListMetadataResponse, a> implements gdn {
        /* access modifiers changed from: private */
        public static final ProtoTrackListMetadataResponse i;
        private static volatile fll<ProtoTrackListMetadataResponse> j;
        public int d;
        public String e = "";
        public int f;
        private int g;
        private int h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoTrackListMetadataResponse, a> implements gdn {
            private a() {
                super(ProtoTrackListMetadataResponse.i);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoTrackListMetadataResponse protoTrackListMetadataResponse = new ProtoTrackListMetadataResponse();
            i = protoTrackListMetadataResponse;
            protoTrackListMetadataResponse.e();
        }

        private ProtoTrackListMetadataResponse() {
        }

        private boolean l() {
            return (this.g & 1) == 1;
        }

        private boolean m() {
            return (this.g & 2) == 2;
        }

        private boolean n() {
            return (this.g & 4) == 4;
        }

        private boolean o() {
            return (this.g & 8) == 8;
        }

        public static fll<ProtoTrackListMetadataResponse> parser() {
            return i.c();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoTrackListMetadataResponse();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoTrackListMetadataResponse protoTrackListMetadataResponse = (ProtoTrackListMetadataResponse) obj2;
                    this.h = fVar.a(l(), this.h, protoTrackListMetadataResponse.l(), protoTrackListMetadataResponse.h);
                    this.d = fVar.a(m(), this.d, protoTrackListMetadataResponse.m(), protoTrackListMetadataResponse.d);
                    this.e = fVar.a(n(), this.e, protoTrackListMetadataResponse.n(), protoTrackListMetadataResponse.e);
                    this.f = fVar.a(o(), this.f, protoTrackListMetadataResponse.o(), protoTrackListMetadataResponse.f);
                    if (fVar == e.a) {
                        this.g |= protoTrackListMetadataResponse.g;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.g |= 1;
                                    this.h = fkw.g();
                                } else if (a2 == 16) {
                                    this.g |= 2;
                                    this.d = fkw.g();
                                } else if (a2 == 26) {
                                    String c = fkw.c();
                                    this.g |= 4;
                                    this.e = c;
                                } else if (a2 == 32) {
                                    this.g |= 8;
                                    this.f = fkw.g();
                                } else if (!a(a2, fkw)) {
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
                    if (j == null) {
                        synchronized (ProtoTrackListMetadataResponse.class) {
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
            if ((this.g & 1) == 1) {
                codedOutputStream.c(1, this.h);
            }
            if ((this.g & 2) == 2) {
                codedOutputStream.c(2, this.d);
            }
            if ((this.g & 4) == 4) {
                codedOutputStream.a(3, this.e);
            }
            if ((this.g & 8) == 8) {
                codedOutputStream.c(4, this.f);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.g & 1) == 1) {
                i3 = 0 + CodedOutputStream.g(1, this.h);
            }
            if ((this.g & 2) == 2) {
                i3 += CodedOutputStream.g(2, this.d);
            }
            if ((this.g & 4) == 4) {
                i3 += CodedOutputStream.b(3, this.e);
            }
            if ((this.g & 8) == 8) {
                i3 += CodedOutputStream.g(4, this.f);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }
    }
}
