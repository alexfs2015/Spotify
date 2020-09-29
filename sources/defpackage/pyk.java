package defpackage;

import android.os.Parcelable;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import java.util.List;

/* renamed from: pyk reason: default package */
public abstract class pyk implements Parcelable {

    /* renamed from: pyk$a */
    public interface a {
        a a(int i);

        a a(long j);

        a a(NoteMessage noteMessage);

        a a(List<qbg> list);

        a a(qag qag);

        a a(boolean z);

        pyk a();

        a b(boolean z);
    }

    public static a a(NoteMessage noteMessage, qag qag, long j) {
        a aVar = new a();
        aVar.a = noteMessage;
        return aVar.a(qag).a(j).a(false).a(null).a(-1).b(false);
    }

    public abstract NoteMessage a();

    public final pyk a(NoteMessage noteMessage) {
        return h().a((NoteMessage) null).a();
    }

    public final pyk a(boolean z) {
        return h().b(z).a();
    }

    public abstract List<qbg> b();

    public abstract int c();

    public abstract qag d();

    public abstract long e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract a h();
}
