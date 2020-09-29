package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: iit reason: default package */
public final class iit {
    final iis a;
    final DataInputStream b;
    final Executor c;
    final byte[] d = new byte[10000];
    iiu e;
    volatile boolean f;
    final Runnable g = new Runnable() {
        public final void run() {
            if (!iit.this.f) {
                try {
                    iit iit = iit.this;
                    ByteBuffer wrap = ByteBuffer.wrap(iit.d);
                    iis iis = iit.a;
                    DataInputStream dataInputStream = iit.b;
                    iir iir = new iir();
                    iis.a(dataInputStream);
                    byte a2 = iir.a(dataInputStream.readByte());
                    byte a3 = iir.a(dataInputStream.readByte());
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
                            iir.a(readByte);
                        } else {
                            if (wrap.position() > 1) {
                                iir.a(wrap.get(wrap.position() - 2));
                            }
                            wrap.put(readByte);
                        }
                        i++;
                    }
                    short s = wrap.getShort(wrap.position() - 2);
                    short a4 = iir.a();
                    if (a4 == s) {
                        wrap.position(wrap.position() - 2);
                        a aVar = new a(a2, a3);
                        if (aVar.a == 0) {
                            new StringBuilder("Received FRAMED DATA s:").append(aVar.b);
                            wrap.array();
                            wrap.position();
                            byte b = aVar.b;
                            if (iit.e != null) {
                                ByteBuffer allocate = ByteBuffer.allocate(wrap.position());
                                allocate.put(iit.d, 0, allocate.limit());
                                iit.e.a(b, allocate.array());
                            }
                        } else if (aVar.a == 1) {
                            new StringBuilder("Received FRAMED ACK s:").append(aVar.b);
                            wrap.array();
                            wrap.position();
                            byte b2 = aVar.b;
                            if (iit.e != null) {
                                iit.e.a(b2);
                            }
                        } else {
                            Logger.b("Unexpected type", new Object[0]);
                        }
                        if (!iit.this.f) {
                            iit.this.c.execute(iit.this.g);
                        }
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Wrong checksum. calculated = ");
                    sb.append(Integer.toHexString(a4));
                    sb.append(" received = ");
                    sb.append(Integer.toHexString(s));
                    throw new IOException(sb.toString());
                } catch (EOFException e) {
                    iit iit2 = iit.this;
                    iit.a(new IOException("EoF detected, session will close", e));
                    iit.this.a();
                } catch (IOException e2) {
                    iit iit3 = iit.this;
                    iit.a(e2);
                } catch (Exception e3) {
                    iit iit4 = iit.this;
                    Assertion.a("ProtocolFraming Error", (Throwable) e3);
                }
            }
        }
    };

    public iit(InputStream inputStream, Executor executor, iis iis) {
        this.b = new DataInputStream(inputStream);
        this.c = executor;
        this.a = iis;
    }

    public final void a() {
        this.f = true;
        try {
            this.b.close();
        } catch (IOException e2) {
            a(e2);
        }
    }

    static void a(IOException iOException) {
        Logger.b(iOException, "ProtocolFraming Error %s", iOException.getMessage());
    }
}
