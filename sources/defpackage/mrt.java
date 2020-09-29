package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.followfeed.network.models.FeedItemDataType;
import java.util.List;

/* renamed from: mrt reason: default package */
final class mrt extends mry {
    private final String a;
    private final FeedItemDataType b;
    private final Optional<String> c;
    private final Optional<String> d;
    private final List<mrr> e;
    private final Optional<String> f;
    private final Optional<String> g;
    private final Optional<String> h;
    private final Optional<String> i;
    private final Optional<Boolean> j;
    private final List<msc> k;
    private final Optional<String> l;

    mrt(String str, FeedItemDataType feedItemDataType, Optional<String> optional, Optional<String> optional2, List<mrr> list, Optional<String> optional3, Optional<String> optional4, Optional<String> optional5, Optional<String> optional6, Optional<Boolean> optional7, List<msc> list2, Optional<String> optional8) {
        if (str != null) {
            this.a = str;
            if (feedItemDataType != null) {
                this.b = feedItemDataType;
                if (optional != null) {
                    this.c = optional;
                    if (optional2 != null) {
                        this.d = optional2;
                        if (list != null) {
                            this.e = list;
                            if (optional3 != null) {
                                this.f = optional3;
                                if (optional4 != null) {
                                    this.g = optional4;
                                    if (optional5 != null) {
                                        this.h = optional5;
                                        if (optional6 != null) {
                                            this.i = optional6;
                                            if (optional7 != null) {
                                                this.j = optional7;
                                                if (list2 != null) {
                                                    this.k = list2;
                                                    if (optional8 != null) {
                                                        this.l = optional8;
                                                        return;
                                                    }
                                                    throw new NullPointerException("Null sectionTitle");
                                                }
                                                throw new NullPointerException("Null tracks");
                                            }
                                            throw new NullPointerException("Null played");
                                        }
                                        throw new NullPointerException("Null entityUri");
                                    }
                                    throw new NullPointerException("Null imageUrl");
                                }
                                throw new NullPointerException("Null subtitle");
                            }
                            throw new NullPointerException("Null title");
                        }
                        throw new NullPointerException("Null artists");
                    }
                    throw new NullPointerException("Null releaseDate");
                }
                throw new NullPointerException("Null artistPickMessage");
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null id");
    }

    public final String a() {
        return this.a;
    }

    public final FeedItemDataType b() {
        return this.b;
    }

    public final Optional<String> c() {
        return this.c;
    }

    public final Optional<String> d() {
        return this.d;
    }

    public final List<mrr> e() {
        return this.e;
    }

    public final Optional<String> f() {
        return this.f;
    }

    public final Optional<String> g() {
        return this.g;
    }

    public final Optional<String> h() {
        return this.h;
    }

    public final Optional<String> i() {
        return this.i;
    }

    public final Optional<Boolean> j() {
        return this.j;
    }

    public final List<msc> k() {
        return this.k;
    }

    public final Optional<String> l() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedItemData{id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", artistPickMessage=");
        sb.append(this.c);
        sb.append(", releaseDate=");
        sb.append(this.d);
        sb.append(", artists=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", imageUrl=");
        sb.append(this.h);
        sb.append(", entityUri=");
        sb.append(this.i);
        sb.append(", played=");
        sb.append(this.j);
        sb.append(", tracks=");
        sb.append(this.k);
        sb.append(", sectionTitle=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mry) {
            mry mry = (mry) obj;
            return this.a.equals(mry.a()) && this.b.equals(mry.b()) && this.c.equals(mry.c()) && this.d.equals(mry.d()) && this.e.equals(mry.e()) && this.f.equals(mry.f()) && this.g.equals(mry.g()) && this.h.equals(mry.h()) && this.i.equals(mry.i()) && this.j.equals(mry.j()) && this.k.equals(mry.k()) && this.l.equals(mry.l());
        }
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }
}
