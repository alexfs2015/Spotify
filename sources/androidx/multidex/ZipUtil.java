package androidx.multidex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class ZipUtil {
    private static final int BUFFER_SIZE = 16384;
    private static final int ENDHDR = 22;
    private static final int ENDSIG = 101010256;

    static class CentralDirectory {
        long offset;
        long size;

        CentralDirectory() {
        }
    }

    ZipUtil() {
    }

    static long computeCrcOfCentralDir(RandomAccessFile randomAccessFile, CentralDirectory centralDirectory) {
        CRC32 crc32 = new CRC32();
        long j = centralDirectory.size;
        randomAccessFile.seek(centralDirectory.offset);
        byte[] bArr = new byte[BUFFER_SIZE];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        }
        return crc32.getValue();
    }

    static CentralDirectory findCentralDirectory(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(ENDSIG);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() != reverseBytes) {
                    length--;
                } else {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    CentralDirectory centralDirectory = new CentralDirectory();
                    centralDirectory.size = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    centralDirectory.offset = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return centralDirectory;
                }
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder sb = new StringBuilder("File too short to be a zip file: ");
        sb.append(randomAccessFile.length());
        throw new ZipException(sb.toString());
    }

    static long getZipCrc(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return computeCrcOfCentralDir(randomAccessFile, findCentralDirectory(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
