package com.spotify.stories.v1.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Chapter extends GeneratedMessageLite<Chapter, a> implements wbb {
    /* access modifiers changed from: private */
    public static final Chapter f;
    private static volatile fll<Chapter> g;
    public int d = 0;
    public Object e;

    /* renamed from: com.spotify.stories.v1.view.proto.Chapter$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ChapterCase.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007f */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r2 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r3 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r4 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r4 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r4 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.VISIT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r4 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x004b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r4 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r4 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                com.spotify.stories.v1.view.proto.Chapter$ChapterCase[] r3 = com.spotify.stories.v1.view.proto.Chapter.ChapterCase.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x0075 }
                com.spotify.stories.v1.view.proto.Chapter$ChapterCase r4 = com.spotify.stories.v1.view.proto.Chapter.ChapterCase.TRACK_CHAPTER     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007f }
                com.spotify.stories.v1.view.proto.Chapter$ChapterCase r3 = com.spotify.stories.v1.view.proto.Chapter.ChapterCase.VIDEO_CHAPTER     // Catch:{ NoSuchFieldError -> 0x007f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.spotify.stories.v1.view.proto.Chapter$ChapterCase r1 = com.spotify.stories.v1.view.proto.Chapter.ChapterCase.CHAPTER_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.stories.v1.view.proto.Chapter.AnonymousClass1.<clinit>():void");
        }
    }

    public enum ChapterCase implements b {
        TRACK_CHAPTER(1),
        VIDEO_CHAPTER(2),
        CHAPTER_NOT_SET(0);
        
        private final int value;

        private ChapterCase(int i) {
            this.value = i;
        }

        public static ChapterCase a(int i) {
            if (i == 0) {
                return CHAPTER_NOT_SET;
            }
            if (i == 1) {
                return TRACK_CHAPTER;
            }
            if (i != 2) {
                return null;
            }
            return VIDEO_CHAPTER;
        }

        public final int a() {
            return this.value;
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Chapter, a> implements wbb {
        private a() {
            super(Chapter.f);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Chapter chapter = new Chapter();
        f = chapter;
        chapter.e();
    }

    private Chapter() {
    }

    public static fll<Chapter> parser() {
        return f.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Chapter();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Chapter chapter = (Chapter) obj2;
                int i = AnonymousClass1.a[ChapterCase.a(chapter.d).ordinal()];
                if (i == 1) {
                    if (this.d == 1) {
                        z = true;
                    }
                    this.e = fVar.e(z, this.e, chapter.e);
                } else if (i == 2) {
                    if (this.d == 2) {
                        z = true;
                    }
                    this.e = fVar.e(z, this.e, chapter.e);
                } else if (i == 3) {
                    if (this.d != 0) {
                        z = true;
                    }
                    fVar.a(z);
                }
                if (fVar == e.a) {
                    int i2 = chapter.d;
                    if (i2 != 0) {
                        this.d = i2;
                    }
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
                                com.spotify.stories.v1.view.proto.TrackChapter.a aVar = this.d == 1 ? (com.spotify.stories.v1.view.proto.TrackChapter.a) ((TrackChapter) this.e).h() : null;
                                this.e = fkw.a(TrackChapter.parser(), fky);
                                if (aVar != null) {
                                    aVar.a((TrackChapter) this.e);
                                    this.e = aVar.e();
                                }
                                this.d = 1;
                            } else if (a2 == 18) {
                                com.spotify.stories.v1.view.proto.VideoChapter.a aVar2 = this.d == 2 ? (com.spotify.stories.v1.view.proto.VideoChapter.a) ((VideoChapter) this.e).h() : null;
                                this.e = fkw.a(VideoChapter.parser(), fky);
                                if (aVar2 != null) {
                                    aVar2.a((VideoChapter) this.e);
                                    this.e = aVar2.e();
                                }
                                this.d = 2;
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
                if (g == null) {
                    synchronized (Chapter.class) {
                        if (g == null) {
                            g = new b(f);
                        }
                    }
                }
                return g;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (this.d == 1) {
            codedOutputStream.a(1, (fli) (TrackChapter) this.e);
        }
        if (this.d == 2) {
            codedOutputStream.a(2, (fli) (VideoChapter) this.e);
        }
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d == 1) {
            i2 = 0 + CodedOutputStream.b(1, (fli) (TrackChapter) this.e);
        }
        if (this.d == 2) {
            i2 += CodedOutputStream.b(2, (fli) (VideoChapter) this.e);
        }
        this.c = i2;
        return i2;
    }

    public final TrackChapter k() {
        return this.d == 1 ? (TrackChapter) this.e : TrackChapter.l();
    }
}
