package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.fullscreen.story.mobius.view.FullscreenStoryViewState;
import com.spotify.stories.v1.view.proto.Story;

/* renamed from: nas reason: default package */
abstract class nas extends nba {
    final FullscreenStoryViewState a;
    final int b;
    final Optional<Story> c;
    final ImmutableList<Boolean> d;
    final long e;
    final long f;
    final Optional<Boolean> g;
    final boolean h;

    /* renamed from: nas$a */
    static final class a extends defpackage.nba.a {
        private FullscreenStoryViewState a;
        private Integer b;
        private Optional<Story> c;
        private ImmutableList<Boolean> d;
        private Long e;
        private Long f;
        private Optional<Boolean> g;
        private Boolean h;

        /* synthetic */ a(nba nba, byte b2) {
            this(nba);
        }

        a() {
            this.c = Optional.e();
            this.g = Optional.e();
        }

        private a(nba nba) {
            this.c = Optional.e();
            this.g = Optional.e();
            this.a = nba.a();
            this.b = Integer.valueOf(nba.b());
            this.c = nba.c();
            this.d = nba.d();
            this.e = Long.valueOf(nba.e());
            this.f = Long.valueOf(nba.f());
            this.g = nba.g();
            this.h = Boolean.valueOf(nba.h());
        }

        public final defpackage.nba.a a(FullscreenStoryViewState fullscreenStoryViewState) {
            if (fullscreenStoryViewState != null) {
                this.a = fullscreenStoryViewState;
                return this;
            }
            throw new NullPointerException("Null viewState");
        }

        public final defpackage.nba.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.nba.a a(Optional<Story> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null story");
        }

        public final defpackage.nba.a a(ImmutableList<Boolean> immutableList) {
            if (immutableList != null) {
                this.d = immutableList;
                return this;
            }
            throw new NullPointerException("Null likedChapters");
        }

        public final defpackage.nba.a a(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        public final defpackage.nba.a b(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        public final defpackage.nba.a b(Optional<Boolean> optional) {
            if (optional != null) {
                this.g = optional;
                return this;
            }
            throw new NullPointerException("Null contextPlayerInitialState");
        }

        public final defpackage.nba.a a(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final nba a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" viewState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" currentChapter");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" likedChapters");
                str = sb3.toString();
            }
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" currentChapterPositionMs");
                str = sb4.toString();
            }
            if (this.f == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" currentChapterDurationMs");
                str = sb5.toString();
            }
            if (this.h == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" showStoryInfo");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                nat nat = new nat(this.a, this.b.intValue(), this.c, this.d, this.e.longValue(), this.f.longValue(), this.g, this.h.booleanValue());
                return nat;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }
    }

    nas(FullscreenStoryViewState fullscreenStoryViewState, int i, Optional<Story> optional, ImmutableList<Boolean> immutableList, long j, long j2, Optional<Boolean> optional2, boolean z) {
        if (fullscreenStoryViewState != null) {
            this.a = fullscreenStoryViewState;
            this.b = i;
            if (optional != null) {
                this.c = optional;
                if (immutableList != null) {
                    this.d = immutableList;
                    this.e = j;
                    this.f = j2;
                    if (optional2 != null) {
                        this.g = optional2;
                        this.h = z;
                        return;
                    }
                    throw new NullPointerException("Null contextPlayerInitialState");
                }
                throw new NullPointerException("Null likedChapters");
            }
            throw new NullPointerException("Null story");
        }
        throw new NullPointerException("Null viewState");
    }

    public final FullscreenStoryViewState a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final Optional<Story> c() {
        return this.c;
    }

    public final ImmutableList<Boolean> d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final long f() {
        return this.f;
    }

    public final Optional<Boolean> g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FullscreenStoryModel{viewState=");
        sb.append(this.a);
        sb.append(", currentChapter=");
        sb.append(this.b);
        sb.append(", story=");
        sb.append(this.c);
        sb.append(", likedChapters=");
        sb.append(this.d);
        sb.append(", currentChapterPositionMs=");
        sb.append(this.e);
        sb.append(", currentChapterDurationMs=");
        sb.append(this.f);
        sb.append(", contextPlayerInitialState=");
        sb.append(this.g);
        sb.append(", showStoryInfo=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nba) {
            nba nba = (nba) obj;
            return this.a.equals(nba.a()) && this.b == nba.b() && this.c.equals(nba.c()) && this.d.equals(nba.d()) && this.e == nba.e() && this.f == nba.f() && this.g.equals(nba.g()) && this.h == nba.h();
        }
    }

    public int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        long j = this.e;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        return ((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (this.h ? 1231 : 1237);
    }

    public final defpackage.nba.a i() {
        return new a(this, 0);
    }
}
