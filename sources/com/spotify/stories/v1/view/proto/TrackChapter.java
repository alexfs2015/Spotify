package com.spotify.stories.v1.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class TrackChapter extends GeneratedMessageLite<TrackChapter, a> implements wbg {
    /* access modifiers changed from: private */
    public static final TrackChapter i;
    private static volatile fll<TrackChapter> j;
    public String d;
    public String e;
    public String f;
    public String g;
    private Overlay h;

    public static final class Overlay extends GeneratedMessageLite<Overlay, a> implements wbf {
        /* access modifiers changed from: private */
        public static final Overlay h;
        private static volatile fll<Overlay> i;
        public String d;
        public String e;
        public String f;
        public String g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Overlay, a> implements wbf {
            private a() {
                super(Overlay.h);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            Overlay overlay = new Overlay();
            h = overlay;
            overlay.e();
        }

        private Overlay() {
            String str = "";
            this.d = str;
            this.e = str;
            this.f = str;
            this.g = str;
        }

        public static Overlay k() {
            return h;
        }

        public static fll<Overlay> parser() {
            return h.c();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Overlay();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Overlay overlay = (Overlay) obj2;
                    this.d = fVar.a(!this.d.isEmpty(), this.d, !overlay.d.isEmpty(), overlay.d);
                    this.e = fVar.a(!this.e.isEmpty(), this.e, !overlay.e.isEmpty(), overlay.e);
                    this.f = fVar.a(!this.f.isEmpty(), this.f, !overlay.f.isEmpty(), overlay.f);
                    this.g = fVar.a(!this.g.isEmpty(), this.g, true ^ overlay.g.isEmpty(), overlay.g);
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
                                    this.f = fkw.d();
                                } else if (a2 == 34) {
                                    this.g = fkw.d();
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
                        synchronized (Overlay.class) {
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
            if (!this.f.isEmpty()) {
                codedOutputStream.a(3, this.f);
            }
            if (!this.g.isEmpty()) {
                codedOutputStream.a(4, this.g);
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
            if (!this.f.isEmpty()) {
                i3 += CodedOutputStream.b(3, this.f);
            }
            if (!this.g.isEmpty()) {
                i3 += CodedOutputStream.b(4, this.g);
            }
            this.c = i3;
            return i3;
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<TrackChapter, a> implements wbg {
        private a() {
            super(TrackChapter.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        TrackChapter trackChapter = new TrackChapter();
        i = trackChapter;
        trackChapter.e();
    }

    private TrackChapter() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
    }

    public static TrackChapter l() {
        return i;
    }

    public static fll<TrackChapter> parser() {
        return i.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new TrackChapter();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                TrackChapter trackChapter = (TrackChapter) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !trackChapter.d.isEmpty(), trackChapter.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !trackChapter.e.isEmpty(), trackChapter.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, !trackChapter.f.isEmpty(), trackChapter.f);
                this.g = fVar.a(!this.g.isEmpty(), this.g, !trackChapter.g.isEmpty(), trackChapter.g);
                this.h = (Overlay) fVar.a(this.h, trackChapter.h);
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
                                this.f = fkw.d();
                            } else if (a2 == 34) {
                                this.g = fkw.d();
                            } else if (a2 == 42) {
                                a aVar = this.h != null ? (a) this.h.h() : null;
                                this.h = (Overlay) fkw.a(Overlay.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.h);
                                    this.h = (Overlay) aVar.e();
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
                if (j == null) {
                    synchronized (TrackChapter.class) {
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
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.a(2, this.e);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.a(3, this.f);
        }
        if (!this.g.isEmpty()) {
            codedOutputStream.a(4, this.g);
        }
        if (this.h != null) {
            codedOutputStream.a(5, (fli) k());
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
        if (!this.f.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.f);
        }
        if (!this.g.isEmpty()) {
            i3 += CodedOutputStream.b(4, this.g);
        }
        if (this.h != null) {
            i3 += CodedOutputStream.b(5, (fli) k());
        }
        this.c = i3;
        return i3;
    }

    public final Overlay k() {
        Overlay overlay = this.h;
        return overlay == null ? Overlay.k() : overlay;
    }
}
