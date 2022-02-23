package IO;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream1 {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("youfile"));//创建数据专属的字节输出流

        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400L;
        float f = 500f;
        double d =3.0f ;
        boolean bo = false;
        char c = 'a';

        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(bo);
        dos.writeChar(c);

        dos.flush();
        dos.close();
    }
}
