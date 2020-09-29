package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: cji reason: default package */
final class cji extends ckh {
    private final ctm a;

    cji(ctm ctm) {
        this.a = ctm;
    }

    public final csl a(dwv<?> dwv, Map<String, String> map) {
        try {
            HttpResponse b = this.a.b(dwv, map);
            int statusCode = b.getStatusLine().getStatusCode();
            Header[] allHeaders = b.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new drc(header.getName(), header.getValue()));
            }
            if (b.getEntity() == null) {
                return new csl(statusCode, arrayList);
            }
            long contentLength = b.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new csl(statusCode, arrayList, (int) b.getEntity().getContentLength(), b.getEntity().getContent());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(contentLength);
            throw new IOException(sb.toString());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
