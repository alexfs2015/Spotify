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

    public static final class ProtoPlaylistOfflineState extends GeneratedMessageLite<ProtoPlaylistOfflineState, a> implements hep {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistOfflineState g;
        private static volatile fll<ProtoPlaylistOfflineState> h;
        public String d = "";
        public int e;
        private int f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistOfflineState, a> implements hep {
            private a() {
                super(ProtoPlaylistOfflineState.g);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoPlaylistOfflineState protoPlaylistOfflineState = new ProtoPlaylistOfflineState();
            g = protoPlaylistOfflineState;
            protoPlaylistOfflineState.e();
        }

        private ProtoPlaylistOfflineState() {
        }

        public static ProtoPlaylistOfflineState k() {
            return g;
        }

        private boolean m() {
            return (this.f & 1) == 1;
        }

        private boolean n() {
            boolean z = true ^ true;
            return (this.f & 2) == 2;
        }

        public static fll<ProtoPlaylistOfflineState> parser() {
            return g.c();
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c = fkw.c();
                                    this.f |= 1;
                                    this.d = c;
                                } else if (a2 == 16) {
                                    this.f |= 2;
                                    this.e = fkw.g();
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
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    break;
                case GET_DEFAULT_INSTANCE:
                    break;
                case GET_PARSER:
                    if (h == null) {
                        Class<ProtoPlaylistOfflineState> cls = ProtoPlaylistOfflineState.class;
                        synchronized (ProtoPlaylistOfflineState.class) {
                            try {
                                if (h == null) {
                                    h = new b(g);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return h;
                default:
                    throw new UnsupportedOperationException();
            }
            return g;
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
    }
}
