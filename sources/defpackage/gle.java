package defpackage;

import com.spotify.intentrouter.CommandRunner;
import io.reactivex.subjects.UnicastSubject;

/* renamed from: gle reason: default package */
public final class gle<T> {
    final UnicastSubject<glc<T>> a = UnicastSubject.a();
    public final CommandRunner<T> b = new CommandRunner<>(this.a);
}
