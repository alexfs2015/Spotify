package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.net.HostAndPort;
import io.reactivex.FlowableEmitter;

/* renamed from: vqa reason: default package */
final class vqa extends way<wan> {
    private final wat b = new wer();
    private final FlowableEmitter<wan> c;
    private final wgd d;
    private final ObjectMapper e;
    private final HostAndPort f;
    private final vre g;

    vqa(FlowableEmitter<wan> flowableEmitter, wgd wgd, ObjectMapper objectMapper, HostAndPort hostAndPort, vre vre) {
        this.c = flowableEmitter;
        this.d = wgd;
        this.e = objectMapper;
        this.f = hostAndPort;
        this.g = vre;
    }

    public final void a(wan wan) {
        wbf c2 = wan.c();
        if (this.g.b().b()) {
            wan.c().a((wat) this.g.b().c());
        }
        wgd wgd = this.d;
        c2.b(new wgf(wgd.a(wan.d(), this.f.host, this.f.a()), wgd.h), new wdu(), this.b, new vpz(this.c), new weq(), new vpw(this.e));
        if (this.g.a().b()) {
            wan.c().b((wat) this.g.a().c());
        }
    }
}
