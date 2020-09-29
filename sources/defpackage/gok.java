package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;

/* renamed from: gok reason: default package */
public final class gok {
    private final ghm a;
    private final Observable<String> b;
    private final goi c;
    private final PasswordValidator d;
    private final gog e;

    public gok(ghm ghm, wud<String> wud, goi goi, PasswordValidator passwordValidator, gog gog) {
        this.a = ghm;
        this.b = vun.b(wud);
        this.c = goi;
        this.d = passwordValidator;
        this.e = gog;
    }

    public c<got, goq, gop> a(gov gov) {
        return klb.a((kjz<M, E, F>) $$Lambda$7h8g7OmKckxa5syFsaZX6ydJUQ.INSTANCE, gou.a(gov, this.a, this.b, this.c, this.d)).a((kjo<M, F>) $$Lambda$wxS6yq3LDkUQyiNNbKs0k4rjGSQ.INSTANCE).a((kjm<E>) this.c.b).a((d<M, E, F>) gol.a(this.e));
    }
}
