package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.List;

/* renamed from: kck reason: default package */
public class kck implements kch {
    private final jzx a;
    private final kaa b;
    private a c;

    public kck(kaa kaa, jzx jzx) {
        this.b = kaa;
        this.a = jzx;
    }

    public /* synthetic */ void a() {
        CC.$default$a(this);
    }

    public void a(float f, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2).a(f);
    }

    public /* synthetic */ void a(int i) {
        CC.$default$a((kch) this, i);
    }

    public /* synthetic */ void a(long j) {
        CC.$default$a((kch) this, j);
    }

    public void a(long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2).a(false);
    }

    public final void a(long j, long j2, long j3) {
        this.c.a(Long.valueOf(j2)).a(j3);
    }

    public final void a(Optional<VideoSurfaceView> optional, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2);
    }

    public /* synthetic */ void a(EncryptionType encryptionType) {
        CC.$default$a((kch) this, encryptionType);
    }

    public void a(BetamaxException betamaxException, long j, long j2) {
        this.c.b(true).a(0.0f).a(false).a(Long.valueOf(j)).a(j2);
    }

    public /* synthetic */ void a(List<kai> list) {
        CC.$default$a((kch) this, (List) list);
    }

    public void a(jzr jzr, ReasonEnd reasonEnd, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2).a(0.0f).a(false);
    }

    public /* synthetic */ void a(kaa kaa, long j) {
        CC.$default$a((kch) this, kaa, j);
    }

    public final void a(kai kai, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2);
    }

    public final void a(kcc kcc, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2);
    }

    public final void a(kcm kcm, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2);
    }

    public void a(boolean z, long j) {
        this.c = new a().a(this.b).a((Long) null).a(j).a(false).b((Long) null).a(0.0f).b(!this.a.b());
    }

    public final void a(boolean z, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2);
    }

    public final kcj b() {
        a aVar = this.c;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public void b(long j) {
        this.c.b(false).a(j);
    }

    public void b(long j, long j2) {
        this.c.b(Long.valueOf(j));
    }

    public void b(BetamaxException betamaxException, long j, long j2) {
        this.c.b(true).a(0.0f).a(false).a(Long.valueOf(j)).a(j2);
    }

    public void c(long j, long j2) {
        this.c.b(true).a(Long.valueOf(j)).a(j2);
    }

    public void d(long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2).a(true);
    }

    public /* synthetic */ void e(long j, long j2) {
        CC.$default$e(this, j, j2);
    }
}
