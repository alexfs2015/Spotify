package org.msgpack.core.buffer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public class InputStreamBufferInput implements MessageBufferInput {
    private final int bufferSize;
    private InputStream in;
    private boolean reachedEOF;

    public static MessageBufferInput newBufferInput(InputStream inputStream) {
        wpp.a(inputStream, (Object) "InputStream is null");
        if (inputStream instanceof FileInputStream) {
            FileChannel channel = ((FileInputStream) inputStream).getChannel();
            if (channel != null) {
                return new ChannelBufferInput(channel);
            }
        }
        return new InputStreamBufferInput(inputStream);
    }

    public InputStreamBufferInput(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public InputStreamBufferInput(InputStream inputStream, int i) {
        this.reachedEOF = false;
        this.in = (InputStream) wpp.a(inputStream, (Object) "input is null");
        this.bufferSize = i;
    }

    public InputStream reset(InputStream inputStream) {
        InputStream inputStream2 = this.in;
        this.in = inputStream;
        this.reachedEOF = false;
        return inputStream2;
    }

    public MessageBuffer next() {
        if (this.reachedEOF) {
            return null;
        }
        byte[] bArr = new byte[this.bufferSize];
        int read = this.in.read(bArr);
        if (read != -1) {
            return MessageBuffer.wrap(bArr).slice(0, read);
        }
        this.reachedEOF = true;
        return null;
    }

    public void close() {
        this.in.close();
    }
}
