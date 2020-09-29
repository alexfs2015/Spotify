package com.spotify.podcastextensions.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Podcastextensions {

    public static final class PodcastTopic extends GeneratedMessageLite<PodcastTopic, a> implements vab {
        /* access modifiers changed from: private */
        public static final PodcastTopic f;
        private static volatile fkr<PodcastTopic> g;
        public String d;
        public String e;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PodcastTopic, a> implements vab {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(PodcastTopic.f);
            }
        }

        private PodcastTopic() {
            String str = "";
            this.d = str;
            this.e = str;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if (!this.d.isEmpty()) {
                codedOutputStream.a(1, this.d);
            }
            if (!this.e.isEmpty()) {
                codedOutputStream.a(2, this.e);
            }
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.d.isEmpty()) {
                i2 = 0 + CodedOutputStream.b(1, this.d);
            }
            if (!this.e.isEmpty()) {
                i2 += CodedOutputStream.b(2, this.e);
            }
            this.c = i2;
            return i2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new PodcastTopic();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    PodcastTopic podcastTopic = (PodcastTopic) obj2;
                    this.d = fVar.a(!this.d.isEmpty(), this.d, !podcastTopic.d.isEmpty(), podcastTopic.d);
                    this.e = fVar.a(!this.e.isEmpty(), this.e, true ^ podcastTopic.e.isEmpty(), podcastTopic.e);
                    e eVar = e.a;
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    this.d = fkc.d();
                                } else if (a2 == 18) {
                                    this.e = fkc.d();
                                } else if (!fkc.b(a2)) {
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
                        synchronized (PodcastTopic.class) {
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

        static {
            PodcastTopic podcastTopic = new PodcastTopic();
            f = podcastTopic;
            podcastTopic.e();
        }

        public static fkr<PodcastTopic> parser() {
            return f.c();
        }
    }

    public static final class PodcastTopics extends GeneratedMessageLite<PodcastTopics, a> implements vac {
        /* access modifiers changed from: private */
        public static final PodcastTopics e;
        private static volatile fkr<PodcastTopics> f;
        public e<PodcastTopic> d = fks.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PodcastTopics, a> implements vac {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(PodcastTopics.e);
            }
        }

        private PodcastTopics() {
        }

        public final int k() {
            return this.d.size();
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.a(1, (fko) this.d.get(i));
            }
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                i2 += CodedOutputStream.b(1, (fko) this.d.get(i3));
            }
            this.c = i2;
            return i2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new PodcastTopics();
                case IS_INITIALIZED:
                    return e;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    this.d = ((f) obj).a(this.d, ((PodcastTopics) obj2).d);
                    e eVar = e.a;
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    fke fke = (fke) obj2;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(fkc.a(PodcastTopic.parser(), fke));
                                } else if (!fkc.b(a2)) {
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
                    if (f == null) {
                        synchronized (PodcastTopics.class) {
                            if (f == null) {
                                f = new b(e);
                            }
                        }
                    }
                    return f;
                default:
                    throw new UnsupportedOperationException();
            }
            return e;
        }

        static {
            PodcastTopics podcastTopics = new PodcastTopics();
            e = podcastTopics;
            podcastTopics.e();
        }

        public static PodcastTopics l() {
            return e;
        }

        public static fkr<PodcastTopics> parser() {
            return e.c();
        }
    }
}
