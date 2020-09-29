package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class MinutesListenedStory extends GeneratedMessageLite<MinutesListenedStory, a> implements wfh {
    /* access modifiers changed from: private */
    public static final MinutesListenedStory h;
    private static volatile fll<MinutesListenedStory> i;
    public String d;
    public String e;
    public e<ListenedData> f = flm.d();
    private int g;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<MinutesListenedStory, a> implements wfh {
        private a() {
            super(MinutesListenedStory.h);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        MinutesListenedStory minutesListenedStory = new MinutesListenedStory();
        h = minutesListenedStory;
        minutesListenedStory.e();
    }

    private MinutesListenedStory() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    public static MinutesListenedStory k() {
        return h;
    }

    public static fll<MinutesListenedStory> parser() {
        return h.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new MinutesListenedStory();
            case IS_INITIALIZED:
                return h;
            case MAKE_IMMUTABLE:
                this.f.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                MinutesListenedStory minutesListenedStory = (MinutesListenedStory) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !minutesListenedStory.d.isEmpty(), minutesListenedStory.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, true ^ minutesListenedStory.e.isEmpty(), minutesListenedStory.e);
                this.f = fVar.a(this.f, minutesListenedStory.f);
                if (fVar == e.a) {
                    this.g |= minutesListenedStory.g;
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
                            } else if (a2 == 18) {
                                this.e = fkw.d();
                            } else if (a2 == 26) {
                                if (!this.f.a()) {
                                    this.f = GeneratedMessageLite.a(this.f);
                                }
                                this.f.add(fkw.a(ListenedData.parser(), fky));
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
                    synchronized (MinutesListenedStory.class) {
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
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.a(3, (fli) this.f.get(i2));
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int b = !this.d.isEmpty() ? CodedOutputStream.b(1, this.d) + 0 : 0;
        if (!this.e.isEmpty()) {
            b += CodedOutputStream.b(2, this.e);
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            b += CodedOutputStream.b(3, (fli) this.f.get(i3));
        }
        this.c = b;
        return b;
    }
}
