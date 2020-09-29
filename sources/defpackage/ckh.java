package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: ckh reason: default package */
public abstract class ckh implements ctm {
    public abstract csl a(dwv<?> dwv, Map<String, String> map);

    @Deprecated
    public final HttpResponse b(dwv<?> dwv, Map<String, String> map) {
        csl a = a(dwv, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), a.a, ""));
        ArrayList arrayList = new ArrayList();
        for (drc drc : Collections.unmodifiableList(a.b)) {
            arrayList.add(new BasicHeader(drc.a, drc.b));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream inputStream = a.d;
        if (inputStream != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(inputStream);
            basicHttpEntity.setContentLength((long) a.c);
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
