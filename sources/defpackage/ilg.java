package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: ilg reason: default package */
public final class ilg {
    final ilf a;
    final DataInputStream b;
    final Executor c;
    final byte[] d = new byte[10000];
    ilh e;
    volatile boolean f;
    final Runnable g = new Runnable() {
        public final void run() {
            if (!ilg.this.f) {
                try {
                    ilg ilg = ilg.this;
                    ByteBuffer wrap = ByteBuffer.wrap(ilg.d);
                    ilf ilf = ilg.a;
                    DataInputStream dataInputStream = ilg.b;
                    ile ile = new ile();
                    ilf.a(dataInputStream);
                    byte a2 = ile.a(dataInputStream.readByte());
                    byte a3 = ile.a(dataInputStream.readByte());
                    int i = 0;
                    while (true) {
                        byte readByte = dataInputStream.readByte();
                        if (readByte == 124) {
                            break;
                        }
                        if (readByte == 125) {
                            readByte = (byte) (dataInputStream.readByte() + 32);
                        }
                        if (i < 4) {
                            ile.a(readByte);
                        } else {
                            if (wrap.position() > 1) {
                                ile.a(wrap.get(wrap.position() - 2));
                            }
                            wrap.put(readByte);
                        }
                        i++;
                    }
                    short s = wrap.getShort(wrap.position() - 2);
                    short a4 = ile.a();
                    if (a4 == s) {
                        wrap.position(wrap.position() - 2);
                        a aVar = new a(a2, a3);
                        if (aVar.a == 0) {
                            new StringBuilder("Received FRAMED DATA s:").append(aVar.b);
                            wrap.array();
                            wrap.position();
                            byte b = aVar.b;
                            if (ilg.e != null) {
                                ByteBuffer allocate = ByteBuffer.allocate(wrap.position());
                                allocate.put(ilg.d, 0, allocate.limit());
                                ilg.e.a(b, allocate.array());
                            }
                        } else if (aVar.a == 1) {
                            new StringBuilder("Received FRAMED ACK s:").append(aVar.b);
                            wrap.array();
                            wrap.position();
                            byte b2 = aVar.b;
                            if (ilg.e != null) {
                                ilg.e.a(b2);
                            }
                        } else {
                            Logger.b("Unexpected type", new Object[0]);
                        }
                        if (!ilg.this.f) {
                            ilg.this.c.execute(ilg.this.g);
                        }
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Wrong checksum. calculated = ");
                    sb.append(Integer.toHexString(a4));
                    sb.append(" received = ");
                    sb.append(Integer.toHexString(s));
                    throw new IOException(sb.toString());
                } catch (EOFException e) {
                    ilg ilg2 = ilg.this;
                    ilg.a(new IOException("EoF detected, session will close", e));
                    ilg.this.a();
                } catch (IOException e2) {
                    ilg ilg3 = ilg.this;
                    ilg.a(e2);
                } catch (Exception e3) {
                    ilg ilg4 = ilg.this;
                    Assertion.a("ProtocolFraming Error", (Throwable) e3);
                }
            }
        }
    };

    public ilg(InputStream inputStream, Executor executor, ilf ilf) {
        this.b = new DataInputStream(inputStream);
        this.c = executor;
        this.a = ilf;
    }

    static void a(IOException iOException) {
        Logger.b(iOException, "ProtocolFraming Error %s", iOException.getMessage());
    }

    public final void a() {
        this.f = true;
        try {
            this.b.close();
        } catch (IOException e2) {
            a(e2);
        }
    }
}
