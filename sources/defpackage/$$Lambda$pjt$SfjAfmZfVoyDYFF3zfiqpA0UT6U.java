package defpackage;

import com.spotify.music.features.editprofile.EditProfileActivity;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$pjt$SfjAfmZfVoyDYFF3zfiqpA0UT6U reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pjt$SfjAfmZfVoyDYFF3zfiqpA0UT6U implements Consumer {
    private final /* synthetic */ pjj f$0;

    public /* synthetic */ $$Lambda$pjt$SfjAfmZfVoyDYFF3zfiqpA0UT6U(pjj pjj) {
        this.f$0 = pjj;
    }

    public final void accept(Object obj) {
        this.f$0.a.startActivity(EditProfileActivity.a(this.f$0.a, ((b) obj).a, ((b) obj).b, ((b) obj).c));
    }
}
