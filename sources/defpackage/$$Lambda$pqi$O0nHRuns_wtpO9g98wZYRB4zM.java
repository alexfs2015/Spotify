package defpackage;

import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pqi$O0nHRuns_wtpO9g-98wZ-YRB4zM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pqi$O0nHRuns_wtpO9g98wZYRB4zM implements Function {
    private final /* synthetic */ a f$0;

    public /* synthetic */ $$Lambda$pqi$O0nHRuns_wtpO9g98wZYRB4zM(a aVar) {
        this.f$0 = aVar;
    }

    public final Object apply(Object obj) {
        return pqf.a(String.format("Error fetching creative Id %s. %s", new Object[]{this.f$0.c, ((Throwable) obj).getMessage()}));
    }
}
