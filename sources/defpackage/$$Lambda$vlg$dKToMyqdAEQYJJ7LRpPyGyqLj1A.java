package defpackage;

import com.spotify.signup.api.services.model.EmailSignupResponse;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vlg$dKToMyqdAEQYJJ7LRpPyGyqLj1A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vlg$dKToMyqdAEQYJJ7LRpPyGyqLj1A implements Function {
    public static final /* synthetic */ $$Lambda$vlg$dKToMyqdAEQYJJ7LRpPyGyqLj1A INSTANCE = new $$Lambda$vlg$dKToMyqdAEQYJJ7LRpPyGyqLj1A();

    private /* synthetic */ $$Lambda$vlg$dKToMyqdAEQYJJ7LRpPyGyqLj1A() {
    }

    public final Object apply(Object obj) {
        return Observable.b(vld.a(((EmailSignupResponse) obj).status()));
    }
}
