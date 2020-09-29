package defpackage;

import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$ktd$Gyufw5YOVYNSryiEYvHI5-WKtWg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ktd$Gyufw5YOVYNSryiEYvHI5WKtWg implements Predicate {
    private final /* synthetic */ ktj f$0;

    public /* synthetic */ $$Lambda$ktd$Gyufw5YOVYNSryiEYvHI5WKtWg(ktj ktj) {
        this.f$0 = ktj;
    }

    public final boolean test(Object obj) {
        return ((ktj) obj).h().containsAll(this.f$0.h());
    }
}
