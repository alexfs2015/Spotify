package defpackage;

import com.spotify.music.features.followfeed.network.models.FeedItemDataType;

/* renamed from: mwq reason: default package */
final class mwq extends mww {
    private final String a;
    private final FeedItemDataType b;
    private final mwz c;
    private final mwy d;

    mwq(String str, FeedItemDataType feedItemDataType, mwz mwz, mwy mwy) {
        if (str != null) {
            this.a = str;
            if (feedItemDataType != null) {
                this.b = feedItemDataType;
                this.c = mwz;
                this.d = mwy;
                return;
            }
            throw new NullPointerException("Null viewType");
        }
        throw new NullPointerException("Null id");
    }

    public final String a() {
        return this.a;
    }

    public final FeedItemDataType b() {
        return this.b;
    }

    public final mwz c() {
        return this.c;
    }

    public final mwy d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mww) {
            mww mww = (mww) obj;
            if (this.a.equals(mww.a()) && this.b.equals(mww.b())) {
                mwz mwz = this.c;
                if (mwz != null ? mwz.equals(mww.c()) : mww.c() == null) {
                    mwy mwy = this.d;
                    return mwy != null ? mwy.equals(mww.d()) : mww.d() == null;
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        mwz mwz = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (mwz == null ? 0 : mwz.hashCode())) * 1000003;
        mwy mwy = this.d;
        if (mwy != null) {
            i = mwy.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedItemData{id=");
        sb.append(this.a);
        sb.append(", viewType=");
        sb.append(this.b);
        sb.append(", musicRelease=");
        sb.append(this.c);
        sb.append(", followRecs=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
