package defpackage;

import android.os.Parcelable;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import java.util.List;

/* renamed from: ppo reason: default package */
public abstract class ppo implements Parcelable {

    /* renamed from: ppo$a */
    public interface a {
        a a(int i);

        a a(long j);

        a a(NoteMessage noteMessage);

        a a(List<psk> list);

        a a(prk prk);

        a a(boolean z);

        ppo a();

        a b(boolean z);
    }

    public abstract NoteMessage a();

    public abstract List<psk> b();

    public abstract int c();

    public abstract prk d();

    public abstract long e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract a h();

    public static a a(NoteMessage noteMessage, prk prk, long j) {
        a aVar = new a();
        aVar.a = noteMessage;
        return aVar.a(prk).a(j).a(false).a(null).a(-1).b(false);
    }

    public final ppo a(NoteMessage noteMessage) {
        return h().a((NoteMessage) null).a();
    }

    public final ppo a(boolean z) {
        return h().b(z).a();
    }
}
