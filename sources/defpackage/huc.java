package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.Map;

/* renamed from: huc reason: default package */
final class huc extends hue {
    private final String a;
    private final CharSequence b;
    private final Map<String, String> c;
    private final hui d;
    private final Uri e;
    private final PlayOrigin f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final ThumbState m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;

    huc(String str, CharSequence charSequence, Map<String, String> map, hui hui, Uri uri, PlayOrigin playOrigin, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ThumbState thumbState, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str2 = str;
        Uri uri2 = uri;
        PlayOrigin playOrigin2 = playOrigin;
        ThumbState thumbState2 = thumbState;
        if (str2 != null) {
            this.a = str2;
            this.b = charSequence;
            this.c = map;
            this.d = hui;
            if (uri2 != null) {
                this.e = uri2;
                if (playOrigin2 != null) {
                    this.f = playOrigin2;
                    this.g = z;
                    this.h = z2;
                    this.i = z3;
                    this.j = z4;
                    this.k = z5;
                    this.l = z6;
                    if (thumbState2 != null) {
                        this.m = thumbState2;
                        this.n = z7;
                        this.o = z8;
                        this.p = z9;
                        this.q = z10;
                        this.r = z11;
                        this.s = z12;
                        this.t = z13;
                        return;
                    }
                    throw new NullPointerException("Null radioThumbState");
                }
                throw new NullPointerException("Null playOrigin");
            }
            throw new NullPointerException("Null imageUri");
        }
        throw new NullPointerException("Null entityUri");
    }

    public final String a() {
        return this.a;
    }

    public final CharSequence b() {
        return this.b;
    }

    public final Map<String, String> c() {
        return this.c;
    }

    public final hui d() {
        return this.d;
    }

    public final Uri e() {
        return this.e;
    }

    public final PlayOrigin f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final boolean k() {
        return this.k;
    }

    public final boolean l() {
        return this.l;
    }

    public final ThumbState m() {
        return this.m;
    }

    public final boolean n() {
        return this.n;
    }

    public final boolean o() {
        return this.o;
    }

    public final boolean p() {
        return this.p;
    }

    public final boolean q() {
        return this.q;
    }

    public final boolean r() {
        return this.r;
    }

    public final boolean s() {
        return this.s;
    }

    public final boolean t() {
        return this.t;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationState{entityUri=");
        sb.append(this.a);
        sb.append(", contextDescription=");
        sb.append(this.b);
        sb.append(", contextMetadata=");
        sb.append(this.c);
        sb.append(", trackInfo=");
        sb.append(this.d);
        sb.append(", imageUri=");
        sb.append(this.e);
        sb.append(", playOrigin=");
        sb.append(this.f);
        sb.append(", paused=");
        sb.append(this.g);
        sb.append(", radio=");
        sb.append(this.h);
        sb.append(", clusterRadio=");
        sb.append(this.i);
        sb.append(", isVideo=");
        sb.append(this.j);
        sb.append(", prevEnabled=");
        sb.append(this.k);
        sb.append(", nextEnabled=");
        sb.append(this.l);
        sb.append(", radioThumbState=");
        sb.append(this.m);
        sb.append(", adPlaying=");
        sb.append(this.n);
        sb.append(", videoAd=");
        sb.append(this.o);
        sb.append(", adSkippable=");
        sb.append(this.p);
        sb.append(", queued=");
        sb.append(this.q);
        sb.append(", localPlayback=");
        sb.append(this.r);
        sb.append(", isNftEnabled=");
        sb.append(this.s);
        sb.append(", isLocalBansEnabled=");
        sb.append(this.t);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hue) {
            hue hue = (hue) obj;
            if (this.a.equals(hue.a())) {
                CharSequence charSequence = this.b;
                if (charSequence != null ? charSequence.equals(hue.b()) : hue.b() == null) {
                    Map<String, String> map = this.c;
                    if (map != null ? map.equals(hue.c()) : hue.c() == null) {
                        return this.d.equals(hue.d()) && this.e.equals(hue.e()) && this.f.equals(hue.f()) && this.g == hue.g() && this.h == hue.h() && this.i == hue.i() && this.j == hue.j() && this.k == hue.k() && this.l == hue.l() && this.m.equals(hue.m()) && this.n == hue.n() && this.o == hue.o() && this.p == hue.p() && this.q == hue.q() && this.r == hue.r() && this.s == hue.s() && this.t == hue.t();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        CharSequence charSequence = this.b;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        Map<String, String> map = this.c;
        if (map != null) {
            i2 = map.hashCode();
        }
        int hashCode3 = (((((((hashCode2 ^ i2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        int i3 = 1231;
        int hashCode4 = (((((((((((((((((((((((((hashCode3 ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003) ^ this.m.hashCode()) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003) ^ (this.q ? 1231 : 1237)) * 1000003) ^ (this.r ? 1231 : 1237)) * 1000003) ^ (this.s ? 1231 : 1237)) * 1000003;
        if (!this.t) {
            i3 = 1237;
        }
        return hashCode4 ^ i3;
    }
}
