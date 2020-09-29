package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;

/* renamed from: uxt reason: default package */
public interface uxt {
    Completable a(String str);

    Completable a(String str, boolean z);

    Single<String> a(String str, List<String> list, Optional<String> optional);

    Completable b(String str);
}
