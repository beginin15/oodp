package madvirus.oodp.chap03;

import java.io.FileReader;

public class FlowController {

    public void process() {
        FileDataReader reader = new FileDataReader();
        byte[] data = reader.read();

        Encryptor encryptor = new Encryptor();
        byte[] encryptedData = encryptor.encrypt(data);

        FileDataWriter writer = new FileDataWriter();
        writer.write(encryptedData);
    }
}
