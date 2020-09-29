package defpackage;

import android.os.Parcelable;
import com.spotify.music.features.quicksilver.messages.models.BannerMessage;

/* renamed from: pod reason: default package */
public abstract class pod implements Parcelable {

    /* renamed from: pod$a */
    public interface a {
        a a(long j);

        a a(prk prk);

        a a(boolean z);

        pod a();
    }

    public abstract BannerMessage a();

    public abstract prk b();

    public abstract boolean c();

    public abstract long d();

    public abstract a e();

    public static a a(BannerMessage bannerMessage, prk prk, long j) {
        a aVar = new a();
        if (bannerMessage != null) {
            aVar.a = bannerMessage;
            return aVar.a(prk).a(j).a(false);
        }
        throw new NullPointerException("Null bannerMessage");
    }
}
