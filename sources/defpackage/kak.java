package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.List;

/* renamed from: kak reason: default package */
public class kak implements kah {
    private final jxx a;
    private final jya b;
    private a c;

    public /* synthetic */ void a() {
        CC.$default$a(this);
    }

    public /* synthetic */ void a(int i) {
        CC.$default$a((kah) this, i);
    }

    public /* synthetic */ void a(long j) {
        CC.$default$a((kah) this, j);
    }

    public /* synthetic */ void a(EncryptionType encryptionType) {
        CC.$default$a((kah) this, encryptionType);
    }

    public /* synthetic */ void a(List<jyi> list) {
        CC.$default$a((kah) this, (List) list);
    }

    public /* synthetic */ void a(jya jya, long j) {
        CC.$default$a((kah) this, jya, j);
    }

    public /* synthetic */ void e(long j, long j2) {
        CC.$default$e(this, j, j2);
    }

    public kak(jya jya, jxx jxx) {
        this.b = jya;
        this.a = jxx;
    }

    public final kaj b() {
        a aVar = this.c;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public void d(long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2).a(true);
    }

    public void a(long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2).a(false);
    }

    public void c(long j, long j2) {
        this.c.b(true).a(Long.valueOf(j)).a(j2);
    }

    public void b(long j) {
        this.c.b(false).a(j);
    }

    public final void a(long j, long j2, long j3) {
        this.c.a(Long.valueOf(j2)).a(j3);
    }

    public void b(long j, long j2) {
        this.c.b(Long.valueOf(j));
    }

    public void a(jxr jxr, ReasonEnd reasonEnd, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2).a(0.0f).a(false);
    }

    public void a(BetamaxException betamaxException, long j, long j2) {
        this.c.b(true).a(0.0f).a(false).a(Long.valueOf(j)).a(j2);
    }

    public void b(BetamaxException betamaxException, long j, long j2) {
        this.c.b(true).a(0.0f).a(false).a(Long.valueOf(j)).a(j2);
    }

    public final void a(boolean z, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2);
    }

    public final void a(Optional<VideoSurfaceView> optional, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2);
    }

    public final void a(jyi jyi, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2);
    }

    public final void a(kam kam, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2);
    }

    public final void a(kac kac, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2);
    }

    public void a(float f, long j, long j2) {
        this.c.a(Long.valueOf(j)).a(j2).a(f);
    }

    public void a(boolean z, long j) {
        this.c = new a().a(this.b).a((Long) null).a(j).a(false).b((Long) null).a(0.0f).b(!this.a.b());
    }
}
