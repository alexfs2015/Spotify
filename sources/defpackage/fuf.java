package defpackage;

import android.net.Uri;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: fuf reason: default package */
public final class fuf {
    public String a;
    public String b;
    public String c;
    public String d;
    public Uri e;
    public SpotifyIconV2 f;
    public boolean g;
    public int h;

    public fuf() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = Uri.EMPTY;
        this.f = null;
        this.g = false;
        this.h = -1;
    }

    public fuf(String str, String str2, Uri uri, SpotifyIconV2 spotifyIconV2, boolean z) {
        this.a = str;
        this.b = str2;
        String str3 = "";
        this.c = str3;
        this.d = str3;
        this.e = uri;
        this.f = spotifyIconV2;
        this.g = z;
        this.h = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuf)) {
            return false;
        }
        fuf fuf = (fuf) obj;
        return this.g == fuf.g && this.h == fuf.h && this.e.equals(fuf.e) && this.f == fuf.f && this.b.equals(fuf.b) && this.c.equals(fuf.c) && this.d.equals(fuf.d) && this.a.equals(fuf.a);
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        SpotifyIconV2 spotifyIconV2 = this.f;
        return ((((hashCode + (spotifyIconV2 != null ? spotifyIconV2.hashCode() : 0)) * 31) + (this.g ? 1 : 0)) * 31) + this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuHeader{mTitle='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", mSubtitle='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mDescription='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", mDescriptionHeader='");
        sb.append(this.d);
        sb.append('\'');
        sb.append(", mHeaderImageUri='");
        sb.append(this.e);
        sb.append('\'');
        sb.append(", mPlaceholderIcon=");
        Object obj = this.f;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", mIsIconRounded=");
        sb.append(this.g);
        sb.append(", mTitleMaxLines=");
        sb.append(this.h);
        sb.append('}');
        return sb.toString();
    }
}
