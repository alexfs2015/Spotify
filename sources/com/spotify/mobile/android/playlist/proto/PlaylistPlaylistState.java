package com.spotify.mobile.android.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PlaylistPlaylistState {

    public static final class ProtoPlaylistOfflineState extends GeneratedMessageLite<ProtoPlaylistOfflineState, a> implements hbt {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistOfflineState g;
        private static volatile fkr<ProtoPlaylistOfflineState> h;
        public String d = "";
        public int e;
        private int f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistOfflineState, a> implements hbt {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoPlaylistOfflineState.g);
            }
        }

        private ProtoPlaylistOfflineState() {
        }

        private boolean m() {
            return (this.f & 1) == 1;
        }

        private boolean n() {
            return (this.f & 2) == 2;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.c(2, this.e);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f & 1) == 1) {
                i2 = 0 + CodedOutputStream.b(1, this.d);
            }
            if ((this.f & 2) == 2) {
                i2 += CodedOutputStream.g(2, this.e);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoPlaylistOfflineState();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoPlaylistOfflineState protoPlaylistOfflineState = (ProtoPlaylistOfflineState) obj2;
                    this.d = fVar.a(m(), this.d, protoPlaylistOfflineState.m(), protoPlaylistOfflineState.d);
                    this.e = fVar.a(n(), this.e, protoPlaylistOfflineState.n(), protoPlaylistOfflineState.e);
                    if (fVar == e.a) {
                        this.f |= protoPlaylistOfflineState.f;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c = fkc.c();
                                    this.f |= 1;
                                    this.d = c;
                                } else if (a2 == 16) {
                                    this.f |= 2;
                                    this.e = fkc.g();
                                } else if (!a(a2, fkc)) {
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
                    if (h == null) {
                        synchronized (ProtoPlaylistOfflineState.class) {
                            if (h == null) {
                                h = new b(g);
                            }
                        }
                    }
                    return h;
                default:
                    throw new UnsupportedOperationException();
            }
            return g;
        }

        static {
            ProtoPlaylistOfflineState protoPlaylistOfflineState = new ProtoPlaylistOfflineState();
            g = protoPlaylistOfflineState;
            protoPlaylistOfflineState.e();
        }

        public static ProtoPlaylistOfflineState k() {
            return g;
        }

        public static fkr<ProtoPlaylistOfflineState> parser() {
            return g.c();
        }
    }
}
