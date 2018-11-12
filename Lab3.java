import javax.sound.midi.Soundbank;

public class Lab3 {
    public static void main(String[] args) {
        /*System.out.println("result: ");

        int a = 1;
//        String s = "result: ";
        String s = new String("result: ");
        System.out.println(s + a);


        System.out.println(s);
        System.out.println(a + 2);
        System.out.println(a + "A");

        String s1 = s;
        s = s + '1';
        System.out.println(s);

        String tmpS = "";
        for (int i = 0; i < 100; i++) {
//            tmpS = tmpS + i;
            tmpS += i;
            System.out.println(tmpS);
        }*/

        StringBuilder stringBuilder = new StringBuilder("result: ");
        stringBuilder = stringBuilder.append("1");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("123");

        // 2 thread
        System.out.println(stringBuffer);

        // 1 thread
        stringBuffer.append("1");

    }
}
