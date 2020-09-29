package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class AudioEpisode extends GeneratedMessageLite<AudioEpisode, a> implements vwh {
    /* access modifiers changed from: private */
    public static final AudioEpisode j;
    private static volatile fll<AudioEpisode> k;
    public String d = "";
    public boolean e;
    public e<String> f = flm.d();
    public boolean g;
    private int h;
    private Duration i;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<AudioEpisode, a> implements vwh {
        private a() {
            super(AudioEpisode.j);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        AudioEpisode audioEpisode = new AudioEpisode();
        j = audioEpisode;
        audioEpisode.e();
    }

    private AudioEpisode() {
    }

    public static AudioEpisode l() {
        return j;
    }

    public static fll<AudioEpisode> parser() {
        return j.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new AudioEpisode();
            case IS_INITIALIZED:
                return j;
            case MAKE_IMMUTABLE:
                this.f.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                AudioEpisode audioEpisode = (AudioEpisode) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !audioEpisode.d.isEmpty(), audioEpisode.d);
                boolean z2 = this.e;
                boolean z3 = audioEpisode.e;
                this.e = fVar.a(z2, z2, z3, z3);
                this.i = (Duration) fVar.a(this.i, audioEpisode.i);
                this.f = fVar.a(this.f, audioEpisode.f);
                boolean z4 = this.g;
                boolean z5 = audioEpisode.g;
                this.g = fVar.a(z4, z4, z5, z5);
                if (fVar == e.a) {
                    this.h |= audioEpisode.h;
                }
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
                            } else if (a2 == 16) {
                                this.e = fkw.b();
                            } else if (a2 == 26) {
                                com.spotify.searchview.proto.Duration.a aVar = this.i != null ? (com.spotify.searchview.proto.Duration.a) this.i.h() : null;
                                this.i = (Duration) fkw.a(Duration.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.i);
                                    this.i = (Duration) aVar.e();
                                }
                            } else if (a2 == 34) {
                                String d2 = fkw.d();
                                if (!this.f.a()) {
                                    this.f = GeneratedMessageLite.a(this.f);
                                }
                                this.f.add(d2);
                            } else if (a2 == 40) {
                                this.g = fkw.b();
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
                if (k == null) {
                    synchronized (AudioEpisode.class) {
                        if (k == null) {
                            k = new b(j);
                        }
                    }
                }
                return k;
            default:
                throw new UnsupportedOperationException();
        }
        return j;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        boolean z = this.e;
        if (z) {
            codedOutputStream.a(2, z);
        }
        if (this.i != null) {
            codedOutputStream.a(3, (fli) k());
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.a(4, (String) this.f.get(i2));
        }
        boolean z2 = this.g;
        if (z2) {
            codedOutputStream.a(5, z2);
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int b = !this.d.isEmpty() ? CodedOutputStream.b(1, this.d) + 0 : 0;
        boolean z = this.e;
        if (z) {
            b += CodedOutputStream.b(2, z);
        }
        if (this.i != null) {
            b += CodedOutputStream.b(3, (fli) k());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f.size(); i4++) {
            i3 += CodedOutputStream.b((String) this.f.get(i4));
        }
        int size = b + i3 + (this.f.size() * 1);
        boolean z2 = this.g;
        if (z2) {
            size += CodedOutputStream.b(5, z2);
        }
        this.c = size;
        return size;
    }

    public final Duration k() {
        Duration duration = this.i;
        return duration == null ? Duration.k() : duration;
    }
}
