package defpackage;

import com.spotify.intentrouter.CommandRunner;
import io.reactivex.subjects.UnicastSubject;

/* renamed from: gjt reason: default package */
public final class gjt<T> {
    final UnicastSubject<gjr<T>> a = UnicastSubject.a();
    public final CommandRunner<T> b = new CommandRunner<>(this.a);
}
