package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.net.HostAndPort;
import io.reactivex.FlowableEmitter;

/* renamed from: wdb reason: default package */
final class wdb extends wpe<wot> {
    private final woz b = new wsx();
    private final FlowableEmitter<wot> c;
    private final wuj d;
    private final ObjectMapper e;
    private final HostAndPort f;
    private final wem g;

    wdb(FlowableEmitter<wot> flowableEmitter, wuj wuj, ObjectMapper objectMapper, HostAndPort hostAndPort, wem wem) {
        this.c = flowableEmitter;
        this.d = wuj;
        this.e = objectMapper;
        this.f = hostAndPort;
        this.g = wem;
    }

    public final void a(wot wot) {
        wpl c2 = wot.c();
        if (this.g.b().b()) {
            wot.c().a((woz) this.g.b().c());
        }
        wuj wuj = this.d;
        c2.b(new wul(wuj.a(wot.d(), this.f.host, this.f.a()), wuj.h), new wsa(), this.b, new wda(this.c), new wsw(), new wcx(this.e));
        if (this.g.a().b()) {
            wot.c().b((woz) this.g.a().c());
        }
    }
}
