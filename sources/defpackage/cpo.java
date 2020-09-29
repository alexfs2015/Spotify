package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@cfp
/* renamed from: cpo reason: default package */
public final class cpo implements cpf {
    private final String a;

    public cpo() {
        this(null);
    }

    public cpo(String str) {
        this.a = str;
    }

    public final void a(String str) {
        HttpURLConnection httpURLConnection;
        String str2 = "Error while pinging URL: ";
        String str3 = ". ";
        String str4 = "Pinging URL: ";
        try {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str4.concat(valueOf);
            } else {
                new String(str4);
            }
            cpn.a(3);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            dqe.a();
            cpc.a(httpURLConnection, this.a);
            cpg cpg = new cpg();
            cpg.a(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            cpg.a(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(str);
                sb.toString();
                cpn.a(5);
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(str3);
            sb2.append(message);
            sb2.toString();
            cpn.a(5);
        } catch (IOException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
            sb3.append(str2);
            sb3.append(str);
            sb3.append(str3);
            sb3.append(message2);
            sb3.toString();
            cpn.a(5);
        } catch (RuntimeException e3) {
            String message3 = e3.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb4.append(str2);
            sb4.append(str);
            sb4.append(str3);
            sb4.append(message3);
            sb4.toString();
            cpn.a(5);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
