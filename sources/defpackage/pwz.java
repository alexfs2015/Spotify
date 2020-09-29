package defpackage;

import android.os.Parcelable;
import com.spotify.music.features.quicksilver.messages.models.BannerMessage;

/* renamed from: pwz reason: default package */
public abstract class pwz implements Parcelable {

    /* renamed from: pwz$a */
    public interface a {
        a a(long j);

        a a(qag qag);

        a a(boolean z);

        pwz a();
    }

    public static a a(BannerMessage bannerMessage, qag qag, long j) {
        a aVar = new a();
        if (bannerMessage != null) {
            aVar.a = bannerMessage;
            return aVar.a(qag).a(j).a(false);
        }
        throw new NullPointerException("Null bannerMessage");
    }

    public abstract BannerMessage a();

    public abstract qag b();

    public abstract boolean c();

    public abstract long d();

    public abstract a e();
}
