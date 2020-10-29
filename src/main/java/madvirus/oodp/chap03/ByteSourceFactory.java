package madvirus.oodp.chap03;

public class ByteSourceFactory {

    private static ByteSourceFactory instance = new ByteSourceFactory();

    private ByteSourceFactory() {}

    public static ByteSourceFactory getInstance() {
        return instance;
    }

    public ByteSource create() {
        if (useFile()) {
            return new FileDataReader();
        } else {
            return new SocketDataReader();
        }
    }

    private boolean useFile() {
        String useFileVal = System.getProperty("useFile");
        return useFileVal != null && Boolean.valueOf(useFileVal);
    }
}
