package defpackage;

import io.reactivex.functions.Function;
import java.util.Locale;

/* renamed from: -$$Lambda$hwm$kG5yHZeyOPW6Um34mnMCJ6eWNag reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hwm$kG5yHZeyOPW6Um34mnMCJ6eWNag implements Function {
    public static final /* synthetic */ $$Lambda$hwm$kG5yHZeyOPW6Um34mnMCJ6eWNag INSTANCE = new $$Lambda$hwm$kG5yHZeyOPW6Um34mnMCJ6eWNag();

    private /* synthetic */ $$Lambda$hwm$kG5yHZeyOPW6Um34mnMCJ6eWNag() {
    }

    public final Object apply(Object obj) {
        return String.format(Locale.getDefault(), "\"%s\"", new Object[]{((Throwable) obj).getMessage()});
    }
}
